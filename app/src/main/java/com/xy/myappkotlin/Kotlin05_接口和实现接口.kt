package com.xy.myappkotlin

/**
 *Copyright
 *
 *Created by xuyang on 2019/1/1 21:16
 *
 *email xuyangme@126.com
 *
 *${FILENAME}
 *
 *Description
 *
 *Update records:
 */
fun main(args : Array<String>){

    val kotlin05Test = Kotlin05Test()

    val property = kotlin05Test.property

    val propertyImpl = kotlin05Test.propertyImpl

    println(property)

    println(propertyImpl)

    kotlin05Test.test()

    kotlin05Test.test1()


}

class Kotlin05Test : TestInterface{

    override val property: String
        get() = "实现类初始化接口中的属性"

    override fun test1() {
        println("实现类重写接口方法")
    }

}


interface TestInterface{


    val property : String

    val propertyImpl : String get()  = "这是接口内部已经赋值的属性"

    fun test(){

        println("这是接口中的方法test()")

    }

    fun test1()

}