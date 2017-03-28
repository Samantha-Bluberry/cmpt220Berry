import java.util.Scanner;
/**
 * file: Driver_prj1.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: project 1
 * due date: March 28, 2017
 * version 1.0
 * 
 * This file convolutes two arrays and prints the result
 */
public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int length1;
    int length2;
    
    System.out.print("Enter the number of ints in array 1: ");
    length1 = input.nextInt();
    System.out.print("Enter the number of ints in array 2: ");
    length2 = input.nextInt();

    System.out.println("");

    int[] a1 = new int[length1];
    for (int i = 0; i < a1.length; i++) {
      System.out.print("Enter integer " + (i+1) + " for array 1: ");
      a1[i] = input.nextInt();
    }
    
    int[] a2 = new int[length2];
    for (int i = 0; i < a2.length; i++) {
      System.out.print("Enter integer " + (i+1) + " for array 2: ");
      a2[i] = input.nextInt();
    }

    int[] convoluted = convolveVectors(a1, a2);

    System.out.println("The convoluted list is:");
    for (int i = 0; i < convoluted.length; i++) {
      System.out.print(convoluted[i] + " ");
    }
  }
  /**
   * convolveVectors
   *
   * This function convolutes two arrays
   *
   * Parameters:
   *   vFirst: the first array of ints, represents a vector
   *   vSecond: the second array of ints, represents a vector
   *
   * Return Value: the convolution of vFirst and vSecond
   */
  public static int[] convolveVectors(int vFirst[], int vSecond[]) {
    int[] cResult = new int[(vFirst.length + vSecond.length - 1)];
    
    for (int i = 0; i < cResult.length; i++) {
      cResult[i] = 0;
      int firstMove = i;
      for(int j = 0; j < vSecond.length; j++) {
        if(firstMove < 0 || firstMove > vFirst.length - 1) {
          cResult[i] += 0;
        }
        else {
          cResult[i] += vFirst[firstMove] * vSecond[j];
        }
        firstMove--;
      }
    }
  
    for (int i = 0; i < cResult.length; i++) {
      System.out.print(cResult[i] + " ");
    }
  
    return cResult;
  }// convolutes two int[]
}
