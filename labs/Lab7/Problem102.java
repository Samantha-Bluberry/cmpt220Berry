/**
 * file: Problem102.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: Lab 7
 * due date: April 18, 2017
 * version 1.0
 * 
 * This file implements and tests BMI.java
 */
public class Problem102 {
  public static void main(String[] args) {
    BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
    System.out.println("The BMI for " + bmi1.getName() + " is "
      + bmi1.getBMI() + " " + bmi1.getStatus());

    BMI bmi2 = new BMI("Susan King", 215, 70);
    System.out.println("The BMI for " + bmi2.getName() + " is "
      + bmi2.getBMI() + " " + bmi2.getStatus());

    BMI bmi3 = new BMI("Oscar Smith", 25, 165, 5, 10);
    System.out.println(bmi3.getName() + " is " + bmi3.getHeight()
      + " inches tall");
    System.out.println("The BMI for " + bmi3.getName() + " is "
      + bmi3.getBMI() + " " + bmi3.getStatus());
  } //tests BMI.java
}