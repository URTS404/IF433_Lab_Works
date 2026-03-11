package oop_133155_IndraRizkyRaharja.week6

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Lampu '$name' nyala.")
    }

    override fun turnOff() {
        println("Lampu '$name' mati.")
    }
}