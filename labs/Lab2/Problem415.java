import java.util.Scanner;
/**
 * file: Problem415.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 14, 2017
 * version 1.0
 * 
 * This file displays the number that corresponds to an entered letter
 */
public class Problem415 {
  public static void main(String[] args) {
    char entered;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a letter: ");
    entered = Character.toLowerCase(input.nextLine().charAt(0));

    if (entered >= 'a' && entered <= 'c')
      System.out.println("The corresponding number is 2");
    else if (entered >= 'd'  && entered <= 'f')
      System.out.println("The corresponding number is 3");
    else if (entered >= 'g' && entered <= 'i')
      System.out.println("The corresponding number is 4");
    else if (entered >= 'j' && entered <= 'l')
      System.out.println("The corresponding number is 5");
    else if (entered >= 'm' && entered <= 'o')
      System.out.println("The corresponding number is 6");
    else if (entered >= 'p' && entered <= 's')
      System.out.println("The corresponding number is 7");
    else if (entered >= 't' && entered <= 'v')
      System.out.println("The corresponding number is 8");
    else if (entered >= 'w' && entered <= 'z')
      System.out.println("The corresponding number is 9");
    else 
      System.out.print(entered + " is an invalid input");
  } //displays the number that corresponds to an entered letter
}