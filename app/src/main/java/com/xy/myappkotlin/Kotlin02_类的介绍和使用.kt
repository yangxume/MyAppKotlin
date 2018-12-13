package com.xy.myappkotlin


/**
 * 类的介绍和使用
 */
fun main(args : Array<String>){

    Kotlin02<String>("Kotlin-类的介绍和使用").test()

    Kotlin02<String>("Kotlin1","Kotlin2")

    Kotlin02<Int>(1,2,3)

}

/**
 *  用class关键字声明一个类，且带有以下特征：
 * 1. 泛型类<T>
 * 2. 带有指定参数类型的主构造方法 constructor(str:T)
 */
class Kotlin02<T> constructor(str:T) {

    /**
     * 声明一个全局变量
     */
    var mStr:T

    /**
     * init{}  代码块初始化全局属性
     */
    init {
        mStr = str
    }

    /**
     * * 二级构造方法：
     *  1. 必需添加constructor关键字。
     *  2. 若是类的声明中有主构造方法，必需使用this（参数...）传递参数进行调用。
     */
    constructor(mstr1:T,mstr2:T):this(mstr1){

        var mstr3 = "${mstr1}和${mstr2}"
        println("mstr3 = "+mstr3)

    }

    constructor(mstr1: T,mstr2: T,mstr3:T):this(mstr1,mstr2){

        println("mstr1 = "+mstr1)
        println("mstr2 = "+mstr2)
        println("mstr3 = "+mstr3)
    }

    fun test(){
        println("mStr = "+mStr)
    }
}
