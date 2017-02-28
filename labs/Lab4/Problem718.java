import java.util.Scanner;
/**
 * file: Driver_prj0.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 4
 * due date: February 28, 2017
 * version 1.0
 * 
 * This file sorts an entered array using bubble sort
 */
public class Problem718 {
  public static void main(String[] args) {
    double[] arr = new double[10];
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 doubles:");
    
    for(int i = 0; i < arr.length; i++) {
      arr[i] = input.nextDouble();
    }
    System.out.println(arr.length);

    double[] sorted = bubbleSort(arr);
    System.out.println("This array in ascending order is:");
    for(int i = 0; i < arr.length; i++) {
      System.out.print(sorted[i] + " ");
    }
  } //main Method
  /**
   * bubbleSort
   *
   * This function orders an array using the bubble sort method
   *
   * Parameters:
   *   array[]: an array of doubles to be sorted
   *
   * Return value: the value of parameter array in ascending order
   */
  public static double[] bubbleSort(double[] array) {
    double swap;

    for(int i = 0; i < array.length - 1; i++) {
      for(int j = 0; j < (array.length - i - 1); j++) {
        if(array[j] > array[j + 1]) {
          swap = array[j];
          array[j] =array[j + 1];
          array[j + 1] = swap;
        }
      }
    }
 
    return array;
  }
}
