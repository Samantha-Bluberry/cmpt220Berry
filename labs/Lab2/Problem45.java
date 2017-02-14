import java.util.Scanner;
/**
 * file: Driver_prj0.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version 1.0
 * 
 * This file calculates the area of a polygon
 */
public class Problem45 {
  public static void main(String[] args) {
    int sideNum;
    double sideLength, polyArea;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of sides: ");
    sideNum = input.nextInt();
    System.out.print("Enter the length of the sides: ");
    sideLength = input.nextDouble();

    polyArea = (sideNum * sideLength * sideLength) / (4 * Math.tan(Math.PI / 5.0));

    System.out.println("The area of the polygon is: " + polyArea);
  } //calculates the area of a polygon
}