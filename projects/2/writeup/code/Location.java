/**
 * file: Location.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: project 2
 * due date: May 8, 2017
 * version 1.0
 *
 * This file contains the code for the Location class and all
 * it's subclasses
 * The location objects are used to hold informatin about rooms in the game
 * They all have a description, an array of the Items inside them, and
 * An array of the doors in them
 * Some Locations have an alternate description, which is used if certain 
 * conditions are met
 */
public class Location {
  private String description;
  private Item[] listI;
  private Door[] doorList;

  /**
   * Location
   *
   * This method is the constructor for objects of the Location class
   */
  public Location(){
  }

  /**
   * getDesc
   *
   * This method returns the description of the Location
   * 
   * Return: The description string for the specific Location object
   */
  public String getDesc() {
    return description;
  }

  /**
   * getItem
   *
   * This method returns the Item value with a name String
   * that matches the parameter String
   * If no Item matches it returns null
   *
   * Parameters:
   *   name: the name of the item to find
   *
   * Return: The Item value with the same name as the parameter
   */
  Item getItem(String name) {
    for(int i = 0; i < listI.length; i++){
      if(name.equals(listI[i].getName()))
        return listI[i];
    }
    return null;
  }

  /**
   * getDirections
   *
   * This method finds the Door object at is located in the 
   * direction of the parameter
   * if there is no door in that direction this method returns null
   *
   * Parameters:
   *   dir: the direction of the Door object to be found
   * 
   * Return: the Door object in the direction dir
   */
  Door getDirections(String dir) {
    for(int i = 0; i < doorList.length; i++){
      if(dir.equals(doorList[i].getDir()))
        return doorList[i];
    }
    return null;
  } 

  /**
   * getDoor
   *
   * This method returns the door in the doorlist array 
   * with the index that is the same as the parameter
   *
   * Parameters:
   *   index: the index of the Door object in doorList[]
   *
   * Return: the door object at the index parameter
   */
  Door getDoor(int index) {
    return doorList[index];
  }
}

/**
 * Cell1
 *
 * This is the class for the first cell Location in the game
 * This location has index 0
 */
class Cell1 extends Location {
  private String description = "You're in a small cell, to the west is an iron door. \n" +
    "There's almost nothing in the cell, other than a \n" +
    "lit scone on the wall. Outside you can see keys \n" +
    "hanging up below a scone.";
  private String altDesc = "You're in a small cell, to the west is an iron door. \n" +
    "There's almost nothing in the cell, other than a \n" +
    "lit scone on the wall.";
  private Item[] listI = {
    new Item("scone", "A lit scone, nothing unusual", new String[]{"light"},
    new boolean[]{true, false} ),

    new Item("door", "A door made of iron bars, one of the bars looks loose",
    new String[]{"open"}, new boolean[]{true, false}),

    new Item("bar", "A loose bar, a good pull could pull it out", 
    new String[]{"pull"}, new boolean[]{true, true}),

    new Item("keys", "A string with keys on it", 
      new String[]{"take"}, new boolean[]{true, false})
  };

  private Door[] doorList = {
    new Door(1, "west", false, false)};
  /**
   * Cell1
   *
   * This method is the constructor for objects of the Cell1 class
   */
  public Cell1() {
  }

  /**
   * getDesc
   *
   * This method returns the description of Cell1
   * 
   * Return: The description string for the Cell1 object
   */
  public String getDesc() {
    if (listI[3].getState(0) == false)
      return altDesc;
    else
      return description;
  }

  /**
   * getItem
   *
   * This method returns the Item value with a name String
   * that matches the parameter String
   * If no Item matches it returns null
   *
   * Parameters:
   *   name: the name of the item to find
   *
   * Return: The Item value with the same name as the parameter
   */
  Item getItem(String name) {
    for(int i = 0; i < listI.length; i++){
      if(name.equals(listI[i].getName()))
        return listI[i];
    }
    return null;
  }

  /**
   * getDirections
   *
   * This method finds the Door object at is located in the 
   * direction of the parameter
   * if there is no door in that direction this method returns null
   *
   * Parameters:
   *   dir: the direction of the Door object to be found
   * 
   * Return: the Door object in the direction dir
   */
  Door getDirections(String dir) {
    for(int i = 0; i < doorList.length; i++){
      if(dir.equals(doorList[i].getDir()))
        return doorList[i];
    }
    return null;
  }

  /**
   * getDoor
   *
   * This method returns the door in the doorlist array 
   * with the index that is the same as the parameter
   *
   * Parameters:
   *   index: the index of the Door object in doorList[]
   *
   * Return: the door object at the index parameter
   */
  Door getDoor(int index) {
    return doorList[index];
  }
}

/**
 * Jail
 *
 * This is the class for the jail Location in the game
 * This location has index 1
 */
