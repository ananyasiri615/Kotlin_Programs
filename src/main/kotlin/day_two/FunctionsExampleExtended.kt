package day_two

import day_one.myFunction

fun Myfunction(){
    println("From inside my own function" )
}
fun main(args: Array<String>){
    println("From Inside the main function")
    myFunction()
    val result = multiply(12,4)
    println("result= "+result)
    getFullName("Meera", "Kumari")
    getDetails("Vimal", 35)
    getDetails("Ajay")
    getDetails(age=30)

}

fun multiply(n1:Int, n2:Int):Int {
    val result = n1 * n2
    return result
}

fun getFullName(firstName: String, surName: String){
    println(firstName.plus(" ").plus(surName))
}

fun getDetails(name: String = "Kamal", age: Int = 20){
    println("Hello Mr $name . your age is $age ")
}