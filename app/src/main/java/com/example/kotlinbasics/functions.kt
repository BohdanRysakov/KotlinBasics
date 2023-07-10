package com.example.kotlinbasics

fun main(){
    var a: Int = 4
    var b: Int = 5

    println(a)
    println(b)
    a = 6;
    println(b)
}

class functions {
    fun String.upperCaseFirst(): String {
        return this[0].uppercase() + this.substring(1)
    }

}