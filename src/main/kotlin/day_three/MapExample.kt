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
    println(scientistMap.containsKey("Newton"))

    var politicalMap = LinkedHashMap<String, String>()
    politicalMap["Narendra Modi"] = "BJP"
    politicalMap["Arvind Kejriwal"] = "AAP"
    politicalMap["Rahul Gandhi"] = "Congress"
    politicalMap["Mamta Banerjee"] = "TMC"

    var keys = politicalMap.keys
    for(key in keys) {
        println("Politicians are : " + key)
    }
}