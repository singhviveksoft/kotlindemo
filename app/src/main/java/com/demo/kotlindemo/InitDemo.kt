package com.demo.kotlindemo

class InitOrderDemo( name: String) {
  //  lateinit var nos:Int  // not allow for primitive data type and not allowed in constructor
    lateinit var firstProperty: String
val id :DataItem by lazy { // can not use with var

  println("my name is")
    DataItem(name= "raj")

}


    fun lateCheck(){

        if (::firstProperty.isInitialized) print("lateinit initialized")
     else  print("lateinit not be initialized")
    }
   // val firstProperty = "First property: $name"


    init {
        println("First initializer block that prints ${name}")
    }



    var secondProperty = "Second property: ${name.length}"

    init {
        println("Second initializer block that prints ${name.length}")
    }
    constructor(name: String,id:String,):this(name)
    {
        print("name: $name id: $id")

    }


}

class InitDemo {
    var name:String


    constructor(name: String,gender:String){            //var and val ard not allowed in sec. condstr.
       this.name=name
    }

    override fun toString(): String {
        return "name $name"
    }
}

fun main() {
   var initObj= InitOrderDemo("hello")
 //   initObj.lateCheck()
    println(initObj.id)
    println(initObj.id)
 //   InitOrderDemo("vello","5326")
 //  var obj= InitDemo("vivek","men")
 //   print(obj)
 //   obj.name="singh"
//    print(obj)
}