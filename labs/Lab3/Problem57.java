/**
 * file: Problem57.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 3
 * due date: February 21, 2017
 * version 1.0
 * 
 * This file prints out the conversion table between kilograms and pounds
 */
public class Problem57 {
  public static void main(String[] args) {
    System.out.println("Kilograms\tPounds");
    
    for(int i = 1; i < 200; i += 2) {
      System.out.printf("%d\t\t%6.1f\n", i, (i * 2.2));
    }
    //printf pls
  } //prints out the conversion table between kilograms and pounds
}
