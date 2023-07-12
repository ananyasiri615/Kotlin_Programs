package day_three

//Open means the class is open of inheritance
open class Human(name:String, age:Int){
    var name: String = ""
    var age: Int = 0

    init{
        this.name = name
        this.age = age
    }

    open fun communicate(){
        println("Humans communicate using a language")
    }
    fun displayInfo(){
        println("Name is: $name age is: $age")
    }
}
class Doctor(name: String, age: Int, dept: String): Human(name, age){

    var dept : String = ""
    init {
        this.dept = dept
    }

    fun cure(){
        println("The doctor cures patients")
    }

    override fun communicate(){
        println("The doctor communicates using medical terms")
    }

}

fun main(args: Array<String>) {
    val h = Human("Ravi", 25)
    val d = Doctor("Anjali", 30, "Cardiology")

    h.communicate()
    h.displayInfo()
    d.cure()
    d.communicate()
    d.displayInfo()
}