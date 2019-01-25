package com.kotlin.retrofit.net

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @Description: RetrofitManager
 * @Author: weilu
 * @Time: 2017/12/22 0022 14:08.
 */
object RetrofitManager {

    private val retrofit = Retrofit.Builder()
            .baseUrl(ApiService.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

    private val okHttpClient: OkHttpClient
        get() = OkHttpClient.Builder()
                .addInterceptor(LoggingInterceptor())
                .build()

    fun createApiService(): ApiService {
        return retrofit.create(ApiService::class.java)
    }

}
