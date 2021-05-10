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

    //--------------------------- higher order function-------------------------------------

  //  addUserNamer("vivek","singh", addString) // way 1 for calling higher order function
//addUserNamer("raju","verma",{
//    a,b->"my name is $a, and surname is $b"
//})   // way 2 for calling higher order function

//    addUserNamer("vinod","gupta"){ a,b->a.plus(b)} // way 3 for calling higher order function
//
//multiple(5,5){
//    a,b->a*b
//}

//    val lambda:Int.(Int)->Int={
//        this+it
//    }
//
//    println(1.lambda(1))

//    val lambda2 : String.(Boolean)->String={
//        this+it
//    }

 //   println("Vivek".lambda2(true))

    val dataItemLambda :(DataItem) -> String={
        it.name.plus(it.email)
    }
//        val dataObject=DataItem("raj"," raj@neosoft")
//    println(dataItemLambda(dataObject))
////
//    val list= listOf<Int>(1,2,3,4,5,6,7,8)
////    println(list)
//    val result=list.filter {
//        it % 2==0
//    }
//    println(result)
//
//    val userList= mutableListOf<User>(
//        User("1","vivek"),
//        User("2","singh")
//    )
//   print(
//       userList.filter {
//       it.id=="2"
//   })


//    var adminList=userList.map {
//        Admin(it.id,it.name)
//    }
//
//    print(adminList)

//print(addAdmin()("5","vivek"))

}



fun addUserNamer(fname : String, lname:String, addString: (String,String)->String){

 val result=   addString(fname,lname)
    print(result)
}

val addString:(String,String)->String={
    a, b -> "my name is $a and surname is $b"
}
fun add(x:Int,y:Int)=x+y


fun multiple(nums1:Int, nums2:Int,mult:(Int, Int)->Int){
    val output=mult(nums1,nums2)
    println(output)
}



data class User(val id:String,val name:String)
data class Admin(val id:String,val name:String)



fun addAdmin(): (String, String) -> String {
    return {
        a, b-> a+b

    }
}