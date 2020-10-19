/*
Name:        Anthony Berrios
Date:        9/25/18
Title:       DieGame2.java
Description: Program runs a simple game to 
             play die between the computer
             and the user.
             
*/

import java.util.Scanner;
public class DieGame2 {

public static void main(String[] args) {

int points = 10;
int wager;
int guesses;

Die die = new Die(6);

Scanner kb = new Scanner(System.in);

while( points > 0)
{
   System.out.print("Place wager between 1-3 points: ");
   wager = kb.nextInt();
   
   while(wager > 3 || wager < 1)
   {
      System.out.println("Please enter a valid wager: ");
      wager = kb.nextInt();
   }
   
   System.out.print("Guess: ");
   guesses = kb.nextInt();
   
   if (guesses == die.getValue()) 
   {
        if (wager ==1)   
        {
            points+=2;
        }
        
        else if(wager ==2)
        {
            points+=6;
        }
    
        else
        {
            points+=12;
        }
    
    }  
    
      else
      {
         points-=wager;
      } 
      
     }           
   

   }

}   