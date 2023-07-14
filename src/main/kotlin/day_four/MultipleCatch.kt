package day_four

fun main(args: Array<String>) {
    try {
        val a = IntArray(5)
        a[0] = 10
        a[1] = 11
        a[2] = 12
        a[3] = 13
        a[4] = 10 / 2
        a[5] = 20
    }  catch (e: ArithmeticException) {
        println("catching ArithmeticException")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("catching ArrayIndexOutOfBoundsException")
    } catch (e: Exception) {
        println("parent exception catch")
    }

    println("Program ended successfully")
}