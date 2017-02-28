/**
 * file: Problem68.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 4
 * due date: February 28, 2017
 * version 1.0
 * 
 * This file prints a table of celcius and fahrenheit conversions
 */
public class Problem68 {
  public static void main(String[] args) {
    double celCount = 40.0;
    double fahCount = 120.0;
    double celCalc, fahCalc;

    System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\tCelsius");
    System.out.println("------------------------------------------------------------------");

    for(int i = 1; i <= 10; i++) {
      fahCalc = celsiusToFahrenheit(celCount);
      celCalc = fahrenheitToCelsius(fahCount);

      System.out.printf("%4.1f\t\t%4.1f\t\t|\t%4.1f\t\t%4.2f\n", 
                         celCount, fahCalc, fahCount, celCalc);
      celCount--;
      fahCount -= 10;
    }
  } //prints out a table of celcius and fahrenheit conversions
  /**
   * celsiusToFahrenheit
   *
   * This function converts a celsius temp to fahrenheit
   *
   * Parameters:
   *   celcius: the number that represents a temperature in celcius
   *
   * Return value: the value of parameter celcius in fahrenheit
   */
  public static double celsiusToFahrenheit(double celsius) {
    return ((9.0 / 5) * celsius + 32);
  }
  /**
   * fahrenheitToCelsius
   *
   * This function converts a fahrenheit temp to celsius
   *
   * Parameters:
   *   fahrenheit: the number that represents a temperature in fahrenheit
   *
   * Return value: the value of parameter fahrenheit in celsius
   */
  public static double fahrenheitToCelsius(double fahrenheit) {
    return ((5.0 / 9) * (fahrenheit - 32));
  }
}
