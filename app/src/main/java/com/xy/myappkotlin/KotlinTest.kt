package com.xy.myappkotlin


fun main(args : Array<String>){
    KotlinTest().test()
}

class KotlinTest{

    init {
        println("fun init")
    }
    fun test(){
        println("fun test")
    }
}
