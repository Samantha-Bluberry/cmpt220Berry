import java.util.Scanner;
/**
 * file: GradeCalc.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 2
 * due date: January 31, 2017
 * version 2.0
 * 
 * This file calculates a students final grade for CMPT 220
 */
public class GradeCalc  {
  public static void main(String args[])  {
    int midtermGrade, finalGrade, projectGrade, homeworkGrade, total;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter the following as percentage...");
    System.out.print("midterm exam: ");
    midtermGrade = input.nextInt();
    System.out.print("final exam: ");
    finalGrade = input.nextInt();
    System.out.print("projects: ");
    projectGrade = input.nextInt();
    System.out.print("homework and labs: ");
    homeworkGrade = input.nextInt();

    total = ((homeworkGrade * 2) + projectGrade + midtermGrade + finalGrade) / 5;
    
    if (total <= 100 && total >= 95)
      System.out.print("Your final grade is: A");
    else if (total < 95 && total >= 90)
      System.out.print("Your final grade is: A-");
    else if (total < 90 && total >= 87)
      System.out.print("Your final grade is: B+");
    else if (total < 87 && total >= 83)
      System.out.print("Your final grade is: B");
    else if (total < 83 && total >= 80)
      System.out.print("Your final grade is: B-");
    else if (total < 80 && total >= 77)
      System.out.print("Your final grade is: C+");
    else if (total < 77 && total >= 73)
      System.out.print("Your final grade is: C");
    else if (total < 73 && total >= 70)
      System.out.print("Your final grade is: C-");
    else if (total < 70 && total >= 65)
      System.out.print("Your final grade is: D+");
    else if (total < 65 && total >= 60)
      System.out.print("Your final grade is: D");
    else
      System.out.print("Your final grade is: F");
  } //inputs a students grades and outputs their final grade as a percentage
}
