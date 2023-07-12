package day_two

fun main(args: Array<String>) {
    var result = multiplyNumbers(12, 3)

    println(result)

    result = multiplicationResult(12, 5)

    println(result)

    var fullName = getFullName("Ananya", "Siri")

//println(fullName)
}

fun multiplyNumbers(n1: Int, n2: Int):Int{
    return n1 * n2
}

val multiplicationResult = {n1: Int, n2: Int -> n1 * n2}

val getFullName = {name: String, surName: String -> name.plus(" ").plus(surName)}