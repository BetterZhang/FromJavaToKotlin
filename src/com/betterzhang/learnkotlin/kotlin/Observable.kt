package com.betterzhang.learnkotlin.kotlin

import kotlin.properties.Delegates

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 下午 2:12
 * Desc   : Kotlin observable 观察者
 */
class Observable {

    public var name: String by Delegates.observable("init...") {
        property, oldValue, newValue -> println("property: $property, oldValue: $oldValue, newValue: $newValue")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val person = Observable()
            println(person.name)

            person.name = "Andrew Zhang"
            person.name = "Kotlin"
        }
    }

}