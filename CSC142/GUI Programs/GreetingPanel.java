import javax.swing.*;

//the greetingPanel class displays a greeting in a panel

public class GreetingPanel extends JPanel
{
   private JLabel greeting; //to display a greating
   
   //constructor
   public GreetingPanel()
   {
      //create the label
      greeting = new JLabel("Welcome to Brandi's Bagel House");
      
      //add the label to this panel
      add(greeting);
   }
}


