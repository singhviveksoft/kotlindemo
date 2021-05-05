package com.demo.kotlindemo

fun main(){
//    val square : (Int) -> Int={
//        number -> number*number
//    }
//

//
//    println(square(5))

//    var add : (Int,Int) -> Int={
//            a,b->a+b
//
//    }
//
//
//   println(add(5,6))

    val lambda:Int.(Int)->Int={
        this+it
    }

  //  println(1.lambda(1))

    val lambda2 : String.(Boolean)->String={
        this+it
    }

 //   println("Vivek".lambda2(true))

    val dataItemLambda :(DataItem) -> String={
        it.name.plus(it.email)
    }
        val dataObject=DataItem("raj"," raj@neosoft")
    println(dataItemLambda(dataObject))

    val list= listOf<Int>(1,2,3,4,5,6,7,8)
    println(list)
    val result=list.filter {
        it % 2==0
    }
    println(result)

    val userList= listOf<User>(
        User("1","vivek"),
        User("2","singh")
    )
   print(
       userList.filter {
       it.id=="2"
   })
    var adminList=userList.map {
        Admin(it.id,it.name)
    }

    print(adminList)


}



data class User(val id:String,val name:String)
data class Admin(val id:String,val name:String)