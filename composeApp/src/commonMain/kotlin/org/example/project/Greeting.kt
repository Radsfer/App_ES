package org.example.project

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Testando o app no, ${platform.name}!\n aparentemente"
    }
}