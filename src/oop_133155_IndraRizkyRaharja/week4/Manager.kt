package oop_133155_IndraRizkyRaharja.week4

// Child class Manager yang mewarisi Employee
class Manager(
    name: String,
    baseSalary: Int
) : Employee(name, baseSalary) {

    // Override work() dengan teks yang diminta
    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    // Override calculateBonus(): bonus standar + Rp 500.000
    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}