package com.zhigaras.myapplication

fun main() {
    val a = 0
    val b = 2
    if (a > b)
        println("a>b")
     else if (a<b) {
        println("a<b")
    } else {
        println("a=b")
    }
    
    val count = 7
    
    when (count) {
        2 -> println()
        
        8 -> {
            println()
        }
        in (1..9) -> println()
        else -> println()
    }
    
    
}
