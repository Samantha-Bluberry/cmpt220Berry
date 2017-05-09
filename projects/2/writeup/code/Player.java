/**
 * file: Player.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: project 2
 * due date: May 8, 2017
 * version 1.0
 *
 * This file contains the code for the Player class
 * A player has a list of InvItems that it manipulates and
 * interacts with Items in the environment with
 */
public class Player
{
  private static InvItem[] listIP = {
   new InvItem("torch", "A torch", new String[]{"light", "give"}, 
     new String[]{"scone", "dragon"}, new boolean[]{false, false}),
   new InvItem("bar", "A long, iron bar", new String[]{"use", "give"}, 
     new String[]{"keys", "dragon"}, new boolean[]{false}),
   new InvItem("keys", "A ring of keys", new String[]{"use", "give"}, 
     new String[]{"door", "dragon"}, new boolean[]{false}),
   new InvItem("bucket", "An empty bucket", new String[]{"fill", "give", "empty"}, 
     new String[]{"water", "dragon", "bowl"}, new boolean[]{false, false})
  };

  /**
   * Player
   *
   * This method is the constructor for objects of the Player class
   */
  public Player()
  {
  }

  /**
   * getInvetory
   *
   * This method returns the contents of the players invetory
   * 
   * ReturnL: A string containing all the items in the players invetory
   */
  public static String getInvetoryPrint() {
    String inv = "You have: ";
    if (listIP[0].getState(0) == true)
      inv = inv + "a torch ";
    if (listIP[1].getState(0) == true)
      inv = inv + "an iron bar ";
    if (listIP[2].getState(0) == true)
      inv = inv + "keys ";
    if (listIP[3].getState(0) == true)
      inv = inv + "a bucket ";
    return inv;
  }
 
  /**
   * getItem
   *
   * This method returns the InvItem value with a name String
   * that matches the parameter String
   * If no InvItem matches it returns null
   *
   * Parameters:
   *   name: the name of the Invtem to find
   *
   * Return: The InvItem value with the same name as the parameter
   */
  static InvItem getItem(String name) {
    for(int i = 0; i < listIP.length; i++){
      if(name.equals(listIP[i].getName()))
        return listIP[i];
    }
    return null;
  }
}
