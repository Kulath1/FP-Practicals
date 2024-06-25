object Practical {

    def main( args : Array[String]) : Unit = {

        var i = 2;
        var j = 2;
        var k = 2;
        var m = 5;
        var n = 5;
        var f = 12.0; // cannot use f in it's own intialization
        f * f;
        var g = 4.0 * f;
        var c = "X";

        println(" k+12*m: " + (k + 12 * m))
        println(" m/j : " + (m / j))
        println(" n%j : " + (n % j))
        println(" m/j*j : " + (m / j*j))
        println(" f+10*5+g : " + (f + 10 * 5 + g))
        println(" ++i * n : " + ((i+=1) * n)) // scala does not support increment and decrement operators
    }
}