package io.govie.govie_app

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}