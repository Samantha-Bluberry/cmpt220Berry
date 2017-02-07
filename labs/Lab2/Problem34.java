/**
 * file: Driver_prj0.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: project 0
 * due date: February 7, 2017
 * version 1.0
 * 
 * This file generates a number between 1 and 12 and prints out a corresponding date
 */
public class Problem34 {
  public static void main(String[] args) {
    int month = (int)(Math.random() * 12 + 1);
    if (month == 1)
      System.out.println("January");
    if (month == 2)
      System.out.println("February");
    if (month == 3)
      System.out.println("March");
    if (month == 4)
      System.out.println("April");
    if (month == 5)
      System.out.println("May");
    if (month == 6)
      System.out.println("June");
    if (month == 7)
      System.out.println("July");
    if (month == 8)
      System.out.println("August");
    if (month == 9)
      System.out.println("September");
    if (month == 10)
      System.out.println("October");
    if (month == 11)
      System.out.println("November");
    if (month == 12)
      System.out.println("December");
  } //generates a number between 1 and 12 and prints out a corresponding date
}