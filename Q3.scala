object Practical {

    def main( args : Array[String]) : Unit = {

        def normalHrsPay( noNormalHrs : Int) : Int = {
            250 * noNormalHrs
        }

        def otHrsPay( noOTHrs : Int) : Int = {
            85 * noOTHrs
        }

        def taxPay( taxRate : Double, noNormalHrs : Int, noOTHrs : Int) : Double = {
            (normalHrsPay(noNormalHrs) + otHrsPay(noOTHrs)) * (taxRate/100)
        }

        def takeHomeSalary(noNormalHrs: Int, noOTHrs : Int, taxRate : Double) : Double = {
            (normalHrsPay(noNormalHrs) + otHrsPay(noOTHrs)) - (taxPay(taxRate, noNormalHrs, noOTHrs))
        }

        var finalSalary = takeHomeSalary(40, 30, 12.0)

        println(s"Salary that is taken home: $finalSalary")
    }
}