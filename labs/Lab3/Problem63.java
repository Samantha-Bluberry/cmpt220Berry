import java.util.Scanner;
/**
 * file: Problem63.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: project 0
 * due date: February 21, 2017
 * version 1.0
 * 
 * This file reverses a given int and evaluates whether it is a palindrome
 */
public class Problem63 {
  public static void main(String[] args) {
    int num;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer ");
    num = input.nextInt();
    System.out.println("The reverse of the number is " + (reverse(num)));

    if (isPalindrome(num))
      System.out.println("The number is a palindrome");
    else
      System.out.println("The number is not a palindrome");
  } //asks for the input and prints the reverse and if it is a palindrome
  /**
   * reverse
   *
   * This function returns the reversal of an interger, 
   * i.e., reverse(456) returns 654
   *
   * Parameters:
   *   number: the number for which to reverse
   *
   * Return value: the reversal of number
   */
  public static int reverse(int number) {
    int digit;
    int rev = 0;
    int i = 0;
    int countDig = number;
    
    while (countDig / 10 != 0) {
      countDig /= 10;
      i++;
    }
    while (number != 0) {
      digit = number % 10;
      rev += (int)(digit * Math.pow(10, i));
      number /= 10;
      i--;
    }

    return rev;
  }//returns the reversal of an integer
  /**
   * isPalindrome
   *
   * This function returns true if number is a palindrome
   *
   * Parameters:
   *   number: the number for which to evaluate if it is a palindrome
   *
   * Return value: the truth value for if number is a palindrome
   */
  public static boolean isPalindrome(int number) {
    return (number == reverse(number));
  }//returns true if number is a palindrome
}
