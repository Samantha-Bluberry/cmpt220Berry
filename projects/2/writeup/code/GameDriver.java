import java.util.Scanner;
/**
 * file: GameDriver.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: project 2
 * due date: May 8, 2017
 * version 1.0
 *
 * This file contains the main method for the game
 * run the main class to play
 */
public class GameDriver{
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("You wake up in a prision cell,\n" +
                        "beside you is a note that simply says\n" + 
                        "'Get out, if you can.'");
    while (FlagList.getGameOn() == true) {
      System.out.println("");
      System.out.print(">> ");
      String in = input.nextLine();
      System.out.println("");
      TextParse text = new TextParse(in);
      text.seperate(in);
    }
  }
}
