package swami.poo.project.bCars_inheritance

class Car constructor(
    private val motor: Motor
) {

    var color: String? = null

    fun ignition() {

    }

    fun accelerator() {
        println("Vruumm Vruuuummmm!!!!!!")

    }

    fun horn() {
        println("!$#$%@#!$%#!@")

    }

    fun brake() {
        println("The car is slowing down...")

    }
}