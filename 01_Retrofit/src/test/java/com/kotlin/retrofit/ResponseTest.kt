package com.uniwill.dell.mengxi

/**
 *Copyright
 *
 *Created by xuyang on 2018/12/14 22:14
 *
 *email xuyangme@126.com
 *
 *${FILENAME}
 *
 *Description
 *
 *Update records:
 */
import com.kotlin.retrofit.bean.*
import com.kotlin.retrofit.net.RetrofitManager
import com.kotlin.retrofit.utils.LogUtil
import io.reactivex.Observer
import io.reactivex.android.plugins.RxAndroidPlugins
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.plugins.RxJavaPlugins
import io.reactivex.schedulers.Schedulers
import okhttp3.MediaType
import okhttp3.RequestBody
import org.json.JSONObject
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.shadows.ShadowLog

/**
 * @Description:
 * @Author: weilu
 * @Time: 2017/12/22 0022 14:27.
 */
@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class, sdk = [23])
class ResponseTest {

    val TAG : String = "ResponseTest"

    val password: String = "4280d89a5a03f812751f504cc10ee8a5"

    @Before
    fun setUp() {
        ShadowLog.stream = System.out
        initRxJava2()
    }

    private fun initRxJava2() {
        RxJavaPlugins.reset()
        RxJavaPlugins.setIoSchedulerHandler { Schedulers.trampoline() }
        RxAndroidPlugins.reset()
        RxAndroidPlugins.setMainThreadSchedulerHandler { Schedulers.trampoline() }
    }

