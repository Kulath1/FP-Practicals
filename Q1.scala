object InterestCalculator {
  def main(args: Array[String]): Unit = {

    val calculateInterest: Double => Double = (deposit: Double) => deposit match {
      case x if x <= 20000 => x * 0.02
      case x if x <= 200000 => x * 0.04
      case x if x <= 2000000 => x * 0.035
      case x if x > 2000000 => x * 0.065
    }

    val depositAmount = 50000.0
    val interestEarned = calculateInterest(depositAmount)
    println(s"Interest earned on Rs. $depositAmount is Rs. $interestEarned")
  }
}
