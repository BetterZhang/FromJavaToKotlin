package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/27 下午 5:06
 * Desc   : description
 */
class Person private constructor() {

    private var name: String? = null
    private var age: Int = 25

    constructor(name: String, age: Int): this() {
        this.name = name
        this.age = age
    }

}