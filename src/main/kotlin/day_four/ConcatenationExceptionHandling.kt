package day_four

fun main(args: Array<String>) {
    val name = "Ananya"
    val surname: String
    surname = null.toString()
    try {
        println(name + " " + surname)
    } catch (e: NullPointerException) {
        println("name $name \n Surname not found")
        e.printStackTrace()
    }
}
