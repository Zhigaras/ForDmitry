package com.zhigaras.myapplication

fun main() {

    for (i in 1..100) {
        println(i)
    }

    val list = listOf("asd", "qwe", "zxc")

    for (i in list) {
        println(i)
    }

    for (i in list.indices) {
        println("элемент по индексу $i="+list[i])
    }
    var counter = 0
    while (counter < 10) {
        println(counter)
        counter ++
    }
    
    do {
        println(counter)
        counter++
    } while (counter<10)
    
}