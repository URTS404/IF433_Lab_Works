package oop_133155_IndraRizkyRaharja.week5

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    // Polymorphic Collection: List yang berisi tipe Parent, tapi isinya objek Anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        // Pemanggilan Runtime Polymorphism
        pegawai.bekerja()

        // Smart Casting dengan is dan when
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar() // Smart cast! Tidak perlu manual casting (as)
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("------------------------------------------------------------")
    }

    // ============================================================
    // DEMO COMPILE-TIME POLYMORPHISM (METHOD OVERLOADING)
    // ============================================================
    println("\n=== DEMO COMPILE-TIME POLYMORPHISM (OVERLOADING) ===")
    println("Membuktikan Kotlin memanggil method yang tepat berdasarkan parameter")
    println("-".repeat(60))

    // Instansiasi MathHelper
    val mathHelper = MathHelper()

    // Memanggil fungsi hitungLuas dengan 1 parameter Int (Luas Persegi)
    val sisiPersegi = 8
    val luasPersegi = mathHelper.hitungLuas(sisiPersegi)
    println("1. Memanggil hitungLuas($sisiPersegi) -> Parameter: 1 Int")
    println("   → Menghitung luas persegi dengan sisi $sisiPersegi")
    println("   → Hasil: $luasPersegi")
    println()

    // Memanggil fungsi hitungLuas dengan 2 parameter Int (Luas Persegi Panjang)
    val panjang = 12
    val lebar = 5
    val luasPersegiPanjang = mathHelper.hitungLuas(panjang, lebar)
    println("2. Memanggil hitungLuas($panjang, $lebar) -> Parameter: 2 Int")
    println("   → Menghitung luas persegi panjang $panjang x $lebar")
    println("   → Hasil: $luasPersegiPanjang")
    println()

    // Memanggil fungsi hitungLuas dengan 1 parameter Double (Luas Lingkaran)
    val jariJari = 10.5
    val luasLingkaran = mathHelper.hitungLuas(jariJari)
    println("3. Memanggil hitungLuas($jariJari) -> Parameter: 1 Double")
    println("   → Menghitung luas lingkaran dengan jari-jari $jariJari")
    println("   → Hasil: $luasLingkaran")
    println()
}