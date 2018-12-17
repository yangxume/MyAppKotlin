package com.xy.myappkotlin.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.xy.myappkotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    private lateinit var btn_01 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

        // Example of a call to a native method
        sample_text.text = stringFromJNI()
    }

    private fun initView() {

        btn_01 = findViewById(R.id.btn_01);

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }

    override fun onClick(v: View?) {

        val id: Int = v!!.id

        test1()
    }

    private fun test1() {

    }

    private fun sum(a: Int,b:Int):Int{
        return a+b
    }
}
