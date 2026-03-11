package oop_133155_IndraRizkyRaharja.week6

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("CCTV '$name' di nyalakan.")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV '$name' di matikan.")
    }

    override fun startRecord() {
        println("CCTV '$name' mulai merekam...")
    }
}
