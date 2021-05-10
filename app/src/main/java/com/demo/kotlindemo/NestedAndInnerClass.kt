package com.demo.kotlindemo

class Outer(id:Int){
    var id=id
    var name="Kattapa"
    class nested(val msg:String){ // outer member are not access in nested class.
        fun callMe(){
            println(msg)
        }
    }

    inner class innerClass(val msg: String){   //  we cannot directly change value of id property in inner class
        var i=id

        fun innerCallMe() = print("msg: $msg and id: $i")
    }


}

fun main(){
  val outer= Outer(5)
    outer.name="rakesh"
    println(outer.name)
    Outer.nested("hello every one").callMe()
    Outer(3).innerClass("bye").innerCallMe()
}