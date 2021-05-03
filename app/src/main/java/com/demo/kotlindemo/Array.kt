package com.demo.kotlindemo

fun main(){


    var strArray=Array(5)
    {i -> (i * i).toString()}
    strArray.forEach {
        println(it)
    }
  print(  desc(6L))
}
fun desc(any: Any):String{
    return when (any) {
        i -> "hello"
       !is Long -> "hi"
        else -> "unknow"

    }

}

