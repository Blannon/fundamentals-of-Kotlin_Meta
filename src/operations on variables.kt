fun  main(){
    val scoreLevel1 = 79
    val scoreLevel2 =92
    val scoreLevel3 =86

    val totalScore= scoreLevel1 + scoreLevel2 + scoreLevel3
    val averageScore = totalScore / 3

     val boostMultiplier = 4
    val scoreBoost = boostMultiplier * totalScore
    val finalBoostedScore = totalScore + scoreBoost

    println(totalScore)
    println(averageScore)
    println(scoreBoost)
    println(finalBoostedScore)
}