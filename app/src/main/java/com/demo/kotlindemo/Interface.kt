package com.demo.kotlindemo
//const val companyName = "MindOrks" // this will work compile time
//val comapanyname = "MindOrks" // this will work compile time

//const val companykName = getCompanyName() // will not work u can difned value at run time it should on compile time
//val companyName = getCompanyName()  // run time

fun getCompanyName(): String {
return "hrllo"
}

fun main(){
    val obj=Car()

   print( obj.sum(1))
    obj.alert()
 println(obj.count)
    obj.alert()
}


interface Tata{
    var count :Int               // property are not initalized in interface
    fun sum(a:Int,b:Int=10): Int
    fun alert() {
       print( "Add by  tata default")
    }

}

class Car :Tata{
    override var count: Int
        get() = 5
        set(value) {}



    override fun sum(a: Int, b: Int) :Int{
    return  a.plus(b)
    }
    override fun alert() {
        super.alert()
       println( "new alert ${count.plus(1)}")
    }



}

