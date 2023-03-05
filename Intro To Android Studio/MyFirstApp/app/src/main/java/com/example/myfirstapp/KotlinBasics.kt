package com.example.myfirstapp

fun main() {
    var denis = Person("Denis", "Panjuta")
    var john = Person()
    var johnPeterson = Person(lastName = "Peterson")
}

class Person constructor(firstName: String = "John", lastName: String = "Doe") {

    init {
        println("Person created with first name $firstName and last name $lastName")
    }
}