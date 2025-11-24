package com.altmann.choresmanager.network

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.statement.HttpResponse
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.http.isSuccess
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class ApiClient {
    companion object {
        const val BASE_URL = "http://localhost:8080/"
    }

    val http: HttpClient = createHttpClient().config {
        install(ContentNegotiation) {
            json(
                Json {
                    prettyPrint = true
                    ignoreUnknownKeys = true
                    isLenient = true
                }
            )
        }

        install(HttpTimeout) {
            requestTimeoutMillis = 15000
            connectTimeoutMillis = 15000
            socketTimeoutMillis = 15000
        }
    }

    suspend inline fun <reified T> get(url: String): ApiResult<T> =
        safeRequest {
            val response: HttpResponse = http.get(url)
            if (response.status.isSuccess()) {
                response.body<T>()
            } else {
                throw Exception("Request failed with status: ${response.status} : ${response.body<String>()}")
            }
        }

    suspend inline fun <reified T, reified R> post(url: String, body: R): ApiResult<T> =
        safeRequest {
            val response : HttpResponse = http.post(url) {
                contentType(ContentType.Application.Json)
                setBody(body)
            }
            if (response.status.isSuccess()) {
                response.body<T>()
            } else {
                throw Exception("Request failed with status: ${response.status} : ${response.body<String>()}")
            }
        }
}