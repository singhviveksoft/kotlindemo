package com.demo.kotlindemo

fun main(){

    var nos=7
val ans=nos.aracthematic(8)
println(ans)

    var dataItem=DataItem()
    dataItem.item1="vivek "
    dataItem.item2="singh"
 val result=   dataItem.initailize()
println(result)

//    var strArray=Array(5)
//    {i -> (i * i).toString()}
//    strArray.forEach {
//        println(it)
//    }
//  print(  desc(6L))
//}
//fun desc(any: Any):String{
//    return when (any) {
//        i -> "hello"
//       !is Long -> "hi"
//        else -> "unknow"
//
//    }

//    val item= setOf(1,2,3,4,56,"yyy",7,8,9)
//    when{
//      11 in item ->print(message = "hell0")
//
//        10 in item -> print("hi")
//        "yyy" in item -> print("hi6")
//        -21.8 in item -> print("hi9")
//        else -> print("unknown")
//    }
//
//    nullCheck(1)
  //  sun(1,8)

//  var mapList=  mutableMapOf("1a" to 1, "2b" to 2)
//    mapList["1a"]=3
//    for ((k,v)in mapList) println(v)
//
//    val str  :String by lazy {
//        print("hello1")
//        print("hello2")
//        "bye"
//
//    }

 //   println(str)
 //   println(str)

}


fun nullCheck(any: Any) {
    if (any is String) {
        println("hello vivek")
    } else if (any is Char){
     print("singh")
    }
}

fun sun(a:Int,b:Int) = println(a+b)


