package oop_133155_IndraRizkyRaharja.week7

sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Error(val error: String) : ApiResponse()
    object Loading : ApiResponse()
}

enum class AppState {
    STARTING, RUNNING, STOPPED
}