/*
Name:        Anthony Berrios
Date:        9/25/18
Title:       DieGame1.java
Description: Program runs a simple game to 
             play die between the computer
             and the user.
             
*/

import java.util.Scanner;
public class DieGame1 {

public static void main(String[] args) {

int sides;
int userW = 0;
int compW = 0;

Scanner kb = new Scanner(System.in);

System.out.println("Please enter the number of sides: ");
sides = kb.nextInt();

Die die1 = new Die(sides);
Die die2 = new Die(sides);

for ( int i = 0; i < 10; i++)
{
   die1.roll();
   die2.roll();
   
if ( die1.getValue() > die2.getValue())
   userW++;
   
else
   compW++;   
  }
  
  if( userW > compW)
      System.out.println("User wins!");
  else    
      System.out.println("Computer wins!");
  }  

}
