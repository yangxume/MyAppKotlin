package com.xy.myappkotlin

import org.junit.Test

//包修饰符
private  var v1 = "该属性同一源文件中可以访问"

internal var v2 = "该属性同一模块中可以访问"

public   var v3 = "该属性任何地方均可访问"

open class BaseTest{

    private   var a = "private修饰的属性子类不能访问"
    protected var b = "protected修饰的属性子类能访问"
    internal  var c = "internal修饰的属性同一模块中可以访问"
    public    var d = "public修饰的属性任何地方可以访问"

}

class Test: BaseTest() {

    @Test
    fun test(){

//        println(a);
        println(b)
        println(c);
        println(d);
    }

}