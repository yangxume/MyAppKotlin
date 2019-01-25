package com.kotlin.retrofit.basic_use.net;


import com.kotlin.retrofit.basic_use.bean.LoginRequest;
import com.kotlin.retrofit.basic_use.bean.LoginResponse;

public class NetUtils {

    // 使用用户名密码登录
    public static void login(final LoginRequest loginRequest, final ApiCallBack<LoginResponse> callback) {

        ApiService userInterface = RetrofitUtil.getInstance().createUserApi();
        userInterface.login(loginRequest).enqueue(callback);
    }
}