package day_three

open class Professional(name:String,age:Int) {

    var name :String =""
    var age:Int=0
    init {
        this.name=name
        this.age=age
    }
    open fun display(){
        println("$name $age")
    }

}

class Engineer(name:String,age:Int,Dept:String):Professional(name,age){
    var Dept:String=""
    init {
        this.Dept=Dept
    }
    override fun display(){
        println("$name $age $Dept")
    }

}

class Medical(name:String,age:Int,Dept: String):Professional(name,age){
    var Dept:String=""
    init {
        this.Dept=Dept
    }
    override fun display(){
        println("$name $age $Dept")
    }

}

fun main(args: Array<String>) {

    var p = Professional("Kumar",34)
    var E = Engineer("Arjun",45,"Testing")
    var M = Medical("Meera",56,"Cardiology")

    p.display()
    E.display()
    M.display()

}