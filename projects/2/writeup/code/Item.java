/**
 * file: Item.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: project 2
 * due date: May 8, 2017
 * version 1.0
 *
 * This file contains the code for the Item class
 * An Item is something interactable in the environment
 * Each location has an array of Items
 */
public class Item
{
  String name;
  String description;
  String[] commands;
  boolean[] states; 
  //first boolean indicates if object is in scene false = no, true = yes
  //The following booleans indicate if the commands in the string can be done in order
   
  /**
   * Item
   *
   * This method is the zero parameter constructor for objects of the Item class
   */
  public Item(){
  }

  /**
   * Item 
   *
   * This method is the four parameter constructor for the Item Class
   *
   * Parameters:
   *   name: the name for the instance of the Item class
   *   description: the description for the instance of the Item class
   *   commands: the commands for the instance of the Item class
   *   states: the states for the instance of the Item class
   */
  public Item(String name, String description, String commands[], boolean[] states){
    this.name = name;
    this.description = description;
    this.commands = commands;
    this.states = states;
  }
  
  /**
   * getName
   *
   * This method returns the name value for an instance of Item
   * 
   * Return: the name String of the Item instance
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
   * This method returns the description of the Item instance
   *
   * Return: the description string of the Item instance
   */
  public String getDesc() {
    return description;
  }
}
