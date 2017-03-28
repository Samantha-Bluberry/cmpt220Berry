import java.util.Scanner;
/**
 * file: Problem813.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 5
 * due date: JMarch 28, 2017
 * version 1.0
 * 
 * This file finds the largest number in a two dimensional array
 */
public class Problem813 {
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

    int[] largest = locateLargest(list);
    System.out.print("The location of the largest element is at ("
                      + largest[0] + ", " + largest[1] + ")");
  } //prints out "Hello World!"
  /**
   * locateLargest
   * 
   * This function finds and returns the largest number in 
   * a two dimensional array
   *
   * Parameters:
   * a[][]: a two dimensional array of double values
   * 
   * Return Value: the location of the largest value in format (column, row)
   */
  public static int[] locateLargest(double[][] a) {
    int[] index = {0, 0};

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        if (a[index[0]][index[1]] < a[i][j]) {
          index[0] = i;
          index[1] = j;
        }
      }
    }

    return index;
  }
}
