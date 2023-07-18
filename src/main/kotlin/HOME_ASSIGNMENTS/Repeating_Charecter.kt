package HOME_ASSIGNMENTS

import java.util.Scanner

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    var word = scanner.nextLine()
    var lHM = LinkedHashMap<Char,Int>()
    for(j in word){
        if(lHM.containsKey(j)){
            lHM.put(j,lHM.getValue(j)+1)
        }
        else{
            lHM.put(j,1)
        }
    }
    var reoccur : Char = ' '
    var count=Integer.MIN_VALUE
    for((key, value) in lHM){
        if(count<lHM.getValue(key)){
            count=lHM.getValue(key)
            reoccur=key
        }
    }
    println(reoccur)
}