package com.demo.kotlindemo

fun main() {

//    var nos=7
//val ans=nos.add(8)
//    var a1:Int=7
//    7.add(5)
//println(ans)
//
//    var dataItem=DataItem()
//    dataItem.item1="vivek "
//    dataItem.item2="singh"
// val result=   dataItem.appendItem()
//println(result)
//
//    var strArray=Array(5)
//    {i -> (i * i).toString()}
//    strArray.forEach {
//        println(it)
//    }

//}


//    fun desc(any: Any) :String{
//        return when (any) {
//            is Int -> "hello"
//            !is Long -> "hi"
//            else -> "unknown"
//        }
//    }
//        print(desc(1))


        //list ------------------------------------------

//    val listitem= listOf(5, 6, 7, 10, "ttttt")
//
//    listitem.forEach { println(it) }
//
//    for (index in listitem.indices) println("index is $index : ${listitem[index]}")
//
//
//    val mutableListitem= mutableListOf<String>()
//
//
//    mutableListitem.add("singh")
//    mutableListitem.add(0,"hello")
//    mutableListitem.add(1,"vivek")
//
//    println(mutableListitem)

        // set-----------------------------------------------


//    val item= setOf(1,2,3,4,56,"yyy",7,8,9,9,null)
//    println(item)
////
//    val setItem= mutableSetOf<Int>()
//    setItem.add(5)
//    setItem.add(10)
//    setItem.add(5)
////    println(setItem)
////
//
//    when{
//        10 in setItem-> print("vivek")
//        9 in setItem-> "hello"
//
//    }
//    print(setResult)


// map ------------------------------------------------------

//  var mapList=  mapOf("1a" to "ggg", "2b" to 5, "ff" to "ffff")
//
//println(mapList["2b"])
//    println(mapList)
//    for ((k,v)in mapList) println("$k : $v")
////
//    val mutableMapList= mutableMapOf("1" to "vivek", "2" to "singh",1 to "hhhh")
//    mutableMapList["1"]="raj"
//
//    mutableMapList.forEach { (s, s2) ->
//        println("$s : $s2")
//    }


// lazy ----------------------------------


    val str  :String by lazy {
        println("hello1")
        println("hello2")
        "bye"

    }

    println(str)
   // println(str)    // second time calling lazy val to see catch value.
//
//    checkInput(0)

    }


    fun checkInput(any: Any) {
        if (any is String) {
            println("hello vivek")
        }
    }











