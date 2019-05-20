package com.xy.myappkotlin.study1_csdn

fun main(args : Array<String>){

    println("----------伴生对象----------")

    //伴生对象
    val companionObject = TestCompanionObject()
    TestCompanionObject.instance.test()
    TestCompanionObject.companionObjectMethod()

    println("----------抽象类----------")

    val abstractSon = TestAbstractSon()
    abstractSon.funAbstract()

//    TestAbstractSon.instance.funAbstract()
    TestAbstractSon.funCompanionObj()

    println("----------密封类----------")
    testSealed(BaseClass.Test1())
    testSealed(BaseClass.Test2())
    testSealed(BaseClass.Test3())


}

class TestCompanionObject{

    fun test(){
        println("伴生对象的静态调用对象，通过对象再调用方法")
    }

    companion object Factory{

        var instance = TestCompanionObject()

        fun companionObjectMethod(){
            println("伴生对象的静态调用方法")
        }

    }
}

abstract class TestAbstract{

    val property = "抽象类中的属性"

    abstract fun funAbstract()

    fun funTest(){
        println("抽象类里面已经实现的方法")
    }
}

class TestAbstractSon : TestAbstract() {

    override fun funAbstract() {
        println("子类访问抽象类中的值：property = "+property)
        println("子类实现抽象类的方法")
    }

    companion object {
        var instance = TestAbstractSon()

        fun funCompanionObj(){
            println("我是伴生对象中的方法")
        }

    }

}

sealed class BaseClass{

    class Test1 : BaseClass(){
        override fun test() {
            println("Test1 实例")
        }
    }

    class Test2 : BaseClass(){
        override fun test() {
            println("Test2 实例")
        }
    }

    class Test3 : BaseClass(){
        override fun test() {
            println("Test3 实例")
        }
    }

    open fun test(){
        println("BaseClass 实例")
    }
}

fun testSealed(instanse: BaseClass)= when(instanse){

    is BaseClass.Test1 -> instanse.test()

    is BaseClass.Test2 -> instanse.test()

    is BaseClass.Test3 -> instanse.test()
}