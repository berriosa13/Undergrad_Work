/*
Name:        Anthony Berrios
Date:        9/20/18
Title:       Inverter.java
Description: Program that opens a .pbm file and
             writes a new file but inverted.
Input:       Opens .pbm file
Output:      Creates new, but inverted file.
*/

import java.util.Scanner; // Needed for Scanner class
import java.io.*; // Needed for file I/O classes
public class Inverter {
   public static void main(String[] args) throws IOException {
  
 // Opening file to be read
    File file = new File("J.pbm");
    Scanner inputFile = new Scanner(file);
   
 // Creating String to read first line of file
    String line1 = inputFile.nextLine();
    System.out.println(line1);
 
 // Creating String to read second line of file
    String line2 = inputFile.nextLine();
    System.out.println(line2);
 
 // Creating two int variables to read third line
    int width = inputFile.nextInt();
    int height = inputFile.nextInt();
    System.out.println(width + " " + height);
    
 // Creating PrintWriter to create a new .pbm file
    PrintWriter outputFile = new PrintWriter("J-inverted.pbm");
    outputFile.println(line1);
    outputFile.println(line2);
    outputFile.println(width + " " + height);
     

 // Using int values height & width
   for (int i = 0; i < height; i++) {  // iterates 10x
        for (int j = 1; j <= width; j++) {  // iterates 6x
             int pixel = inputFile.nextInt(); 
             if (pixel == 1)
                  outputFile.print("0 "); // Prints 0, if == 1
              else
                  outputFile.print("1 "); // Prints 1, if == 0

             System.out.print(pixel + " ");   
              
        }
     
             System.out.println();
             outputFile.println(); 
   }        
        
   outputFile.close(); // Closes file
   
   }
   
}   
   
