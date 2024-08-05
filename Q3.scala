import scala.io.StdIn.readLine

object Main extends App {

  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else !(2 to Math.sqrt(n).toInt).exists(i => n % i == 0)
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(n => isPrime(n))
  }

  def readIntListFromUser(): List[Int] = {
    println("Enter a list of integers separated by spaces:")
    val input = readLine()
    input.split(" ").toList.map(_.toInt)
  }

  val inputList = readIntListFromUser()
  val outputList = filterPrime(inputList)
  println(s"Filtered prime numbers: $outputList")
}
