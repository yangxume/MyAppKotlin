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

//    val myClass1 = MyClass1()
//    println(myClass1.abstraceProperty)
//    println(myClass1.propertyImpl)
//    myClass1.abstractFun()
//    myClass1.interfaceFun()

    val sonClass = SonClass("本类是：")
    sonClass.test()
}


class MyClass1 : kotlinInterface1{

    //接口中定义的属性必须在实现类中初始化
    override val abstraceProperty: String
        get() = "实现类：接口中抽象属性在实现类中实现"

    override fun abstractFun() {
        println("实现类：接口中的抽象方法实现")
    }
}

interface kotlinInterface1{

    //抽象属性
    val abstraceProperty : String

    val propertyImpl : String get() = "接口：接口中抽象属性的实现用get()"

    fun interfaceFun(){
        println("接口：我是接口中定义的方法")
    }

    fun abstractFun()

}


interface interface1Child{

    val childProperty : String
    fun playing()
    fun crying()

}

interface interfaceStudent{

    val studentProperty : String
    fun reading()
    fun writing()

}
/**
 * 1/定义接口关键字：interface
 * 2/接口中有两种方法（抽象方法和方法的实现），有两种属性（抽象属性和属性访问器的实现）,这与Java有很大的不同。
 * 3/实现接口，在类头后面添加:接口名
 * 4/一个类可以实现一个或多个接口
 * 5/接口中只有val修饰的只读属性，没有var修饰的可写属性
 * 6/实现接口，必需重写抽象属性和抽象方法，且用override修饰。
 * 7/接口的方法和属性默认open修饰的
 * 8/实现接口，在类头后面添加:接口名，而继承父类是:父类名()
 * 9/接口的方法的默认open修饰的
 *10/当父类和接口或者多个接口中中有同名方法时候，调用应该使用super<类名>.同名方法的形式调用
 */
class Person : interface1Child,interfaceStudent{

    override val childProperty: String
        get() = "7岁以下幼儿，爱哭"
    override val studentProperty: String
        get() = "7岁后上学了"

    override fun playing() {
    }

    override fun crying() {
    }

    override fun reading() {
    }

    override fun writing() {
    }
}

open class FatherClass<T>(open val t:T){

    open fun test(){
        println("我是父类中的test()")
    }

    fun closeTest(){
        println("父类中不能被子类重写的方法")
    }

}

interface Interface2{
    //接口的成员变量默认是 open 的
    fun test(){
        println("我是接口中的test()")
    }
}

//当父类和接口或者多个接口中中有同名方法时候，调用应该使用super<类名>.同名方法的形式调用。
class SonClass<T> constructor(override var t:T) : FatherClass<T>(t),Interface2{

    override fun test() {

        println("${t} FatherClass 子类")
        super<Interface2>.test()
        super<FatherClass>.test()

    }

}