package com.demo.kotlindemo

fun main(){
    val obj=Car()


    obj.sum(1)
    obj.alert()
   obj.count=7
    obj.alert()
}

interface Tata{
    var count :Int
    fun sum(a:Int,b:Int=10): Int
    fun alert() :String{
      return  "Add by default"
    }

}

class Car :Tata{
    override var count: Int=0



    override fun sum(a: Int, b: Int) :Int{
    return  a.plus(b)
    }
    override fun alert() :String{
        super.alert()
       return "new alert ${count.plus(1)}"
    }



}