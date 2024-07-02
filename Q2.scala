import scala.io.StdIn.readLine

object Question2 {

    def main( args: Array[String]) : Unit = {

       def filterStr() : Unit = {

            println("Enter a list of strings(seperated by spaces): ")
            var inputList = readLine().split("\\s+").toList
            var filteredInput = inputList.filter(_.length > 5)
            println("Filtered string: " + filteredInput.mkString(", "))

        }

        filterStr()
    }
}