import scala.io.StdIn.readLine

object Main extends App {
  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(n => n % 2 == 0)
  }

  def readIntListFromUser(): List[Int] = {
    println("Enter a list of integers separated by spaces:")
    val input = readLine()
    input.split(" ").toList.map(_.toInt)
  }

  val inputList = readIntListFromUser()
  val outputList = filterEvenNumbers(inputList)
  println(s"Filtered even numbers: $outputList")
}
