package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/29 下午 5:03
 * Desc   : 获得class的实例
 */
class ClassZZ {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // ClassZZ::class拿到的是Kotlin的KClass,再转换成Java的class实例
            val clazz = ClassZZ::class.java
            println(clazz)

            val c = ClassZZ()
            val clazz2 = c.javaClass
            println(clazz2)
        }
    }

}