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
    val weapon2 = Weapon("nunchaku", 1200)
    println("Senjata: ${weapon2.name}")
    println("Hasil: Damage = ${weapon2.damage}, Tier = ${weapon2.tier}")
    println("-".repeat(40))

    println("=== TEST SELESAI ===")
}