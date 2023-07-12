package day_two

fun main(args: Array<String>) {

    var arr = arrayOf<Int>(101, 103, 105, 109, 102) //to create specific type array
    var myArr:IntArray = intArrayOf(101, 103, 105, 109, 102)
    var names = arrayOf<String>("Arjun", "Shankar", "Javed")

    for(index in 0..2){
        println("value: "+names[index])
    }
    println("___________________________________________________")

    arr.set(2, 111)

    arr[3] = 112

    //println(arr.toString())
    println(arr.get(4)) //to get the element at a particular position
    println("___________________________________________________")

    println(arr[3]) //to get the element at a particular position
    println("___________________________________________________")

    var index = 4
    if(index< arr.size) {
        println(arr.get(4))
    }
    println("___________________________________________________")

    for(element in arr){
        println(element)
    }
    println("___________________________________________________")

    var arr1 = Array<Int>(5){3} //to set default value
    println("___________________________________________________")
    arr1.set(1, 31)
    arr1.set(2, 32) //to set value for particular index
    arr1.set(4, 33)
    for (value in arr1){
        println(value)
    }
    println("___________________________________________________")

}