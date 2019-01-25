package com.kotlin.retrofit.basic_use.bean

class ErrorEntity {

    lateinit var errorMessage : String

    companion object {
        @JvmStatic
        fun parse(string: String): ErrorEntity {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }


}