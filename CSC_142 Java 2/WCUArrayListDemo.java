/*
    Name:                Anthony Berrios
    Date:                11/8/18
    Title:               WCUArrayListDemo.java
    Description:         A program to simulate the usage of the WCUArrayList class.
  */

import java.util.Random;  

public class WCUArrayListDemo {

    public static void main (String[] args) {
      
      // creates a new empty WCU array list
      WCUArrayList order = new WCUArrayList();
      
      // creating 20 steaks and adding them to our collection
      for (int i = 1; i <= 20; i++) {
        System.out.println("Creating steak " + i + "...");

        // random amount of meat 
        Random r = new Random();
        int meat = r.nextInt(16) + 1;   // between 1..16 ounces

        // random cheese
        int cheese = r.nextInt(2);      // 0=nocheese, 1=cheese 
        boolean withCheese = (cheese == 1);  // clever shorthand!

        // create the cheesesteak object
        PhillyCheesesteak pc = new PhillyCheesesteak(meat, withCheese);

        // add the steak to the array list 
        order.addElement(pc);
      }

      // print the steaks in the array list 
      System.out.println(order);

    } // ends the main
} // ends the class
    
// Extend the class to implement the following methods:

/*addElement(PhillyCheesesteak) which adds an element. 
Fix the bug in this method -- you need to check if the number of elements has reached 
the capacity, if so create a new array with the capacity increased. Then copy the old
 array into this array and replace the old array with the new array.
getElementAt(int) which returns the PhillyCheesesteak stored at an index specified by
 the integer parameter.
setElementAt(int, PhillyCheesesteak) which modifies the element at the index specified
 by its 1st parameter to be the value specified by the 2nd parameter.
Demonstrate the use of these methods in WCUArrayListDemo.java
*/

