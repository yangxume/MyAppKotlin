package com.xy.myappkotlin

//这个的main（）是属于包级别的函数
fun main(args: Array<String>){
//    创建类对象，不需要使用new关键字
    Test().run()
}

class Test{

    fun run(){
        println("hello kotlin !");
    }

}