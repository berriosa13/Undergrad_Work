//********************************************************************//
//       NAME: Anthony Berrios                                        //
//      CLASS: CSC-141-99                                             //
// ASSIGNMENT: Assignment 3                                           //
//   FILENAME: ScoreAverages.java                                     //
//       DATE: April 24, 2018                                         //
// DECRIPTION: This program asks a user to input test scores and get  //
//             the lowest score, highest score, and the average.      //
//                                                                    //
//********************************************************************//

import java.util.Scanner;
import java.text.DecimalFormat;

public class ScoreAverages
{
   public static void main(String[] args)
   {
      // Create Scanner
      Scanner kb = new Scanner(System.in);
      
      // Declare variables
      int score = 0, total = 0, count = 0;
      int sentinel = 999, smallest = 100, high = 0;
      
      System.out.println("Enter test scores, and get the lowest score," +
         " the highest score, and the average. \n" + "Enter 999 to quit. \n");
      
      // Create String prompt
      final String prompt = ("Enter a score [0..100] (999 to quit): ");
      
      // Take input value and print new prompt
      while(score != sentinel)
      {
        
         System.out.print(prompt);
         score = kb.nextInt();
         if (score == 999)
            break;
            
        // Make sure inputted value is within [0..100]
        // and not sentinel value (999)
         while(score <0 || score >100 && score!=999)
         {
            System.out.print("      Enter only 0...100 (999 quits): ");
            score = kb.nextInt();
         }
            // Use variables to store highest and lowest
            // test scores to print later
         if (score <= smallest)
         {
            smallest = score;
         }
         if (high <= score)
         {
            high = score;
         }
         total+=score;
         count++;
             
      }
       
      // Print scores out as decimals
      DecimalFormat formatter = new DecimalFormat("#.00");
      if (count>0)
      {
         // Outputs lowest, highest, and average score
         System.out.println();
         System.out.println("       RESULTS");
         System.out.println("The lowest score is " + smallest + ".");
         System.out.println("The highest score is " + high + ".");                   
         double average = (double)total/(double)count;
         System.out.println("The average of the scores is "
                             + formatter.format(average) + ".");
         System.out.println("There were " + count + " scores.");                   
      }                       
      
      else // Prints out if score count is less than 0
         System.out.println("No scores were input.");
      
                             
      
           
        
        
      
      
      
      
   
   
   
   
   
   
   
   
   
   
   
   }
      
      
      
}