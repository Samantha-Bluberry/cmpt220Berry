import java.util.Scanner;
/**
 * file: Problem62.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 3
 * due date: February 21, 2017
 * version 1.0
 * 
 * This file calculates the sum of the digits in a given input
 */
public class Problem62 {
  public static void main(String[] args) {
    long num;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer ");
    num = input.nextLong();
    System.out.println("The sum the the digits is " + (sumDigits(num)));
  } //asks for the input and prints the sum
  /**
   * sumDigits
   *
   * This function computes the sum of the digits of the given input.
   *
   * Parameters:
   *   n: the number for which to compute the sum
   *
   * Return value: the sum of the digits of n
   */
  public static int sumDigits(long n) {
    long digit;
    long sum = 0;

    while (n != 0) {
      digit = n % 10;
      sum += digit;
      n = n / 10;
    }
 
    return (int)sum;
  }//computes the sum of the digits of the given input
}
