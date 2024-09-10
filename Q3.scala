class Account(var balance: Double) {

  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
    println(s"Deposited $$${amount}. Current balance: $$${balance}")
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdraw amount must be positive")
    if (amount > balance) {
      println("Insufficient funds.")
    } else {
      balance -= amount
      println(s"Withdrew $$${amount}. Current balance: $$${balance}")
    }
  }

  def transfer(toAccount: Account, amount: Double): Unit = {
    require(amount > 0, "Transfer amount must be positive")
    if (amount > balance) {
      println("Insufficient funds for transfer.")
    } else {
      this.withdraw(amount)
      toAccount.deposit(amount)
      println(s"Transferred $$${amount} to the target account.")
    }
  }

  override def toString: String = s"Balance: $$${balance}"
}

object AccountTest extends App {
  val account1 = new Account(500.0)
  val account2 = new Account(300.0)

  account1.deposit(100.0)
  account1.withdraw(50.0)
  account1.transfer(account2, 200.0)

  println(account1)
  println(account2)
}
