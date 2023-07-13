package PRACTICE_PROBLEMS

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Enter a sentence:")
    val sentence = scanner.nextLine()
    val words = sentence.split(" ")

    var lw = words[0]
    var sw = words[0]

    for (word in words) {
        if (word.length > lw.length) {
            lw = word
        }
        if (word.length < sw.length) {
            sw = word
        }
    }

    println("Largest word: $lw")
    println("Smallest word: $sw")
}

