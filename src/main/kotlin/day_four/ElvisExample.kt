package day_four

fun main(args: Array<String>) {

    var str1 : String? = null

    var str2 : String? = "Welcome to Kotlin"

    var length1 : Int = str1 ?.length ?: -1
    var length2 : Int = str2 ?.length ?: -1

    println("Length : $length1")
    println("Length : $length2")

}