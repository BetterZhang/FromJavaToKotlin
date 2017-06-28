package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 下午 1:41
 * Desc   : Kotlin高阶函数
 */

fun main(args: Array<String>) {

    // 使用高阶函数
    superFun("这是一个高阶函数", ::argFun)
    superFun("这是一个高阶函数", { argFun()})
    superFun("这是一个高阶函数") { argFun()}

}

fun argFun() = " 我是高阶函数的参数"

fun superFun(desc: String?, method: () -> String) {
    print(desc)
    println(method())
}