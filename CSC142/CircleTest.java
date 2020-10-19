/*
Name:        Anthony Berrios
Date:        9/20/18
Title:       CircleTest.java
Description: Program that asks the user for the
             circle's radius, creating a Circle object, 
             and then reporting the circle's area,
             diameter, and circumference.
             Creates new, but inverted file.
*/
import java.util.Scanner;
public class CircleTest {
   public static void main(String[] args) {
   
   Scanner kb = new Scanner(System.in);
   
   System.out.println("Enter radius and get the circle's" +
   " area, diameter, and circumference: ");
   
   Circle circle = new Circle (kb.nextDouble());
   
   circle.getRadius();
   circle.getArea();
   circle.getDiameter();
   circle.getCircumference();
   
   System.out.println("Area: " + circle.getArea() +"\n"+
   "Diameter: " + circle.getDiameter() + "\n" + "Circumference: " +
    circle.getCircumference());

   
   }
   
}   
  
