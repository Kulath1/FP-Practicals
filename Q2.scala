object NumberCategorizer {
  def main(args: Array[String]): Unit = {
    println("Enter an integer:")
    val input = scala.io.StdIn.readInt()

    val isMultipleOfThree = (n: Int) => n % 3 == 0
    val isMultipleOfFive = (n: Int) => n % 5 == 0

    input match {
      case x if isMultipleOfThree(x) && isMultipleOfFive(x) => println("Multiple of Both Three and Five")
      case x if isMultipleOfThree(x) => println("Multiple of Three")
      case x if isMultipleOfFive(x) => println("Multiple of Five")
      case _ => println("Not a Multiple of Three or Five")
    }
  }
}
