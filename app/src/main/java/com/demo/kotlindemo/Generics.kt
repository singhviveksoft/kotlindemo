package com.demo.kotlindemo

class Generics<T>(val value:T?=null, val list: List<T>?=null){

    fun itemLenth(){
        print("length : ${value.toString().length}")
    }

    fun list (){
      val item=  list?.filterIndexed {
        index,element-> index % 2===0

        }

println(item)
println(list)
println(value)
    }


}
class GenericDemo<T>(var a:T,var b:T){
fun value(){
    println("a: $a and b: $b")
}
}

fun main(){
 //  Generics(list =  listOf(1,3,4,56,7,8,"dddddd")).list()      //give value according to order wise parameter or used parameter name to give value
  // Generics("lllll").itemLenth()
    var itemList= listOf<String>("hhhh","ddd","ssss")
//
    val listOfDataItem:List<DataItem> = listOf(
            DataItem("avinash","av@gmail.com"),
            DataItem("rajan","ra@gmail.com"),
            DataItem("vivek","vigmail.com"),
            DataItem("raj","rjgmail.com")

    )
GenericDemo(3,itemList).value()
//   Generics(1,list=listOfDataItem).list()
}