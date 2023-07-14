package day_five

import java.io.File

fun main(args: Array<String>) {
    var file = File("C:\\Users\\ANANYA SIRI\\Desktop\\sample.txt")
    var lines: List<String>  = file.readLines()

    for(line in lines){
        println(line)
    }
}
