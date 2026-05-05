package oop_133155_IndraRizkyRaharja.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice(
        name      = "Philips WiZ Living Room",
        category  = "Lighting"
    ).apply {
        isOnline  = true
        powerLoad = 12
    }.also {
        println("(LOG) Lampu dikonfigurasi: ${it.name}")
        homeDevices.add(it)
    }

    SmartDevice(
        name     = "Ezviz Outdoor",
        category = "Camera"
    ).apply {
        isOnline  = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }
}