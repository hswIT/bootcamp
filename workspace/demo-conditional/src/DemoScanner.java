import java.util.Scanner;

public class DemoScanner {

  public static void main(String[] args) {
    
    // User input
    Scanner s = new Scanner(System.in);
    System.out.println("Please input a number: ");
    int input = s.nextInt();
    // terminal will stop at "s.nextInt()", and wait for a user input
    // After capturing the user input -> assignment

    System.out.println("The user input = " + input);
    
    // Example 2
    // Choose an option 1) Deposit 2) Withdraw 3) Check Balance
    // if user input 1
      // Question: "Please input the deposit amount"
    // if user input 2
      // Question: "Please input the withdraw amount" 
        // print out the amount after withdrawal
    // if user input 3
      // Print out current balance
    
    double currentBalance = 300.0;
    Scanner s1 = new Scanner(System.in);
    System.out.println("Please press 1 for deposit, 2 for withdraw, 3 for check balance");
    int option = s1.nextInt();

    if (option == 1) {
      System.out.println("Please input the deposit amount");
      double depositAmount = s1.nextDouble();
      System.out.println("Your current balance is " + (currentBalance + depositAmount));
    } else if (option == 2) {
      System.out.println("Please input the withdraw amount");
      double withdrawAmount = s1.nextDouble();
      System.out.println("Your current balance is " + (currentBalance - withdrawAmount));
    } else if (option == 3) {
      System.out.println("Your current balance is " + currentBalance);
    } else {
      System.out.println("Failed to process other than deposit, withdraw, check balance");
    }
    

    


  }
}
