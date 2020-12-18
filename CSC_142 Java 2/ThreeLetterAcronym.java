/* 
Name:        Anthony Berrios
Date:        9/6/18
Title:       ThreeLetterAcronym.java
Description: Asks the user to enter three words and outputs a three
             letter acronym in uppercase letters.
Input:       String
Output:      Three letter acronym
*/

import java.util.Scanner;
public class ThreeLetterAcronym {
   public static void main(String[] args) { 
   
   Scanner kb = new Scanner(System.in);
   
   for (int i=1; i<=4; i++) {
   
   System.out.print("Enter three words: ");
   String threeWords = kb.nextLine();
   
   String[] words = threeWords.split(" ");
   
   System.out.println("The acronym is: " + words[0].charAt(0)+
   words[1].charAt(0) + words[2].charAt(0));
   
   System.out.println();
   
      }       
   
   }
   
}   