class Jail extends Location {
  private String description = "You're in a small jail. There's only two cells, Along" + 
    " one wall \nis a poorly made table with a bucket under it. in the other direction" +
    " is an \nopening that leads into a corridor.";
  private String altDesc = "You're in a small jail. There's only two cells, Along" + 
    " one wall \nis a poorly made table. in the other direction" +
    " is ajn\nopening that leads into a corridor.";
  private Item[] listI = {

    new Item("door", "The door of the cell adjacent to yours, it looks, in better shape" +
      " than the other one", new String[]{"open"}, new boolean[]{true, true}),

    new Item("bucket", "A simple bucket, it doesn't look well \n" + 
                        "made but it should still hold liquids", 
      new String[]{"take"}, new boolean[]{true, true})};

  private Door[] doorList = {
    new Door(0, "east", true, false),
    new Door(2, "west", true, false),
    new Door(3, "north", true, false)};

  /**
   * Jail
   *
   * This method is the constructor for objects of the Jail class
   */
  public Jail() {
  }

  /**
   * getDesc
   *
   * This method returns the description of Jail
   * 
   * Return: The description string for the Jail object
   */
  public String getDesc() {
    if (listI[1].getState(0) == false)
      return altDesc;
    else
      return description;
  }

  /**
   * getItem
   *
   * This method returns the Item value with a name String
   * that matches the parameter String
   * If no Item matches it returns null
   *
   * Parameters:
   *   name: the name of the item to find
   *
   * Return: The Item value with the same name as the parameter
   */
  Item getItem(String name) {
    for(int i = 0; i < listI.length; i++){
      if(name.equals(listI[i].getName()))
        return listI[i];
    }
    return null;
  }

  /**
   * getDirections
   *
   * This method finds the Door object at is located in the 
   * direction of the parameter
   * if there is no door in that direction this method returns null
   *
   * Parameters:
   *   dir: the direction of the Door object to be found
   * 
   * Return: the Door object in the direction dir
   */
  Door getDirections(String dir) {
    for(int i = 0; i < doorList.length; i++){
      if(dir.equals(doorList[i].getDir()))
        return doorList[i];
    }
    return null;
  }

  /**
   * getDoor
   *
   * This method returns the door in the doorlist array 
   * with the index that is the same as the parameter
   *
   * Parameters:
   *   index: the index of the Door object in doorList[]
   *
   * Return: the door object at the index parameter
   */
  Door getDoor(int index) {
    return doorList[index];
  }
}

/**
 * Cell2
 *
 * This is the class for the second cell Location in the game
 * This location has index 2
 */
class Cell2 extends Location {
  private String description = "You're in the cell adjacent to yours. \n" + 
                                "There's an unlit torch on the wall";
  private String altDesc = "You're in the cell adjacent to yours. \n" + 
                                "There's an empty scone on the wall";
  private Item[] listI = {
    new Item("torch", "An unlit torch, you could probably take it", new String[]{"take"},
    new boolean[]{true, true} )
  };

  private Door[] doorList = {
    new Door(1, "east", true, false)};
  /**
   * Cell2
   *
   * This method is the constructor for objects of the Cell2 class
   */
  public Cell2() {
  }

  /**
   * getDesc
   *
   * This method returns the description of Cell2
   * 
   * Return: The description string for the Cell2 object
   */
  public String getDesc() {
    return description;
  }

  /**
   * getItem
   *
   * This method returns the Item value with a name String
   * that matches the parameter String
   * If no Item matches it returns null
   *
   * Parameters:
   *   name: the name of the item to find
   *
   * Return: The Item value with the same name as the parameter
   */
  Item getItem(String name) {
    for(int i = 0; i < listI.length; i++){
      if(name.equals(listI[i].getName()))
        return listI[i];
    }
    return null;
  }

  /**
   * getDirections
   *
   * This method finds the Door object at is located in the 
   * direction of the parameter
   * if there is no door in that direction this method returns null
   *
   * Parameters:
   *   dir: the direction of the Door object to be found
   * 
   * Return: the Door object in the direction dir
   */
  Door getDirections(String dir) {
    for(int i = 0; i < doorList.length; i++){
      if(dir.equals(doorList[i].getDir()))
        return doorList[i];
    }
    return null;
  }

  /**
   * getDoor
   *
   * This method returns the door in the doorlist array 
   * with the index that is the same as the parameter
   *
   * Parameters:
   *   index: the index of the Door object in doorList[]
   *
   * Return: the door object at the index parameter
   */
  Door getDoor(int index) {
    return doorList[index];
  }
}

/**
 * Hall
 *
 * This is the class for the hall Location in the game
 * This location has index 3
 */
