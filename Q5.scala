object WordCountApp extends App {
    
  def countLetterOccurrences(words: List[String]): Int = {

    val lengths = words.map(_.length)
    
    lengths.reduce(_ + _)
  }

  val words = List("apple", "banana", "cherry", "date")

  println(s"Total count of letter occurrences: ${countLetterOccurrences(words)}")
}
