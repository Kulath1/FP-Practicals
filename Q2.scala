object Practical {

    def main( args: Array[String]) : Unit = {

        var (a, b, c, d) = (2, 3, 4, 5);
        var k = 4.3f;
        var g = 0.0;

        b-=1;
        d-=1;
        println("--b*a+c*d--: " + (b*a+c*d));
        a+=1;
        println("a++: " + a);
        println("-2*(g-k)+c : " + ((-2)*(g-k)+c));
        c+=1;
        println("c=c++ : " + c);
        c+=1;
        a+=1;
        println("c=++c*a++ : " + ((c*a)));
    }
}