class Hall extends Location {
  private String description = "A long, dark hallway, you can't see well enough to go\n" +
                                "forward.";
  private String altDesc = "Your torch illuminates the hallway, you see a passageway to\n" +
                           "the north. Along the wall is a single scone on the west side";
  private Item[] listI = {
    new Item("scone", "An unlit scone, the torch inside looks like its never been used", 
      new String[]{"pull"}, new boolean[]{true, false})
  };

  private Door[] doorList = {
    new Door(1, "south", true, false),
    new Door(4, "east", false, false),
    new Door(5, "north", false, false)};
  /**
   * Hall
   *
   * This method is the constructor for objects of the Hall class
   */
  public Hall() {
  }

  /**
   * getDesc
   *
   * This method returns the description of Hall
   * 
   * Return: The description string for the Hall object
   */
  public String getDesc() {
    if (listI[0].getState(1) == true)
      return altDesc;
    else
      return description;
  }

  /**
   * getItem
   *
   * This method returns the Item value with a name String
   * that matches the parameter String
   * If no Item matches it returns null
   *
   * Parameters:
   *   name: the name of the item to find
   *
   * Return: The Item value with the same name as the parameter
   */
  Item getItem(String name) {
    for(int i = 0; i < listI.length; i++){
      if(name.equals(listI[i].getName()))
        return listI[i];
    }
    return null;
  }

  /**
   * getDirections
   *
   * This method finds the Door object at is located in the 
   * direction of the parameter
   * if there is no door in that direction this method returns null
   *
   * Parameters:
   *   dir: the direction of the Door object to be found
   * 
   * Return: the Door object in the direction dir
   */
  Door getDirections(String dir) {
    for(int i = 0; i <= doorList.length; i++){
      if(dir.equals(doorList[i].getDir()))
        return doorList[i];
    }
    return null;
  }

  /**
   * getDoor
   *
   * This method returns the door in the doorlist array 
   * with the index that is the same as the parameter
   *
   * Parameters:
   *   index: the index of the Door object in doorList[]
   *
   * Return: the door object at the index parameter
   */
  Door getDoor(int index) {
    return doorList[index];
  }
}

/**
 * SecretRoom
 *
 * This is the class for the secret room Location in the game
 * This location has index 4
 */
class SecretRoom extends Location {
  private String description = "A small, hidden room, there's a shelf with some books on it\n" +
    "and a barrel of water on the floor.";
  private Item[] listI = {
    new Item("shelf", "A shelf with some books on it.", new String[]{}, new boolean[]{true}),
    new Item("books", "Some old books, look too big to carry. On the\n " +
      "spine of one of them you can read 'property of Dr. Rivas.'", 
      new String[]{}, new boolean[]{true}),
    new Item("barrel", "An open barrel full of water.", 
      new String[]{}, new boolean[]{true} ),
    new Item("water", "Stagnant water in a barrel.",
      new String[]{}, new boolean[]{true} )
  };

  private Door[] doorList = {
    new Door(3, "west", true, false)};
  /**
   * SectretRoom
   *
   * This method is the constructor for objects of the SecretRoom class
   */
  public SecretRoom() {
  }

  /**
   * getDesc
   *
   * This method returns the description of SecretRoom
   * 
   * Return: The description string for the SecretRoom object
   */
  public String getDesc() {
    return description;
  }

  /**
   * getItem
   *
   * This method returns the Item value with a name String
   * that matches the parameter String
   * If no Item matches it returns null
   *
   * Parameters:
   *   name: the name of the item to find
   *
   * Return: The Item value with the same name as the parameter
   */
  Item getItem(String name) {
    for(int i = 0; i < listI.length; i++){
      if(name.equals(listI[i].getName()))
        return listI[i];
    }
    return null;
  }

  /**
   * getDirections
   *
   * This method finds the Door object at is located in the 
   * direction of the parameter
   * if there is no door in that direction this method returns null
   *
   * Parameters:
   *   dir: the direction of the Door object to be found
   * 
   * Return: the Door object in the direction dir
   */
  Door getDirections(String dir) {
    for(int i = 0; i < doorList.length; i++){
      if(dir.equals(doorList[i].getDir()))
        return doorList[i];
    }
    return null;
  }

  /**
   * getDoor
   *
   * This method returns the door in the doorlist array 
   * with the index that is the same as the parameter
   *
   * Parameters:
   *   index: the index of the Door object in doorList[]
   *
   * Return: the door object at the index parameter
   */
  Door getDoor(int index) {
    return doorList[index];
  }
}

/**
 * MainRoom
 *
 * This is the class for the main room Location in the game
 * This location has index 5
 */
class MainRoom extends Location {
  private String description = "A large room, in the middle of the room is\n" +
                                "an altar with a large bowl in the middle.\n" +
                                "There's a beam of light shining from the \n" +
                                "ceiling into the bowl. To the north is a set\n" +
                                "of stairs with a carpet at the bottom.";
  private Item[] listI = {
    new Item("bowl", "a large bowl made of some precious metal\n" +
                     "there's a beam of light shining into the middle of it", 
      new String[]{}, new boolean[]{true, false})
  };

