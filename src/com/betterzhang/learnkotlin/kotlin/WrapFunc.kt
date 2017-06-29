package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 下午 1:54
 * Desc   : Kotlin泛型函数
 */

class WrapFunc {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val list = singletonList<String>("Kotlin", "Java")
            for (item in list) {
                println(item)
            }
        }

        private fun <T> singletonList(item1: T, item2: T): List<T> {
            return arrayListOf(item1, item2)
        }
    }
}