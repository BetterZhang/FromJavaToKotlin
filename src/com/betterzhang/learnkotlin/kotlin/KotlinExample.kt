package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/27 上午 10:48
 * Desc   : description
 */

fun main(args: Array<String>) {

    print("Andrew Zhang\n")
    println("Andrew Zhang")

    var name1 = "Andrew Zhang"
    val name2 = "Andrew Zhang"

    var otherName: String?
    otherName = null

    var text: String? = "abc"
    text?.let {
        val length = text.length
    }
    // or simple
    val length = text?.length

    val firstName = "Andrew"
    val lastName = "Zhang"
    val message = "My name is: $firstName $lastName"

    val text2 = """
                |First Line
                |Second Line
                |Third Line
                """.trimMargin()

    val x: Int = 10
    val text3 = if (x > 5)
                    "x > 5"
                else
                    "x <= 5"
    val message2: String? = null
    println(message2 ?: "")

    val a: Int = 10
    val b: Int = 20
    val andResult = a and b
    val orResult = a or b
    val xorResult = a xor b
    val rightShift = a shr 2
    val leftShift = a shl 2

    var obj: Any = Any()
    if (obj is Developer) {

    }
    var developer: Developer = obj as Developer

    if (obj is Developer) {
        var developer: Developer = obj      // smart casting
    }

    val score: Int = 80
    if (score in 0..300) {}

    var grade = when (score) {
        9, 10 -> "Excellent"
        in 6..8 -> "Good"
        4, 5 -> "Ok"
        in 1..3 -> "Fail"
        else -> "Fail"
    }

    for (i in 1..10) {}
    for (i in 1 until 10) {}
    for (i in 10 downTo 0) {}
    for (i in 1..10 step 2) {}
    for (i in 10 downTo 0 step 2) {}
    val collection = listOf("a", "b", "c")
    for (item in collection) {}
    val map = mapOf("a" to "one", "b" to "two")
    for ((key, value) in map) {}

    val listOfNumber = listOf(1, 2, 3, 4)
    listOfNumber.forEach { println(it) }
    val keyValue = mapOf(1 to "one", 2 to "two", 3 to "three")
    for ((key, value) in keyValue) {
        println("$key, $value")
    }
    // or
    keyValue.forEach { key, value -> println("$key, $value") }

    val developers = listOf(Developer("John", 20), Developer("Lucy", 24))
    developers.forEach { println(it.name) }
    developers.filter { it.age > 30 }.forEach { println(it.age) }

    fun doSomething1() {
        // logic here
    }

    fun doSomething2(vararg numbers: Int) {
        // logic here
    }

    val score2: Int = 80
    fun getScore(): Int {
        return score2
    }
    fun getScore2(): Int = score2

    fun getScore3(value: Int): Int {
        // logic here
        return 2 * value
    }
    fun getScore4(value: Int): Int = 2 * value

    // cloning or copying
    val dev = Developer("Mark", 21)
    val dev2 = dev.copy()
    // in case you only want to copy selected properties
    val dev3 = dev.copy(age = 25)

    var (name, age) = dev
    println("$name, $age")

    Util.getScore(5)

    fun Int.triple(): Int {
        return 3 * this
    }

    val result = 3.triple()
    val developer4: Developer

    var list = listOf("java", "c++", "Android", "Kotlin", "iOS")
    list.map { "Hello $it" }
            .filter { !it.contains("c") }
            .forEach { it }

}

class Util private constructor() {
    companion object {
        fun getScore(value: Int): Int {
            return 2 * value
        }
    }
}

// other way is also there
object Util2 {
    fun getScore(value: Int): Int {
        return 2 * value
    }
}