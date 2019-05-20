package com.xy.myappkotlin.study1_csdn


fun main(args : Array<String>){

    Kotlin03().test1()

    val test2Result = Kotlin03().test2()
    println(test2Result)

    Kotlin03().test3("aaa")

    val test4Result = Kotlin03().test4("123")
    println(test4Result)

    //调用包级别的方法
    pkgFun()


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

    fun testPkgFun(){
        //静态方式调用包级别的方法
        pkgFun()
    }

}

/**
 * 静态方法
 * Kotlin中没有Java中的静态方法。但是有三种实现的方式：
 * 1. 使用包级别的函数，即源文件中包含函数:
 *
 */
fun pkgFun(){

    println("i am is a fun of package")

}

