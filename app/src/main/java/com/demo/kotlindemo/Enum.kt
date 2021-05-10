package com.demo.kotlindemo

enum class Enum{
    January,Feb,March
}
// enum class with initialize with constr
// i.e assiging default value fro object constant since each member
// of enum class is a object (instance of enum class)

enum class CardType(var color:String){
    Silver("gray"),Gold("yellow"),Platinum("black")
}
enum class DAYS{                            // enum class without constr.
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}
enum class Seasons(var weather: String): weatherMonth{
    // using a abstract method to override fun
  Summer("hot") {
      override fun weatherCondition() {                                 // interface can also be use but class cannot be extent, it can have init block and componion object
      }

      override fun month(msg:String) {
          println("$msg month is hot")

      }
  },
    Winter("cold"){
        override fun weatherCondition() {
    }

        override fun month(msg: String) {

            println("$msg is cold")
        }

    },
    Rainy("moderate"){
        override fun weatherCondition() {
          println(  Rainy.ordinal)
    }
        override fun month(msg:String){
            println("In $msg rain is moderate ")
        }
    };
    abstract fun weatherCondition()



}
interface weatherMonth{
    fun month(msg:String)
}
fun main(){

    // using enum class with when expression.


//    when(DAYS.SUNDAY){
//        DAYS.SUNDAY -> println("Today is Sunday")
//        DAYS.MONDAY -> println("Today is Monday")
//        DAYS.TUESDAY -> println("Today is Tuesday")
//        DAYS.WEDNESDAY -> println("Today is Wednesday")
//        DAYS.THURSDAY -> println("Today is Thursday")
//        DAYS.FRIDAY -> println("Today is Friday")
//        DAYS.SATURDAY -> println("Today is Saturday")
//        // no need for else statement bcz every possible condition of enum class is cover in when expression
//    }

//
  val cardtype=  CardType.Gold
    cardtype.color="golden"
    println(CardType.Gold.color)
//    when(CardType.Platinum.color){
//        CardType.Gold.color->
//            println(CardType.Gold.color)
//        CardType.Silver.color->
//            println(CardType.Silver.color)
//        CardType.Platinum.color->
//            println(CardType.Platinum.color)
//
//    }




  //  println(CardType.Gold.color)

println(Seasons.Rainy.name)
 //  println(Enum.January.name)      // we can get name of enum constant using----- name (which can be used tu check tu constant)

//    for (enum in Enum.values()){
//        println(" index: ${enum.ordinal} and name of the object ${enum.name}")
//    }

  //  println(Enum.March.ordinal)     // we can get index of enum constant using ------ ordinal
//    println(Enum.values().size)
//    println(Enum.valueOf("Feb"))    // feb not allowed
 //  println(Enum.values())
//
//    Enum.values().forEach {
//        println(it)
//    }
//for (enum in Enum.values()) println(enum)

    Seasons.Rainy.weatherCondition()
    Seasons.Winter.month("december")
}