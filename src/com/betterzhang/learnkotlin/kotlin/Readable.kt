package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 上午 9:55
 * Desc   : description
 */
interface Readable {

    fun getContent(): String
    fun getVersion(): Int = 0

}