    /**
     * 2 登录
     */
    @Test
    fun postLogin(){

        val jsonObject = JSONObject()
        jsonObject.put("username","liuzhuangshi")
        jsonObject.put("password","liuzhuangshi")

        val requestBody = RequestBody.create(MediaType.parse("application/json"),
            jsonObject.toString())

        RetrofitManager.createApiService()
            .postLogin(requestBody)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<LoginBean> {
                override fun onSubscribe(d: Disposable) {}

                override fun onNext(loginResponse: LoginBean) {
                    LogUtil.d(TAG, loginResponse.errorMsg)
                }

                override fun onError(e: Throwable) {
                    LogUtil.e(e.toString())
                }

                override fun onComplete() {}
            })
//        D/LoggingInterceptor: {"code":10000,"user":[{"id":2,"username":"admin","password":"43442676c74ae59f219c2d87fd6bad52","sex":"男","department":"保安部","userType":"app","job":"保安","realname":"admin","phone":"13366851236","createdAt":"2019-01-02 15:16:00","updatedAt":"2019-01-28 20:28:07","cardId":1}],"card":[{"id":1,"name":"01","card":"66666666","department":"0001","job":null,"cardPermission":null,"phone":null,"charge":"0.0000"}],"errorMsg":"用户登录成功"}


    }

    /**
     * 退出
     */
    @Test
    fun getLogout(){

        RetrofitManager.createApiService()
            .getLogout()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object :Observer<LogoutBean>{
                override fun onError(e: Throwable) {

                }

                override fun onComplete() {

                }

                override fun onSubscribe(d: Disposable) {
                }

                override fun onNext(loginOutResponse: LogoutBean) {

                    LogUtil.d(TAG, loginOutResponse.errorMsg)

                }
            })

    }

    /**
     * 3 天气
     */
    @Test
    fun getWeather(){

        RetrofitManager.createApiService()
            .getWeather()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object :Observer<WeatherResponse>{
                override fun onError(e: Throwable) {

                }

                override fun onComplete() {

                }

                override fun onSubscribe(d: Disposable) {
                }

                override fun onNext(weatherResponse: WeatherResponse) {

                    LogUtil.d(TAG, weatherResponse.errorMsg)

                }
            })

    }

    /***
     * 4.用户、一卡通
     */
    //    4.1用户信息
    @Test
    fun getUserInfo(){

        RetrofitManager.createApiService()
            .getUserInfo()
            .subscribeOn(Schedulers.io())
            .subscribeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<UserInfoBean>{
                override fun onComplete() {

                }

                override fun onSubscribe(d: Disposable) {
                }

                override fun onNext(userInfoResponse : UserInfoBean) {
                    LogUtil.d(TAG, userInfoResponse.errorMsg)
                }

                override fun onError(e: Throwable) {
                }
            })

    }

    //    4.2消费信息
    @Test
    fun postQueryConsume(){

        val jsonObject = JSONObject()
        jsonObject.put("pageNum","1")
        jsonObject.put("pageSize","120")
        jsonObject.put("slotCardType","消费")
        jsonObject.put("beginDate","2018-01-14")
        jsonObject.put("endDate","2018-11-22")

        val requestBody = RequestBody.create(MediaType.parse("application/json"),
            jsonObject.toString())

        RetrofitManager.createApiService()
            .postQueryConsume(requestBody)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<UserConsumptionBean> {
                override fun onSubscribe(d: Disposable) {}

                override fun onNext(consumeResponse: UserConsumptionBean) {
                    LogUtil.d(TAG, consumeResponse.errorMsg)
                }

                override fun onError(e: Throwable) {
                    LogUtil.e(e.toString())
                }

                override fun onComplete() {}
            })

    }

    //    4.3一卡通信息

    @Test
    fun getCardInfo(){

        RetrofitManager.createApiService()
            .getCardInfo()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object :Observer<CardInfoBean>{
                override fun onError(e: Throwable) {

                }

                override fun onComplete() {

                }

                override fun onSubscribe(d: Disposable) {
                }

                override fun onNext(cardInfoResponse: CardInfoBean) {

                    LogUtil.d(TAG, cardInfoResponse.errorMsg)

                }
            })
    }


    //    4.4充值信息
    @Test
    fun getRecharge(){

        val jsonObject = JSONObject()
        jsonObject.put("username","admin")
        jsonObject.put("password","admin")

        val requestBody = RequestBody.create(MediaType.parse("application/json"),
            jsonObject.toString())

        RetrofitManager.createApiService()
            .getRecharge(requestBody)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<UserReChargeBean> {
                override fun onSubscribe(d: Disposable) {}

                override fun onNext(loginResponse: UserReChargeBean) {
                    LogUtil.d(TAG, loginResponse.errorMsg)
                }

                override fun onError(e: Throwable) {
                    LogUtil.e(e.toString())
                }

                override fun onComplete() {}
            })
    }


    //    4.5持卡人基本信息
    @Test
    fun getCardUserinfo(){

        RetrofitManager.createApiService()
            .getCardUserinfo()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<CardUserinfoBean> {
                override fun onSubscribe(d: Disposable) {}

                override fun onNext(cardUserinfoBean: CardUserinfoBean) {
                    LogUtil.d(TAG, cardUserinfoBean.errorMsg)
                }

                override fun onError(e: Throwable) {
                    LogUtil.e(e.toString())
                }

                override fun onComplete() {}
            })
    }


    /**
     * 5 民意调查
     */
    //5.1民意调查列表
    @Test
    fun getOpinionSurvey(){
        val jsonObject = JSONObject()
        jsonObject.put("pageNumber","1")
        jsonObject.put("pageSize","20")
        val requestBody = RequestBody.create(MediaType.parse("application/json"),
            jsonObject.toString())
        RetrofitManager.createApiService()
            .getOpinionSurvey(requestBody)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<OpinionSurveyBean> {
                override fun onSubscribe(d: Disposable) {}

                override fun onNext(opinionSurveyResponse: OpinionSurveyBean) {
                    LogUtil.d(TAG, opinionSurveyResponse.errorMsg)
                }

                override fun onError(e: Throwable) {
                    LogUtil.e(e.toString())
                }

                override fun onComplete() {}
            })

    }

    //5.2民意调查填写

    @Test
    fun opinionSurveySubmit(){
        val jsonObject = JSONObject()
        jsonObject.put("pageNumber","1")
        jsonObject.put("pageSize","20")
        val requestBody = RequestBody.create(MediaType.parse("application/json"),
            jsonObject.toString())
        RetrofitManager.createApiService()
            .opinionSurveySubmit(requestBody)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<OpinionSurveySubmitBean> {
                override fun onSubscribe(d: Disposable) {}

                override fun onNext(opinionSurveySubmitBean: OpinionSurveySubmitBean) {
                    LogUtil.d(TAG, opinionSurveySubmitBean.errorMsg)
                }

                override fun onError(e: Throwable) {
                    LogUtil.e(e.toString())
                }

                override fun onComplete() {}
            })

    }

