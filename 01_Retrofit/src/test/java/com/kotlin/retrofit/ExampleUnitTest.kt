package com.kotlin.retrofit

import com.kotlin.retrofit.basic_use.net.ApiCallBack
import com.kotlin.retrofit.basic_use.bean.LoginRequest
import com.kotlin.retrofit.basic_use.bean.LoginResponse
import com.kotlin.retrofit.basic_use.net.NetUtils
import org.junit.Test

import org.junit.Assert.*
import retrofit2.Call
import retrofit2.Response

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun login(){

        val loginRequest = LoginRequest()
        loginRequest.username = "admin"
        loginRequest.password = "admin"

        NetUtils.login(loginRequest,object : ApiCallBack<LoginResponse>(){
            override fun onSuccessful(call: Call<LoginResponse>?, response: Response<LoginResponse>?) {

            }

        })

    }

}
