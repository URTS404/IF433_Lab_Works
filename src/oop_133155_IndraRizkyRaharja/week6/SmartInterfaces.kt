package oop_133155_IndraRizkyRaharja.week6

interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable {
    fun turnOn()
    fun turnOff()
}

interface Recordable {
    fun startRecord()

    fun stopRecord() {
        println("Rekamanan dihentikan dan akan disimpan ke CloudServer!")
    }
}