package com.uniwill.dell.mengxi.net

import com.kotlin.retrofit.bean.*
import io.reactivex.Observable
import okhttp3.RequestBody
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

/**
 * @Description: Github接口
 * @Author: weilu
 * @Time: 2017/12/22 0022 14:03.
 */
interface ApiService {

    companion object {

//        val BASE_URL = "http://www.zgaiss.club:8080/mengxi/app/"
        val BASE_URL = "http://www.zgaiss.club:8080/app/"
    }

    /**
     * 2 登录
     */
    @Headers("Content-Type: application/json", "Accept: */*")
    @POST("login/json")
    fun postLogin(@Body requestBody : RequestBody):Observable<LoginBean>

    /**
     * 退出
     */
    @GET("logout")
    fun getLogout(): Observable<LogoutBean>

    /**
     * 3 天气
     */
    @GET("weather/get")
    fun getWeather(): Observable<WeatherResponse>

    /***
     * 4.用户、一卡通
     */
    //    4.1用户信息
    @GET("user/get")
    fun getUserInfo():Observable<UserInfoBean>

    //    4.2消费信息
    @Headers("Content-Type: application/json", "Accept: */*")
    @POST("consume/get")
    fun postQueryConsume(@Body requestBody : RequestBody): Observable<UserConsumptionBean>

    //    4.3一卡通信息
    @GET("app/card/get")
    fun getCardInfo(): Observable<CardInfoBean>

    //    4.4充值信息
    @Headers("Content-Type: application/json", "Accept: */*")
    @POST("recharge/get")
    fun getRecharge(@Body requestBody : RequestBody): Observable<UserReChargeBean>

    //    4.5持卡人基本信息
    @GET("app/get")
    fun getCardUserinfo(): Observable<CardUserinfoBean>


    /**
     * 5 民意调查
     */
    //5.1民意调查列表
    @POST("paper/answer/list")
    fun getOpinionSurvey(@Body requestBody : RequestBody): Observable<OpinionSurveyBean>

    //5.2民意调查填写
    @POST("paper/answer/view")
    fun opinionSurveySubmit(@Body requestBody : RequestBody): Observable<OpinionSurveySubmitBean>

    //5.3民意调查结
    @POST("paper/answer")
    fun getOpinionSurveyResult(@Body requestBody : RequestBody): Observable<OpinionSurveyResultBean>


    /**
     * 6 .楼宇运营
     */
    //6. 1运营楼宇初始页面展示数据
    @POST("buildingOperate/electricInformation")
    fun getElectricInformation(@Body requestBody : RequestBody): Observable<ElectricInformationBean>

    //6.2运营楼宇点击柱状图月份展示分项用电数据
    @POST("buildingOperate/getElectricMonthData")
    fun getElectricMonthData(@Body requestBody : RequestBody): Observable<ElectricMonthDataBean>


    /**
     * 7.审核信息
     */
    //7. 1审核信息展示
    @Headers("Content-Type: application/json", "Accept: */*")
    @POST("inform/get")
    fun informQueryAll(@Body requestBody : RequestBody):Observable<AuditeInfoBean>

    // 7.2查看详情
    @POST("inform/getDetails")
    fun informGetDetails(@Body requestBody : RequestBody):Observable<AuditeInfoDetailBean>

    //7.3接收信息----是否通过审核
    @POST("inform/getCheckData")
    fun informGetCheckData(@Body requestBody : RequestBody):Observable<AuditeInfoCheckBean>

    /**
     * 查询审核信息 @TODO 暂未调通，无返回数据格式
     */
    

    /**
     *查询审核信息详情 @TODO 暂未调通，无返回数据格式
     */
    @Headers("Content-Type: application/json", "Accept: */*")
    @POST("/app/inform/getDetails")
    fun postQueryInformDetails(@Body requestBody : RequestBody): Observable<AuditeInfoDetailBean>



    /**
     * 8 故障信息
     */
    //8.1故障信息上报
    @POST("repair/getRepairTrouble")
    fun getRepairTrouble(@Body requestBody : RequestBody)


    //8.2报修跟踪
    @POST("repair/getRepairTracking")
    fun getRepairTracking(@Body requestBody : RequestBody)


    //8.3维修确认
    @POST("repair/getOK")
    fun getRepairOk(@Body requestBody : RequestBody)

    //8.4报修统计
    @POST("repair/getRepairStatistics")
    fun getRepairStatistics(@Body requestBody : RequestBody)

    //8.5设备维修详情（修改）
    @POST("repair/getRepairParticulars")
    fun getRepairParticulars(@Body requestBody : RequestBody)


    /**
     * 9 通知
     */

    //9.1查看所有通知
    @POST("notification/get")
    fun getNotification(@Body requestBody : RequestBody)

    //9.2查看一条通知内容
    /**
     * 根据“1.20查看所有通知”接口中的type来判定链接地址：
     *     目前一共三种类型：设备故障、调查问卷、下发通知
     *
     * 测试链接
     *     设备故障：“设备维修详情”接口的链接
     *     调查问卷：“民意调查填写”接口的链接
     *     下发通知： “查看下发通知详情”接口的链接
     *
     * TypeId改成相应的id名称
     */

    //9.3查看下发通知详情
    @POST("notification/getNotifi")
    fun getNotificationDetails(@Body requestBody : RequestBody)


}
