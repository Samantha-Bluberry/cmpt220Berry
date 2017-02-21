/**
 * file: Problem513.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 3
 * due date: February 21, 2017
 * version 1.0
 * 
 * This file prints out the biggest n such that n cubed < 12000
 */
public class Problem513 {
  public static void main(String[] args) {
    int num = 0;
    int nTriple = 0;
    while (nTriple < 12000) {
      nTriple = (int)Math.pow(num, 3);
      num++;
    }
    System.out.println("The biggest n such that n cubed < 12000 is " + (num - 2));
  } //prints out the biggest n such that n cubed < 12000
}
