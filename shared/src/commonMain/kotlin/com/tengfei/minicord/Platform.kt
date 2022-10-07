package com.tengfei.minicord

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform