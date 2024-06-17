object HelloWorld {

  def main( args: Array[String]) : Unit = {
    def convert(tempInCels : Double) : Double = {
        (tempInCels*1.8000) + 32
    }

    val tempInFah = convert(35)
    println(s"Temperature in Fahrenheit: $tempInFah")
  }   
  
}
