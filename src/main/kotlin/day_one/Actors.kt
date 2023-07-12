package day_one

class Actors(var name:String, var age: Int) {
    /*var id = 101
    var name = "Anushka"
    var gender = "Female"
    var bestFilm = "Bahubali"*/
    var aName: String
    var aAge: Int
    init{
        aName = name.uppercase()
        aAge = age - 2
    }
}

fun main(args: Array<String>){
    /*val a1 =  Actors()
    println("id : ${a1.id}, name : ${a1.name}, Gender : ${a1.gender}, best Film: ${a1.bestFilm}")

    var a2 = Actors()

    a2.id = 102
    a2.name = "Prabhas"
    a2.gender = "Male"
    a2.bestFilm = "Bahubali"

    println("id : ${a2.id}, name : ${a2.name}, Gender : ${a2.gender}, best Film: ${a2.bestFilm}")
*/
    val a = Actors("Hrithik", 40)
    println("Name of the Actor: ${a.aName} age: ${a.aAge}")
}