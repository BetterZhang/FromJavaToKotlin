package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 下午 2:08
 * Desc   : Kotlin懒加载
 */

class Lazy {

    private var name1: String? = null
    private var name2: String = ""

    // lateinit是用来告诉编译器，name 这个变量后续会妥善处置的
    private lateinit var name3: String

    companion object {
        val lazyValue: String by lazy {
            println("init")     // 第一次使用时才被初始化
            "Hello Kotlin"
        }

        @JvmStatic
        fun main(args: Array<String>) {
            println(lazyValue)
            println(lazyValue)
        }
    }
}