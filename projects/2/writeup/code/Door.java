/**
 * file: Door.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: project 2
 * due date: May 8, 2017
 * version 1.0
 *
 * This class contains the code for the doors between Locations
 * Doors lead to a specific location, can be opened or closed,
 * and can be trapped (entering a trapped door results in death)
 */
public class Door
{
  int connectsTo; //index for where the door goes too
  String direction; //word used by text parser to find location
  boolean isOpen;
  boolean trapped;
  String trapText; // Text for when a trapped door is opened

  /**
   * Door
   *
   * This method is the zero parameter constructor for the Door class
   */
  public Door() {
  }

  /**
   * Door
   *
   * This method is the four parameter constructor for the door class
   *
   * Parameters:
   *   to: the connectsTo value for the constructed Door
   *   dir: the direction value for the constructed Door
   *   opened: the isOpen value for the constructed Door
   *   trap: the trapped value for the constructed Door
   */
  public Door(int to, String dir, boolean opened, boolean trap) {
    connectsTo = to;
    direction = dir;
    isOpen = opened;
    trapped = trap;
  }

  /**
   * Door
   *
   * This method is the five parameter constructor for the door class
   *
   * Parameters:
   *   to: the connectsTo value for the constructed Door
   *   dir: the direction value for the constructed Door
   *   opened: the isOpen value for the constructed Door
   *   trap: the trapped value for the constructed Door
   *   tText: the trapText value for the contructed Door
   */
  public Door(int to, String dir, boolean opened, boolean trap, String tText) {
    connectsTo = to;
    direction = dir;
    isOpen = opened;
    trapped = trap;
    trapText = tText;
  }

  /**
   * goThrough
   *
   * This method moves the location of the player to the index 
   * indicated in connectsTo
   * If the door is trapped the player does not move and dies
   * If the door is locked the player does not move
   */
  public void goThrough() {
    if(trapped == true){
      System.out.println(trapText);
      System.out.println("YOU DIE");
      FlagList.gameOff();
      //die
    }
    else if(isOpen == true) {
      FlagList.setLocation(connectsTo);
      System.out.println(FlagList.getLocation().getDesc());
    }
    else
      System.out.println("You can't go that way");
  }

  /**
   * getDir
   *
   * This method returns the direction value for an instance of Door
   * 
   * Return: the direction String of the Door instance
   */
  public String getDir() {
    return direction;
  }

  /**
   * open
   *
   * This method sets the isOpen value of an instance of Door to true
   * This allows the door to be opened
   */
  public void open() {
    isOpen = true;
  }

}

