object HelloWorld {

  def main( args: Array[String]) : Unit = {
    def areaOfDisk(radius : Double) : Double = {
        math.Pi * radius * radius
    }

    val area = areaOfDisk(5)
    println(s"Area of the disk is $area")
  }   
  
}
