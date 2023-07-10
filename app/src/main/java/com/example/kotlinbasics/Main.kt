package com.example.kotlinbasics

import kotlin.random.Random

fun main() {
    var int = Int.MAX_VALUE
    println("Testing type overflow: ")
    println("Suggestion: int2 should be MIN_VALUE ")
    var int2 = int + 1;
    if(int2.equals(Int.MIN_VALUE)) {
        println("overflow works as in Java")
    }
    println("int2: " + int2 + " Int.MIN_VALUE = " + Int.MIN_VALUE)

    var str = "String!"

    var str2 = str

    var str3 = "String!"
    var str4 = "Different String"

    println("#########################")
    println("String pool test:")

    println("str == str2 : " + (str == str2))
    println("str == str3 : " + (str == str3))
    println("str == str4 : " + (str == str4))
    println("str equals str2 : " + (str.equals(str2)))
    println("str equals str3 : " + (str.equals(str3)))
    println("str equals str4 : " + (str.equals(str4)))

    println("#########################")
    println("Finally String works as char array")

    println("str[0] = " + str[0])
    println("Trying to change string directly :")
    str[0] = "Q"
    println("wtf")
    println("str[0] = \"Q\" : $str")

    var x = (0..100).random()
    when(x) {
        in 12..14 -> println(x)
        !in 3..5 -> println(x)
        else -> println(x)
    }

    var variable  = 2

    when(x) {
        is Int -> println("x is Int!")
        else -> println("X is not Int")
    }

    println("Cool For loop:")
    for(i in 1..10){
        println(i)
    }
    println("Another cool For loop:")
    for(i in 1 until 10){
        println(i)
    }
    println("Another another cool For loop:")
    for(i in 10 downTo 1){
        if(i == 4)
            continue
        println(i)
    }
    println("Finally steps:")
    for(i in 10 downTo 1 step 4){

        println(i)
    }




}

private operator fun String.set(i: Int, value: String) {

}
fun add(a: Int, b: Int): Int = a+b
fun String.upperCaseFirst(): String {
    return this[0].uppercase() + this.substring(1)
}
