package com.demo.kotlindemo

import java.util.*

fun main(){

    val a1 = arrayOf(5,10,20,12,15)

    var matrix= arrayOf(
            arrayOf(1,2,3),               // Multi-Dimension Array:
            arrayOf(3,2,1),
            arrayOf(4,5,6),
            arrayOf(6,5,4)
    )

    println(Arrays.toString(a1))    // we can as try contentToString in normal array.

    println(Arrays.deepToString(a1))          // deepToString work with multi Dimension array, normal array and dont work for primitive datatype like IntarrayOf()
    println(Arrays.deepToString(matrix))
    println(matrix.contentDeepToString())     // same as deepToString which in java util package and contentDeepToString-- in kotlin collection

   // for (i in a1.indices)
     //   println(a1[i])

   // println(a1.size)

// val a2=  a1.iterator()
//
//    while (a2.hasNext()) println(a2.next())

    val array=IntArray(5){
    it->    0
    }

   array.forEach { print(it) }
// val arrayItem=Array(5) { it * 2 }
//
//    arrayItem.forEach {
//
//        println(it)
//    }

//-------------------------

//
//
//
//val stringArray:Array<String> = arrayOf("5","6")
//
//    val outputArray=stringArray.map {
//        it.plus("8")
//
//    }
//
//    outputArray.forEach {
//        println(it)
//    }





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









