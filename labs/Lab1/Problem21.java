import java.util.Scanner;
/**
 * file: Problem21.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 1
 * due date: January 31, 2017
 * version 1.0
 * 
 * This file converts an inputed celsius value to fahrenheit
 */
public class Problem21  {
  public static void main(String[] args)  {
    double celsiusTemp;
    double fahrenheitTemp;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a degree in Celsius: ");
    celsiusTemp = input.nextDouble();
    
    System.out.println(celsiusTemp + " Celsius is " + 
    ((9.0/5.0) * celsiusTemp + 32) + " Fahrenheit");
  } //converts an inputed celsius value to fahrenheit
}
