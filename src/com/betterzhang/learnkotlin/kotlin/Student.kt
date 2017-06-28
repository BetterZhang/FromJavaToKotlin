package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 上午 10:17
 * Desc   : description
 */
class Student(private var school: String? = null, name: String) : People(name) {

    override fun sayHello() {
        super.sayHello()
        println("Hello Student")
    }

}