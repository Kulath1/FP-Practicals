import scala.io.StdIn.readLine

object Question4 {

  def main(args: Array[String]): Unit = {
    sumOfEven()
  }

  def sumOfEven(): Unit = {
    println("Enter a list of integers (separated by spaces): ")
    val input = readLine()
    val numbers = input.split("\\s+").map(_.toInt).toList

    var sum = 0
    for (num <- numbers) {
      if (num % 2 == 0) {
        sum += num
      }
    }

    println("The sum of even numbers in the list: " + sum)
  }
}
