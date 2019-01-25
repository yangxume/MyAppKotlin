package com.kotlin.retrofit.net

import io.reactivex.Observable
import okhttp3.RequestBody
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

import com.kotlin.retrofit.bean.*

/**
 * @Description: Github接口
 * @Author: weilu
 * @Time: 2017/12/22 0022 14:03.
 */
interface ApiService {

    companion object {

//        val BASE_URL = "http://www.zgaiss.club:8080/mengxi/"
        val BASE_URL = "http://www.zgaiss.club:8080/"
    }

    /**
     * 登录
     */
    @Headers("Content-Type: application/json", "Accept: */*")
    @POST("app/login/json")
    fun postLogin(@Body requestBody : RequestBody):Observable<LoginResponse>

    /**
     * 退出
     */
    @GET("app/logout")
    fun getLogout(): Observable<LogoutBean>

    /**
     *天气预报
     */
    @GET("app/weather/get")
    fun getWeather(): Observable<WeatherResponse>

    /**
     * 查询消费信息
     */
    @Headers("Content-Type: application/json", "Accept: */*")
    @POST("/app/consume/get")
    fun postQueryConsume(@Body requestBody : RequestBody): Observable<ConsumeResponse>

    /**
     *查询一卡通信息
     */
    @GET("app/card/get")
    fun getCardInfo(): Observable<CardInfoResponse>

    /**
     *查询用户信息
     */
    @GET("app/user/get")
    fun getUserInfo():Observable<UserInfoResponse>

    /**
     *查询民意调查
     */
    @Headers("Content-Type: application/json", "Accept: */*")
    @POST("app/paper/answer/list")
    fun postQueryOpinionSurvey(@Body requestBody : RequestBody): Observable<OpinionSurveyResponse>


    /**
     *提交民意调查
     */
    @Headers("Content-Type: application/json", "Accept: */*")
    @POST("app/paper/answer/view")
    fun postSubmitOpinionSurvey(@Body requestBody : RequestBody): Observable<OpinionSurveyResponse>

    /**
     *查询园区运营数据
     */
    @Headers("Content-Type: application/json", "Accept: */*")
    @POST("app/buildingOperate/electricInformation")
    fun postQueryElectricInformation(@Body requestBody : RequestBody): Observable<ElectricInformationResponse>


    /**
     * 查询审核信息
     */
    @Headers("Content-Type: application/json", "Accept: */*")
    @POST("app/inform/get")
    fun postQueryInform(@Body requestBody : RequestBody):Observable<CheckInformResponse>

    /**
     *查询审核信息详情
     */
    @Headers("Content-Type: application/json", "Accept: */*")
    @POST("/app/inform/getDetails")
    fun postQueryInformDetails(@Body requestBody : RequestBody): Observable<CheckInformDetailResponse>



}
