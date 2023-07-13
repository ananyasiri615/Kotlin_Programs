package HOME_ASSIGNMENTS

fun main(args: Array<String>) {
    val str1 = "level"
    val str2 = "level"
    var reversed = ""
    for (i in str1.length - 1 downTo 0) {
        reversed += str1[i]
    }
    if (reversed == str2) {
        println("string is palindromes")
    } else {
        println("string is not a palindrome")
    }
}

