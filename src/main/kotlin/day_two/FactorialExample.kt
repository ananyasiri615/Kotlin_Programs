package day_two

fun calculateFactorial(n: Int): Long {

    var result = 0L
    if(n == 1){
        result = n.toLong()
    }
    else{
        result = n*calculateFactorial(n-1)
    }
    return result
}

fun main(args: Array<String>) {
    val n = 5

    val result = calculateFactorial(n)

    println(result)
}