package com.example.kotlinbasics

class Inheritance {
}
open class Venicle {

}
open class Car (val name : String,
                val brand: String,
                override val maxSpeed: Double) : Drivable{
    open var range: Double = 0.0;

    fun extendRange( amount:Double ) {
        if(amount > 0 )
            range += amount
    }
    override fun drive (distance : Double) {
        var distance = distance
        if(distance > range){
            distance = range
        }
        range -= distance
        println("Drove for $distance KM")
    }

    override fun brake() {
        println("This is Car braking")
    }
}
class electoCar(name: String, brand:String, batteryLife:Double, maxSpeed: Double) : Car(name,brand, maxSpeed) {
    override var range = batteryLife
    fun drive(){
        super.drive(1.0)
    }

    override val maxSpeed: Double
        get() = super.maxSpeed
}
fun main(){
    var myCar = Car("A3","Audi",100.0)
    var eCar  = electoCar("Model-X","Tesla",85.5,100.0)


    myCar.drive(45.5)
    eCar.drive(45.5)
    eCar.drive()
    println(eCar.range)
    eCar.brake()


    eCar.extendRange(100.0)
    println(eCar.range)

}
