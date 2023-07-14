package HOME_ASSIGNMENTS

fun main(args: Array<String>) {
    val array = arrayOf(1, 2, 3, 4, 5)
    println("Original array: $array")
    for (i in 0 until array.size / 2) {
        val temp = array[i]
        array[i] = array[array.size - 1 - i]
        array[array.size - 1 - i] = temp
    }
    println("Reversed array: $array")
}
