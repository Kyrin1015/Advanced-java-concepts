public class BankIntro {
  //Sets variables
  public double balance;
  public double changeAmount;

  //Constructor
  public BankIntro(double thebalance) {
    balance = thebalance;
  }

  //Deposit method
  private double deposit(double modification) {
    balance = balance + modification;
    return balance;
  }

  //Withdrawl method
  private double withdraw(double modification) {
    balance = balance - modification;
    return balance;
  }

  //Main withdraw and deposit method
  public void bankProcess(int pChoice, double amount) {
    if (pChoice == 1) {
      System.out.println("Your deposit: $" + amount);
      System.out.println("Your new balance: $" + deposit(amount));
    } else if (pChoice == 2) {
      System.out.println("Your withdraw: $" + amount);
      if ((balance - amount) >= 0) {
        System.out.println("Your new balance: $" + withdraw(amount));
      } else {
        System.out.println("Error!");
        System.out.println("Withdraw will result in negative balance.");
        System.out.println("Withdrawl cancelled.");
      }
    }
  }

  //Displays final balance when exiting the program
  public void balanceFinal() {
    System.out.println("Final Balance: $" + balance);
  }
}

