package day_four
abstract class Player(name:String,age:Int) {

    abstract fun play()
    fun display(){
        println("display method in player class")
    }

}

class Cricketer(name: String, age: Int) : Player(name, age){

    var name :String =""
    var age:Int=0
    init {
        this.name=name
        this.age=age
    }

    override fun play() {
        println("Cricketer plays cricket")
    }

    fun displayInfo(){
        println("$name $age plays cricket")
    }

}

class TennisPlayer(name: String, age: Int) : Player(name, age){

    var name :String =""
    var age:Int=0
    init {
        this.name=name
        this.age=age
    }

    override fun play() {
        println("Tennisplayer plays Tennis")
    }

    fun displayInfo(){
        println("$name $age plays Tennis")
    }

}

fun main(args: Array<String>) {

    var c = Cricketer("Virat Kohli",35)
    c.display()
    c.play()
    c.displayInfo()
    println()
    var t = TennisPlayer("Saniya Mirza",34)
    t.display()
    t.play()
    t.displayInfo()

}