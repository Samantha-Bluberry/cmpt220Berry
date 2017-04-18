import java.util.Scanner;
/**
 * file: Problem913.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: Lab 6
 * due date: April 18, 2017
 * version 1.0
 * 
 * This file finds the largest double in an input two-demensional array
 * then returns that value as a location object
 */
public class Problem913 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number of row and columns of the array ");
    int row = input.nextInt();
    int column = input.nextInt();
    double[][] list = new double[row][column];

    for (int i = 0; i < list.length; i++) {
      for (int j = 0; j < list[0].length; j++) {
        System.out.print("Enter number " + j + " in row " + i + ": ");
        list[i][j] = input.nextDouble();
      }
    }

    Location testing = locateLargest(list);
   
    System.out.println("The Location of the largest element is " + testing.maxValue 
      + " at (" + testing.row + ", " + testing.column + ")");
  } //inputs and array and calls locateLargest
  /**
   * locateLargest
   * 
   * This function finds the largest number in a two-dimensional array
   *
   * Parameters:
   *   a[][]: the array used to find the largest number
   *
   * Return value: a Location object where row and column indicate
   * the location of the largest number and maxValue indicates the largest number
   */
  public static Location locateLargest(double[][] a) {
    Location aLocate = new Location();
    aLocate.maxValue = a[0][0];

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        if (aLocate.maxValue < a[i][j]) {
          aLocate.maxValue = a[i][j];
          aLocate.row = i;
          aLocate.column = j;
        }
      }
    }

    return aLocate;
  }
}
/**
 * Location
 * 
 * This class implements the location of a value and the specified value
 */
class Location {
  public int row = 0;
  public int column = 0;
  public double maxValue = 0;

  /**
   * Location
   *
   * This function is the zero parameter constructor for the Location class
   */
  Location() {
  }

  /**
   * Location
   *
   * This function is the three parameter constructor for the Location class
   * 
   * Parameters:
   *   newRow: the row value for the constructed Location instance
   *   newColumn: the column value for the constructed Location instance
   *   newMaxValue: the maxValue value for the constructed Location instance
   */
  Location(int newRow, int newColumn, double newMaxValue) {
    row = newRow;
    column = newColumn;
    maxValue = newMaxValue;
  }
}