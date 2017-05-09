/**
 * file: TextParse.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: project 2
 * due date: May 8, 2017
 * version 1.0
 *
 * This class contains the code that parses input text
 * Text is first split into an array an then the correct
 * text is chosen through if statements 
 */
public class TextParse
{
  private String textIn;
  private String helpMessage = "When writing your commands make sure to eliminate \n" +
                       "unnecessary words such as 'the', 'to', and 'in'. \n" +
                       "Two word commands should be written in the format 'verb' 'object'.\n" +
                       "Three word commands should be written in the format \n" +
                       "'verb' 'inventory object' 'environment object'.\n" +
                       "Enter 'invetory' to see your invetory,\n" +
                       "enter 'quit' to exit the game.\n" +
                       "Good luck!";

  /**
   * TextParse
   * 
   * This function is the zero parameter constructor for the Textparse class
   */
  public TextParse() {
  }

  /**
   * TextParse
   * 
   * This function is the one parameter constructor for the Textparse class
   *
   * Parameters:
   *   in: the text input by the player in the main method
   */
  public TextParse(String in) {
    textIn = in;
  }

  /**
   * seperate
   *
   * This function prepares input text to be parsed
   * then it calls the appropriate text parsing function
   */
  public void seperate(String input) {
    input = input.toLowerCase();
    input = input.trim();
    String[] splitInput = input.split(" ");
  
    String phrase = null;
    if (splitInput.length == 1) {
      phrase = parse1Word(splitInput);
    }
    else if (splitInput.length == 2) {
      phrase = parse2Word(splitInput);
    }
    else if (splitInput.length > 2) {
      phrase = parseMulitWord(splitInput);
    }

    if (phrase != null) 
      System.out.println(phrase);
  }
  
  /**
   * parse1Word
   *
   * This method returns a String based on what the user inputs
   * This method returns the results for when the user inputs one word
   * Acceptable words include "help", "look", "invetory", and "quit"
   * if no response is applicable an error message is returned
   *
   * Parameters:
   *   inputs: an array containing the user's input split into individual words
   *     there should only be one item in the array
   *
   * Return: the string containing the appropriate response to the input
   *   if no response is needed null is returned
   */
  public String parse1Word(String[] inputs) {
    if (inputs[0].equals("help")) {
      return helpMessage;
    }
    else if (inputs[0].equals("look")) {
      return FlagList.getLocation().getDesc(); //returns description for area
    }
    else if(inputs[0].equals("inventory")) {
      return Player.getInvetoryPrint(); //returns players inventory
    }
    else if (inputs[0].equals("quit")) {
      FlagList.gameOff(); //quits game
      return "Goodbye!";
    }
    else
      return "I don't know what a " + inputs[0] + " is.";
  }
  
  /**
   * parse2Word
   *
   * This method returns a String based on what the user inputs
   * This method returns the results for when the user inputs two words
   * This method reads phrases in the format "verb"(input[0]) "item"(input[1])
   * if no response is applicable an error message is returned
   *
   * Parameters:
   *   inputs: an array containing the user's input split into individual words
   *     there should be two items in the array
   *
   * Return: the string containing the appropriate response to the input
   *   if no response is needed null is returned
   */
  public String parse2Word(String[] inputs) {
    if(inputs[0].equals("go") || inputs[0].equals("move")) {
      if (FlagList.getLocation().getDirections(inputs[1]) != null) {
        FlagList.getLocation().getDirections(inputs[1]).goThrough();
        return null;
        //moves player to other room
      }
      else
        return "You can't go there.";
    }
    else if (FlagList.getLocation().getItem(inputs[1]) != null) {
      if(FlagList.getLocation().getItem(inputs[1]).getState(0) == true) {
        if(inputs[0].equals("look"))
          return FlagList.getLocation().getItem(inputs[1]).getDesc();
        if (FlagList.getLocation().getItem(inputs[1]).getCommand(0).equals(inputs[0])
          && FlagList.getLocation().getItem(inputs[1]).getState(1) == true) {
          FlagList.getLocation().getItem(inputs[1]).setState(1, false);
          System.out.println("You " + inputs[0]  + " the " +
            FlagList.getLocation().getItem(inputs[1]).getName());
          if (Player.getItem(FlagList.getLocation().getItem(inputs[1]).getName()) != null) {
            System.out.println("You get the " + 
              FlagList.getLocation().getItem(inputs[1]).getName());
            FlagList.getLocation().getItem(inputs[1]).setState(0, false);
            Player.getItem(FlagList.getLocation().getItem(inputs[1])
              .getName()).setState(0, true);
          }
          if(inputs[0].equals("pull") && inputs[1].equals("scone")){
            FlagList.getLocation().getDoor(1).open();
            return "Suddenly, the wall next to the east moves\n" +
                    "revealing a hidden door!";
          }
          return null;
        }
      }
      else {
        return "There isn't a " +
          FlagList.getLocation().getItem(inputs[1]).getName() + " here.";
      }
    }
    else
      return inputs[0] + " what?";
    return null;
  }

