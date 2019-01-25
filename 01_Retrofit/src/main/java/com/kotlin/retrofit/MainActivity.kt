package com.kotlin.retrofit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.retrofit.bean.MyCarBean
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()
    }

    private fun initData() {

        val retrofit = Retrofit.Builder()
            .baseUrl("http://mrobot.pcauto.com.cn/v2/cms/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val getRequestService = retrofit.create(GetRequest_Interface::class.java)

        getRequestService.getCall().enqueue(object : Callback<MyCarBean>{

            override fun onFailure(call: Call<MyCarBean>, t: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<MyCarBean>, response: Response<MyCarBean>) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })

    }
}
