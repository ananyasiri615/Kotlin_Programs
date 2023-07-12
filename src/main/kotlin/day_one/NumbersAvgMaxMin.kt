package day_one

fun main() {
    val numbers = arrayOf(125, 455, 15, 32, 25, 142)

    val max = numbers.max()
    val min = numbers.min()
    val average = numbers.average()

    println("Maximum: $max")
    println("Minimum: $min")
    println("Average: $average")
}