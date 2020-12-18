/*

Name: Anthony Berrios
Date: 25 October 2018
Title: TicTacToe2Player.java

*/

import java.util.Scanner;
public class TicTacToe2Player 
{
   public static void main(String[] args)
   {
      char[][] tictac = { { ' ' , ' ' , ' '},
                          { ' ' , ' ' , ' '},
                          { ' ' , ' ' , ' '}  };
                          
   Scanner kb = new Scanner(System.in);
   System.out.println("Welcome to Tic-Tac-Toe");
   System.out.println();
   TicTacToe.display(tictac, 3);
   System.out.println();
   
    while(true)
      {
         System.out.print("Player 1: \t row: ");
         int r1 = kb.nextInt();
         System.out.print("          \t col: "); 
         int c1 = kb.nextInt();
         if (tictac[r1-1][c1-1] == ' ')
            tictac[r1-1][c1-1]='X';
         else   
            System.out.println("that spots taken, you lose a turn");
         
         TicTacToe.display(tictac, 3);
         if(winX(tictac)){
            System.out.println("Player 1 wins!"); 
            break;
             
         }

        
         System.out.print("Player 2: \t row: ");
         int r2 = kb.nextInt();
         System.out.print("          \t col: "); 
         int c2 = kb.nextInt();
         if (tictac[r2-1][c2-1] == ' ')
            tictac[r2-1][c2-1]='O';
         else  
            System.out.println("that spots taken, you lose a turn");
           
         TicTacToe.display(tictac, 3);  
         
        if(winO(tictac)) {
            System.out.println("Player 2 wins!");
            break;
        }  
      
     }
     
     }
    public static boolean winX(char[][] tictac){
         if(tictac[0][0] == 'X' && tictac[0][1] == 'X' && tictac[0][2] == 'X')
            return true;
         else if(tictac[1][0] == 'X' && tictac[1][1] == 'X' && tictac[1][2] == 'X')
            return true;
            else if(tictac[2][0] == 'X' && tictac[2][1] == 'X' && tictac[2][2] == 'X')
            return true;
           else if(tictac[0][0] == 'X' && tictac[1][0] == 'X' && tictac[2][0] == 'X')
            return true;
           else if(tictac[0][1] == 'X' && tictac[1][1] == 'X' && tictac[2][1] == 'X')
            return true;
           else if(tictac[0][2] == 'X' && tictac[1][2] == 'X' && tictac[2][2] == 'X')
            return true;
           else if(tictac[0][0] == 'X' && tictac[1][1] == 'X' && tictac[2][2] == 'X')
            return true;
            else if(tictac[2][0] == 'X' && tictac[1][1] == 'X' && tictac[0][2] == 'X')
            return true;
            
            return false;
         
    }
    public static boolean winO(char[][] tictac){
         if(tictac[0][0] == 'O' && tictac[0][1] == 'O' && tictac[0][2] == 'O')
            return true;
            else if(tictac[1][0] == 'O' && tictac[1][1] == 'O' && tictac[1][2] == 'O')
            return true;
            else if(tictac[2][0] == 'O' && tictac[2][1] == 'O' && tictac[2][2] == 'O')
            return true;
           else if(tictac[0][0] == 'O' && tictac[1][0] == 'O' && tictac[2][0] == 'O')
            return true;
           else if(tictac[0][1] == 'O' && tictac[1][1] == 'O' && tictac[2][1] == 'O')
            return true;
           else if(tictac[0][2] == 'O' && tictac[1][2] == 'O' && tictac[2][2] == 'O')
            return true;
           else if(tictac[0][0] == 'O' && tictac[1][1] == 'O' && tictac[2][2] == 'O')
            return true;
            else if(tictac[2][0] == 'O' && tictac[1][1] == 'O' && tictac[0][2] == 'O')
            return true;
            
            return false;
    }
                     
   
}
   
   
   
   
   
   
   