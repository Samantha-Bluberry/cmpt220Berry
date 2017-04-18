import java.math.*;
/**
 * file: Problem1017.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: Lab 7
 * due date: April 18, 2017
 * version 1.0
 * 
 * This file finds the first 10 squares larger than Long.MAX_VALUE
 */
public class Problem1017 {
  public static void main(String[] args) {
    String LongSquare = Long.toString((long)Math.sqrt(Long.MAX_VALUE));

    BigInteger startPoint = new BigInteger(LongSquare);
    BigInteger one = new BigInteger("1");
    startPoint = startPoint.add(one);

    System.out.println("10 squares larger than " + Long.MAX_VALUE + " are:");
    System.out.println("");

    for (int i = 0; i < 10; i++) {
      BigInteger Square = startPoint.multiply(startPoint);

      System.out.println(startPoint + " squared: " + Square);

      startPoint = startPoint.add(one);
    }

  }
}