/*
Name:        Anthony Berrios
Date:        9/20/18
Title:       Circle.java
Description: Program that asks the user for the
             circle's radius, creating a Circle object, 
             and then reporting the circle's area,
             diameter, and circumference.
             Creates new, but inverted file.
*/

public class Circle {
   
  private double radius;
  private double PI = 3.14159;
   
public Circle(double r) {
   radius = r;
}

public void setRadius(double newRadius) {
   radius = newRadius; 
}

public double getRadius() {
   return radius;  
}

public double getArea() {;
   return (radius * radius) * PI; 
}

public double getDiameter() {
   return (2 * radius);
   
}

public double getCircumference() {
   return (PI*radius)*2;
}

          

   
   }
   
   
  
