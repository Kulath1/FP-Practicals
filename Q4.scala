object HelloWorld {

  def main( args: Array[String]) : Unit = {
    
    def discountForOneBook(priceOfOneBook : Double) : Double = {
        priceOfOneBook * 0.4
    }

    def shippingCost(noOfCopies : Int) : Double = {
        if(noOfCopies <= 50){
            3
        }else{
            ((noOfCopies-50)*3.75) + 3
        }
    }

    def totalCost(priceOfOneBook : Double, noOfCopies : Int) : Double = {

        val discountedPricePerBook = priceOfOneBook * (1 - 0.4)
        val totalBookCost = discountedPricePerBook * noOfCopies
        val totalShippingCost = shippingCost(noOfCopies)
        val wholesaleCost = totalBookCost + totalShippingCost
        wholesaleCost
    }

    val cost = totalCost(24.95, 60)
    println(s"Total wholesale cost: Rs. $cost")
    
  }   
  
}
