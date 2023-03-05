package com.example.myfirstapp

data class User(val id: Long, var name: String)

fun main() {
    val user1 = User(1, "Denis")
    
    user1.name = "Michael"
    val user2 = User(1, "Michael")

    println(user1 == user2)

    val updatedUser = user1.copy(name="Denis Panjuta")

    println(updatedUser.component1())
    println(updatedUser.component2())

    val (id, name) = updatedUser
    println("id=$id, name=$name")
}