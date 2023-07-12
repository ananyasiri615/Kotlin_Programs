package day_three

import java.util.Scanner

fun main(args: Array<String>) {

    var sc = Scanner(System.`in`)
    println("Enter a String")

    var input = sc.nextLine()

    var output = reverseWords(input)

    println(output)
}

fun reverseWords(str: String): String {

    var words:List<String> = str.trim().split(" ")

    var reversedString: StringBuffer = StringBuffer()

    println(words.size)
    for (i in words.lastIndex downTo 0){
        //println(words.get(i))
        reversedString.append(words.get(i));
        reversedString.append(" ")
    }

    return reversedString.toString()
}
/*
fun reverseWords(sentence: String): String {
    val words = sentence.split(" ")
    val reversedWords = words.reversed()
    return reversedWords.joinToString(" ")
}

fun main(args: Array<String>) {
    val sentence = "hello world"
    val reversedSentence = reverseWords(sentence)
    println(reversedSentence)
}
*/
