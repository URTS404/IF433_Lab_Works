package oop_133155_IndraRizkyRaharja.week6

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Speaker '$name' menyala dan siap memutar lagu!")
    }

    override fun turnOff() {
        println("Speaker '$name' dimatikan.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}