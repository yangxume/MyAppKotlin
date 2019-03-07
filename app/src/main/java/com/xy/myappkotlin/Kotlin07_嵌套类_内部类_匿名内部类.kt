package com.xy.myappkotlin

fun main(args : Array<String>){

    val outterClass = OutterClass()

    println("----------嵌套类----------")
    val nested = OutterClass.Nested()
    nested.funNested()

    println("----------内部类----------")
    val inner = outterClass.Inner()
    inner.funInner()

    println("----------匿名内部类----------")
    outterClass.setTestInterface(object : TestInterface{

        override fun funInterface() {
            println("对象表达式创建匿名内部类的实例")
        }

    })

}

class OutterClass{

    val property = "我是OutterClas 中的属性"

    /**
     * 一个在类中嵌套的类
     * 引用不到外层嵌套类的成员
     */
    class Nested{

        fun funNested(){
            println("我是嵌套类中的方法,无法访问外部嵌套类的属性")
        }
    }

    inner class Inner{

        fun funInner(){

            println("我是内部类中的方法,可以访问外部内中的属性：property = "+property)
        }
    }

    fun setTestInterface(testInterface: TestInterface){
        testInterface.funInterface()
    }
}

interface TestInterface{

    fun funInterface()
}