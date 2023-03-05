package com.example.myfirstapp

fun main() {
    var denis = Person("Denis", "Panjuta")
    var john = Person()
    var johnPeterson = Person(lastName = "Peterson")

    val iphone = MobilePhone("iOS", "Apple", "iPhone 12")
    val galaxyS20 = MobilePhone("Android","Samsung", "Galaxy S20")
    val mateXS = MobilePhone("Android", "Huawei", "Mate X S")
}

class Person constructor(firstName: String = "John", lastName: String = "Doe") {

    init {
        println("Person created with first name $firstName and last name $lastName")
    }
}

class MobilePhone constructor(osName: String, brand: String, model: String) {

    init {
        println("OS Name: $osName brand: $brand model: $model")
    }
}