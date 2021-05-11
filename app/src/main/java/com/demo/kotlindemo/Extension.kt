package com.demo.kotlindemo

infix fun Int.add(num:Int)= println(this+num)

fun DataItem.appendItem()=this.name.plus(this.email)
fun main(){
   7.add(6)    // normal function calling and
    6 add 9   //infix function calling

}