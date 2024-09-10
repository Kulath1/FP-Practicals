class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  private val gcdValue: Int = gcd(n.abs, d.abs)
  val numer: Int = n / gcdValue
  val denom: Int = d / gcdValue

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

  def neg: Rational = new Rational(-numer, denom)

  def sub(that: Rational): Rational = {
    val newNumer = this.numer * that.denom - that.numer * this.denom
    val newDenom = this.denom * that.denom
    new Rational(newNumer, newDenom)
  }

  def mul(that: Rational): Rational = {
    new Rational(this.numer * that.numer, this.denom * that.denom)
  }

  override def toString: String = s"$numer/$denom"
}

object RationalTest extends App {
  val x = new Rational(3, 4)
  val y = new Rational(5, 8)
  val z = new Rational(2, 7)

  val resultSub = y.sub(z)
  println(s"y - z = $resultSub") // Output y - z

  val result = x.mul(resultSub)
  println(s"x * (y - z) = $result") // Output x * (y - z)
}