  private Door[] doorList = {
    new Door(3, "south", true, false),
    new Door(6, "east", false, false),
    new Door(0, "north", false, true, "You walk towards the stairs at the far end of the room.\n" +
                        "However, the second you step onto the carpet in front of \n" +
                        "the stairs, the floor gives out from under you. You fall\n" +
                        "down a pit.")};

  /**
   * MainRoom
   *
   * This method is the constructor for objects of the MainRoom class
   */
  public MainRoom() {
  }

  /**
   * getDesc
   *
   * This method returns the description of MainRoom
   * 
   * Return: The description string for the MainRoom object
   */
  public String getDesc() {
    return description;
  }

  /**
   * getItem
   *
   * This method returns the Item value with a name String
   * that matches the parameter String
   * If no Item matches it returns null
   *
   * Parameters:
   *   name: the name of the item to find
   *
   * Return: The Item value with the same name as the parameter
   */
  Item getItem(String name) {
    for(int i = 0; i < listI.length; i++){
      if(name.equals(listI[i].getName()))
        return listI[i];
    }
    return null;
  }

  /**
   * getDirections
   *
   * This method finds the Door object at is located in the 
   * direction of the parameter
   * if there is no door in that direction this method returns null
   *
   * Parameters:
   *   dir: the direction of the Door object to be found
   * 
   * Return: the Door object in the direction dir
   */
  Door getDirections(String dir) {
    for(int i = 0; i < doorList.length; i++){
      if(dir.equals(doorList[i].getDir()))
        return doorList[i];
    }
    return null;
  }

  /**
   * getDoor
   *
   * This method returns the door in the doorlist array 
   * with the index that is the same as the parameter
   *
   * Parameters:
   *   index: the index of the Door object in doorList[]
   *
   * Return: the door object at the index parameter
   */
  Door getDoor(int index) {
    return doorList[index];
  }
}
 
/**
 * DragonLair
 *
 * This is the class for the dragon lair Location in the game
 * This location has index 6
 */
class DragonLair extends Location {
  private String description = "As you walk into the room you see an\n" +
                                "amazing sight, a giant dragon with\n" +
                                "polished brass-colored scales.\n" +
                                "The dragon looks at you and says," +
                                "'You have been clever to make it\n" +
                                "this far, but now I have one last\n" +
                                "test for you, you must answer my\n" +
                                "riddle:\n" +
                                "What force and strength cannot get through,\n" +
                                "I with a gentle touch can do. And many \n" +
                                "in the street would stand, were I not a\n" +
                                "friend at hand.\n" +
                                "What am I?\n\n" +
                                "One of the items you have is the\n" +
                                "answer, give it to me and you may leave.'";
                                
  private Item[] listI = {
    new Item("dragon", "A giant dragon with brass scales.", 
      new String[]{}, new boolean[]{true})
  };

  private Door[] doorList = {
    new Door(5, "west", false, true, "You turn to run for the exit. The second you\n" +
                                       "turn your back to the dragon, it breathes a\n" +
                                       "spout of flame, burning you away until only\n" +
                                       "your bones remain." )};
  /**
   * DragonLair
   *
   * This method is the constructor for objects of the DragonLair class
   */
  public DragonLair() {
  }

  /**
   * getDesc
   *
   * This method returns the description of DragonLair
   * 
   * Return: The description string for the DragonLair object
   */
  public String getDesc() {
    return description;
  }

  /**
   * getItem
   *
   * This method returns the Item value with a name String
   * that matches the parameter String
   * If no Item matches it returns null
   *
   * Parameters:
   *   name: the name of the item to find
   *
   * Return: The Item value with the same name as the parameter
   */
  Item getItem(String name) {
    for(int i = 0; i < listI.length; i++){
      if(name.equals(listI[i].getName()))
        return listI[i];
    }
    return null;
  }

  /**
   * getDirections
   *
   * This method finds the Door object at is located in the 
   * direction of the parameter
   * if there is no door in that direction this method returns null
   *
   * Parameters:
   *   dir: the direction of the Door object to be found
   * 
   * Return: the Door object in the direction dir
   */
  Door getDirections(String dir) {
    for(int i = 0; i < doorList.length; i++){
      if(dir.equals(doorList[i].getDir()))
        return doorList[i];
    }
    return null;
  }

  /**
   * getDoor
   *
   * This method returns the door in the doorlist array 
   * with the index that is the same as the parameter
   *
   * Parameters:
   *   index: the index of the Door object in doorList[]
   *
   * Return: the door object at the index parameter
   */
  Door getDoor(int index) {
    return doorList[index];
  }
}