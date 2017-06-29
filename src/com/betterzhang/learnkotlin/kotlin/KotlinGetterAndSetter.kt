package com.betterzhang.learnkotlin.kotlin

import java.util.*

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/29 下午 5:20
 * Desc   : Kotlin Getter and Setter
 */
class KotlinGetterAndSetter {

    var x: Int = 0
        set(value) {field = value}
        get() = field

    var y: Int = 0
        set(value) {
            var date = Calendar.getInstance().apply {
                set(2017, 2, 18)
            }
            if (System.currentTimeMillis() < date.timeInMillis) {
                println("Cannot be set before 2017.3.18")
            } else {
                field = value
            }
        }
        get() {
            println("Get field y: $field")
            return field
        }

}