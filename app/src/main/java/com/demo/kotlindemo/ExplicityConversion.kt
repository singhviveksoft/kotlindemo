package com.demo.kotlindemo

class ExplicityConversion {



companion object{
    fun expilicityConversion(b:Byte,float: Float){

        println(b.toShort())

        println(float.toDouble())
        println(float.toLong())
    }




    fun max(a:Int,b:Int)= if (a>b)  a else  b

    fun maximum(a:Int,b: Int):Int{
        if (a>b) return a
        else return b
    }

}

}

fun main(){
   val ans: Int = ExplicityConversion.max(18,15)
    print(ans)
}



//var i=5  //by default its takes int value. Int 32 bites
//val l:Long=1000000000L //long 64 bites
//val b:Byte=25  /// 8 bites
//val s:Short=6666 //16 bites
//
//val d=3.8887 // by default its take double. 64 bite
//val f:Float=6.6666F // float 32 bites