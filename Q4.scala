object Practical {

    def main(args : Array[String]) : Unit = {

        var initialAttendance = 120
        var initialTicketPrice = 15.0
        
        def noOfAttendies(ticketPrice : Double) : Int = {
            var priceDifferenece = ticketPrice - initialTicketPrice
            var changedAttPerUnitPrice = 20/5
            initialAttendance - (priceDifferenece*changedAttPerUnitPrice).toInt
        }

        def totalCost(ticketPrice : Double) : Double = {
            var attendance = noOfAttendies(ticketPrice)
            500 + ( 3 * attendance)
        }

        def totalProfit(ticketPrice : Double) : Double = {
            var attendance = noOfAttendies(ticketPrice)
            (ticketPrice*attendance) - totalCost(ticketPrice)
        }

        var newTicketPrice = 40.0
        var profit = totalProfit(newTicketPrice)

        println(s"Ticket Price: $newTicketPrice")
        println(s"Profit: $profit")
    }

}