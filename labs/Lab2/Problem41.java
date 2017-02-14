import java.util.Scanner;
/**
 * file: Driver_prj0.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version 1.0
 * 
 * This file calculates the area of a pentagon
 */
public class Problem41 {
  public static void main(String[] args) {
    double pentLength, pentSide, pentArea;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the length from the center to a vertex: ");
    pentLength = input.nextDouble();

    pentSide = 2 * pentLength * Math.sin(Math.PI / 5.0);
    pentArea = (5 * pentSide * pentSide) / (4 * Math.tan(Math.PI / 5.0));

    System.out.println("The area of the pentagon is: " + pentArea);
  } //calculates the area of a pentagon
}