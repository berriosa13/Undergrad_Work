/*
Name: Anthony Berrios
Date: 8/30/18
Title: GuessNum.java
Description: This progam will generate a random
             integer that the user will try to correctly guess. 
Input: integer guess made by the user 
Output: whether the user guessed correctly
*/

import java.util.Scanner; 
import java.util.Random;            
public class GuessNum { 
   public static void main( String[] args) {
      
      final int HIGH_LIMIT = 5;
      Scanner kb = new Scanner(System.in);
      Random numGenerator = new Random(); 
      int randomNum = numGenerator.nextInt(HIGH_LIMIT) +1; // 1-5 (goes from 0-4 so add 1)
      //System.out.println(randomNum);
      
      System.out.print("Enter a number to guess:");
      int input = kb.nextInt();
      
      if (input == randomNum) // correct
         System.out.println("You got it!");
      else if (input < 1 || input > HIGH_LIMIT) // outside range
         System.out.println("Number entered not in the 1-" + HIGH_LIMIT +
         " range."); 
      else  // guess is incorrect
         System.out.println("Wrong guess."); 
      
    
       

   }

}