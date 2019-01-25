package com.kotlin.retrofit

import com.kotlin.retrofit.bean.MyCarBean
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

interface GetRequest_Interface {

    @GET("channels/3?pageNo=1&pageSize=20&v=4.0.0")
    fun getCall(): Call<MyCarBean>
    // @GET注解的作用:采用Get方法发送网络请求
    // getCall() = 接收网络请求数据的方法
    // 其中返回类型为Call<*>，*是接收数据的类（即上面定义的Translation类）
    // 如果想直接获得Responsebody中的内容，可以定义网络请求返回值为Call<ResponseBody>
    //动态配置URL地址

    @GET("channels/3?pageNo={page}&pageSize=20&v=4.0.0")
    fun getIpMsgPath(@Path("page") page: String): Call<MyCarBean>

    //动态指定查询条件
    @GET("getIpInfo.php")
    fun getIpMsgQuery(@Query("ip") ip: String): Call<MyCarBean>

    //动态指定查询条件组
    @GET("getIpInfo.php")
    fun getIpMsgQueryMap(@QueryMap option: Map<String, String>): Call<MyCarBean>

    //Post 表单形式请求
    @FormUrlEncoded
    @POST("getIpInfo.php")
    fun getIpMsgPost(@Field("ip") first: String): Call<MyCarBean>

    //POST JSON数据请求
    @POST("getIpInfo.php")
    fun getIpMsgPostBody(@Body ip: String): Call<MyCarBean>

    //单文件上传
    @Multipart
    @POST("user/photo")
    fun upDateUser(@Part photo: MultipartBody.Part, @Part("description") description: RequestBody): Call<MyCarBean>

    //多文件上传
    @Multipart
    @POST("user/photo")
    fun upDateUser(@PartMap photos: Map<String, String>, @Part("description") description: RequestBody): Call<MyCarBean>


}