package com.zhigaras.myapplication

fun main() {
    circleSquare(5) { it ->
        it + 2
    }
    
    someFun(5) { s, i ->
        i.toString() + s
    }
    
}

//fun kvadratSquare(a: Int): Int {
//    return a * a
//}
//
//fun krugSquare(r: Int): Double {
//    return 3.14 * r * r
//}


fun someFun(r: Int, func: (String, Int) -> Unit) {

}

fun square(n: Int): Int {
    return n * n
}

fun circleSquare(r: Int, square: (Int) -> Int): Double {
    return 3.14 * square(r)
}

fun circleSquare2(r: Int, square: (Int) -> Int): Double {
    return 3.14 * square.invoke(r)
}

fun circleSquare3(r: Int): Double {
    return 3.14 * square(r)
}