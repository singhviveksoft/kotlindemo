package com.demo.kotlindemo

fun main(){
    val user= addUser("ajay","pal"){
        a,b->a+b
    }                                // calling higher order function which pass function as a parameter
    print(user)

    val additionResult= addsum()(5,5)   // calling higher order function which return function
    print(additionResult)
  val name=  fullName()("vivek","singh")     // calling higher order function which return function
    println(name)
    higherOrderFunctionReturningUnit(print, ::sum,3,4)      // call higher funstion by passing normal method print and  sum
}

fun addUser(fName:String,lName:String, addName: (String,String)->String): String {
    return addName(fName,lName)
}

fun addsum():(Int,Int)->Int{
    return ::sum
}

fun sum(a:Int,b:Int):Int
{
  return  a+b
}



val print={
    println("hello")
}


fun higherOrderFunctionReturningUnit(print:()->Unit,sum:(Int,Int)->Int,nos1:Int,nos2:Int){     //higher order function-----taking function as parameter----- passing normal function
   print()
  val o=  sum(nos1,nos2)
    print(o)
}

fun fullName():(String,String)->String{                   // higher order function------ returning function
    return ::name
}
fun name(fName: String,lName: String):String{
    return fName.plus(lName)

}