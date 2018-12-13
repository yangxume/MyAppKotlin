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
 * ****************************************************************************************************************************
 * 2.类的构造方法：
            在Kotlin中类，可以有一个主构造函数和多个二级构造函数。

            1. 主构造方法：

            跟着在类名后面，constructor(t :T)表示。

            T是主构造方法的参数类型，t是参数名

            主构造函数没有注解或可见性说明，则 constructor 关键字是可以省略。例如：class Test (str:String){}

            构造方法的作用是：初始化。
 ****************************************************************************************************************************
 */


/**
 *
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

/**
 * ****************************************************************************************************************************
 * 1.定义一个类：
            用class关键字来声明类。

            类的声明形式：class 类名<某个类型> constructor (参数名：参数类型)。
            例如：class Test<T> constructor(str:T){ }

            不指定某个类型的类，可以省略<T>。例如：class Test constructor(str:String){}

            不指定类的主构造方法,可以省略constructor(str:T)。例如： class Test{}

 ****************************************************************************************************************************
 * */


/**
 *  类的声明形式：class 类名<某个类型> constructor (参数名：参数类型)。
    例如：class Test<T> constructor(str:T){ }
 */
class Class1<T> constructor(str:T){

    var mStr:T

    init {
        mStr = str
    }

    fun test(){
        println(mStr)
    }

}

/**
 * 不指定某个类型的类，可以省略<T>。例如：class Test constructor(str:String){}
 */
class Class2 constructor(str: String){

    var mStr:String

    init {
        mStr = str
    }

    fun test(){
        println(mStr)
    }
}
/**
 * 不指定类的主构造方法,可以省略constructor(str:T)。例如： class Test{}
 */
class Class3{
    init {
        print("hello kotlin")
    }
}





