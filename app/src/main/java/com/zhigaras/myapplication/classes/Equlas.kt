package com.zhigaras.myapplication.classes

fun main() {
    val rambo = Solder("Rambo")
    val rambo2 = Solder("Rambo")
    val rocky = Solder("Rocky")
    
    println(rambo == rambo2)
    println(rambo.equals(rambo2)) // провалиться в метод equals()
}