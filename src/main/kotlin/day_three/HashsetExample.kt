package day_three

fun main() {
    val stringSet = HashSet<String>()


    stringSet.add("car")
    stringSet.add("Bike")
    stringSet.add("Ola")
    stringSet.add("Motorcycle")
    stringSet.add("cycle")

    // Iterating over the set
    for (element in stringSet) {
        println(element)
    }
}