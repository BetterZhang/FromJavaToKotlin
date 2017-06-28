package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 上午 9:56
 * Desc   : description
 */
class Book : Readable {

//    override fun getContent(): String {
//        return "Hello Kotlin"
//    }

    override fun getContent(): String = "Hello Kotlin"

    override fun getVersion(): Int {
        return super.getVersion()
    }

}