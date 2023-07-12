package day_three

import java.util.Scanner
fun main(args: Array<String>) {


    var reader = Scanner(System.`in`)

    var str = reader.nextLine()

    var map = LinkedHashMap<Char,Int>()

    for(j in str){
        if(map.containsKey(j)){
            map.put(j,map.getValue(j)+1)
        }
        else{
            map.put(j,1)
        }

    }

    var firstnotreoccuring : Char = ' '
    var count=Integer.MAX_VALUE
//    for((key, value) in map){
//        if(count>map.getValue(key)){
//            count=map.getValue(key)
//            firstnotreoccuring=key
//        }
//    }
    for((key, value) in map){
        if(map.getValue(key)==1){
            println(key)
            break
        }
    }


    println(firstnotreoccuring)



}