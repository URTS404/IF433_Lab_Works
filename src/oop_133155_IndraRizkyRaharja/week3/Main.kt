package oop_133155_IndraRizkyRaharja.week3

fun main() {
    println("=== TOKO SENJATA GAME ONLINE ===")
    println("Membuat senjata baru dengan damage 500...")

    // Membuat objek Weapon dengan damage awal 500
    val weapon = Weapon("Keris Sakti", 500)
    println("Senjata: ${weapon.name}")
    println("Damage awal: ${weapon.damage}")
    println("Tier awal: ${weapon.tier}")
    println("-".repeat(40))

    // TEST 1: Mencoba set damage ke nilai negatif
    println("TEST 1: Mencoba set damage ke -50")
    println("Mengubah damage ke -50...")
    weapon.damage = -50
    println("Hasil: Damage = ${weapon.damage}, Tier = ${weapon.tier}")
    println("-".repeat(40))

    // TEST 2: Mencoba set damage ke nilai yang melebihi 1000
    println("TEST 2: Mencoba set damage ke 9999")
    println("Mengubah damage ke 9999...")
    weapon.damage = 9999
    println("Hasil: Damage = ${weapon.damage}, Tier = ${weapon.tier}")
    println("-".repeat(40))

    // TEST 3: Membuat senjata baru dengan damage OP saat inisialisasi
    println("TEST 3: Membuat senjata baru dengan damage 1200")
    val weapon2 = Weapon("Nunchaku", 1200)
    println("Senjata: ${weapon2.name}")
    println("Hasil: Damage = ${weapon2.damage}, Tier = ${weapon2.tier}")
    println("-".repeat(40))

    println("=== TEST SENJATA SELESAI ===")
    println("\n" + "=".repeat(50))
    println("=== SISTEM LEVELING PLAYER ===")

    // Membuat player baru
    val player = Player("JoeMama")
    println("Player dibuat dengan username: ${player.username}")
    println("-".repeat(40))

    // Mencoba akses player.xp (harus error - ini hanya untuk demonstrasi,
    // baris ini akan menyebabkan error kompilasi jika dijalankan)
    // println("Mencoba akses xp langsung: ${player.xp}") // ERROR! Tidak bisa diakses karena private

    println("Mencoba akses xp langsung: (TIDAK BISA - properti private)")
    println("Hanya bisa melihat XP melalui fungsi showStatus()")
    player.showStatus()
    println("-".repeat(40))

    // Test 1: addXp(50) - masih level 1
    println("TEST 1: Menambah 50 XP")
    player.addXp(50)
    player.showStatus()
    println("-".repeat(40))

    // Test 2: addXp(60) - total 110 XP, harus level up ke level 2
    println("TEST 2: Menambah 60 XP (total 110 XP)")
    player.addXp(60)
    player.showStatus()
    println("-".repeat(40))

    // Test tambahan: coba addXp dengan nilai negatif (harus error)
    println("TEST TAMBAHAN: Mencoba menambah XP -10 (harus error)")
    player.addXp(-10)
    player.showStatus()
    println("-".repeat(40))

    println("=== TEST PLAYER SELESAI ===")
}