package com.xy.myappkotlin


fun main(args : Array<String>){

    Kotlin03().test1()

    val test2Result = Kotlin03().test2()
    println(test2Result)

    Kotlin03().test3("aaa")

    val test4Result = Kotlin03().test4("123")
    println(test4Result)

}

class Kotlin03{


    fun test1(){
        println("kotlin 方法之无参无返回值")

    }

    fun test2():String{
        println("kotlin 方法之无参有返回值")
        return "result is aaa"
    }

    fun test3(parms : String){
        println("kotlin 方法之有参无返回值")
        println("params is "+parms)
    }
    fun test4(parms: String): Int{
        println("kotlin 方法之有参有返回值")
        return parms.toInt()
    }

}

