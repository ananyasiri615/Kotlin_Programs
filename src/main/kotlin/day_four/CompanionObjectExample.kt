package day_four

class Person{
    companion object CO {
        fun display(){
            println("This is display method")
        }
    }

    fun printInfo() {
        println("This is print info function")
    }

}

fun main(args: Array<String>) {
    //val obj = Person()
    //obj.display()

    Person.display()

    val obj = Person()
    obj.printInfo()
}