package com.kotlin.workshop.kotlin.tutorial

import com.kotlin.tutorial.examples.arrow.ComputeProblem
import java.time.DayOfWeek
import java.time.LocalDate

fun main() {
    val x: Int = 2
    val y = x

    //range types
    for (i in 1..10) {
        println("i: $i")
    }

    //if
    val isEven: Boolean = if (x % 2 == 0) {
        true
    } else {
        false
    }

    val isOdd=if(true==true) "A" else "B"//

    // switch
    println(getGreetingByDayWithSwitch(LocalDate.now().dayOfWeek))

    //try
    val positiveNumber = try {
        Integer.parseInt("124")
    } catch (e: Exception) {
        -1
    }
    println("positiveNumber: $positiveNumber")

    // extension function
    x.getMultiplyBy(2)

//    object DDD: ComputeProblem()//

}

fun getGreetingByDayWithSwitch(dayOfWeek: DayOfWeek): String {
    return when (dayOfWeek) {
        DayOfWeek.FRIDAY -> "Today is Developer Guild, the weekend is almost here :) "
        DayOfWeek.SATURDAY, DayOfWeek.SUNDAY -> " The weekend is here"
        else -> "Keep calm, and carry on. This is a working day"
    }
}

fun Int.getMultiplyBy(i: Int): Int {
    return this.times(i)
}
