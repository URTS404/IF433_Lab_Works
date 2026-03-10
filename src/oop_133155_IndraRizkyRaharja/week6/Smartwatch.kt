package oop_133155_IndraRizkyRaharja.week6

import java.nio.file.Watchable

// Menggabungkan 1 Parent Class dan 2 Interfaces
class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {

    override fun showTime() {
        println("Layar OLED menyala: 14:00 WIB")   // TODO: ubah teks waktu / format sesuai selera
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HP di sekitar untuk pairing...")   // TODO: boleh ubah pesannya
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W.")   // TODO: ubah watt / tipe charger
    }
}