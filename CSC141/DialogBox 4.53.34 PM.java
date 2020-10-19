import javax.swing.JOptionPane;

public class DialogBox
{
   public static void main(String[] args)
   {
      String name1 = JOptionPane.showInputDialog("What is your name user?");
      
      JOptionPane.showMessageDialog(null, "Your computer may be" 
      + " compromised by Russian hackers");
   
      System.exit(0);
   
   }
   
}   
  
