package com.example.kotlinbasics

interface Drivable {
    val maxSpeed : Double;
    fun drive(distance : Double)
    fun brake(){
        println("This drivable is braking")
    }
}