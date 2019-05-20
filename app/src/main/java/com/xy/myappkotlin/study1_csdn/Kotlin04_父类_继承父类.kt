package com.xy.myappkotlin.study1_csdn

fun main(args : Array<String>){

    var instance: BaseTest<String>
    instance = Kotlin4Test<String>("本类是")

    //父类对象调用子类对象的方法
    instance.test()

    instance.closeTest()

}

/**
 * open关键字：
 * 1. 修饰父类:open class BaseTest
 * 2. 主构造方法中声明的属性:open val t: T
 * 3. 修饰方法:open fun test(){ }
 *
 * 默认情况下，Kotlin中的类，属性，方法都是被final修饰的，不允许继承或者覆盖重写。
 */
open class BaseTest<T>( open val t: T) {
    open fun test() {
        println("${t} BaseTest父类 ")
    }
    fun closeTest(){
        println("父类中不能被子类重新复写的方法")
    }
}
/**
 *  继承自定义的BaseTest父类
 *  覆盖属性t
 *  复写test（）
 */
class Kotlin4Test<T> constructor(override var t: T) : BaseTest<T>(t) {
    /**
     * 复写父类中的方法
     */
    override fun test() {
        println("${t} Test子类 ")
    }
}
