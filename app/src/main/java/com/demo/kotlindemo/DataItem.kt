package com.demo.kotlindemo

 class DataItem(var name: String, var email: String) {
    // declaring class as open to inherit it property
//    var item1:String?=name
//    var item2:String?=email


    override fun toString(): String {
        return " name= $name email= $email"
    }
}