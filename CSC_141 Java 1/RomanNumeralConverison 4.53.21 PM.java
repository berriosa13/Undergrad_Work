//**********************************************************************//
//         NAME: Anthony Berrios                                        //
//        CLASS: CSC-141-99                                             //
//   ASSIGNMENT: Assignment 2                                           //
//     FILENAME: RomanNumeralConversion.java                            //
//         DATE: April 3, 2018                                          //
//   DECRIPTION: This program asks a user to input an integer [1-20]    //
//               and ouputs it as a Roman numeral                       //
//**********************************************************************//                 

import java.util.Scanner;

public class RomanNumeralConverison
{
   public static void main(String[] args)
   {
      // Create Scanner object
      Scanner kb = new Scanner(System.in);
      
      // Tell user what program does and to enter a number
      System.out.printf("Enter an integer in arabic numerals [1..20]" 
      + " and get it converted to Roman numerals %n" + 
      "Enter [1..20]: ");
         
      // Storing user's inputted number
      int number = kb.nextInt();
      
      // Create String for switch statment
      String numberString;
      
      // Create 20 cases for Roman numerals 1-20
      switch (number)
      {
         case 1: numberString = "The number 1 in Roman numerals is I";
            break;
                 
         case 2: numberString = " The number 2 in Roman numerals is II";
            break;    
                 
         case 3: numberString = "The number 3 in Roman numerals is III";
            break;
                 
         case 4: numberString = "The number 4 in Roman numerals is IV";
            break;
                 
         case 5: numberString = "The number 5 in Roman numerals is V";
            break;
                 
         case 6: numberString = "The number 6 in Roman numerals is VI";
            break;
                 
         case 7: numberString = "The number 7 in Roman numerals is VII";
            break; 
                 
         case 8: numberString = "The number 8 in Roman numerals is VIII";
            break;
         
         case 9: numberString = "The number 9 in Roman numerals is IX";
            break;
         
         case 10: numberString = "The number 10 in Roman numerals is X";
            break;
         
         case 11: numberString = "The number 11 in Roman numerals is XI";
            break;
         
         case 12: numberString = "The number 12 in Roman numerals is XII";
            break;
         
         case 13: numberString = "The number 13 in Roman numerals is XIII";
            break;
         
         case 14: numberString = "The number 14 in Roman numerals is XIV";                                                                                           
            break;
                  
         case 15: numberString = "The number 15 in Roman numerals is XV";
            break;
                  
         case 16: numberString = "The number 16 in Roman numerals is XVI";
            break;
                  
         case 17: numberString = "The number 17 in Roman numerals is XVII";
            break; 
                  
         case 18: numberString = "The number 18 in Roman numerals is XVIII";
            break;
                  
         case 19: numberString = "The number 19 in Roman numerals is XIX";         
            break;
                  
         case 20: numberString = "The number 20 in Roman numerals is XX";
            break;
                  
         default: numberString = "Invalid number inputted";          
            break;
                  
      }
         // Display the users number as a Roman numeral
         System.out.printf(numberString);                                            
      
   }

}