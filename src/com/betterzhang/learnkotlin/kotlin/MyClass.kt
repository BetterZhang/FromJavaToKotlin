package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 上午 11:10
 * Desc   : 扩展函数
 */
class MyClass {
    fun foo() = println("member")
}

fun MyClass.bar() = println("extension")

fun MyClass.foo() = println("extension foo")

fun MyClass.foo(para: Int) = println("extension foo Int")

fun main(args: Array<String>) {
    MyClass().bar()
    MyClass().foo()     // 扩展函数与成员函数相同时，成员函数优先
    MyClass().foo(10)
}