fun main(args: Array<String>) {

    val scientistMap = hashMapOf("Darwin" to "Biology", "Einstein" to "Physics",
        "Kalam" to "Physics")

    println(scientistMap)

    for((key, value) in scientistMap){
        println("Key is : $key")
        println("Value is : $value")
    }

    println(scientistMap.getOrDefault("ABC", "Chemistry"))

    scientistMap.put("Newton", "Physics")
    println(scientistMap)

    scientistMap.replace("Newton", "Relative Physics")

    println(scientistMap)
}