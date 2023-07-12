package day_one

fun main(args: Array<String>){

    var names = arrayOf("Arjun", "Shankar", "Javed", "Anjali")
    var firstname = names[0]

    println(firstname)

    names[3] = "Meera"

    println(names[3])
    println("size of the array: ${names.size}")

    for(n in names){
        println(n.uppercase())
    }
    for (name in names) {
        if (name.endsWith("a", ignoreCase = true)) {
            println("Miss $name")
        } else {
            println("Mr. $name")
        }
    }
    for(value in 1..20){
        println(value * value)
    }
}