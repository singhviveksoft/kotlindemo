package com.demo.kotlindemo

fun main(){

    val dataType=DataType()
//    dataType.issues()
//    dataType.expilicityConversion(22,5.69999f)
  //  dataType.str="raju"
 //   print(dataType.str)
//  val maxValue=  dataType.max(6,7)
//  val maximumValue=  dataType.maximum(6,7)
//    println(maxValue )
//    println(maximumValue)
//    dataType.item1="8"
//    dataType.item2="9"
//    println(dataType.item1)
//    println(dataType.item2)

    //-------------------------------

//var str ="vivek singh"
//    str="vivek"+"12"+1+1.45+true+-98
//    for (item in str) println(item)

//    val text = """
//    &Tell me and I forget.
//    &Teach me and I remember.
//    &Involve me and I learn.
//   &(Benjamin Franklin)
//    """.trimMargin("&")
//
//    print(text+"\n")
//    print("$text.length = ${text.length}")


//----------------------------------
// primitive array classes
//    val a1:IntArray = intArrayOf(5,10,20,12,15)
//    for (i in a1.indices)
//        println(a1[i])
//
//    println(a1.size)
//
//   a1.forEach { println(it) }

//-------------------------


// isues for default value setting
//    val arr = IntArray(5) { 62 }
//    for (i in arr) println(arr[i])

    //----------------------------------------


// collection
//    val item= listOf<String>("aaa","vvv","ccc")

//    for (i in item) println(i)
//
//    item.forEach { println(it) }
//
//    val set= setOf<Int>(3,4,5,6)
//
//    for (i in set) println(i)
//    set.forEach { println(it) }


  //while loop

//  var value= setOf("awaq","ytr")
//  value+="ddddd"
//
//  println(value)
//
//  var i=0
//  while (i<value.size){
//    print(value)
//    i++
//  }

  //question to ask
  var value2= mutableSetOf<String>("gggg","lll")
 // value2+="yyyy"
  value2.remove("gggg")
  value2.add("oooo")
  println(value2)
}










