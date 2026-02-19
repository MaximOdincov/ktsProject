package com.example.ktsproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform