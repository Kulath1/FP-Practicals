object NameFormatter {

  def toUpper(name: String): String = name.toUpperCase

  def toLower(name: String): String = name.toLowerCase

  def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)

  def main(args: Array[String]): Unit = {

    val name1 = "Benny"
    val name2 = "Niroshan"
    val name3 = "Saman"
    val name4 = "Kumara"

    val formattedName1 = formatNames(name1)(toUpper)
    val formattedName2 = formatNames(name2)(name => name.substring(0, 2).toUpperCase + name.substring(2).toLowerCase)
    val formattedName3 = formatNames(name3)(toLower)
    val formattedName4 = formatNames(name4)(name => name.substring(0, 1).toUpperCase + name.substring(1).toLowerCase)

    println(formattedName1) // BENNY
    println(formattedName2) // NIroshan
    println(formattedName3) // saman
    println(formattedName4) // Kumar
  }
}
