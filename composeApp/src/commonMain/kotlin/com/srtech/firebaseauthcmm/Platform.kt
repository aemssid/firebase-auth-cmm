package com.srtech.firebaseauthcmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform