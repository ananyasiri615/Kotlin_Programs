package day_one

fun main(args: Array<String>) {
    var day = 4

    var result = when(day) {
        1 -> "Monday"
        4 -> "Thursday"
        7 -> "Saturday"
        else -> "No match found"
    }
    println(result)

}