object HelloWorld {

  def main( args: Array[String]) : Unit = {
    def volOfSphere(radius : Double) : Double = {
        (4/3) * math.Pi * radius * radius * radius
    }

    val vol = volOfSphere(5)
    println(s"Volume of the sphere is $vol")
  }   
  
}