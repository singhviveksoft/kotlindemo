package com.demo.kotlindemo

fun main(){
//    val list= mutableListOf<Any>(1.5F,7.5F,7.2F)
//
//    for (item in list){
//        if (item is String){              // type cas
//            println("string is $item")
//
//        }
//        else if (item is Float){
//            println("Float is $item")
//
//        }
//        else if ((item is Double)){
//            println("Double is $item")
//
//        }
//        else if (item is Boolean){
//            println("Boolean is $item")
//
//        }
//        else println("unknown")
//    }
    val softwareEngineer=MobileDeveCompany("qq","and")
    if (softwareEngineer is MobileDeveCompany){
        print("yes")
    }

    val obj:Any=1

    val string=obj as? String   //smart cast
    print(string)


}