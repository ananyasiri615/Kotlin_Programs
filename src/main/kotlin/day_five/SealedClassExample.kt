package day_five

sealed class ArithmeticOperation

class Addition(var a: Int, var b: Int): ArithmeticOperation()
class Subtraction(var a: Int, var b: Int): ArithmeticOperation()
class Multiplication(var a: Int, var b: Int): ArithmeticOperation()
class Divison(var a: Int, var b: Int): ArithmeticOperation()

fun calculate(op : ArithmeticOperation) = when (op) {

    is Addition -> op.a + op.b
    is Subtraction -> op.a - op.b
    is Multiplication -> op.a * op.b
    is Divison -> op.a / op.b

}

fun main(args: Array<String>) {

    var a = 10
    var b = 5

    var result = 0

    var op1 = Addition(a, b)
    result = calculate(op1)

    println("Addition result = $result")

    var op2 = Subtraction(a, b)
    result = calculate(op2)

    println("Subtraction result = $result")

    var op3 = Multiplication(a, b)
    result = calculate(op3)

    println("Multiplication result = $result")

    var op4 = Divison(a, b)
    result = calculate(op4)

    println("Division result = $result")


}