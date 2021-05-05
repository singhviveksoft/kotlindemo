package com.demo.kotlindemo

data class PersonData(val name:String, val age:String= "27"):Tata {
    override var count: Int = 6
        get() = field
        set(value) {
            field=value
        }


    override fun sum(a: Int, b: Int) :Int{
       return a.plus(b)
    }




}


fun main(){
    val personData=PersonData("vivek","27")
    println(personData)

    println(personData.sum(5))

//    println(personData.name)
//    println(personData.component1())
//    println(personData.component2())
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