/*
  Name: Anthony Berrios
  Date: 11/6/18
  Class: PhillyCheesesteak.java 
  Description: a class that represents the amount of ingredients 
               on a philly cheesesteak sandwich
               
  Public methods: 
      PhillyCheesesteak() -- creates a standard cheesesteak sandwich with 6 oz of 
                             meet, plus cheese 
      PhillyCheesesteak(int, boolean) -- creates a cheesesteak with the specied 
                             lbs of meat, and whether or not cheese is also on the sandwich 
      getAmountOfMeat() -- returns the amount of meat (in oz) on the sandwich 
      hasCheese() -- returns whether the sandwich has cheese or not 
*/

public class PhillyCheesesteak { 

  private int meatAmount;   // the amount of meat (in oz) on the sandwich 
  private boolean cheese;   // whether or not cheese is on the sandwich 

  private static int DEFAULT_MEAT = 6;

  // no-arg constructor
  // creates a new sandwich with the default amount of meat
  // cheese also on sandwich, because "wiz wit"
  public PhillyCheesesteak() {
    meatAmount = DEFAULT_MEAT;
    cheese = true;
  }

  // arg constructor
  // creates a custom sandwich with the specific amount of meat 
  // cheese is optional 
  public PhillyCheesesteak(int m, boolean c) {
    meatAmount = m;
    cheese = c;
  }

  // getter method 
  // returns the amount of meat (in oz) on the sandwich 
  public int getAmountOfMeat() {
    return meatAmount;
  }

  // getter method 
  // returns whether or not the sandwich has cheese on it 
  public boolean hasCheese() {
    return cheese;
  }
}
