package oop_133155_IndraRizkyRaharja.week3

class Weapon(
    val name: String,
    damage: Int
) {
    // Backing field untuk properti damage
    private var _damage: Int = damage

    // Properti damage dengan custom setter
    var damage: Int
        get() = _damage
        set(value) {
            if (value < 0) {
                println("ERROR: Damage tidak boleh negatif. Nilai damage tetap ${_damage}")
                return
            }

            _damage = if (value > 1000) {
                println("ERROR: Damage melebihi 1000, karena terlalu OP akan di nerf menjadi 1000")
                1000
            } else {
                value
            }
        }

    // Computed property tier berdasarkan damage
    val tier: String
        get() {
            return when {
                _damage > 1000 -> "OP"
                _damage > 900 -> "Mythic"
                _damage > 800 -> "Legendary"
                _damage > 500 -> "Epic"
                _damage > 300 -> "Rare"
                _damage > 150 -> "Uncommon"
                _damage > 100 -> "Common"
                else -> "Broken"
            }
        }

    // Inisialisasi awal untuk memastikan damage valid saat pembuatan objek
    init {
        // Memanggil setter untuk memvalidasi damage awal
        this.damage = _damage
    }
}