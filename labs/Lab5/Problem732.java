import java.util.Scanner;
/**
 * file: Problem732.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 5
 * due date: March 28, 2017
 * version 1.0
 * 
 * This file partitions an array and prints the result
 */
public class Problem732 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int length1;
    int length2;
    
    System.out.print("Enter the number of ints in the array: ");
    length1 = input.nextInt();
    int[] a1 = new int[length1];
    
    for (int i = 0; i < a1.length; i++) {
      System.out.print("Enter the number at index " + i + ": ");
      a1[i] = input.nextInt();
    }

    System.out.println("");
    System.out.println("The pivot is now at index : " + partition(a1));
  } 
  /**
   * partition
   *
   * This function partitions an array, with all elements the elements before the pivot
   * smaller than the pivot and all elements greater or equal to the pivot after the pivot
   * This fuction uses the first element as the pivot
   *
   * Parameters:
   *   list[]: an ordered list of int, the first number is the pivot for the array
   *
   * Return Value: the position of the pivot in the partitioned array
   */
  public static int partition(int[] list) {
    int part = list[0];
    int topI = list.length -1;
    int bottomI = 0;

    while (true) {
      while (list[bottomI] < part)
        bottomI++;
      while (list[topI] > part)
        topI--;
      if (bottomI >= topI){
        for (int i = 0; i < list.length; i++) {
          System.out.print(list[i] + " ");
        }
        return topI + 1;
      }
      
      int temp = list[bottomI];
      list[bottomI] = list[topI];
      list[topI] = temp;
    }

  }
}
