/* 
Name:        Anthony Berrios
Date:        9/6/18
Title:       OddFives.java
Description: Asks the user to enter numbers and only produces the sum
             of numbers that are odd and have a five in them.
Input:       Integers
Output:      Sum of odd numbers with five's in them.
*/
import java.util.Scanner;
public class OddFives {
   public static void main(String[] args) { 
      int number;
      final int SENTINEL = -1;
    
      Scanner kb = new Scanner(System.in);
    
    // Read first input
      System.out.print("Enter a postive integer"
         + " or -1 to exit: "); 
      number = kb.nextInt();
      
      int sum = 0;
    
      if(isOdd(number) && hasFive(number)){
         sum = sum + number;
      }   
   
      while (number != SENTINEL) { // read until input is -1 
      
      // read next input
         System.out.print("Enter a postive integer or -1 to exit: ");
         number = kb.nextInt();
         
         if(isOdd(number) && hasFive(number)){ // number must be
            sum = sum + number;       // odd & contain a (5) to be added
         
         }
      }
         
     
      System.out.println("The magic sum is: " + sum); 
    
   }
   
   public static boolean isOdd (int number) {
     
      if ( number % 2 == 1 ) { 
         return true;
      }
      else
         return false;
   
   } 
 
   public static boolean hasFive (int number) {
      String word = "" + number;
      boolean t =false;
      for( int i = 0; i < word.length(); i++) {
         if( word.charAt(i) == ('5')) {
            t = true;
         }
      }    
      return t;    
   }   

      

}