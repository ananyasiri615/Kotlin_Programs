package day_one

class Cricketer {
    var name: String
    var age: Int
    var type: String = "Batter"

    constructor(name: String, age: Int){
        this.name = name
        this.age=age
    }
    constructor(name: String, age: Int, type: String){
        this.name = name
        this.age=age
        this.type=type
    }
}

fun main(args: Array<String>) {
    val c1 = Cricketer("Virat Kohli", 35)
    val c2 = Cricketer("James Anderson", 36, "Bowler")

    println("${c1.name} ${c1.age} ${c1.type}")
    println("${c2.name} ${c2.age} ${c2.type}")

}