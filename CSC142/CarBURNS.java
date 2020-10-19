/*
Name: Anthony Berrios 
Date: 9/18/18
Title: CarBURNS.java
*/

public class CarBURNS {
   // fields
   private int yearModel; // car year's model
   private String make; // make of the car
   private int speed; // car's current speed
   
   public CarBURNS (int _yearModel, String _make) {
      yearModel = _yearModel;
      make = _make;
      speed = 0;
   }
   
   // accessor methods
   public int getYearModel() {
      return yearModel;
   }
   public String getMake() {
      return make;
   }
   public int getSpeed() {
      return speed;
   }
   
   // this method adds some speed
   // to the car each time it is called
   public void accelerate() {
      speed += 5;
   }
   
   // this method reduces the car's speed
   // each time it is called
   public void brake() {
      speed = speed - 5;
   }
}