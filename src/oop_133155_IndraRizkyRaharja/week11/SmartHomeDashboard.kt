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

    val acUnit = run {
        SmartDevice(
            name      = "Daikin Inverter (Kabel 3x2.5)",
            category  = "HVAC",
            isOnline  = false,
            powerLoad = 800
        )
    }
    homeDevices.add(acUnit)
    homeDevices.add(
        SmartDevice(
            name      = "Picolo's Auto Feeder",
            category  = "Pet Care",
            isOnline  = true,
            powerLoad = 10
        )
    )

    println("\n=== PENCARIAN PERANGKAT ===")
    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println("Perangkat ditemukan:")
        println(it.diagnose())
    } ?: println("Perangkat tidak ditemukan.")

    println("\n=== SUMMARY SMART HOME ===")
    with(homeDevices) {
        println("========================================")
        println("       SMART HOME DASHBOARD             ")
        println("========================================")
        println("Total Perangkat Terdaftar : $size")
        println("----------------------------------------")
    }

    val totalPower = homeDevices.run { sumOf { it.powerLoad } }
    println("Total Konsumsi Daya      : $totalPower Watt")
    println("----------------------------------------")
}