  /**
   * parseMultiWord
   *
   * This method returns a String based on what the user inputs
   * This method returns the results for when the user inputs three words
   * This method reads phrases in the format,
   * "verb"(input[0]) "invetory item"(input[1]) "environment item" (input[2])
   * if no response is applicable an error message is returned
   *
   * Parameters:
   *   inputs: an array containing the user's input split into individual words
   *     there should be three items in the array
   *
   * Return: the string containing the appropriate response to the input
   *   if no response is needed null is returned
   */
  public String parseMulitWord(String[] inputs) {
    if (Player.getItem(inputs[1]) != null) {
      if(Player.getItem(inputs[1]).getName().equals("torch") &&
         Player.getItem(inputs[1]).getState(0) == true &&
         Player.getItem(inputs[1]).getInteract(0).equals(inputs[2]) &&
         FlagList.getLocation().getItem(inputs[2]) != null) {
        Player.getItem(inputs[1]).setState(1, true);
        FlagList.getLocation(3).getItem("scone").setState(1, true);
        FlagList.getLocation(3).getDoor(2).open();
        return "You light the torch";
      }
      if (Player.getItem(inputs[1]).getName().equals("bar") &&
        Player.getItem(inputs[1]).getState(0) == true &&
        Player.getItem(inputs[1]).getInteract(0).equals(inputs[2]) && 
        FlagList.getLocation().getItem(inputs[2]) != null &&
        FlagList.getLocation().getItem(inputs[2]).getState(0) == true) {
        System.out.println("You deftly lift the keys of the hook\n" +
                            "With the bar.");
        Player.getItem("keys").setState(0, true);
        FlagList.getLocation().getItem(inputs[2]).setState(0, false);
        return "You get the keys.";
      }
      if (Player.getItem(inputs[1]).getName().equals("keys") &&
        Player.getItem(inputs[1]).getState(0) == true &&
        Player.getItem(inputs[1]).getInteract(0).equals(inputs[2]) && 
        FlagList.getLocation().getItem(inputs[2]) != null &&
        FlagList.getLocation().getItem(inputs[2]).getState(1) == false){
        FlagList.getLocation().getItem(inputs[2]).setState(1, true);
        FlagList.getLocation().getDoor(0).open();
        return "You open the door with the keys";
      }
      else if (Player.getItem(inputs[1]).getName().equals("keys") &&
        Player.getItem(inputs[1]).getState(0) == true &&
        Player.getItem(inputs[1]).getInteract(1).equals(inputs[2]) && 
        FlagList.getLocation().getItem(inputs[2]) != null) {
        System.out.println("The gleaming dragon chuckles, 'Clever,\n" +
                            "you figured out my riddle. Very well,\n" +
                            "I suppose I have to hold my end of the\n" +
                            "agreement, don't I?");
        System.out.println("With that, the dragon leaps forward, and\n" +
                            "grabs you in its talons. Her great wings\n" +
                            "unfurl, and she launches through a hole\n" +
                            "in the ceiling. Before you can process\n" +
                            "everything, you've landed facefirst in\n" +
                            "a grassy field.");
        System.out.println("YOU WIN");
        System.out.println("");
        System.out.println("Game by:\tSamantha Berry");
        System.out.println("Thank you for playing!");
        
        FlagList.gameOff();
        return null;
      }
      else if ((Player.getItem(inputs[1]).getName() != null) &&
        Player.getItem(inputs[1]).getState(0) == true &&
        Player.getItem(inputs[1]).getInteract(1).equals(inputs[2]) && 
        FlagList.getLocation().getItem(inputs[2]) != null) {
        System.out.println("The dragon smiles, 'That would\n" +
                            "be incorrect human, too bad.'\n" +
                            "The dragon leaps forward, and\n" +
                            "Snaps you in her jaws.");
        System.out.println("YOU DIE");
        FlagList.gameOff();
        return null;
      }
      if (Player.getItem(inputs[1]).getName().equals("bucket") && //using bucket
        Player.getItem(inputs[1]).getState(0) == true &&
        Player.getItem(inputs[1]).getState(1) == false &&
        Player.getItem(inputs[1]).getInteract(0).equals(inputs[2]) && 
        FlagList.getLocation().getItem(inputs[2]) != null) {
        Player.getItem(inputs[1]).setState(1, true);
        return "You fill the bucket with water";
      }
      else if (Player.getItem(inputs[1]).getName().equals("bucket") &&
        Player.getItem(inputs[1]).getState(0) == true &&
        Player.getItem(inputs[1]).getState(1) == true &&
        Player.getItem(inputs[1]).getInteract(2).equals(inputs[2]) && 
        FlagList.getLocation().getItem(inputs[2]) != null) {
        System.out.println("You pour the water into the bowl");
        System.out.println("The beam of light from the ceiling\n" +
                            "makes the bowl glow bright. A beam\n" +
                            "of light emerges from the side of\n" +
                            "the altar, striking the east wall\n" +
                            "and it opens, revealing a hidden door!");
        FlagList.getLocation().getItem(inputs[2]).setState(1, true);
        FlagList.getLocation().getDoor(1).open();
        return null;
      }
    }
    else {
      return "You don't have a " + inputs[1];
    }
    return "I don't know what a " + inputs[1] + " is.";
  }
}
