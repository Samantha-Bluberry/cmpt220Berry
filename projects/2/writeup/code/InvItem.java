/**
 * file: InvItem.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: project 2
 * due date: May 8, 2017
 * version 1.0
 *
 * This file contains the code for the InvItem class
 * The Player class has InvItems that it uses to
 * interacts with Items in the environment with
 */
public class InvItem extends Item
{
  private String name;
  private String description;
  private String[] commands;
  private String[] interactItems; //Items the InvItem can interact with
  private boolean[] states;
  //first boolean indicates if object is in scene false = no, true = yes
  //The following booleans indicate if the commands in the string can be done in order

  /**
   * InvItem
   *
   * This method is the zero parameter constructor for objects of the InvItem class
   */
  public InvItem(){
  }

  /**
   * Item 
   *
   * This method is the five parameter constructor for the InvItem Class
   *
   * Parameters:
   *   name: the name for the instance of the InvItem class
   *   description: the description for the instance of the InvItem class
   *   commands: the commands for the instance of the InvItem class
   *   intI: the interactItems for the instance of the InvItem class
   *   states: the states for the instance of the InvItem class
   */
  public InvItem(String name, String desc, String command[], String[] intI, boolean[] states){
    this.name = name;
    this.description = description;
    this.commands = commands;
    this.interactItems = intI;
    this.states = states;
  }
  
  /**
   * getName
   *
   * This method returns the name value for an instance of InvItem
   * 
   * Return: the name String of the InvItem instance
   */
  public String getName() {
    return name;
  }
  
  /**
   * getState
   *
   * This method returns the state value at the given index
   * 
   * Parameters:
   *   index: the index of the state to return
   *
   * Return: the state boolean at the given index
   */
  public boolean getState(int index) {
    return states[index];
  }
  
  /**
   * setState
   *
   * This method sets the value of the state at the given index
   * to the given boolean value
   *
   * Parameters:
   *   index: the index of the state to change
   *   state: the next boolean value for the state at the index
   */
  public void setState(int index, boolean state) {
    states[index] = state;
  }

  /**
   * getCommand
   *
   * This method returns the command value at the given index
   * 
   * Parameters:
   *   index: the index of the command to return
   *
   * Return: the command String at the given index
   */
  public String getCommand(int index) {
    return commands[index];
  }

  /**
   * getDesc
   *
   * This method returns the description of the InvItem instance
   *
   * Return: the description string of the InvItem instance
   */
  public String getDesc() {
    return description;
  }

  /**
   * getInteract
   *
   * This method returns the interactItems value at the given index
   * 
   * Parameters:
   *   index: the index of the interactItems to return
   *
   * Return: the interactItems String at the given index
   */
  public String getInteract(int index) {
    return interactItems[index];
  }

  /**
   * getArrsLength()
   *
   * This method returns length of the commands[] array
   *
   * Return: the commands[] array's length
   */
  public int getArrsLength() {
    return commands.length;
  }
}
