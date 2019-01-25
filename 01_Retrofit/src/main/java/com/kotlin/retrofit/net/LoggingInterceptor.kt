package com.kotlin.retrofit.net

import android.text.TextUtils
import android.util.Log
import okhttp3.FormBody
import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException
import java.net.URLDecoder

/**
 * @author weilu
 * Created by weilu on 2016/9/1.
 * 日志信息采集类
 * 有一个地方需要注意一下，在调用了response.body().string()方法之后，
 * response中的流会被关闭，我们需要创建出一个新的response给应用层处理
 */
class LoggingInterceptor : Interceptor {

    var TAG:String = "LoggingInterceptor"

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val startTime = System.currentTimeMillis()
        val response = chain.proceed(chain.request())
        val endTime = System.currentTimeMillis()
        val duration = endTime - startTime
        val mediaType = response.body()!!.contentType()
        Log.d(TAG,"\n")
        Log.d(TAG,"----------Start----------------")
        Log.d(TAG,"| RequestUrl:" + request.url())
        Log.d(TAG,"| RequestHeaders:\n" + request.headers())

        val method = request.method()
        if ("POST" == method) {
            val sb = StringBuilder()
            if (request.body() is FormBody) {
                val body = request.body() as FormBody?
                for (i in 0 until body!!.size()) {
                    sb.append(body.encodedName(i) + ":" + (if (TextUtils.isEmpty(body.encodedValue(i)))
                        "参数为空"
                    else
                        URLDecoder.decode(body.encodedValue(i), "utf-8")) + ",")
                }
                if (sb.length != 0) {
                    sb.delete(sb.length - 1, sb.length)
                }
                Log.d(  TAG,"| RequestParams:\n")
                try {
                    Log.d(TAG,"{" + sb.toString() + "}")
                } catch (e: Exception) {
                    Log.d(TAG,"{" + sb.toString() + "}")
                }

            }
        }
        Log.d(TAG,"| ResponseHeaders:\n" + response.headers())
        val content = response.body()!!.string()
        try {
            Log.d(TAG,content)
        } catch (e: Exception) {
            Log.d(TAG,content)
        }

        Log.d(TAG,"----------End:" + duration + "毫秒----------")
        return response.newBuilder()
                .body(okhttp3.ResponseBody.create(mediaType, content))
                .build()
    }
}