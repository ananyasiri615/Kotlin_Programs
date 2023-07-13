package PRACTICE_PROBLEMS

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Enter a Word to be reversed:")
    val str1 = scanner.nextLine()
    var reversed = ""
    for (i in str1.length - 1 downTo 0) {
        reversed += str1[i]
    }
    println(reversed)
}