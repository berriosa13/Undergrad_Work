import javax.swing.JOptionPane; //Needed for boxes

public class MilesToFeetDialog
{
   public static void main (String[] args)
   {
      // instructions
      JOptionPane.showMessageDialog(null,"Enter miles, convert to feet");
      
      // Create the prompt
      final String prompt = "Enter mileage: ";
      
      // Get mileage
      // First get the mileage as a String
      String milesStr = JOptionPane.showInputDialog(prompt);
      
      // second, convert the mileage as a String to a double
      double miles = Double.parseDouble(milesStr);
      
      // Compute the number of feet
      int feet = (int)((5280.0 * miles) + 0.5);
      
      // Output the number of feet
      JOptionPane.showMessageDialog(null,miles + " miles equals "
       + feet + " feet.");
      
      //clean up threads
      System.exit(0);
   
      
      
   
   
   }

}