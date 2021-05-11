package com.demo.kotlindemo



fun main(){
    var a:String?=null
    var b:String?=null
    a="hello"
    println(a)
    println(b?.length)


    val items= listOf<String?>(null,"kotlin",null)

    println(items)
    for (i in items){
        i?.let {
            println(i)

        }
    }

//Elvis operator is use to give default value to your property

    val x=b?.length?:0    // checking nullability at run time
    val y=a?.length?:0    // checking nullability at run time
    val z=b?:"hhhh"
    println(z)
    println(x)
    println(y)
}
