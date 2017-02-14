/**
 * file: Problem425.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 14, 2017
 * version 1.0
 * 
 * This file creates a random plate number
 */
public class Problem425 {
  public static void main(String[] args) {
    char letter1 = (char)(int)(Math.random() * (26) + 65);
    char letter2 = (char)(int)(Math.random() * (26) + 65);
    char letter3 = (char)(int)(Math.random() * (26) + 65);
    char digit1 = (char)(int)(Math.random() * (10) + 48);
    char digit2 = (char)(int)(Math.random() * (10) + 48);
    char digit3 = (char)(int)(Math.random() * (10) + 48);
    char digit4 = (char)(int)(Math.random() * (10) + 48);
  
    System.out.println("" + letter1 + letter2 + letter3 +
      digit1 + digit2 + digit3 + digit4);
  } //creates a random plate number
}