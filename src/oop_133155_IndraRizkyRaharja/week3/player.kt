package oop_133155_IndraRizkyRaharja.week3

class Player(val username: String) {
    // Properti private xp dimulai dari 0
    private var xp: Int = 0

    // Computed property level berdasarkan XP
    val level: Int
        get() = (xp / 100) + 1

    // Function untuk menambahkan XP
    fun addXp(amount: Int) {
        // Validasi Jumlah harus positif
        if (amount <= 0) {
            println("ERROR: Jumlah XP harus positif! ($amount tidak valid)")
            return
        }

        // Simpan level sebelum total
        val levelBefore = level

        // Tambahkan XP
        xp += amount
        println("$username mendapatkan $amount XP!")

        // Cek apakah level naik
        if (level > levelBefore) {
            println("Naik Level! Selamat $username naik ke level $level")
        }
    }

    // Function tambahan untuk melihat status player (opsional)
    fun showStatus() {
        println("""
            Status Player:
            Username: $username
            XP: $xp
            Level: $level
            XP to next level: ${(level * 100) - xp} XP
        """.trimIndent())
    }
}