package day_four

import java.util.*

fun main(args: Array<String>) {

    var sc = Scanner(System.`in`)

    var n1: Int = 0
    var n2: Int = 0

    println("Enter a number")
    try {
        try {
            n1 = Integer.parseInt(sc.nextLine())

            println("Enter second number")

            n2 = Integer.parseInt(sc.nextLine())
        } catch (e: NumberFormatException) {
            println("please provide a proper number")
        }

        var result = n1 / n2
        println("result = $result")
    } catch (e: ArithmeticException) {
        println("The value of n2 cannot be zero")
    } finally {


        println("Program ended successfully")
    }
}