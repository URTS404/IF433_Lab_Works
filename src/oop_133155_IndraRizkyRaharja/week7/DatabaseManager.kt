package oop_133155_IndraRizkyRaharja.week7

object DatabaseManager {
    var connetionStatus: String = "Disconnected"

    fun connect() {
        connetionStatus = "Connected to Server"
        println("Database is ready.")
    }
}