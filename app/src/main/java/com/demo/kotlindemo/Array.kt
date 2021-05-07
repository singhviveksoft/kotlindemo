package com.demo.kotlindemo

fun main(){

//    val a1:IntArray = intArrayOf(5,10,20,12,15)
//    for (i in a1.indices)
//        println(a1[i])

  //  println(a1.size)

//    val array=IntArray(5){
//        it
//    }
//    array.forEach { print(it) }
// val arrayItem=Array(5) { it * 2 }
//
//    arrayItem.forEach {
//
//        println(it)
//    }

//-------------------------




val stringArray:Array<String> = arrayOf("5","6")

    val outputArray=stringArray.map {
        it.plus("8")

    }

    outputArray.forEach {
        println(it)
    }





  //while loop

//  var value= setOf("neo","soft")
//  value+="technology"  // question to asked
//
//  println(value)
//
//
//  var i=0
// while (i<value.size){
//    print(value)
//    i++
//  }

//-------------------------------






}









