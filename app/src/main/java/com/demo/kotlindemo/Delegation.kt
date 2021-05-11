package com.demo.kotlindemo

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

// Delegation is a coding design pattern.
//interface is req for communication between two class
// working of interfce is done by second class
interface Delegation{ //eagles job
// var id:Int by Base        //delegated properties are not allowed in interface.
    fun findEvenNos():Int

}

 class Base(val nos: Int):Delegation{ // eagle


var count:Int by DelegationProperty()
    override fun findEvenNos():Int {
      return  if (nos%2==0) 0 else -1
    }





}
class Derived(i:Delegation)  :Delegation by i     // eagle baby

/*delegated property
    * */
class DelegationProperty{
    var currentCount=0
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return currentCount
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        currentCount=value
    }
}
















val a:Int by lazy {
    println("lazy initialized")
    1
}
var vetoableCheck:Int by Delegates.vetoable(18){           // used for filtering data based on the condition or set initial value give.
    property, oldValue, newValue ->
    newValue>=18

}

var observerCheck:String by Delegates.observable("android studio"){   // for getting old and new value.
    property, oldValue, newValue ->
   println("older value $oldValue new value $newValue")

}

fun main(){
    val b=Base(5)

  val d=  Derived(b)        // job of eagle baby is done by some other eagle bcz the job where same i.e interface.
    println(d.findEvenNos())


  // delegation in ib build fn call laz, observable, vetoable
    println(a)
    println(a)
    vetoableCheck=16
    println(vetoableCheck)
    vetoableCheck=19.plus(5)
    println(vetoableCheck)
println(observerCheck)
    observerCheck="android development"
    println(observerCheck)

 // call for delegate property

    println(b.count)
    b.count=10
    println(b.count)
}