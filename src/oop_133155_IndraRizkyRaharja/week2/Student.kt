package oop_133155_IndraRizkyRaharja.week2

class Student(val name: String, val nim: String, var major: String){
    init {
        // Validasi Sederhana: Cek panjang NIM
        if (nim.length != 5) {
            println("Warning: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG:Object Student $name berhasil dialokasikan di Memory.")
        }
    }
}