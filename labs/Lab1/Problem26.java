import java.util.Scanner;
/**
 * file: Problem26.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 1
 * due date: January 31, 2017
 * version 1.0
 * 
 * This file adds together the digits of an inputed int
 */
public class Problem26  {
  public static void main(String args[])  {
    int inputInt, ones, tens, hundreds;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number between 0 and 1000: ");
    inputInt = input.nextInt();

    ones = inputInt % 10;
    tens = (inputInt / 10) % 10;
    hundreds = inputInt / 100;

    System.out.print("The sum of the digits is " + 
    (ones + tens + hundreds));
  } //adds together the digits of an inputed int
}
