package com.demo.kotlindemo

fun main(){
var alias=Alias("raj")
    alias.think()
//    var human = Human()
//    human.think()

//    var company=MobileDeveCompany("vivek","android")
//    company.devDept()
//    company.deveName()
    var webDevcompany=WebDevcompany("rajat","js")
    webDevcompany.deveName()
    webDevcompany.devDept()



}

open class Human{
   open fun think() = println("real thought")
}
class Alias(val nmae:String):Human(){
    override fun think() {
        super.think()
        println("virtual ideas $nmae")
    }

}

 open class SoftwareEngineer(val name :String,val dept:String){

  open fun deveName()= println("developer name: $name")
    fun devDept()= println("dept name: $dept")
}

class MobileDeveCompany:SoftwareEngineer{
    constructor(name: String,dept: String):super(name, dept){
        println("Name= $name dept= $dept")
    }

    override fun deveName() {
        super.deveName()
        println("mob developer name: $name")
    }


}



class WebDevcompany(devNmae:String,dept: String):SoftwareEngineer(devNmae,dept){
    override fun deveName() {
        super.deveName()
    }


}

