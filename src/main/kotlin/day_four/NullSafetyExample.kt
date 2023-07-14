package day_four

fun main(args: Array<String>) {

    var str:String ?= "Hello"
    println(str)
    //str = null

    if(str != null) {
        println(str.uppercase())
    }

    if(str != null)
        println(str.length)
    else
        println("-1")

}