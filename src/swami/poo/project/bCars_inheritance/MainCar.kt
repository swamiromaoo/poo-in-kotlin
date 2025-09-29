package swami.poo.project.bCars_inheritance

fun main() {

    val motor = Motor()
    val car = Car(motor)
    car.on()
    car.off()
    car.accelerator()

}
