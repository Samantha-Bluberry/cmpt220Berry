import java.util.Scanner;
/**
 * file: Problem426.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 14, 2017
 * version 1.0
 * 
 * This file calculates the change for an input amount
 */
public class Problem426 {
  public static void main(String[] args) {
    String dollars, cents;

    //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    //Receive the amount
    System.out.print(
      "Enter an amount in double, for example 11.56: ");
    String amount = input.nextLine();

    //extracts dollar and cent amounts from string
    if (amount.indexOf('.') == -1) {
      dollars = amount;
      cents = "0";
    }
    else {
      dollars = amount.substring(0,amount.indexOf('.'));
      cents = amount.substring(amount.indexOf('.') + 1);
    }
    
    int remainingAmount = Integer.parseInt(cents);
  
    //Find the number of quarters in the remaining amount
    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;

    //Find the number of dimes in the remaining amount
    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;

    //Find the number of nickels in the remaining amount
    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;

    //Find the number of pennies in the remaining amount
    int numberOfPennies = remainingAmount;

    //Display results
    System.out.println("Your amount " + amount + " consists of");
    System.out.println("    " + dollars + " dollars");
    System.out.println("    " + numberOfQuarters + " quarters");
    System.out.println("    " + numberOfDimes + " dimes");
    System.out.println("    " + numberOfNickels + " nickels");
    System.out.println("    " + numberOfPennies + " pennies");
  } //calculates the change for an input amount
}