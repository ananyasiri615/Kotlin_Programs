package day_five

import java.io.FileWriter
import java.io.PrintWriter

fun main(args: Array<String>) {

    val fileWriter = FileWriter("C:\\Users\\ANANYA SIRI\\Desktop\\sample.txt",true)
    val writer = PrintWriter(fileWriter)

    writer.appendLine("this line is written from a java code")

    writer.close()

    println("File written successfully")

}