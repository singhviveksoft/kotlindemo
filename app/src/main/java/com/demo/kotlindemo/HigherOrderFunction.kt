package com.demo.kotlindemo

fun main(){
    val user= addUser("ajay","pal"){
        a,b->a+b
    }
    print(user)

    val additionResult= addsum()(5,5)
    print(additionResult)
}

fun addUser(fName:String,lName:String, addName: (String,String)->String): String {
    return addName(fName,lName)
}

fun addsum():(Int,Int)->Int{
    return ::sum
}
fun sum(a:Int,b:Int)=a+b