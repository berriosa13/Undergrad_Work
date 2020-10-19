import javax.swing.JOptionPane;

import java.util.Scanner;

public class KillDeathRatio
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
   
      JOptionPane.showInputDialog("Enter amount of kills");
      
      int kills = kb.nextInt();
      
      JOptionPane.showInputDialog("Enter amount of deaths");
      
      int deaths = kb.nextInt();
      
      JOptionPane.showMessageDialog(null, "Your'e k/d ratio is" + (kills/deaths));
      
      
      
      
      
      
   
   }
   
}