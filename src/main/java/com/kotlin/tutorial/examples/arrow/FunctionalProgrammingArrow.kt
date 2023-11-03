package com.kotlin.tutorial.examples.arrow

import arrow.core.Either
import arrow.core.filterOrElse

sealed class ComputeProblem {
    object OddNumber : ComputeProblem()
    object NotANumber : ComputeProblem()

//    object BiggerThanFive : ComputeProblem() //TODO uncomment me
}


fun main() {
//    functional processing with several levels of filtering using Either
//    we can filter an Either stream and also map right ones into another Error.
    //    In the end we will support several types of errors and valid data with: map and filterOrElse

//    problem: try catch is not so friendly with functional programming
//    solution: use  Either to add error handling in stream processing with functional programming

    //layer 1 of processing
    val eitherList = listOf(
        parseNumber("1"),
        parseNumber("2"),
        parseNumber("BB"),
        parseNumber("4"),
        parseNumber("CC"),
        parseNumber("6"),
        parseNumber("7"),
        parseNumber("8"),
    )
        //        layer 2 of processing, detect OddNumber errors
        .map { either -> either.filterOrElse({ it % 2 == 0 }, { ComputeProblem.OddNumber }) }
    //TODO add another level of filtering


    eitherList.forEach { printNumberByEither(it) }

}


fun printNumberByEither(eitherEvenNumber: Either<ComputeProblem, Int>) {
    when (eitherEvenNumber) {
        is Either.Right -> println(eitherEvenNumber.b)
        is Either.Left -> when (eitherEvenNumber.a) {
            ComputeProblem.NotANumber -> println("NotANumber....")
            ComputeProblem.OddNumber -> println("OddNumber....")
        }
    }

}

fun parseNumber(stringNUmber: String): Either<ComputeProblem, Int> {

    return try {
        val right = Integer.parseInt(stringNUmber)
        return Either.right(right)
    } catch (e: Exception) {
        Either.left(ComputeProblem.NotANumber)
    }
}
