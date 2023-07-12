package day_three

import java.util.Scanner

fun main(args: Array<String>) {

    var scanner = Scanner(System.`in`)

    println("Enter the first string")
    var str1 = scanner.next()

    println("Enter another string")

    var str2 = scanner.next()

}

fun checkRotation(str1: String, str2: String):Boolean{

    if(str1.length != str2.length){
        return false
    }
    var megaStr = str1+str1
    if(megaStr.contains(str2)){
        return true
    }
    else{
        return false
    }
}