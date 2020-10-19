/*
Name: Anthony Berrios
Date: 1/2/18
Description: This program will reas in a data file
             into an array, calculate the average monthly rainfall,
             and figure out the month with the most rain fall and least rain fall.
*/
            
import java.util.Scanner;
import java.io.*;

public class Rainfall {

   public static void main(String args) throws IOException {
   // open data file for reading
   
   File f = new File("rainfall.dat");
   Scanner inputFile = new Scanner(f);
   
   // load data snd store it into an array
   double[] month = new double[12];  // 0..11
   for( int i = 0; i < month.length; i++) {
      month[i] = inputFile.nextDouble(); 
   }
   
   // Calculating average rainfall
   double sum = 0.0;
   for(double rain : month) {
      sum += rain;
   }
   double avg = sum / (double)month.length;
   System.out.printf("Avg: %.2f \n", avg);
   
   int highMonthIndex = 0;
   for(int i = 0; i < month.length; i++)
   
      if(month[i] > month[highMonthIndex])
         highMonthIndex = i;
   
   System.out.printf("Month %d had the highest rainfall " + 
               " with %f inches of rain. \n",
                highMonthIndex+1, month[highMonthIndex]);
                
   // close date file before program exits
   inputFile.close();
   
   
   
   }
   
}   

   
   
   