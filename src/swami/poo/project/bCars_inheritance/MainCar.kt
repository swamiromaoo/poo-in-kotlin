package swami.poo.project.bCars_inheritance

fun main() {

    val motor = Motor()
    motor.turnOn()
    println("Motor is ${motor.status()}")

    motor.turnOff()
    println("Motor is ${motor.status()}")

    val car = Car(motor)
    car.accelerator()

}
