package day_four

interface ExampleInterface{
    var testProp : String

    //abstract method
    fun print()

    //method with default implementation
    fun printDefault(){
        println("From inside printDefault Function")
    }
}

class Example: ExampleInterface{
    override var testProp: String = "Hello Interface"

    override fun print() {
        println("Overridden defination of print function")
    }
}

fun main(args: Array<String>){
    val obj = Example()

    println("${obj.testProp}")
    obj.print()
    obj.printDefault()
}
