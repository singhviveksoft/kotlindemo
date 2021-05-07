package com.demo.kotlindemo

class Generics<T>(val value:T?=null, val list: List<T>?=null){

    fun itemLenth(){
        print("length : ${value.toString().length}")
    }

    fun list (){
      val item=  list?.filterIndexed {
        index,element-> index % 2===0

        }

print(item)
    }


}

fun main(){
   Generics( listOf(1,3,4,56,7,8,"dddddd")).list()
   Generics("lllll").itemLenth()

    val listOfDataItem:List<DataItem> = listOf(
            DataItem("avinash","av@gmail.com"),
            DataItem("rajan","ra@gmail.com"),
            DataItem("vivek","vigmail.com"),
            DataItem("raj","rjgmail.com")

    )

   Generics(list=listOfDataItem).list()
}