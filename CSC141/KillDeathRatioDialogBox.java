import javax.swing.JOptionPane;

import java.util.Scanner;

public class KillDeathRatioDialogBox
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      
      JOptionPane.showInputDialog("Enter amount of kills");
      
      int kills = kb.nextInt();
   
      JOptionPane.showInputDialog("Enter amount of deaths");
      
      int deaths = kb.nextInt();
      
      Integer.parseInt(kills);
      
      Integer.parseInt(deaths);
      
      JOptionPane.showMessageDialog(null,"Your k/d ratio is " + (int)(kills)/(int)(deaths));
      
      
      