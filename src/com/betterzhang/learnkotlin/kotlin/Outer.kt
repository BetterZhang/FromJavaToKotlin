package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 上午 10:50
 * Desc   : 静态与非静态内部类
 */
class Outer {

    private var bar: Int = 100

    // 嵌套类
    class Nested {
        // 不能访问外部类成员
        fun foo() = "Hello Kotlin"
    }

    // 内部类
    inner class Inner {
        // 可以访问外部类成员
        fun foo() = bar
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(Outer.Nested().foo())
            println(Outer().Inner().foo())
        }
    }

}