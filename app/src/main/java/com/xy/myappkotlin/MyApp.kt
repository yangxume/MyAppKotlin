package com.xy.myappkotlin

import android.app.Application
import com.okay.t_x5webview.X5WebView

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        //初始化x5浏览器
        X5WebView.init(getApplicationContext());

    }


}