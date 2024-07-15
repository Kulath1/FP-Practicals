import scala.collection.mutable.Set

// Case class to represent a Book
case class Book(title: String, author: String, isbn: String)

object LibraryManagement {
  
  // Mutable set to store the library's book collection
  var library: Set[Book] = Set(
    Book("Scala Programming", "Martin Odersky", "978-0981531649"),
    Book("Clean Code", "Robert C. Martin", "978-0132350884"),
    Book("Design Patterns", "Erich Gamma", "978-0201633610")
  )

  // Function to add a new book to the library
  def addBook(book: Book): Unit = {
    library += book
    println(s"Book added: ${book.title} by ${book.author} (ISBN: ${book.isbn})")
  }

  // Function to remove a book from the library by its ISBN
  def removeBook(isbn: String): Unit = {
    library.find(_.isbn == isbn) match {
      case Some(book) =>
        library -= book
        println(s"Book removed: ${book.title} by ${book.author} (ISBN: ${book.isbn})")
      case None =>
        println(s"No book found with ISBN: $isbn")
    }
  }

  // Function to check if a book exists in the library by its ISBN
  def containsBook(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  // Function to display the current library collection
  def displayLibrary(): Unit = {
    println("Current Library Collection:")
    library.foreach { book =>
      println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
    }
  }

  // Function to search for a book by its title
  def searchByTitle(title: String): Unit = {
    library.find(_.title.toLowerCase == title.toLowerCase) match {
      case Some(book) =>
        println(s"Book found:")
        println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      case None =>
        println(s"No book found with title: $title")
    }
  }

  // Function to display all books by a specific author
  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author.toLowerCase == author.toLowerCase)
    if (booksByAuthor.nonEmpty) {
      println(s"Books by $author:")
      booksByAuthor.foreach { book =>
        println(s"Title: ${book.title}, ISBN: ${book.isbn}")
      }
    } else {
      println(s"No books found by $author")
    }
  }

  def main(args: Array[String]): Unit = {
    // Example usage
    displayLibrary()

    // Adding a new book
    val newBook = Book("Effective Java", "Joshua Bloch", "978-0134685991")
    addBook(newBook)
    displayLibrary()

    // Removing a book by ISBN
    val isbnToRemove = "978-0201633610"
    removeBook(isbnToRemove)
    displayLibrary()

    // Searching for a book by title
    val titleToSearch = "Clean Code"
    searchByTitle(titleToSearch)

    // Displaying books by an author
    val authorToSearch = "Robert C. Martin"
    displayBooksByAuthor(authorToSearch)
  }
}
