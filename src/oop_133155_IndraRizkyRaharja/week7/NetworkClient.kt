package oop_133155_IndraRizkyRaharja.week7

class NetworkClient private constructor(val url: String) {

    companion object {
        const val BASE_URL = "https://api.umn.ac.id/api/" // Shared constant

        fun createClient(): NetworkClient {
            println("Membangun NetworkClient dengan BASE_URL: $BASE_URL")
            return NetworkClient("$BASE_URL")
        }
    }

    fun connect() {
        println("Connecting to $url...")
    }
}