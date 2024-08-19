import scala.io.StdIn.readLine

object NumberClassifier {
  def main(args: Array[String]): Unit = {

    println("Please enter an integer:")
    val inputStr = readLine()

    try {
      val input = inputStr.toInt

      val classifyNumber: Int => String = (num: Int) => num match {
        case x if x <= 0 => "Negative/Zero is input"
        case x if x % 2 == 0 => "Even number is given"
        case _ => "Odd number is given"
      }
      
      val result = classifyNumber(input)
      println(result)

    } catch {
      case _: NumberFormatException => println("Please provide a valid integer.")
    }
  }
}

