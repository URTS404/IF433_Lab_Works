package oop_133155_IndraRizkyRaharja.week11

data class User(var name: String = "", var age: Int = 0)

fun main() {
    println("=== TEST APPLY ===")
    val user = User().apply {
        name = "Indra"
        age = 21
    }
    println(user)
}