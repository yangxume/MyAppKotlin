package com.xy.myappkotlin.study1_csdn

fun main(args : Array<String>){

    val test = Test()

    println(test.time1)

    println(test.time2)

    val test1 = Test1()
    val var_str = test1.var_str
    setOf(test1)

}

/**
 *  属性的形式
    备用字段
    属性的延迟初始化
    静态常量属性
 */
class Test{

    /**
     *1.属性的形式
        在Kotlin中，类的属性分类：
        可变属性：用var关键字声明的属性
        只读属性：用val关键字声明的属性
     */
    fun test(){

        /**
         * var关键字声明可变属性，默认实现了 get()和set()
        */
        var var_str : String = "var_str"
        var_str = "var_str+1111"//可变

        /**
         * val声明的只读属性，一旦初始化后，是不能被重新赋值的。
         */
        val val_int : Int = 3
//        val_int = 13 //不可变

    }

    /**
     *  val声明的只读对象的语法：
        val 属性名 ：属性的类型 = 初始化的值
        get( ){  return 返回的值   }

        val声明的属性是没有set()方法
        val声明的属性中，get()和属性类型是可以省略的
     */
    val time1 = "20181216"

    val time2 : String get() {
        return  "20181217"
    }

}

class Test1{

    var var_str = "20181111"

    get() {
        return field
    }

    set(value) {
        if (value.toInt() < 10000){

        }else{

        }
    }

}

