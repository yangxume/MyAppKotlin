package com.xy.mobileplayer.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.toast

/**
 *Copyright
 *
 *Created by xuyang on 2018/12/4 21:51
 *
 *email xuyangme@126.com
 *
 *${FILENAME}
 *
 *Description
 *
 *Update records:
 */
abstract class BaseActivity : AppCompatActivity(),AnkoLogger {

    private val TAG = "BaseActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(getLayoutid())
        initListener();
        initData()

    }

    open protected fun initData() {


    }

    protected fun initListener() {


    }

    abstract fun getLayoutid(): Int

    protected fun showMyToast(msg : String){
        runOnUiThread {

            toast("haha")
        }
    }


}