package com.xy.mobileplayer.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 *Copyright
 *
 *Created by xuyang on 2018/12/4 21:55
 *
 *email xuyangme@126.com
 *
 *${FILENAME}
 *
 *Description
 *
 *Update records:
 */
abstract class BaseFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return  initView()
    }

    abstract fun initView(): View?


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initData()
        initListener()
    }

    protected fun initData() {


    }

    protected fun initListener() {


    }


}