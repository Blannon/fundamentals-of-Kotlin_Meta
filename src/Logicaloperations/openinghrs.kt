package Logicaloperations

fun main(){
    val weekday  = "Friday"
//    println("On $weekday, the opening hours are : ")
    val hour = 2

   val isOpen= when(weekday){
        "Monday" -> hour >= 8 && hour <= 12
       "Teusday", "Wednesday", "Thursday" -> hour >= 8 && hour <= 18
       "Friday" -> hour>= 8 && hour <= 21
       "Saturday" -> hour >= 9 && hour <= 16
       "Sunday" -> hour >= 8 && hour<=16

       else -> false
//        weekday=="Monday" ->
//            println("8AM to 12PM")
//
//        weekday=="Teusday" ->
//            println("8AM to 6PM")
//
//        weekday=="Wednesday" ->
//            println("8AM to 6PM")
//
//        weekday=="Thursday" ->
//            println("8AM to 6PM")
//
//        weekday=="Friday" ->
//            println("8AM to 9PM")
//
//        weekday=="Saturday" ->
//            println("9AM to 4PM")
//
//        weekday=="Sunday" ->
//            println("8AM to 4PM")

    }
    if (isOpen){
        println("Little Lemon is now open")
    } else{
        println("Little Lemon is now Closed")
    }

}