package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/27 下午 5:10
 * Desc   : description
 */
class Manager private constructor() {

    companion object {
        fun getInstance(): Manager = Manager()
    }

}