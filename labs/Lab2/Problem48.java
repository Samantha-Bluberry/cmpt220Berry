import java.util.Scanner;
/**
 * file: Problem48.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 14, 2017
 * version 1.0
 * 
 * This file receives an ASCII code and displays its character
 */
public class Problem48 {
  public static void main(String[] args) {
    int inNum;
    char inChar;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an ASCII code: ");
    inNum = input.nextInt();
    inChar = (char)inNum;

    System.out.println("The character for ASCII code " +
      inNum + " is " + inChar);
  } //receives an ASCII code and displays its character
}