package oop_133155_IndraRizkyRaharja.week11

data class SmartDevice(
    var name      : String,
    var category  : String,
    var isOnline  : Boolean = false,
    var powerLoad : Int     = 0
)