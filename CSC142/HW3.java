/*
Anthony Berrios
CSC-142-01
Professor Lui Cui 
HW3
*/

import java.util.*;
import java.text.DecimalFormat;

public class HW3 
{
   public static void main(String[] args) 
   {
       Scanner kb = new Scanner(System.in);
       DecimalFormat df = new DecimalFormat(".00");
       
       // gets number of people in party
       System.out.println("How many people are in your party?");
       int totalPeople = kb.nextInt();
       
       // create array
       double dinnerAmount[] = new double[totalPeople];
       
       for( int i = 0; i < dinnerAmount.length; i++)
       {
        
         System.out.println("Type [1-13] for the following selections:\n" + "Soups and Salads:\n\t[1]Cream of Tomato ------$5.00\n\t[2]Chicken Tortilla ---------$6.50\n\t[3]Seafood Bisque ---------$9.50\n\t[4]Ahi Tuna ------------------$10.50\n\t[5]House ---------------------$6.00\n\t[6]Caesar ---------------------$8.00\nFinger Foods:\n\t[7]Soft Pretzel Sticks -------$5.00\n\t[8]Spicy Tuna Egg Rolls ----$7.50\n\t[9]Guacamole ----------------$5.00\nBurgers:\n\t[10]Main Street ----------------$12.00\n\t[11]Southwest ------------------$14.00\n\t[12]Sunny ------------------------$11.00\n\t[13]Steakhouse -----------------$18.00\n");
         System.out.print("Person number " +(i+1)+" please select a dinner selection: ");
         
         // loops until final dinner order is made
       do
       {
         int dinnerChoice = kb.nextInt();
         // compares dinner selections[1-13]
         if (dinnerChoice == 1||dinnerChoice == 7||dinnerChoice == 9)
               dinnerAmount[i] += 5.00;
               
            else if (dinnerChoice == 2)
               dinnerAmount[i] += 6.50;
               
            else if(dinnerChoice == 3)
               dinnerAmount[i] += 9.50;
               
            else if (dinnerChoice == 4)
               dinnerAmount[i] += 10.50;
               
            else if (dinnerChoice == 5)
               dinnerAmount[i] += 6.00;
               
            else if (dinnerChoice == 6)
               dinnerAmount[i] += 8.00 ;
               
            else if (dinnerChoice == 8)
              dinnerAmount[i] += 7.50;
              
            else if (dinnerChoice == 10)
               dinnerAmount[i] += 12.00;
               
            else if (dinnerChoice == 11)
               dinnerAmount[i] += 14.00;
               
            else if (dinnerChoice == 12)
               dinnerAmount[i] += 11.00;
               
            else if (dinnerChoice == 13)
               dinnerAmount[i] += 18.00;
            else
               break;  
            
            // asks current person if they are finished ordering
            System.out.println("Would you like anything else? Type (0) to finish");  
            }
           
            while(true); 
            
            }
            
            // display price per person with tax
            for( int j = 0; j < dinnerAmount.length; j++)
            {
               System.out.print("Total price for person number "+(j+1)+" is $");
               double totalPlusTax = (dinnerAmount[j] * 1.06);
               System.out.println(df.format(totalPlusTax));
            
            
            }
            
            // Departing statement
            System.out.println();
            System.out.println("Please come again!");    
       
   }  
   
}       
