package com.zhigaras.myapplication.classes

fun main() {
    
    val john = Person("John", 30)
    val jackDog = Dog("Jack")
    john.walkWithDog(jackDog)

}

class Person(val name: String, val age: Int) {
    
    fun walkWithDog(dog: Dog) {
        println("$name is walking with dog named ${dog.name}")
    }
}

class Dog(val name: String)