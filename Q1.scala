import scala.io.StdIn.readLine

object InventoryManagement {

  // Function to get the product list from user input
  def getProductList(): List[String] = {
    var productList: List[String] = List()
    var input = ""
    while (input.toLowerCase != "done") {
      input = readLine("Enter product name (type 'done' to finish): ")
      if (input.toLowerCase != "done") {
        productList = productList :+ input
      }
    }
    productList
  }

  // Function to print the product list with positions
  def printProductList(productList: List[String]): Unit = {
    println("Product List:")
    productList.zipWithIndex.foreach { case (product, index) =>
      println(s"${index + 1}. $product")
    }
  }

  // Function to get the total number of products
  def getTotalProducts(productList: List[String]): Int = {
    productList.length
  }

  def main(args: Array[String]): Unit = {
    // Example usage
    val products = getProductList()
    printProductList(products)
    val totalProducts = getTotalProducts(products)
    println(s"Total number of products: $totalProducts")
  }
}
