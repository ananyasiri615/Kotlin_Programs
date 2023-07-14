package PRACTICE_PROBLEMS

import java.util.*
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Enter a Score:")
    val score = scanner.nextInt()
    if (score < 35) {
        throw Exception("Student failed with score $score")
    } else {
        println("Student passed with score $score")
    }
}
