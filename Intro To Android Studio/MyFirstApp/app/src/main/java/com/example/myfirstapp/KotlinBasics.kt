package com.example.myfirstapp

fun main() {
    var denis = Person("Denis", "Panjuta", 31)
    denis.hobby = "to skateboard"
    denis.age = 32
    println("Denis is ${denis.age} years old")
    var john = Person()
    var johnPeterson = Person(lastName = "Peterson")
    denis.stateHobby()
    val iphone = MobilePhone("iOS", "Apple", "iPhone 12")
    val galaxyS20 = MobilePhone("Android","Samsung", "Galaxy S20")
    val mateXS = MobilePhone("Android", "Huawei", "Mate X S")
}

class Person constructor(firstName: String = "John", lastName: String = "Doe") {
    var firstName: String? = null
    var age: Int? = null
    var hobby: String = "watch Netflix"

    init {
        this.firstName = firstName
        println("Person created with first name $firstName and last name $lastName")
    }

    constructor(firstName: String = "John", lastName: String = "Doe", age: Int): this(firstName, lastName) {
        this.age = age;
        println("Person created with first name $firstName and last name $lastName with age $age")
    }

    fun stateHobby() {
        println("${this.firstName}'s hobby is $hobby")
    }
}

class MobilePhone constructor(osName: String, brand: String, model: String) {

    init {
        println("OS Name: $osName brand: $brand model: $model")
    }
}