package oop_133155_IndraRizkyRaharja.week7

enum class AppState {
    STARTING, RUNNING, STOPPED
}

sealed class ApiResponse {
    data class Success(val data: DataUser) : ApiResponse()
    data class Error(val error: String) : ApiResponse()
    object Loading : ApiResponse()
}