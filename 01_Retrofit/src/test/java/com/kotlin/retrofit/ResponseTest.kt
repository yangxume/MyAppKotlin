package com.kotlin.retrofit

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
import com.kotlin.retrofit.utils.LogUtil
import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
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

import com.kotlin.retrofit.bean.*
import com.kotlin.retrofit.net.RetrofitManager

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

    @Test
    fun postLogin(){

        val jsonObject = JSONObject()
        jsonObject.put("username","admin")
        jsonObject.put("password","admin")

        val requestBody = RequestBody.create(MediaType.parse("application/json"),
                jsonObject.toString())

        RetrofitManager.createApiService()
                .postLogin(requestBody)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<LoginResponse> {
                    override fun onSubscribe(d: Disposable) {}

                    override fun onNext(loginResponse: LoginResponse) {
                        LogUtil.d(TAG, loginResponse.errorMsg)
                    }

                    override fun onError(e: Throwable) {
                        LogUtil.e(e.toString())
                    }

                    override fun onComplete() {}
                })

    }

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
                .subscribe(object : Observer<ConsumeResponse> {
                    override fun onSubscribe(d: Disposable) {}

                    override fun onNext(consumeResponse: ConsumeResponse) {
                        LogUtil.d(TAG, consumeResponse.errorMsg)
                    }

                    override fun onError(e: Throwable) {
                        LogUtil.e(e.toString())
                    }

                    override fun onComplete() {}
                })

    }

    @Test
    fun getCardInfo(){

        RetrofitManager.createApiService()
                .getCardInfo()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object :Observer<CardInfoResponse>{
                    override fun onError(e: Throwable) {

                    }

                    override fun onComplete() {

                    }

                    override fun onSubscribe(d: Disposable) {
                    }

                    override fun onNext(cardInfoResponse: CardInfoResponse) {

                        LogUtil.d(TAG, cardInfoResponse.errorMsg)

                    }
                })

    }

    @Test
    fun getUserInfo(){

        RetrofitManager.createApiService()
                .getUserInfo()
                .subscribeOn(Schedulers.io())
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<UserInfoResponse>{
                    override fun onComplete() {

                    }

                    override fun onSubscribe(d: Disposable) {
                    }

                    override fun onNext(userInfoResponse : UserInfoResponse) {
                        LogUtil.d(TAG, userInfoResponse.errorMsg)
                    }

                    override fun onError(e: Throwable) {
                    }
                })

    }

    @Test
    fun postQueryOpinionSurvey(){
        val jsonObject = JSONObject()
        jsonObject.put("pageNumber","1")
        jsonObject.put("pageSize","20")
        val requestBody = RequestBody.create(MediaType.parse("application/json"),
                jsonObject.toString())
        RetrofitManager.createApiService()
                .postQueryOpinionSurvey(requestBody)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<OpinionSurveyResponse> {
                    override fun onSubscribe(d: Disposable) {}

                    override fun onNext(opinionSurveyResponse: OpinionSurveyResponse) {
                        LogUtil.d(TAG, opinionSurveyResponse.errorMsg)
                    }

                    override fun onError(e: Throwable) {
                        LogUtil.e(e.toString())
                    }

                    override fun onComplete() {}
                })

    }

    @Test
    fun postSubmitOpinionSurvey(){
        val jsonObject = JSONObject()
//        jsonObject.put("pageNumber","1")
//        jsonObject.put("pageSize","20")
//        val requestBody = RequestBody.create(MediaType.parse("application/json"),
//                jsonObject.toString())
//        RetrofitManager.createApiService()
//                .postSubmitOpinionSurvey(requestBody)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(object : Observer<OpinionSurveyResponse> {
//                    override fun onSubscribe(d: Disposable) {}
//
//                    override fun onNext(opinionSurveyResponse: OpinionSurveyResponse) {
//                        LogUtil.d(TAG, opinionSurveyResponse.errorMsg)
//                    }
//
//                    override fun onError(e: Throwable) {
//                        LogUtil.e(e.toString())
//                    }
//
//                    override fun onComplete() {}
//                })

    }

    @Test
    fun postQueryElectricInformation(){
        val jsonObject = JSONObject()
//        jsonObject.put("pageNumber","1")
//        jsonObject.put("pageSize","20")
//        val requestBody = RequestBody.create(MediaType.parse("application/json"),
//                jsonObject.toString())
//        RetrofitManager.createApiService()
//                .postQueryElectricInformation(requestBody)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(object : Observer<OpinionSurveyResponse> {
//                    override fun onSubscribe(d: Disposable) {}
//
//                    override fun onNext(opinionSurveyResponse: OpinionSurveyResponse) {
//                        LogUtil.d(TAG, opinionSurveyResponse.errorMsg)
//                    }
//
//                    override fun onError(e: Throwable) {
//                        LogUtil.e(e.toString())
//                    }
//
//                    override fun onComplete() {}
//                })

    }

    @Test
    fun postQueryInform(){

        val jsonObject = JSONObject()
        jsonObject.put("pageNum","1")
        jsonObject.put("pageSize","20")
        jsonObject.put("check","1")

        val requestBody = RequestBody.create(MediaType.parse("application/json"),
                jsonObject.toString())

        RetrofitManager.createApiService()
                .postQueryInform(requestBody)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<CheckInformResponse> {
                    override fun onSubscribe(d: Disposable) {}

                    override fun onNext(checkInformResponse: CheckInformResponse) {
                        LogUtil.d(TAG, checkInformResponse.errorMsg)
                    }

                    override fun onError(e: Throwable) {
                        LogUtil.e(e.toString())
                    }

                    override fun onComplete() {}
                })

    }

    @Test
    fun testRxJava(){

        Observable.create(ObservableOnSubscribe<String> {




        })

    }



}
