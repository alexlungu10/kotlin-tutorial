package com.kotlin.tutorial.examples

import java.math.BigInteger

fun main() {

    println(getFactorial(BigInteger.valueOf(20000), BigInteger.ONE))

}

//fun getFactorial(number: BigInteger, result: BigInteger): BigInteger {
tailrec fun getFactorial(number: BigInteger, result: BigInteger): BigInteger {  //TODO uncomment me

    if (number == BigInteger.ZERO) {
        return result
    }

    return getFactorial(number - BigInteger.ONE, number * result)

}
