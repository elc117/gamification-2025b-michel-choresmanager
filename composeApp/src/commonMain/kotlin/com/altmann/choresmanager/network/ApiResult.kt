package com.altmann.choresmanager.network

sealed class ApiResult<out T> {
    data class Success<out T>(val data: T) : ApiResult<T>()
    data class Error(val message: String, val throwable: Throwable? = null) : ApiResult<Nothing>()
}

suspend inline fun <T> safeRequest(request: () -> T): ApiResult<T> {
    return try {
        ApiResult.Success(request())
    } catch (t: Throwable) {
        ApiResult.Error(t.message ?: "Unknown error occurred", t)
    }
}