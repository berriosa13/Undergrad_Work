import javax.swing.JOptionPane;

import java.util.Scanner;

public class KillDeathRatio
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      
      System.out.println("Enter amount of kills");
      
      int kills = kb.nextInt();
   
      System.out.println("Enter amount of deaths");
      
      int deaths = kb.nextInt();
      
      System.out.println("Your k/d ratio is " + (int)(kills)/(int)(deaths));
   
      
      
      
      
      
      
      
   
   }
   
}