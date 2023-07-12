package day_three

fun main(args: Array<String>){
    var names = mutableListOf<String>("Rahul", "Arvind","Mamatha", "Ravishankar", "Piyush" )

    names.remove("Arivind")

    for(n in names){
        println(n)
    }

    names.add(1, "Arvind")

    for(n in names){
        println(n)
    }
}