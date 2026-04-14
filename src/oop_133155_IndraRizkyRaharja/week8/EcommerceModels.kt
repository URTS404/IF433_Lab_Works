package oop_133155_IndraRizkyRaharja.week8

sealed class Product()

data class Electronic(
    val id: String,       // TODO: id produk elektronik (String)
    val name: String,     // TODO: nama produk elektronik (String)
    val warrantyMonths: Int  // TODO: garansi dalam bulan (Int), default fallback = 12
) : Product()

data class Clothing(
    val id: String,   // TODO: id produk pakaian (String)
    val name: String, // TODO: nama produk pakaian (String)
    val size: String  // TODO: ukuran pakaian (String), default fallback = "All Size"
) : Product()