import java.util.Scanner;
/**
 * file: Driver_prj0.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 4
 * due date: February 28, 2017
 * version 1.0
 * 
 * This file counts the number of letter in an input string
 */
public class Problem620 {
  public static void main(String[] args) {
    String entStr;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a String: ");
    entStr = input.nextLine();

    System.out.println("There are " + countLetters(entStr) + " letters in the string.");
  } //counts the number of letter in an input string and prints it
  /**
   * countLetters
   *
   * This function counts the number of letters in a String
   *
   * Parameters:
   *   s: the String for which to count the number of letters
   *
   * Return value: the number of letters in s
   */
  public static int countLetters(String s) {
    int count = 0;
    char countChar;
    for (int i = 0; i < s.length(); i++) {
      countChar = s.charAt(i);
      if (countChar >= 'A' && countChar <= 'z')
        count++;
    }
    return count;
  }
}
