object Question3 {

  def main(args: Array[String]): Unit = {
    val num1 = 10
    val num2 = 20
    val average = avg(num1, num2)
    println(f"The average of $num1 and $num2 is: $average%.2f")
  }

  def avg(num1: Int, num2: Int): Double = {
    val sum = num1 + num2
    val average = sum.toDouble / 2.0
    average
  }
}
