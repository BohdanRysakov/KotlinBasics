package com.example.kotlinbasics
class Person(var firstName: String) {
    var age: Int? = null
    var name: String? = null
    
    // Secondary Constructor
    constructor(firstName: String, age: Int): this(firstName)  {
        this.age = if(age > 0) age else throw IllegalArgumentException("Age must be greater than zero")
    }
}