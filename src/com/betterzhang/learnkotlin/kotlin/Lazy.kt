package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 下午 2:08
 * Desc   : Kotlin懒加载
 */

val lazyValue: String by lazy {
    println("init")     // 第一次使用时才被初始化
    "Hello Kotlin"
}

fun main(args: Array<String>) {
    println(lazyValue)
    println(lazyValue)
}