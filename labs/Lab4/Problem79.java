import java.util.Scanner;
/**
 * file: Driver_prj0.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 4
 * due date: February 28, 2017
 * version 1.0
 * 
 * This file prints out the smallest number entered
 */
public class Problem79 {
  public static void main(String[] args) {
    double[] arr = new double[10];
    Scanner input = new Scanner(System.in);
    
    for(int i = 0; i < arr.length; i++) {
      System.out.print("Enter a double: ");
      arr[i] = input.nextDouble();
    }
    System.out.println("The minimun number is: " + min(arr));
  } //prints out the smallest number entered
  /**
   * min
   *
   * This function finds the minimum value in an array
   *
   * Parameters:
   *   array[]: an array of doubles for which to find the smallest value in
   *
   * Return value: the value of the smallest number in array
   */
  public static double min(double[] array) {
    int minI = 0;
    for(int i = 0; i < array.length; i++) {
      if (array[minI] > array[i]) {
        minI = i;
      }
    }
    return array[minI];
  }
}
