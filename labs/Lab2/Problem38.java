import java.util.Scanner;
/**
 * file: Driver_prj0.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version 1.0
 * 
 * This file displays three inputed ints in non-decreasing order
 */
public class Problem38 {
  public static void main(String[] args) {
    int num1, num2, num3;
    Scanner input = new Scanner(System.in);

    System.out.print("Input your first integer: ");
    num1 = input.nextInt();
    System.out.print("Input your second integer: ");
    num2 = input.nextInt();
    System.out.print("Input your third integer: ");
    num3 = input.nextInt();

    if (num1 >= num2 && num1 >= num3) {
      System.out.print(num1 + " ");
      if (num2 >= num3) {
        System.out.print(num2 + " " + num3);
      }
      else {
        System.out.print(num3 + " " + num2);
      }
    }
    else if (num2 >= num1 && num2 >= num3) {
      System.out.print(num2 + " ");
      if (num1 >= num3) {
        System.out.print(num1 + " " + num3);
      }
      else {
        System.out.print(num3 + " " + num1);
      }
    }
    else {
      System.out.print(num3 + " ");
      if (num1 >= num2) {
        System.out.print(num1 + " " + num2);
      }
      else {
        System.out.print(num2 + " " + num1);
      }
    }
  } //displays three inputed ints in non-decreasing order
}