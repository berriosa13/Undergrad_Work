import java.util.*;
import java.io.*;
public class diceGame
{
   public static void main(String[] args) throws IOException
   {
      FileWriter fw = new FileWriter("dies.txt", true);
      PrintWriter pw = new PrintWriter(fw);
      
      Scanner kb = new Scanner(System.in);
      Random rand = new Random();
      int computerWins = 0;
      int userWins = 0;
      int gameDuration = 10;
      
      for ( int i = 1; i <= gameDuration; i++)
      {
      double computerDie = rand.nextInt(5)+ 1;
      double userDie = rand.nextInt(5)+ 1;
      System.out.println("Die for Computer: " +computerDie+ "\n");
      System.out.println("Die for User: " +userDie+ "\n");
      
      if(computerDie == userDie)
      {
         System.out.println("No winner this roll"+"\n");
      }
      
      if(computerDie > userDie)
      {
         computerWins++;
         System.out.println("Winner : Computer"+"\n");
         
      }
      
      else if(userDie > computerDie)
      {
         userWins++;
         System.out.println("Winner : User"+"\n");
      }   
        
      }
      
      
     // FileWriter fw = new FileWriter("dies.txt", true);
      //PrintWriter pw = new PrintWriter(fw);
      
      System.out.println("Computer's Score: "+computerWins+"\n");
      System.out.println("User's Score: "+userWins+"\n");
      
      
      if(computerWins > userWins)
      {
         System.out.println("Computer is the grand winner!");
      }
      
      else
      {
         System.out.println("User is the grand winner!");          
      } 
      

      pw.println("User Wins: "+ userWins + "Computer Wins: " + computerWins);
      pw.close();
     
    
  }
  
}  
  
   
      
