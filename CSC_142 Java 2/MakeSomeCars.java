/*
Name: Anthony Berrios
Date: 9/18/18
Title: MakeSomeCars.java
Description: Program will demonstrate
             the use of the Car class
             by creating some cars, 
             speeding them up,
             and slowing them down.
*/

public class MakeSomeCars {
   public static void main(String[] args) {
      Car c1, c2, c3;  // reference variables
      c1 = new Car(2018, "Jeep");
      c2 = new Car(2011, "Toyota");
      c3 = new Car(1999, "Honda");
      
      // repeat 5 times
      for (int i = 1; i <= 5; i++) {
         c1.accelerate(); // method call
         
         // display current speed of car
         System.out.println("Current speed: " + c1.getSpeed());
      }
      
      // repeat 5 times
      for (int i = 1; i <= 5; i++) {
         c1.brake(); // method call
         
         // display current speed of car
         System.out.println("Current speed: " + c1.getSpeed());
      }      
   
   }
}             