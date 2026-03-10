package oop_133155_IndraRizkyRaharja.week6

interface Clickable {
    // ERROR: Property in an interface cannot have a backing field
    val name: String = "Tombol Rahasia"

    // Function without body (Implicitly Abstract)
    fun click()
}