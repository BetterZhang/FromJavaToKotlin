package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 下午 2:18
 * Desc   : Kotlin闭包
 */

val plus = {x: Int, y: Int -> println("$x plus $y is ${x + y}")}

val hello = {println("Hello Kotlin")}

fun main(args: Array<String>) {

    {x: Int, y: Int ->
        println("$x plus $y is ${x + y}")
    }(2, 8)     // 自执行的闭包

    plus(2, 8)
    hello()

}