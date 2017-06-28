package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 上午 10:15
 * Desc   : description
 */
open class People(private var name: String? = null) {

    open fun sayHello() = println("Hello Kotlin")
    fun sayGood() = println("Good")

}