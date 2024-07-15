object Fibonacci {

  // Function to calculate the nth Fibonacci number recursively
  def fibonacci(n: Int): Int = n match {
    case 0 => 0   // Base case: Fibonacci(0) = 0
    case 1 => 1   // Base case: Fibonacci(1) = 1
    case _ => {
      val prev1 = fibonacci(n - 1)
      val prev2 = fibonacci(n - 2)
      prev1 + prev2   // Recursive case: Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
    }
  }

  // Function to print the first n Fibonacci numbers
  def printFibonacci(n: Int): Unit = {
    if (n <= 0) {
      println("Invalid input. Please provide a positive integer.")
    } else {
      println(s"First $n Fibonacci numbers:")
      for (i <- 0 until n) {
        val fibNumber = fibonacci(i)
        print(fibNumber + " ")
      }
      println() // Print newline after the sequence
    }
  }

  def main(args: Array[String]): Unit = {
    // Example usage
    val n = 10  // Number of Fibonacci numbers to print
    printFibonacci(n)
  }
}
