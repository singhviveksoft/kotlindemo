package com.demo.kotlindemo

 class DataItem(var name: String, var email: String="webmsil") {
    // declaring class as open to inherit it property
//    var item1:String?=name
//    var item2:String?=email

companion object{
    var id=1
        fun name() {
            print("hello")
        }
}



    override fun toString(): String {
        return " name= $name email= $email"
    }
}


data class Area(val latitudeCode:Double):Location() {

    override var lati: Double=1.0
        get() = field
        set(value) {}

    override fun printLocation() {
        println("latitude $latitudeCode")
    }
}

abstract class Location{
     abstract var lati:Double
    abstract fun printLocation()
}



fun main(){

    DataItem.name()
    DataItem.id=2
    println(DataItem.id)
  var area=  Area(89.0)
    area.printLocation()



}