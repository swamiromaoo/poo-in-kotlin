package swami.poo.project.bCars_inheritance

class Car constructor(
    private val motor: Motor
) {

    var color: String? = null

    fun on() {
        println("Starting the car...")
        motor.turnOn()

    }

    fun off(){
        println("Turning off the car...")
        motor.turnOff()
    }

    fun accelerator() {
        if (motor.status()) {
            println("Vruumm Vruuuummmm!!!!!!")
        }else{
            println("Fist start the car!")
        }
    }

    fun horn() {
        println("!$#$%@#!$%#!@")

    }

    fun brake() {
        println("The car is slowing down...")

    }
}