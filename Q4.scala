class Account(var balance: Double) {

  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdraw amount must be positive")
    if (amount <= balance) balance -= amount else println("Insufficient funds.")
  }

  def transfer(toAccount: Account, amount: Double): Unit = {
    require(amount > 0, "Transfer amount must be positive")
    if (amount <= balance) {
      this.withdraw(amount)
      toAccount.deposit(amount)
    } else println("Insufficient funds for transfer.")
  }

  override def toString: String = s"Account balance: $$${balance}"
}

class Bank(val accounts: List[Account]) {

  def accountsWithNegativeBalances: List[Account] = {
    accounts.filter(account => account.balance < 0)
  }

  def totalBalance: Double = {
    accounts.map(_.balance).sum
  }

  def applyInterest(): Unit = {
    accounts.foreach { account =>
      if (account.balance > 0) {
        account.balance += account.balance * 0.05 
      } else {
        account.balance += account.balance * 0.1
      }
    }
  }
}

object BankTest extends App {

  val acc1 = new Account(500.0)
  val acc2 = new Account(-100.0)
  val acc3 = new Account(200.0)
  val acc4 = new Account(-50.0) 

  val bank = new Bank(List(acc1, acc2, acc3, acc4))

  println("Accounts with negative balances:")
  bank.accountsWithNegativeBalances.foreach(println)

  println(s"Total balance of all accounts: $$${bank.totalBalance}")

  bank.applyInterest()
  println("Balances after applying interest:")
  bank.accounts.foreach(println)
}
