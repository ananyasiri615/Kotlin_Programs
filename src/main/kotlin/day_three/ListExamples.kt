package day_three

import java.util.LinkedList

fun main(args: Array<String>){
    //immutable list no changes can be done
    var names = listOf<String>("Rahul", "Anjali", "Vijay", "Prabhas", "Vinod")

    for(n in names){
        println(n)
    }

    println("--------------------------")

    for(index in 0..names.size-1){
        println(names[index])
    }
    println("--------------------------")

    var cities = LinkedList<String>();
    cities.add("New Delhi")
    cities.add("Kolkata")
    cities.add("Chennai")

    for(ele in cities){
        println(ele)
    }

    var sizeOfList = names.size
    println(names.get(3))
    println(names.indexOf("Vijay"))
    println(names.contains("Meera"))
    println(names.drop(1))


}