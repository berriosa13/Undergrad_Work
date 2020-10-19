/*
   Name:                Anthony Berrios
   Date:                11/6/18
   Title:               FoodOrder.java
   Description:         A program to simulate an order of cheesesteaks
 */

import java.util.ArrayList;

public class FoodOrder {

    public static void main (String[] args) {
      
      // creates a new food order using an ArrayList
      ArrayList<PhillyCheesesteak> foodOrder = new ArrayList<PhillyCheesesteak>();
      
      // lets add a few steaks to the order to feed the familiy
      foodOrder.add(new PhillyCheesesteak());
      foodOrder.add(new PhillyCheesesteak(16, true));
      foodOrder.add(new PhillyCheesesteak(8, false));

      displayCheeseCalculation(foodOrder);

    } // ends the main

    public static void displayCheeseCalculation(ArrayList<PhillyCheesesteak> order) {

        int cheeseCount = 0;
        int noCheeseCount = 0;

        // iterate through the entire order, one steak at a time
        for (PhillyCheesesteak steak : order) {
          if (steak.hasCheese())
            cheeseCount++;
          else
            noCheeseCount++;
        }

        System.out.printf("Cheese count: %d\nNo cheese count: %d\n\n", cheeseCount, noCheeseCount);

    } // ends the display function

} // ends the class
