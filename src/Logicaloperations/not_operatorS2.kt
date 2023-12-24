package Logicaloperations
fun main(){
    val probability = 70

    when{
        probability <= 40 ->{
            println("maybe dogs")

        }
        probability >= 70 -> {
            println("Rats")
        }
        else -> {
            println("Lion")
        }
    }
}

