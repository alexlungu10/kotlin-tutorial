package com.kotlin.tutorial.examples.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() {


    val measureTimeMillis = measureTimeMillis {
        runBlocking {

            for (x in 1..1_000_000) {
                launch { printDot() }
            }

        }
    }

    println()
    println("measureTime in seconds: ${measureTimeMillis / 1000}")


}

suspend fun printDot() {
    delay(1000)
    print(".")
}
