package com.kotlin.retrofit.basic_use;

import com.kotlin.retrofit.basic_use.bean.LoginRequest;
import com.kotlin.retrofit.basic_use.bean.LoginResponse;
import com.kotlin.retrofit.basic_use.net.ApiCallBack;
import com.kotlin.retrofit.basic_use.net.NetUtils;
import retrofit2.Call;
import retrofit2.Response;

public class Test {

    public void main(String [] args){

        NetUtils.login(new LoginRequest(), new ApiCallBack<LoginResponse>() {
            @Override
            public void onSuccessful(Call<LoginResponse> call, Response<LoginResponse> response) {

            }
        });

    }

}
