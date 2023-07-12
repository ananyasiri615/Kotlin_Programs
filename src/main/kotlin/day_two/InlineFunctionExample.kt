package day_two

inline fun higherfunc( str : String, mycall :(String)-> Unit){
// inovkes the print() by passing the string str
    mycall(str)
}
// main function
fun main(args: Array<String>) {
    print("GeeksforGeeks: ")
    higherfunc("A Computer Science portal for Geeks",::print)
}