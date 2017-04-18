/**
 * file: Problem91.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: Lab 6
 * due date: April 18, 2017
 * version 1.0
 * 
 * This file implements and tests the Rectangle class
 */
public class Problem91 {
  public static void main(String[] args) {
    Rectangle rect1 = new Rectangle(4,40);
    Rectangle rect2 = new Rectangle(3.5, 35.9);

    System.out.println("The width of rectangle one is " + rect1.width);
    System.out.println("The height of rectangle one is " + rect1.height);
    System.out.println("The area of rectangle one is " + rect1.getArea());
    System.out.println("The perimeter of rectangle one is " + rect1.getPerimeter());

    System.out.println("");

    System.out.println("The width of rectangle two is " + rect2.width);
    System.out.println("The height of rectangle two is " + rect2.height);
    System.out.println("The area of rectangle two is " + rect2.getArea());
    System.out.println("The perimeter of rectangle two is " + rect2.getPerimeter());
  } //tests Rectagle class
}
/**
 * Rectangle
 * 
 * This class implements a rectangle with a set width and height
 * and allows for information about the rectangle to be obtained
 */
class Rectangle {
  double width = 1;
  double height = 1;

  /**
   * Rectangle
   *
   * This function is the zero parameter constructor for the Rectangle class
   */
  Rectangle() {
  }

  /**
   * Rectangle
   *
   * This function is the two parameter constructor for the Rectangle class
   *
   * Parameters:
   *   newWidth: The width of the constructed Rectangle
   *   newHeight: The height of the constructed Rectangle
   */
  Rectangle(double newWidth, double newHeight) {
    width = newWidth;
    height = newHeight;
  }

  /**
   * getArea
   *
   * This function returns the area of a instance of the Rectangle class
   * The area is defined as width * height
   *
   * Return value: the area of the Rectangle
   */
  double getArea() {
    double area = width * height;
    return area;
  }

  /**
   * getPerimeter
   *
   * This function returns the perimeter of a instance of the Rectangle class
   * The perimeter is defined as (2 * width) + (2 * height)
   *
   * Return value: the perimeter of the Rectangle
   */
  double getPerimeter() {
    double perimeter = (2 * width) + (2 * height);
    return perimeter;
  }

  /**
   * setWidth
   *
   * This function changes the width of a instance of the Rectangle class
   *
   * Parameters:
   *   newWidth: the number that the width will be changed into
   *
   * Return value: the new width of the Rectangle
   */
  double setWidth(double newWidth) {
    width = newWidth;
    return width;
  }
 
  /**
   * setHeight
   *
   * This function changes the height of a instance of the Rectangle class
   *
   * Parameters:
   *   newHeight: the number that the height will be changed into
   *
   * Return value: the new height of the Rectangle
   */
  double setHeight(double newHeight) {
    height = newHeight;
    return height;
  }
}