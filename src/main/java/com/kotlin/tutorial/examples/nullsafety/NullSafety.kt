package com.kotlin.tutorial.examples.nullsafety

fun main() {
    val teacher = Teacher(name = "Andy", specialization = "math")
    val streetName = teacher.contact?.address?.streetName //null, no null pointer exception is thrown
    val streetNumber = teacher.contact?.address?.streetNumber //null

    println("street: $streetName, streetNumber: $streetNumber")

    val streetNameWithDefault = teacher.contact?.address?.streetName ?: "Unknown street"
    val streetNumberWithDefault = teacher.contact?.address?.streetNumber ?: -1

    println("streetNameWithDefault: $streetNameWithDefault, streetNumberWithDefault: $streetNumberWithDefault")

//////////////////
    val text1: String? = null

    if (text1.isNullOrEmpty()) {
//        text1.lowercase()
        println("text1 is null")
    }


    val text2: String? = "Today is Developer Guild"
    if (text2?.isNotEmpty()==true ) {
        text2.lowercase()// the variable is not null because we did a check previously
        println(text2)
    }


}


