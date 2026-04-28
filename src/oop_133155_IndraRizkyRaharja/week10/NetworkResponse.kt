package oop_133155_IndraRizkyRaharja.week10

// CHECKPOINT 13: Generic wrapper untuk simulasi response dari API/jaringan
// TODO: Tambahkan properti lain jika diperlukan (misal: message, timestamp, errorCode, dll)
data class ApiResponse<T>(
    val status: String, // Contoh: "200 OK", "404 Not Found", "500 Internal Server Error"
    val data: T         // Data generik yang dibungkus dalam response
)