package oop_133155_IndraRizkyRaharja.week4

// Child class Developer yang mewarisi Employee
class Developer(
    name: String,
    baseSalary: Int,
    val programmingLanguage: String
) : Employee(name, baseSalary) {

    // Override work() dengan teks yang diminta
    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }

    // calculateBonus() tidak di-override, menggunakan bawaan dari Employee
}