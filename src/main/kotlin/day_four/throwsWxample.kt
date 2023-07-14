package day_four

fun main(args: Array<String>) {

    val username = "Arjun"
    val password = "pass"

    if(password.length < 6){
        throw Exception("The password must be at least 6 characters long and include one special character")
    }

    println("Login successful")


}