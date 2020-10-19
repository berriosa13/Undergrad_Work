/*
Anthony Berrios
ab905436@wcupa.edu
HW4
4/11/2019
*/

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class HW4
{
   public static void main(String[] args) throws IOException
   {    
      // read in number.txt file
      File num = new File("number.txt");
      Scanner input = new Scanner(num);
      // create ArrayList for number.txt file
      ArrayList<Integer> numList = new ArrayList<>();
      // create array to keep count of numbers
      int[] occurrence = new int[100]; 
    
      while(input.hasNext())  // reads through numbers until end of file
      {
         int temp = input.nextInt();
         // handles possible duplicate numbers
         if(!numList.contains(temp))
         {
            numList.add(temp);       
         }
         occurrence[temp-1]++;
      }
      // creates new file to store results to
      FileWriter outputFile = new FileWriter("results.txt");
      // writes info header for assignment
      outputFile.write("Anthony Berrios\n" + "ab905436@wcupa.edu\n\n");
      // creates "Number" & "Occurrence" columns
      outputFile.write("  Number " + "\t" + "Occurrence Times\n");
      
      // writes all numbers from 1-100 and displays their occurrence
      for( int i = 0; i < occurrence.length; i++)
      {
         outputFile.write("  "+(i+1)+"                "+occurrence[i]+"\n");
      }
      outputFile.close();  // closes file
 }

}


