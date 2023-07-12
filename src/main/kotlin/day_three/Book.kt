package day_three

import java.util.*

fun main(args: Array<String>) {

    /*var books = LinkedList<String>();
    books.add("The Day I stopped Drinking Milk")
    books.add("Three thousand Stiches")
    books.add("Mahashwetha")
    books.add("House of Cards")
    books.add("The Mother I never knew")

    for (ele in books) {
        println(ele)
    }
    println("------------------------------------")
    books.remove("The Mother I never knew")
    books.remove("Mahashwetha")

    for (ele in books) {
        println(ele)
    }*/
    var stack = Stack<String>()

    stack.push("Meera")
    stack.push("Ajay")
    stack.push("Bharat")
    stack.push("Kumar")

    println("-------------------------------------")

    for(element in stack){
        println(element)
    }
    println("-------------------------------------")

    println(stack.pop())

}