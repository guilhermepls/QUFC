package com.example.qufc

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform