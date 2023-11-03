package com.kotlin.tutorial.examples

import com.kotlin.tutorial.examples.nullsafety.User


data class ApplicationConfig(
    var name: String,
    var protocol: String,
    var ip: String,
    var port: String,
    var user: User? = null

) {

}

fun main() {
    val applicationConfig = ApplicationConfig(name = "backend 1", protocol = "HTTP", ip = "127.0.0.1", port = "8080")

    //with
    process(applicationConfig)
    println()

    //apply
    applicationConfig.apply {
        name = "backend2"
        protocol = "HTTPS"
    }
    process(applicationConfig)

    val stringList = listOf("abc", "def", "ghi")// immutable
    //    stringList.remove

    val mutableListOf = mutableListOf(1, 2, 3)
    mutableListOf.remove(1)


    //run
    val hexNumberRegex: Regex = run {
        val digits = "0-9"
        val hexDigits = "A-Fa-f"
        val sign = "+-"

        Regex("[$sign]?[$digits$hexDigits]+")
    }

    for (match in hexNumberRegex.findAll("+123 -FFFF !%*& 88 XYZ")) {
        println(match.value)
    }


}

private fun process(applicationConfig: ApplicationConfig) {
    with(applicationConfig) {
        println(ip)
        println(protocol)
    }
}