package com.kotlin.retrofit.basic_use.net;

import com.kotlin.retrofit.basic_use.bean.LoginRequest;
import com.kotlin.retrofit.basic_use.bean.LoginResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    // 登录
    @POST("login")
    Call<LoginResponse> login(@Body LoginRequest loginRequest);
}
