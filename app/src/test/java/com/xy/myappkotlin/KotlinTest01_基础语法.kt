package com.xy.myappkotlin

import org.junit.Test

class Kotlin01Test{

    @Test
    fun helloWorld(){
        print("hello world")
    }


    //函数定义使用关键字 fun，参数格式为：参数 : 类型
    fun sum1(a:Int,b:Int):Int{
        return  a+b
    }

    //表达式作为函数体，返回类型自动推断：
    fun sum2(m:Int,n:Int) = m+n

    //无返回值的函数(类似Java中的void)：
    fun sum3(i:Int,j:Int):Unit{
        println(i+j)
    }

    //如果是返回 Unit类型，则可以省略(对于public方法也是这样)：
    fun sum4(i:Int,j:Int){
        println(i+j)
    }

    @Test
    fun TestSum(){

        val sum1 = sum1(3, 2)
        println("sum = "+sum1)
        println("sum1 = "+sum2(11,45))

        sum3(99,22)
        sum4(15,12)
    }

//    可变长参数函数
//    函数的变长参数可以用 vararg 关键字进行标识：
    fun vars(vararg v:Int){

        for (vt in v){
            println(vt)
        }
    }

    @Test
    fun testVars(){
        vars(1,2,3,4,6)
    }

    fun main(args:Array<String>){

        val sumLambda: (Int,Int) -> Int = {x,y -> x+y}
        print(sumLambda(1,3))

    }

}



