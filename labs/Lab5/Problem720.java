import java.util.Scanner;
/**
 * file: Problem720.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 5
 * due date: March 28, 2017
 * version 1.0
 * 
 * This file selection sorts 10 numbers
 */
public class Problem720 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] a = new double[10];
    
    for (int i = 0; i < 10; i++) {
      System.out.print("Enter a number: ");
      a[i] = input.nextDouble();
    }
    
    selectionSort(a);
  }
  /**
   * selectionSort
   *
   * This function sorts an array using the selection sort method,
   * then prints it out
   * 
   * Parameters:
   *  list[]: an unordered list of double values
   *
   * Return Value: none
   */
  public static void selectionSort(double[] list) {
    for (int i = list.length - 1; i > 0; i--) {
      double currentMax = list[i];
      int currentMaxIndex = i;
      
      for (int j = i - 1; j >= 0; j--) {
        if (currentMax < list[j]) {
          currentMax = list[j];
          currentMaxIndex = j;
        }
      }
      
      if (currentMaxIndex != i) {
        list[currentMaxIndex] = list[i];
        list[i] = currentMax;
      }
    }
    
    for (int i = 0; i < list.length; i++) { 
      System.out.print(list[i] + " ");
    }
  }
}
