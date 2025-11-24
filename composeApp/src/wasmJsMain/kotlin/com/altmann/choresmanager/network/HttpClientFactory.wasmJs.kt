package com.altmann.choresmanager.network

import io.ktor.client.HttpClient
import io.ktor.client.engine.js.Js
import io.ktor.util.Platform

actual fun createHttpClient(): HttpClient = HttpClient(Js)
