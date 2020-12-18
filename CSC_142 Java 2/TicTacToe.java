/*
   Name:                Anthony Berrios
   Date:                10/18/18
   Title:               tictactoe.java
   Description:         A program to simulate the playing of the tictactoe game
   Input:               In my example, nothing. But you will eventually have
                        the users enter in the locations where they'd like 
                        their X's and O's
   Output:              the board
   
 */

import java.util.Scanner;
 
public class TicTacToe {
    
    public static void main (String[] args) {
    	final int DIM = 3;
    
        char[][] tictac = { {'X', 'X', 'O'},
                            {' ', 'O', ' '}, 
                            {'X', 'O', 'X'}   };
                             
        display(tictac, DIM);
    
    } // ends the main

    public static void display(char[][] a, int d) {
        
        int i,j; //indices into the 2-D array
        
        for (i = 0; i < d ; ++i)  {
            for (j = 0; j < d; j++) {
              // System.out.print(a[i][j]);
               if (j == 2)
               System.out.print(a[i][j]);
               else if ( j < 2)
               System.out.print(a[i][j] + " | ");
               
            }  // ends inner for loop
            System.out.println();
            
            if ( i < 2)
            System.out.println("- + - + - ");

        } //ends outer for loop 
        
    } // ends the print function
} // ends the class