package com.demo.kotlindemo

// we can also create anonymous without extending class and interface

// comstructor are not allowed in singleton or object expression i.e anonymous inner class

open class University{
    fun examForm() = println("exam form done")
   open fun college(name:String){
        println("name of college: $name")
    }
}
 class Department(val department:String){
     fun printDepatment() = println("department is : $department")

 }


interface Teacher{
    fun hod()= println(" hod present")

    fun teachingstaff()
}


interface Teacher1{
    fun hod()= println(" hod present")

    fun teachingstaff(){
        println("techer 1 teaching staff ")
    }
}

fun main(){
    val student=object :University(),Teacher,Teacher1{



        override fun college(name: String) {
            super.college(name)
        }

        override fun hod() {

        }

        override fun teachingstaff() {
            super<Teacher1>.teachingstaff()
        }



    }
    student.college("dy patil")
    student.examForm()

    val obj= object  {               // constructor are not allowed object (){}
        val id=5
        var age=18

    }
    println("id : ${obj.id} and age ${obj.age} ")
}


