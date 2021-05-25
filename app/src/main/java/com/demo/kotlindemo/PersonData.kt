package com.demo.kotlindemo

 class PersonData(val name:String, val age:String= "27",override var fName: String ,override val lName: String): FirstName,LastName{





    override fun alert() {
        super<FirstName>.alert()
        super<LastName>.alert()
    }



}
interface FirstName{
    var fName:String

    fun alert() {
        println("first name default $fName")
    }
}

interface LastName{
    val lName:String

   

    fun alert() {
        println("last name default $lName")
    }
}

fun main(){
    val personData=PersonData("vivek","27","vivekRaj","singh")
    println(personData)

    println(personData.alert())


    println(personData.name)
//  //  println(personData.component1())
 //   println(personData.component2())
//
//    val (Name,age)=PersonData("vivek","28")
//    println(Name)
//    println(age)
//  val p1=  personData
//        println(p1)
//    val personData2=PersonData("vivek")
//
//
//    println(personData2)



  //primitive data type behave as a equality but does not work for object.

//
//    var a : Int = 1000
//    var b : Int = 1000
//    println(a === b)
//
//    println(p1===personData)
//    println(personData===personData2)
//    println(personData==personData2)
//
//    var str1:String="aaa"
//    var str2:String="bbb"
//    println(str1===str2)

}