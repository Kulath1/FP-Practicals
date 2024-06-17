object HelloWorld {

  def main( args: Array[String]) : Unit = {
    
    def easyTime(distance : Double) : Double = {
        distance * 8
    }

    def tempoTime(distance : Double) : Double = {
        distance * 7
    }

    def totalTime(easyDistance : Double, tempoDistance : Double) : Double = {
        val easyMinutes = easyTime(easyDistance)
        val tempoMinutes = tempoTime(tempoDistance)
        val totalMinutes = easyMinutes + tempoMinutes
        totalMinutes
    }

    val totalTimetaken = totalTime(2, 3)
    println(s"The total time taken is $totalTimetaken minutes.")
}
  
}