//
//    //5.3民意调查结
//    @POST("paper/answer")
//    fun getOpinionSurveyResult(@Body requestBody : RequestBody);


    /**
     * 6 .楼宇运营
     */
    //6. 1运营楼宇初始页面展示数据
    @Test
    fun getElectricInformation(){
        val jsonObject = JSONObject()
        jsonObject.put("pageNumber","1")
        jsonObject.put("pageSize","20")
        val requestBody = RequestBody.create(MediaType.parse("application/json"),
            jsonObject.toString())
        RetrofitManager.createApiService()
            .getElectricInformation(requestBody)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<ElectricInformationBean> {
                override fun onSubscribe(d: Disposable) {}

                override fun onNext(electricInformationBean: ElectricInformationBean) {
                    LogUtil.d(TAG, electricInformationBean.errorMsg)
                }

                override fun onError(e: Throwable) {
                    LogUtil.e(e.toString())
                }

                override fun onComplete() {}
            })

    }

    //6.2运营楼宇点击柱状图月份展示分项用电数据
    @Test
    fun getElectricMonthData(){
        val jsonObject = JSONObject()
        jsonObject.put("pageNumber","1")
        jsonObject.put("pageSize","20")
        val requestBody = RequestBody.create(MediaType.parse("application/json"),
            jsonObject.toString())
        RetrofitManager.createApiService()
            .getElectricMonthData(requestBody)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<ElectricMonthDataBean> {
                override fun onSubscribe(d: Disposable) {}

                override fun onNext(electricMonthDataBean: ElectricMonthDataBean) {
                    LogUtil.d(TAG, electricMonthDataBean.errorMsg)
                }

                override fun onError(e: Throwable) {
                    LogUtil.e(e.toString())
                }

                override fun onComplete() {}
            })

    }

    /**
     * 7.审核信息
     */
    //7. 1审核信息展示
    @Test
    fun informQueryAll(){
        val jsonObject = JSONObject()
        jsonObject.put("pageNumber","1")
        jsonObject.put("pageSize","20")
        val requestBody = RequestBody.create(MediaType.parse("application/json"),
            jsonObject.toString())
        RetrofitManager.createApiService()
            .informQueryAll(requestBody)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<AuditeInfoBean> {
                override fun onSubscribe(d: Disposable) {}

                override fun onNext(auditeInfoBean: AuditeInfoBean) {
                    LogUtil.d(TAG, auditeInfoBean.errorMsg)
                }

                override fun onError(e: Throwable) {
                    LogUtil.e(e.toString())
                }

                override fun onComplete() {}
            })
    }

    // 7.2查看详情
    @Test
    fun informGetDetails(){
        val jsonObject = JSONObject()
        jsonObject.put("pageNumber","1")
        jsonObject.put("pageSize","20")
        val requestBody = RequestBody.create(MediaType.parse("application/json"),
            jsonObject.toString())
        RetrofitManager.createApiService()
            .informGetDetails(requestBody)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<AuditeInfoDetailBean> {
                override fun onSubscribe(d: Disposable) {}

                override fun onNext(auditeInfoDetailBean: AuditeInfoDetailBean) {
                    LogUtil.d(TAG, auditeInfoDetailBean.errorMsg)
                }

                override fun onError(e: Throwable) {
                    LogUtil.e(e.toString())
                }

                override fun onComplete() {}
            })
    }
    //7.3接收信息----是否通过审核
    @Test
    fun informGetCheckData(){
        val jsonObject = JSONObject()
        jsonObject.put("pageNumber","1")
        jsonObject.put("pageSize","20")
        val requestBody = RequestBody.create(MediaType.parse("application/json"),
            jsonObject.toString())
        RetrofitManager.createApiService()
            .informGetCheckData(requestBody)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<AuditeInfoCheckBean> {
                override fun onSubscribe(d: Disposable) {}

                override fun onNext(auditeInfoCheckBean: AuditeInfoCheckBean) {
                    LogUtil.d(TAG, auditeInfoCheckBean.errorMsg)
                }

                override fun onError(e: Throwable) {
                    LogUtil.e(e.toString())
                }

                override fun onComplete() {}
            })
    }


//    /**
//     * 8 故障信息
//     */
//    //8.1故障信息上报
//    @POST("repair/getRepairTrouble")
//    fun getRepairTrouble(@Body requestBody : RequestBody);
//
//
//    //8.2报修跟踪
//    @POST("repair/getRepairTracking")
//    fun getRepairTracking(@Body requestBody : RequestBody);
//
//
//    //8.3维修确认
//    @POST("repair/getOK")
//    fun getRepairOk(@Body requestBody : RequestBody);
//
//    //8.4报修统计
//    @POST("repair/getRepairStatistics")
//    fun getRepairStatistics(@Body requestBody : RequestBody);
//
//    //8.5设备维修详情（修改）
//    @POST("repair/getRepairParticulars")
//    fun getRepairParticulars(@Body requestBody : RequestBody);


    /**
     * 9 通知
     */

//    //9.1查看所有通知
//    @POST("notification/get")
//    fun getNotification(@Body requestBody : RequestBody);
//
//    //9.2查看一条通知内容
//    /**
//     * 根据“1.20查看所有通知”接口中的type来判定链接地址：
//     *     目前一共三种类型：设备故障、调查问卷、下发通知
//     *
//     * 测试链接
//     *     设备故障：“设备维修详情”接口的链接
//     *     调查问卷：“民意调查填写”接口的链接
//     *     下发通知： “查看下发通知详情”接口的链接
//     *
//     * TypeId改成相应的id名称
//     */
//
//    //9.3查看下发通知详情
//    @POST("notification/getNotifi")
//    fun getNotificationDetails(@Body requestBody : RequestBody);




}
