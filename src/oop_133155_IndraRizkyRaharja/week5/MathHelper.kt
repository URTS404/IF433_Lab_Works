package oop_133155_IndraRizkyRaharja.week5

class MathHelper {

    // Fungsi 1: Menghitung luas persegi (sisi x sisi)
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    // Fungsi 2: Menghitung luas persegi panjang (panjang x lebar)
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    // Fungsi 3: Menghitung luas lingkaran (π x r²)
    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}