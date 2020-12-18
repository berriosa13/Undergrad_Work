/* 
Name" Anthony Berrios
Date: 9/4/18
Title: DataAnalysis.java
Description: Program that repeatedly inputs grades from the user stopping when the sentinal grade of -1 is entered. 
Input: arbitrary number of grades
Output: average grade and higest grade
*/

import java.util.Scanner;
public class DataAnalysis {
   public static void main(String[] args) {
   
      final int SENTINEL = -1;
      Scanner input = new Scanner(System.in);
      int grade; // current grade entered by user
      int highestGrade = -100; // highest grade seen so far
      int counter = 0;  // how many grades have been entered
      int sum = 0;     // total of all entered grades 
      
      do {
         do {
         // prompt the user to enter a grade
         System.out.print("Enter a grade, or " + SENTINEL + " to stop: ");
         // input the grade from the user
         grade = input.nextInt();
         if (grade != SENTINEL && (grade < 1 || grade > 100) )
            System.out.println("BAD Grade"); 
         } while ( grade != SENTINEL && (grade < 1 || grade > 100) ) ;
         // input validation loop, will get stuck for "bad inputs"
         // which are outside of the range 1-100, excluding the sentinel
          
         if (grade != SENTINEL) {
         counter++;  // another grade was entered
         sum += grade;  //add into sum the value of current grade
         }
         
         if ( highestGrade < grade )
            highestGrade = grade;
      } while ( grade!= SENTINEL );  // event-controlled problem
      
      // output avg grade
      System.out.println("Average grade: " + (double)sum/counter);
      // output highest grade
      System.out.println(highestGrade);
      
      
   
   }
   
}   