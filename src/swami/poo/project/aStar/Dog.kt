package swami.poo.project.aStar

class Dog constructor(
    private val ownerName : String
) {

    var name: String? = null

    fun sayHi() {
        println("Hi my name is $name and my owner is $ownerName")
    }
}