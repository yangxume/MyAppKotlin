package com.xy.myappkotlin

import org.junit.Test

class KotlinTest01_基础语法{

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
    fun testSum(){

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

    @Test
    fun testVar(){

        //定义常量和变量
        var a:Int = 1
        val b:Int = 13
        val c = 9

        println(a)
        println(b)
        println(c)

    }

    @Test
    fun testStr(){

        var a = 1;
        var s1 = "s is $a"

        println("s1 = "+s1)

        var s2 = s1.replace("is","was")

        println("s2 = "+s2)

        a = 2
        var s3 = "${s1.replace("is","was")},but now is $a"

        println("s3 = "+s3)

    }

    /**
     * NULL检查机制
       Kotlin的空安全设计对于声明可为空的参数，在使用时要进行空判断处理，
       有两种处理方式，
              1.字段后加!!像Java一样抛出空异常，
              2.字段后加?可不做处理返回值为 null或配合?:做空判断处理
     */
    @Test
    fun testNullCheck(){

//        var age : String = "23"
        var age : String = "中国"
        println("age = "+age)

        //变量后面加？表示可为空
        var age2 : Int = age?.toInt()
        println("age2 = "+age2)

        //变量后面加!!表示为空时跑出空指针异常
        var age1 : Int = age!!.toInt()
        println("age1 = "+age1)

        //为空时返回-1
        var age3 : Int = age?.toInt()?:-1
        println("age3 = "+age3)
    }

    /**
     *  当一个引用可能为 null 值时, 对应的类型声明必须明确地标记为可为 null。
         当 str 中的字符串内容不是一个整数时, 返回 null:
     */
    fun parseInt(str : String):Int?{
        return str.toInt()
    }

    @Test
    fun testParseInt(){
//        val value = parseInt("kotlin")
        val value = parseInt("365")
        println("value = "+value)
    }

    fun funNull(args : Array<String>){
        if (args.size < 2){
            println("args size must =2")
            return
        }
        val x = parseInt(args[0])
        val y = parseInt(args[1])

        if (x != null && y!= null){
            print("x+y = "+x+y)
        }
    }

    @Test
    fun testNull2(){



    }




}



