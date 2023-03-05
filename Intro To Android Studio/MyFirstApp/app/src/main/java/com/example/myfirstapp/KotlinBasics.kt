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
        println("$firstName\'s hobby is $hobby")
    }
}

class MobilePhone constructor(osName: String, brand: String, model: String) {
    private var battery = 30
    init {
        println("OS Name: $osName brand: $brand model: $model")
    }

    fun chargeBattery(chargedBy: Int) {
        println("Battery was at $battery and is at ${battery + chargedBy}")
        battery += chargedBy
    }
}


class Car() {

    lateinit var owner : String

    val myBrand: String = "BMW"
        // Custom getter
        get() {
            return field.toLowerCase()
        }


    // default setter and getter
    var myModel: String = "M5"
        private set

    var maxSpeed: Int = 250
        get() = field
        // Custom Setter
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("_maxSpeed must be greater than zero")
        }

    init{
        this.myModel = "M3"
        this.owner = "Frank"
    }
}