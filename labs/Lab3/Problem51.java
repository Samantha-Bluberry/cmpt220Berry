import java.util.Scanner;
/**
 * file: Problem51.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 3
 * due date: February 21, 2017
 * version 1.0
 * 
 * This file computes stats about entered integers
 */
public class Problem51 {
  public static void main(String[] args) {
    //use do-while
    int currentNum;
    int numPos = 0;
    int numNeg = 0;
    double interation = 0;
    double total = 0;
    Scanner input = new Scanner(System.in);

    do {
      System.out.print("Enter an interger, the input ends if it is 0: ");
      currentNum = input.nextInt();

      if (currentNum > 0) {
        numPos++;
        interation++;
      }
      if (currentNum < 0) {
        numNeg++;
        interation++;
      }
      total += currentNum;
    } while (currentNum != 0);
    if (interation == 1)
      System.out.println("No numbers are entered except 0");
    else {
      System.out.println("The number of positives is " + numPos);
      System.out.println("The number of negatives is " + numNeg);
      System.out.println("The total is " + total);
      System.out.println("The average is " + (total / interation));
    }
  } //computes stats about entered integers
}
