import java.util.Scanner;
/**
 * file: Problem25.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 1
 * due date: January 31, 2017
 * version 1.0
 * 
 * This file calculates a total from an input subtotal and graduity
 */
public class Problem25  {
  public static void main(String[] args) {
    double subtotal, graduity;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the subtotal: ");
    subtotal = input.nextDouble();
    System.out.print("Enter the graduity rate: ");
    graduity = (input.nextDouble() / 100);
    
    System.out.println("The gratuity is $" + (graduity * 10) + 
    " and the total is $" + (subtotal  + (subtotal * graduity)));
  } //calculates a total from an input subtotal and graduity
}
