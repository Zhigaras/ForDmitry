package com.zhigaras.myapplication


val byte: Byte = 0
val short: Short = 0
val int: Int = 2
val long = 0L
val float: Float = 0f
val double = 40.2983793

var b: String = "asd"
val boolean: Boolean = true
val char: Char = 'q'

val pair = "asd" to 3
val triple = Triple("qwe", 34, false)

val doubleArray = arrayOf(32.4, 234.1213, 456.2)

val list = listOf(32, 43, 6)
val array = arrayOf(1, 2, 3, 4, 5)
val mutableList = mutableListOf(1, 34, 54)

val map = mapOf("Vasya" to listOf(1, 3), "Vova" to 3497523)

val set = setOf(1, 2, 3, 4, 1, 1, 1, 2, 3)

fun main() {
//    println(set)
    
    val string = "q2peoir3up3qoweq4p"
    val str2 = string.map { it + 1 }
//    val digits = string.filter { it == 'q' }
//    val digits2 = string
    println(str2)
}
