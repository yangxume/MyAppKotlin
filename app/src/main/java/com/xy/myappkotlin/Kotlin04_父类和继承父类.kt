package com.xy.myappkotlin

fun main(args : Array<String>){



}

class BaseTest<T> constructor(val t:T){


    fun test(){
        println("${t} BaseTest 父类")
    }

    fun closeTest(){
        println("父类中到方法不能被")
    }

}