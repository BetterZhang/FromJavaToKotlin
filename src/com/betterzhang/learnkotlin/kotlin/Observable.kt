package com.betterzhang.learnkotlin.kotlin

import kotlin.properties.Delegates

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 下午 2:12
 * Desc   : Kotlin observable 观察者
 */
class Person2 {
    public var name: String by Delegates.observable("init...") {
        property, oldValue, newValue -> println("property: $property, oldValue: $oldValue, newValue: $newValue")
    }
}
fun main(args: Array<String>) {
    val person = Person2()
    println(person.name)

    person.name = "Andrew Zhang"
    person.name = "Kotlin"
}