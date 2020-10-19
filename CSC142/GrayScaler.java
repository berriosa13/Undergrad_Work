/*
Name:        Anthony Berrios
Date:        9/20/18
Title:       GrayScaler.java
Description: Program that opens a .pbm file and
             writes a new file but inverted.
Input:       Opens .pbm file
Output:      Creates new, but inverted file.
*/

import java.util.Scanner; // Needed for Scanner class
import java.io.*;

public class GrayScaler {
   public static void main(String[] args) throws IOException {
  
   // Opening file to be read
   File file = new File("P3.pbm");
   Scanner inputFile = new Scanner(file);
   
   // Creating String to read first line of file
    String line1 = inputFile.nextLine();
    System.out.println(line1);
    
   // Creating two int variables to read third line
    int width = inputFile.nextInt();
    int height = inputFile.nextInt();
    System.out.println(width + " " + height);
    
    final int maxColor = inputFile.nextInt();
    System.out.print(maxColor);
   
    String commentOne = inputFile.nextLine();
    String commentTwo = inputFile.nextLine();
    String commentThree = inputFile.nextLine();
    String commentFour = inputFile.nextLine();
    String commentFive = inputFile.nextLine();
    String commentSix = inputFile.nextLine();
    
    System.out.println(commentOne);
    System.out.println(commentTwo);
    System.out.println(commentThree);
    System.out.println(commentFour);
    System.out.println(commentFive);
    System.out.println(commentSix);
    
    int[] trips1 = new int[3];
    trips1[0] = inputFile.nextInt();
    trips1[1] = inputFile.nextInt();
    trips1[2] = inputFile.nextInt();
    System.out.print(trips1[0] + " " + trips1[1] + " " +
    trips1[2] + "  ");
    
     int[] trips2 = new int[3];
    trips2[0] = inputFile.nextInt();
    trips2[1] = inputFile.nextInt();
    trips2[2] = inputFile.nextInt();
    System.out.print(trips2[0] + " " + trips2[1] + " " +
    trips2[2] + "  ");
    
    int[] trips3 = new int[3];
    trips3[0] = inputFile.nextInt();
    trips3[1] = inputFile.nextInt();
    trips3[2] = inputFile.nextInt();
    System.out.println(trips3[0] + " " + trips3[1] + " " +
    trips3[2] + "  ");
    
    int[] trips4 = new int[3];
    trips4[0] = inputFile.nextInt();
    trips4[1] = inputFile.nextInt();
    trips4[2] = inputFile.nextInt();
    System.out.print(trips4[0] + " " + trips4[1] + " " +
    trips4[2] + "  ");
    
    int[] trips5 = new int[3];
    trips5[0] = inputFile.nextInt();
    trips5[1] = inputFile.nextInt();
    trips5[2] = inputFile.nextInt();
    System.out.print(trips5[0] + " " + trips5[1] + " " +
    trips5[2] + "  ");
    
    int[] trips6 = new int[3];
    trips6[0] = inputFile.nextInt();
    trips6[1] = inputFile.nextInt();
    trips6[2] = inputFile.nextInt();
    System.out.print(trips6[0] + " " + trips6[1] + " " +
    trips6[2] + "  ");
    
    
    PrintWriter outputFile = new PrintWriter("P2.pbm");
    

   
    

 
    
    
  }
  
}
 



   
   
   
   
