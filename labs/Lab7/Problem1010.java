/**
 * file: Problem1010.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: Lab 7
 * due date: April 18, 2017
 * version 1.0
 * 
 * This file implements and tests Queue.java
 */
public class Problem1010 {
  public static void main(String[] args) {
    Queue test = new Queue();

    for (int i = 1; i <= 20; i++) {
      test.enqueue(i);
    }

    for (int i = 1; i <= 20; i++) {
      int removedInt = test.dequeue();
      System.out.println(removedInt + " ");
    }
  } //tests Queue.java
}
