package com.kotlin.retrofit.basic_use.net;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtil {

    public static final String Service_API = "http://www.zgaiss.club:8080/";

    private Retrofit mRetrofit;
    private static OkHttpClient mOkHttpClient;
    public static RetrofitUtil getInstance(){
        return new RetrofitUtil();
    }
    private RetrofitUtil(){

        if (null==mRetrofit) {
            if (null == mOkHttpClient) {
                mOkHttpClient = OkHttpUtil.getOkHttpClient();
            }
            //Retrofit2后使用build设计模式
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(Service_API)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(mOkHttpClient)
                    .build();
        }
    }

    public ApiService createUserApi(){
        ApiService apiService = mRetrofit.create(ApiService.class);
        return apiService;
    }

}
