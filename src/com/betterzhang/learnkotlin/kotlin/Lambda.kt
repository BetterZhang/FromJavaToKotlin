package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 下午 1:27
 * Desc   : description
 */

fun main(args: Array<String>) {

    Thread(Runnable {
        println("Hello Kotlin")
    }).start()

    // Kotlin Lambda 表达式语法
    val sum = {x: Int, y: Int -> x + y}
    val sum1: (Int, Int) -> Int = {x, y -> x + y}
    val sum2 = fun(x: Int, y: Int): Int {
        return x + y
    }

    println(sum(2, 8))
    println(sum1(3, 9))
    println(sum2(5, 12))

}