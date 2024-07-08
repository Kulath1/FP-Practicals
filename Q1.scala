object InventoryManagement {
  var itemNames: Array[String] = Array("Apple", "Banana", "Orange")
  var itemQuantities: Array[Int] = Array(10, 5, 8)

  def displayInventory(): Unit = {
    println("Current Inventory:")
    for (i <- itemNames.indices) {
      println(s"${itemNames(i)}: ${itemQuantities(i)}")
    }
  }

  def restockItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index >= 0) {
      itemQuantities(index) += quantity
      println(s"Restocked $quantity of $itemName. New quantity: ${itemQuantities(index)}")
    } else {
      println(s"Item $itemName does not exist in the inventory.")
    }
  }

  def sellItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index >= 0) {
      if (itemQuantities(index) >= quantity) {
        itemQuantities(index) -= quantity
        println(s"Sold $quantity of $itemName. Remaining quantity: ${itemQuantities(index)}")
      } else {
        println(s"Not enough $itemName in stock to sell $quantity. Current stock: ${itemQuantities(index)}")
      }
    } else {
      println(s"Item $itemName does not exist in the inventory.")
    }
  }

  def main(args: Array[String]): Unit = {
    displayInventory()
    restockItem("Apple", 5)
    sellItem("Banana", 2)
    sellItem("Orange", 10)
    restockItem("Grapes", 10)
    displayInventory()
  }
}
