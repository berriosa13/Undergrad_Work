/*
Name:        Anthony Berrios
Date:        11/14/18
Title:       Blurrer.java
Description: Program that opens a .pbm file and
             blurrs the image.
Input:       Opens .pbm file
Output:      Creates new, but blurred image.
*/

import java.util.Scanner; // Needed for Scanner class
import java.io.*;

public class Blurrer {
   public static void main(String[] args) throws IOException {
  
   // Opening file to be read
   File file = new File("P3.pbm");
   Scanner inputFile = new Scanner(file);
   
   // Open file for writing
   PrintWriter outputFile = new PrintWriter("BlurredStop.pbm");
   
   // Creating String to read first line of file
    String line1 = inputFile.nextLine();
    System.out.println(line1);
    outputFile.println(line1);
    
   // Creating two int variables to read third line
    int width = inputFile.nextInt();
    int height = inputFile.nextInt();
    System.out.println(width + " " + height);
    outputFile.println(width + " " + height);
    
    final int maxColor = inputFile.nextInt();
    System.out.print(maxColor);
    outputFile.print(maxColor);

    for (int i = 1; i <= 5; i++) {
      String comments = inputFile.nextLine();
      System.out.println(comments);
      outputFile.println(comments);
    }

   
    
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
    
    int[][] red = new int[width][height];
    int[][] green = new int[width][height];
    int[][] blue = new int[width][height];
    for (int j = 0; j < height; j++) {
      for (int i = 0; i < width; i++) {
        red[i][j] = inputFile.nextInt();
        green[i][j] = inputFile.nextInt();
        blue[i][j] = inputFile.nextInt();
      }
      
        }
         
     int[][] redNew = new int [width][height];
     int[][] greenNew = new int [width][height];
     int[][] blueNew = new int [width][height];
     
     for (int x = 1; x < height; x++) {
       for (int y = 1; y < width; y++)
       {
       
        int[][] redTemp = {{ redNew[x-1][y-1], redNew[x-1][y], redNew[x-1][y+1] },
                          { redNew[x][y-1], redNew[x][y], redNew[x][y+1] },
                          { redNew[x+1][y-1], redNew[x+1][y], redNew[x+1][y+1] } };
                          
                          
        int[][] greenTemp = {{ greenNew[x-1][y-1], greenNew[x-1][y], greenNew[x-1][y+1] },
                            { greenNew[x][y-1], greenNew[x][y], greenNew[x][y+1] },
                            { greenNew[x+1][y-1], greenNew[x+1][y], greenNew[x+1][y+1] } };

        int[][] blueTemp = {{ blueNew[x-1][y-1], blueNew[x-1][y], blueNew[x-1][y+1] },
                           { blueNew[x][y-1], blueNew[x][y], blueNew[x][y+1] },
                           { blueNew[x+1][y-1], blueNew[x+1][y], blueNew[x+1][y+1] } };
                           
       int totalRed = 0;
       int totalGreen = 0;
       int totalBlue = 0;
       int blurrMask = 3;
        
        for (int i = 0; i < blurrMask; i++) {
           for(int j = 0; j < blurrMask; j++)
           {
           
           totalRed += redTemp[i][j];
           totalGreen += greenTemp[i][j];
           totalBlue += blueTemp[i][j];
          
           }
               }    
      
        double avgRed = (totalRed/ 9.0);
        double avgGreen = (totalGreen /9.0);
        double avgblue = (totalBlue / 9.0);
        
        for (int i = x-1; i <= x+1; i++) {
           for(int j = y-1; j < y+1; j++)
           {
               redNew[i][j] = totalRed;
               greenNew[i][j] = totalGreen;
               blueNew[i][j] = totalBlue;
               


              }
       
           }          

    
  
     }

    }
    
    inputFile.close();
    outputFile.close();
   }
      
 }   