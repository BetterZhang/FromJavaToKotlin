package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 下午 1:18
 * Desc   : 泛型
 */
class Wrapper<T>(val item: T)

fun main(args: Array<String>) {
    var wrapper = Wrapper("Hello Kotlin")
    println(wrapper.item)
}