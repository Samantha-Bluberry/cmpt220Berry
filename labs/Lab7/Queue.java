/**
 * file: Queue.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: Lab 7
 * due date: April 18, 2017
 * version 1.0
 * 
 * This file implements a queue of ints
 * A queue retrieves elements in a first-in, first-out fashion
 */
public class Queue {
  private int[] elements;
  private int size = 0;
  public static final int DEFAULT_CAPACITY = 8;

  /**
   * Queue
   *
   * This function is the zero parameter constructor for the Queue class
   */
  public Queue() {
    elements = new int[DEFAULT_CAPACITY];
  }

  /**
   * enqueue
   *
   * This function adds a value to an existing queue
   * If the number of elements exceeds the size of the queue 
   * the array size is doubled
   *
   * Parameters:
   *   v: the number to be added to the Queue
   *
   * Return value: void
   */
  public void enqueue(int v){
    if (size >= elements.length) {
      int[] temp = new int[elements.length * 2];
      System.arraycopy(elements, 0, temp, 0, elements.length);
      elements = temp;
    }
    
    elements[size++] = v;
  } //adds v to queue

  /**
   * dequeue
   *
   * This function removes the first value of an existing queue
   *
   * Return value: the int removed from the Queue
   */
  public int dequeue() {
    int first = elements[0];
    int[] temp = new int[elements.length - 1];
    System.arraycopy(elements, 1, temp, 0, elements.length - 1);
    elements = temp;
    size--;

    return first;
  } //removes the first element in the queue

  /**
   * empty
   *
   * This function returns true if an instance of Queue is empty
   *
   * Return value: true if Queue is empty, false otherwise
   */
  public boolean empty() {
    return size == 0;
  } // returns true if empty

  /**
   * getSize
   *
   * This function returns the size of and instance of Queue
   *
   * Return value: the size value of Queue
   */
  public int getSize() {
    return size;
  } // returns size
}// create uml