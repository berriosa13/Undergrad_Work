import java.util.*;
public class GuessNumber
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      Random rand = new Random();
      double guessNumber;
      double randNumber = rand.nextInt(10)+1;
      int count = 0;
     
      //System.out.println("Guess the correct number [0..10]:");
      //guess = kb.nextInt();
      boolean Flag = false;
      
      while (!Flag)
      {
         System.out.println("Guess the correct number [0..10]:");
         guessNumber = kb.nextDouble();
         
         if (guessNumber == randNumber)
         {
            Flag = true;
            System.out.println("Congrats you have guessed correctly!");
         }
         
         else if( guessNumber < randNumber)
         { 
            System.out.println("Too Low");
         }
         else
         {
           System.out.println("Too High");
           count++;
         }  
            
               
         
         
         
         
      }   
      
    
      
   
   
   
   }
   
}   
