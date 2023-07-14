package day_four

fun main(args: Array<String>) {

    var n1 = 40
    var n2 = 0

    var result = 0
    try {
        result = n1 / n2
    } catch (e: ArithmeticException){
        println("The value of n2 shouldn't be zero. Please try again")
    }

    println("The result of division = $result")

}