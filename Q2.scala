import scala.io.StdIn.readLine

object Main extends App {
  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(n => n * n)
  }

  def readIntListFromUser(): List[Int] = {
    println("Enter a list of integers separated by spaces:")
    val input = readLine()
    input.split(" ").toList.map(_.toInt)
  }

  val inputList = readIntListFromUser()
  val outputList = calculateSquare(inputList)
  println(s"Squares of the input numbers: $outputList")
}
