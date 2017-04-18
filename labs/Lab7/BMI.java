/**
 * file: BMI.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: Lab 7
 * due date: April 18, 2017
 * version 1.0
 * 
 * This file implements the BMI of a person with a set name, age,
 * weight and height and calculates information about their BMI
 */
public class BMI {
  private String name;
  private int age;
  private double weight; // in pounds
  private double height; // in inches
  public static final double KILOGRAMS_PER_POUND = 0.45359237;
  public static final double METERS_PER_INCH = 0.0254;

  /**
   * BMI
   *
   * This function is the four parameter constructor for the BMI class
   *
   * Parameters:
   *   name: the name value of the constructed BMI instance
   *   age: the age value of the constructed BMI instance
   *   weight: the weight value of the constructed BMI instance
   *   height: the height value of the constructed BMI instance
   */
  public BMI(String name, int age, double weight, double height) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.height = height;
  }

  /**
   * BMI
   *
   * This function is the three parameter constructor for the BMI class
   * This function sets the age parameter to 20
   *
   * Parameters:
   *   name: the name value of the constructed BMI instance
   *   weight: the weight value of the constructed BMI instance
   *   height: the height value of the constructed BMI instance
   */
  public BMI(String name, double weight, double height) {
    this(name, 20, weight, height);
  }

  /**
   * BMI
   *
   * This function is the five parameter constructor for the BMI class
   * This fuction calculates the height parameter using the feet and inches parameters
   *
   * Parameters:
   *   name: the name value of the constructed BMI instance
   *   age: the age value of the constructed BMI instance
   *   weight: the weight value of the constructed BMI instance
   *   feet: the height in feet of the constructed BMI instance
   *   inches: the height in inches of the constructed BMI instance
   */
  public BMI(String name, int age, double weight, double feet,
    double inches) {
    this(name, age, weight, (feet * 12 + inches));
  }

  /**
   * getBMI
   *
   * This function returns the BMI (body mass index) of an 
   * instance of the BMI class
   *
   * Return value: the BMI of the instance of the BMI class as a percent
   */
  public double getBMI() {
    double bmi = weight * KILOGRAMS_PER_POUND /
      ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
    return Math.round(bmi * 100) / 100;
  }

  /**
   * getStatus
   *
   * This function returns whether someone is underweight, 
   * normal weight, overweight,or obese based on their BMI
   *
   * Return value: the weight status of someone as a string
   */
  public String getStatus() {
    double bmi = getBMI();
    if (bmi < 18.5)
      return "Underweight";
    else if (bmi < 25)
      return "Normal";
    else if (bmi < 30)
      return "Overweight";
    else
      return "Obese";
  }

  /**
   * getName
   *
   * This function returns the name of an instance of the BMI class
   *
   * Return value: the name value of the BMI class
   */
  public String getName() {
    return name;
  }

  /**
   * getAge
   *
   * This function returns the age of an instance of the BMI class
   *
   * Return value: the age value of the BMI class
   */
  public int getAge() {
    return age;
  }

  /**
   * getWeight
   *
   * This function returns the weight of an instance of the BMI class
   *
   * Return value: the weight value of the BMI class
   */
  public double getWeight() {
    return weight;
  }

  /**
   * getHeight
   *
   * This function returns the height of an instance of the BMI class
   *
   * Return value: the height value of the BMI class
   */
  public double getHeight() {
    return height;
  }
}