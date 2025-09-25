package swami.poo.project.aStar

fun main() {
    val jordan = Human()
    jordan.name = "Jordan"

    val dog = Dog()
    dog.owner = jordan
    dog.name = "Bob"
    dog.sayHi()

    val sebatian = Human()
    sebatian.name = "Sebastian"
    dog.owner = sebatian
    dog.sayHi()

}