import java.util.*;

class Main {
  //Variables that are used through multiple methods
  static Scanner keyboard = new Scanner(System.in);
  static int pChoice = 0;
  static double addOrRemove = 0;
  static double balance = 0;

  public static void main(String[] args) {

    //Requests initial balance
    System.out.print("Please enter an initial balance: $");
    balance = Double.parseDouble(keyboard.nextLine());
    //Instantiates a BankIntro object
    BankIntro userbal = new BankIntro(balance);

    //While loop until user wants exit
    while (pChoice != 3) {
      getInt();
      userbal.bankProcess(pChoice, addOrRemove);
    }
    //Print's final balance
    userbal.balanceFinal();
  }

  //Asks user for choice
  public static void getInt() {
    System.out.println("What would you like to do?");
    System.out.print("Deposit(1), Withdraw(2), Exit(3): ");
    pChoice = Integer.parseInt(keyboard.nextLine());
    if (pChoice == 3) {
      System.out.println("Exiting program");
    } else if (pChoice > 2) {
      System.out.println("Not a valid input. Try again.");
    } else if (pChoice <= 0) {
      System.out.println("Not a valid input. Try again.");
    } else {
      addOrRemove = getAmount();
    }
  }

  //Ask user for deposit/withdraw amount
  public static double getAmount() {
    if (pChoice == 1) {
      System.out.print("How much would you like to deposit?: $");
      double dep = Double.parseDouble(keyboard.nextLine());
      return dep;
    } else if (pChoice == 2) {
      System.out.print("How much would you like to withdraw?: $");
      double width = Double.parseDouble(keyboard.nextLine());
      return width;
    } else {
      return 0;
    }
  }
}