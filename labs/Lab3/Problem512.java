/**
 * file: Problem512.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 3
 * due date: February 21, 2017
 * version 1.0
 * 
 * This file prints out the smallest n such that n squared > 12000
 */
public class Problem512 {
  public static void main(String[] args) {
    int num = 0;
    int nDouble = 0;
    while (nDouble <= 12000) {
      num++;
      nDouble = (int)Math.pow(num, 2);
    }
    System.out.println("The smallest n such that n squared > 12000 is " + num);
  } //prints out the smallest n such that n squared > 12000
}
