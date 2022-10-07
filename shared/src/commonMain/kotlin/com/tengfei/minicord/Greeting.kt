package com.tengfei.minicord

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        return "Hello, ${platform.name}!From commonMain"
    }
}