package day_four

fun main(args: Array<String>) {

    var n1: Any ? = null

    n1 = "Vijay Kumar"

    val name: String? = n1 as String?

    println(name)


    val surName : Any ? = "Kumar"

    val str: String ? = surName as String?

    println(str)

}