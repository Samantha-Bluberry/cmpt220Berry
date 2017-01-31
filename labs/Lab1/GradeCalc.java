import java.util.Scanner;
/**
 * file: GradeCalc.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 1
 * due date: January 31, 2017
 * version 1.0
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

    System.out.print("Your final grade is: " + total + "%");
  } //inputs a students grades and outputs their final grade as a percentage
}
