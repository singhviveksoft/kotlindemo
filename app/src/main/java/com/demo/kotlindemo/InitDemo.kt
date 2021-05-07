package com.demo.kotlindemo

class InitOrderDemo(name: String) {
  //  lateinit var nos:Int  // not allow for primitive data type
    lateinit var firstProperty: String


    fun lateCheck(){
        if (this::firstProperty.isInitialized) print("lateinit initialized")
     else  print("lateinit not be initialized")
    }
   // val firstProperty = "First property: $name"


    init {
        println("First initializer block that prints ${name}")
    }



    val secondProperty = "Second property: ${name.length}"

    init {
        println("Second initializer block that prints ${name.length}")
    }
    constructor(name: String,id:String):this(name)
    {
        print("name: $name id: $id")

    }


}

class InitDemo {
    var name:String


    constructor(name: String,gender:String){
       this.name=name
    }

    override fun toString(): String {
        return "name $name"
    }
}

fun main() {
   var initObj= InitOrderDemo("hello")
    initObj.lateCheck()
 //   InitOrderDemo("vello","5326")
 //  var obj= InitDemo("vivek","men")
 //   print(obj)
 //   obj.name="singh"
//    print(obj)
}