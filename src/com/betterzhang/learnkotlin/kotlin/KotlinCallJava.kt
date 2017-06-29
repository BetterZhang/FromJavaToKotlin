package com.betterzhang.learnkotlin.kotlin

import com.betterzhang.learnkotlin.java.Person

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 上午 11:22
 * Desc   : description
 */

class KotlinCallJava {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var p = Person("Andrew Zhang", 25)
            println(p.toString())
        }
    }
}