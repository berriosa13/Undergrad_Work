/*
  Name: Anthony Berrios 
  Date: 11/8/18 
  Class: WCUArrayList.java 
  Description: a class that simulates the functionality of an ArrayList through 
               the internal use of an array
  Public methods: 
      WCUArrayList() -- creates an empty arraylist with capacity 10
      WCUArrayList(int) -- creates an empty arraylist with the specified capacity 
      getSize() -- returns the size of the arraylist
      getCapacity() -- returns the capacity of the arraylist
      addElement(PhillyCheesesteak) -- adds the given steak to the end of the arraylist -- buggy!!
*/

public class WCUArrayList {
  private int size;       // the current size of the array list 
  private int capacity;   // the current capacity of the array list 

  private PhillyCheesesteak[] data;   // an internal array to hold the collection of steaks

  // constructor that creates an empty arraylist with a capcity of 10 
  public WCUArrayList() {
    size = 0;
    capacity = 10;
    data = new PhillyCheesesteak[capacity];
  }

  // constructor that creates an arraylist with the specified capacity 
  public WCUArrayList(int c) {
    size = 0;
    capacity = c;
    data = new PhillyCheesesteak[capacity];
  }

  // getter method that returns the size of the array list 
  public int getSize() {
    return size;
  }

  // getter method that returns the capacity of the array list 
  public int getCapacity() {
    return capacity;
  }

  // BUGGY!!! method that adds the specified steak to the end of the array list 
  // will incorrectly crash if the array list is full 
  public void addElement(PhillyCheesesteak sandwich) {
  
      size = size + 1;  // increase the size, since we just added one sandwich 
            
      if(size < capacity)
      {
         data[size] = sandwich;
         size++;                // adds the sandwich to the end of the array list             
      }
      else if(size == capacity)
      {
         PhillyCheesesteak[] data2 = new PhillyCheesesteak[capacity +1]; 
     
         for(int i = 0; i < data2.length; i++)
         {
            data2[i] = data[i];
         data2[size] = sandwich;
            data = data2;
            size++;
         }

  }
          
 }
  
}