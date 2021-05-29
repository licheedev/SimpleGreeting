package com.licheedev.greeting


class Greeter {

    fun greet(): String {
        
        val v = (System.currentTimeMillis() % 3).toInt()
        return when (v) {
            0 -> "Good morning!"
            1 -> "Good afternoon!"
            else -> "Good evening!"
        }
    }

}