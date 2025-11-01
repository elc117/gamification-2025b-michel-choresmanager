package com.altmann.choresmanager

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform