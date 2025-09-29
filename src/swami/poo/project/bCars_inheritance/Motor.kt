package swami.poo.project.bCars_inheritance

class Motor {

    private var on: Boolean = false

    fun turnOn(){
        on = true
    }

    fun turnOff(){
        on= false
    }

    fun status(): Boolean{
        return on
    }
}