/*
Name:
Date: 
Title: EdgeDetection.java
Description: A program that uses image processing techniques to perform 
             edge detection, which results in the edges of the image 
             becoming highlighted and the colors are reduced to 
             black and white.
*/

import java.io.*;
import java.util.Scanner;

public class EdgeDetection {
  public static void main(String[] args) throws IOException {
    
    final int LUMINANCE = 15;  // threshold paramenter used in 
                               // edge detection algorithm (line 80)

    // open file for reading
    File f = new File("STOP_sign.ppm");
    Scanner inputFile = new Scanner(f);

    // open file for writing
    PrintWriter outputFile = new PrintWriter("edgeSTOP.pbm");

    // read and echo first line
    String line = inputFile.nextLine();  // should be "P3"
    System.out.println("P1");
    outputFile.println("P1");

    // read and echo dimensions
    final int WIDTH = inputFile.nextInt();
    final int HEIGHT = inputFile.nextInt();
    System.out.print(WIDTH + " " + HEIGHT);
    outputFile.print(WIDTH + " " + HEIGHT);

    // read and echo lingering <enter> newline character
    inputFile.nextLine();
    System.out.println();
    outputFile.println();    

    // read and echo third line
    line = inputFile.nextLine();
    System.out.println(line);
    outputFile.println(line);

    // read and echo 5 lines of comments
    // lines 4-8
    for (int i = 1; i <= 5; i++) {
      line = inputFile.nextLine();
      System.out.println(line);
      outputFile.println(line);
    }

    // read image data into three arrays
    int[][] red = new int[WIDTH][HEIGHT];
    int[][] green = new int[WIDTH][HEIGHT];
    int[][] blue = new int[WIDTH][HEIGHT];
    for (int j = 0; j < HEIGHT; j++) {
      for (int i = 0; i < WIDTH; i++) {
        red[i][j] = inputFile.nextInt();
        green[i][j] = inputFile.nextInt();
        blue[i][j] = inputFile.nextInt();
      }
    }

    // create three additional empty arrays
    // that we'll use to store the new image data
    int[][] redNew = new int [WIDTH][HEIGHT];
    int[][] greenNew = new int [WIDTH][HEIGHT];
    int[][] blueNew = new int [WIDTH][HEIGHT];

    // edge detection algorithm
    for (int j = 0; j < HEIGHT; j++) {       
      for (int i = 0; i < WIDTH; i++) {
        // if a border pixel, simply print black
        if (i == 0 || i == WIDTH-1 || j == 0 || j == HEIGHT-1) {
          System.out.print("1 ");  // print a black pixel
          outputFile.print("1 ");           
        }
        else {  // an "inner" pixel
          double avg = (red[i][j] + green[i][j] + blue[i][j]) / 3.0;
          double avgLeft = (red[i-1][j] + green[i-1][j] + blue[i-1][j]) / 3.0;
          double avgBottom = (red[i][j+1] + green[i][j+1] + blue[i][j+1]) / 3.0;
          if (Math.abs(avg - avgLeft) > LUMINANCE || Math.abs(avg - avgBottom) > LUMINANCE) {
            System.out.print("1 ");  // print a black pixel
            outputFile.print("1 ");   
          } else {
            System.out.print("0 ");  // print a white pixel
            outputFile.print("0 ");           
          }
        }
      }

      // print newline characters
      System.out.println();
      outputFile.println();
    }

    // close files
    inputFile.close();
    outputFile.close();

  }
}
