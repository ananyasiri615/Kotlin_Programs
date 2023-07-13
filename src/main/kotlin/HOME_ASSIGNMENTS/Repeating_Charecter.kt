package HOME_ASSIGNMENTS

import java.util.Scanner

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    var word = scanner.nextLine()
    var LHM = LinkedHashMap<Char,Int>()
    for(j in word){
        if(LHM.containsKey(j)){
            LHM.put(j,LHM.getValue(j)+1)
        }
        else{
            LHM.put(j,1)
        }
    }
    var reoccur : Char = ' '
    var count=Integer.MIN_VALUE
    for((key, value) in LHM){
        if(count<LHM.getValue(key)){
            count=LHM.getValue(key)
            reoccur=key
        }
    }
    println(reoccur)
}