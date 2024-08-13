object CaesarCipherExample extends App {

  def encrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val base = if (char.isLower) 'a' else 'A'
        ((char - base + shift) % 26 + base).toChar
      } else {
        char
      }
    }
  }

  def decrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val base = if (char.isLower) 'a' else 'A'
        ((char - base - shift + 26) % 26 + base).toChar
      } else {
        char
      }
    }
  }

  def cipher(func: (String, Int) => String, text: String, shift: Int): String = {
    func(text, shift)
  }

  val text = "Hello, World!"
  val shift = 3

  val encryptedText = cipher(encrypt, text, shift)
  println(s"Encrypted: $encryptedText")  // "Khoor, Zruog!"

  val decryptedText = cipher(decrypt, encryptedText, shift)
  println(s"Decrypted: $decryptedText")  // "Hello, World!"
}
