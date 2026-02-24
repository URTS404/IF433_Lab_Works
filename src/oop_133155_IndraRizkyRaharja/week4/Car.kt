package oop_133155_IndraRizkyRaharja.week4

// Car "Is-A" Vehicle. Parameter brand dilenpar ke atas melalui Vehicle(brand)
open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
}