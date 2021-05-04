package com.demo.kotlindemo

import java.util.*

fun main(){
    //String manipulation working

//    val str= listOf("aaa","bbbbb","ccccc")
//   val itemStr :List<String> = str.map {
//        it.plus(DataItem(email = "vivek.neodoft@wbmail",name = "vivek"))
//
//    }


 //   print(itemStr)


//    val strItemWithNull= listOf("cup","tea",null)
//
//    val strItem  = strItemWithNull.mapNotNull {
//        it
//    }
//    print(strItem)






//    val string = " kotlin"
//    for (i in string) {
//        println(i)
//    }
//    val listOfNos= listOf<String>("one","two","three")
//    listOfNos.forEach { println(it) }
//
//    println(listOfNos.reversed())

//

    val name="vivek"
val myName= buildString {
    repeat(5){
        append("hi ")
        append(name)

                .appendLine("!")
    }
}

    println(myName)



    val blankString=" "
 val blankStringDefault=   blankString.ifBlank {
        "blank string  \n"
    }

val emptyString=""
    val emptyStringDefault=emptyString.ifEmpty {
        "empty string "
    }
    print(blankStringDefault)
    print(emptyStringDefault)


}






