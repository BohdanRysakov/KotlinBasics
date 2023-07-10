package com.example.kotlinbasics

abstract class Mammal(private val name: String, private val origin: String,
    private val weight : Double) {
    abstract var maxSpeed: Double

    abstract fun run()
    abstract fun breath()

    fun displayDetails()  {
        println( "Mammal(name='$name', origin='$origin', weight=$weight, maxSpeed=$maxSpeed)")
    }


}

class Human(name: String, origin: String, weight: Double, override var maxSpeed: Double) : Mammal(name, origin, weight) {
    override fun run() {
        println("Human runs")
    }

    override fun breath() {
        println("Human breaths")
    }

}
class Rabbit(name: String, origin: String, weight: Double, override var maxSpeed: Double) : Mammal(name, origin, weight) {
    override fun run() {
        println("Rabbit runs")
    }

    override fun breath() {
        println("Rabbit breaths")
    }


}
fun main(){
    val human = Human("Huan","Mexico", 85.0,20.0)
    val bonnie = Rabbit("Rodger","New Zealand", 2.0,40.0)

    human.run()
    bonnie.run()
}