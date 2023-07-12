package day_three

open class Player {

    constructor(name:String, age: Int, country: String){
        println("Object initizlied with secondary constructor")
        println("$name, $age, $country")
    }
}

class CricketerOne: Player {
    constructor(name:String, age:Int, country: String, type: String): super(name, age, country){
        println("Cricker object initialized")
        println("$name, $age, $country $type")
    }
}

fun main(args: Array<String>) {
    val player = Player("Geet Sethi", 30, "India")

    val c = CricketerOne("Virat Kohli", 35, "India", "Batter")
}