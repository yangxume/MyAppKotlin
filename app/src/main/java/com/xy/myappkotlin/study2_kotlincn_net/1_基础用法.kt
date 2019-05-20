/**
 * 基本语法
 *
 * https://www.kotlincn.net/docs/reference/basic-syntax.html
 */

/**
 * 1定义包
 */
package com.xy.myappkotlin.study2_kotlincn_net

import android.os.Build
import android.support.annotation.RequiresApi
import android.support.constraint.solver.widgets.Rectangle
import android.view.View.Y
import java.util.regex.Pattern


/**
 * 2定义函数
 *
 * 2个Int类型的参数，返回值Int 类型
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

//表达式作为函数体，返回值类型自动推断
fun sum2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum $a of $b is ${a + b}")
}

//Unit 返回值类型可以省略
fun printSum2(a: Int, b: Int) {
    println("sum $a of $b is ${a + b}")
}

/**
 * 3 定义变量
 */

//只读变量
fun defineVal() {

    //定义局部只读变量只能用val 关键字，且只能赋值一次
    val a: Int = 1 //完整定义：声明类型并赋值
    val b = 2      //省略变量类型:kotlin 自动推断出类型
    val c: Int     //如果没有初始值类型不能省略
    c = 3          //明确赋值

}

//可二次赋值变量
fun defineVar() {

    //可重新赋值的变量用关键字 var
    var x = 0 //自动推断出类型
    x += 5

}

//顶层变量
val PI = 3.14
var x = 0

fun incrementX() {
    x += 1
}

/**
 * 4 注释
 *
 * kotlin 注释可以嵌套
 */

//单行注释

/**
 *
 * 多行注释
 */

/**
 * 5 使用字符串模版
 */
fun strMuBan() {

    var a = 1
    var s1 = "a is $a"
    a = 2
    var s2 = "${s1.replace("is", "was")} but now is $a"

}

/**
 * 6 使用条件表达式
 */
fun tiaoJian(a: Int, b: Int): Int {

    if (a > b) {
        return a
    } else {
        return b
    }

}

//if 表达式
fun tiaoJian2(a: Int, b: Int) = if (a > b) a else b


/**
 * 7 使用可空值及 null 检测
 */

//如果某个变量可以为Null 的时候，必须在声明类型的时候添加 ? 来标识该引用可为空
fun parseInt(str: String): Int? {

    if (str.isEmpty()) {
        return null
    } else {

        val pattern = Pattern.compile("[0-9]*")
        val isNum = pattern.matcher(str)

        if (isNum.matches()) {
            val parseInt = Integer.parseInt(str)
            return parseInt
        } else {
            return null
        }
    }
}

fun checkNull(arg1: String, arg2: String) {

    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x == null) {
        println("arg1 is null")
        return
    }

    if (y == null) {
        println("arg2 is null")
        return
    }

    println(x * y)

}

/**
 *
 * 8 使用类型检测及自动类型转换
    is 运算符检测一个表达式是否某类型的一个实例。
    如果一个不可变的局部变量或属性已经判断出为某类型，
    那么检测后的分支中可以直接当作该类型使用，无需显式转换
 */
@RequiresApi(Build.VERSION_CODES.O)
fun getStrLength(obj: Any): Int? {

    //此处obj 属于Any 类型
    val typeName = obj.javaClass.typeName
    println(typeName)

//    if (obj is String){
//        //此处obj 属于String 类型
//        return obj.length
//    }
//    //此处obj 属于Any 类型
//    return null


//    if (obj !is String) return null
//
//    return obj.length


    if (obj is String && obj.length > 0) {
        return obj.length
    }

    return null

}

/**
 * 9 使用for 循环
 */
fun useFor() {

    var items = listOf("zhangsan", "lisi", "wangwu")

//    for (item in items){
//        println(item)
//    }

    for (index in items.indices) {
        println("index $index is ${items[index]}")
    }

}

/**
 * 10 使用while 循环
 */
fun useWhile() {

    var items = listOf("aa", "bb", "cc")
    var index = 0;

    while (index < items.size) {
        println("index $index is ${items[index]}")
        index++
    }
}

/**
 * 11 使用when 表达式
 */
fun useWhen(obj: Any): String =
    when (obj) {

        1 -> "One"
        "Hi" -> "Hello"
        is Long -> "Long"
        !is String -> "is not String"
        else -> "unknown"
    }


/**
 * 12 使用区间（range）
        使用 in 运算符来检测某个数字是否在指定区间内
 */
fun useRange(){

    var x = 10
    var y = 9

    if (x in 1..y+1){
        println("fit in range")
    }

}
//检测某个数字是否在指定区间内
fun useRange2(){

    var items = listOf("orange","apple","balala")

    var x = 4

    for (index in items.indices){
        println("index: $index valuse is ${items[index]} && items.indeces = ${items.indices}")
    }

    if (x !in 0..items.lastIndex){
        println("x is out of index range")
    }else{
        println("x is in of index range")
    }

}

fun useRange3(){

    var items = listOf("aa","bb","c")

    for (x in items){
        println("x is $x")
    }

    for (y in 1..10 step 2){
        println("y is $y")
    }

    for (z in 9 downTo 0){
        println("z is $z")
    }

}

/**
 * 13 使用集合
 */
fun useList(){

    var items = listOf("apple","orange","balala")

    for (item in items){
        println("item = $item")
    }

    when{
        "apple" in items -> println("has apple")
        "orange" in items -> println("has Orange")
    }


}

//使用 lambda 表达式来过滤（filter）与映射（map）集合：
fun useLambda(){

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")

    fruits.filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it. toUpperCase()}
        .forEach { println(it) }


}


/**
 * 14 创建基本类及其实例
 */
fun createBaseCla(){

    val rectangle = Rectangle()
    rectangle.width = 30
    rectangle.height = 20
}


@RequiresApi(Build.VERSION_CODES.O)
fun main(args: Array<String>) {

//    val i1 = parseInt("1")
//    println(i1)
//    val i2 = parseInt("abc")
//    println(i2)

//    checkNull("1","3")

//    getStrLength("abcdferer")

//    useFor()

//    useWhile()

//    println(useWhen("1"))

//    useRange()
//    useRange2()
//        useRange3()

    useList()

}











