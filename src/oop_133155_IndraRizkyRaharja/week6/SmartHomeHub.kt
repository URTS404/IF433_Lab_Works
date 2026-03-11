package oop_133155_IndraRizkyRaharja.week6

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat '${device.name}' ditambahkan ke MainHub.")
    }

    fun turnOffAllSwitches() {
        println("\n--- Mematikan semua perangkat jika tidak terdeteksi! ---")
        for (device in devices) {
            if (device is Switchable) {   // Smart Casting
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        println("\nMODE KEAMANAN AKTIF!!!")
        for (device in devices) {
            if (device is Recordable) {
                device.startRecord()
            }
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan Berbunyi")
            }
        }
    }
}