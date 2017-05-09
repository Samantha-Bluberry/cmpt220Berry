/**
 * file: FlagList.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: project 2
 * due date: May 8, 2017
 * version 1.0
 *
 * This class contains the code for important data in the game
 * This includes whether the game is on or off and an array of
 * all the Locations in the game
 */
public class FlagList
{
  private static boolean gameOn = true;
  private static int location = 0; //start in Cell1(listL[0])

  static Location[] listL = {
    new Cell1(),
    new Jail(),
    new Cell2(),
    new Hall(),
    new SecretRoom(),
    new MainRoom(),
    new DragonLair()};
 
  /**
   * FlagList
   *
   * This is the zero parameter constructor for the FlagList class
   */
  public FlagList(){
  }
  
  /**
   * getGameOn
   *
   * This method returns the value of the boolean gameOn
   * The game ends if gameOn = false
   *
   * Return: the value of the boolean gameOn
   */
  public static boolean getGameOn() {
    boolean booltest = gameOn;
    return booltest;
  }

  /**
   * gameOff
   * 
   * This method sets gameOn to false, turning off the game
   */
  public static void gameOff() {
    gameOn = false;
  }

  /**
   * getLocation
   *
   * This method returns the Location object for the players current location
   * 
   * ReturnL: The Location object that correlates to the current location
   */
  public static Location getLocation() {
    return listL[location]; 
  }
  
  /**
   * getLocation
   *
   * This method returns the Location object with the same index as the parameter
   * 
   * Parameters: 
   *   index: the index of the Location to be retrieved
   *
   * Return: the location at the input index
   */
  public static Location getLocation(int index) {
    return listL[index];
  }

  /**
   * setLocation
   *
   * This method changes the current location to loc
   *
   * Parameters:
   *  loc: the index for the new location
   */
  public static void setLocation(int loc) {
    location = loc;
  }
}
