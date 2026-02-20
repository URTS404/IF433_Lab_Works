package oop_133155_IndraRizkyRaharja.week3

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0 // Gunakan field, bukan this.salary
            } else {
                field = value // Gunakan field untuk assgin nilai asli
            }
        }
}