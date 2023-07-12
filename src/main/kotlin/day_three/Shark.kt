package day_three

class Shark(name:String,companyname: String,age:Int) {

    var name: String
    var companyname:String
    var age:Int


    init{
        this.name = name
        this.companyname=companyname
        this.age=age
    }

    override fun toString(): String {
        return "Shark(name='$name', companyname='$companyname', age=$age)"
    }


}

fun main(args: Array<String>) {

    var map = LinkedHashMap<Shark,Double>()
    var s1 = Shark("Aman Gupta","Boat",41)
    var s2 = Shark("Anupam Mittal","Shaadi.com",52)
    var s3 = Shark("Vinneta Singh","Sugar",32)
    var s4 = Shark("Amit Jain","Car Dekho",45)

    map.put(s1,9500.0)
    map.put(s2,2900.0)
    map.put(s3,2500.0)
    map.put(s3,1.3000)


    for((key, value) in map){
        println("$key $value")

    }

}