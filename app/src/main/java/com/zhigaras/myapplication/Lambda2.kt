package com.zhigaras.myapplication

fun main() {
    val array = arrayOf(-1, 2, 3, -4)
    printAllPositive(array) {
        asd(it)
    }
    
    printAllPositive(array) {
        it > 0
    }
}

fun asd(i: Int): Boolean {
    return i > 0
}

fun printAllPositive(array: Array<Int>, func: (Int) -> Boolean) {
    for (item in array) {
        val isPositive = func(item)
        if (isPositive)
            println(item)
    }
}