package day_five

data class BollywoodActor(val name: String, val age: Int, val gender: String)

fun main(args: Array<String>) {

    var actors: ArrayList<BollywoodActor> = java.util.ArrayList()

    var a1 = BollywoodActor("Pankaj kapoor", 50, "Male")
    var a2 = BollywoodActor("Anushka Sharma", 30, "Female")
    var a3 = BollywoodActor("Alia Bhatt", 30, "Female")
    var a4 = BollywoodActor("Aamir Khan", 55, "Male")
    var a5 = a4.copy()
    var a6 = a4.copy("Salman Khan")

    actors.add(a1)
    actors.add(a2)
    actors.add(a3)
    actors.add(a4)
    actors.add(a5)
    actors.add(a6)

    for(value in actors){
        println(value)
    }

}


