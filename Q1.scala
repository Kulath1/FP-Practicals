import scala.io.StdIn.readLine

object Question2 {

    def main( args : Array[String]) : Unit = {

        def reverseStr() : Unit = {

            println("Enter a string to reverse:")
            val inputString = readLine()

            var reversed = ""
            for (i <- inputString.length - 1 to 0 by -1) {
                reversed += inputString(i)
            }

            println("The reversed string is " + reversed)

        }

        reverseStr()
    }
}

