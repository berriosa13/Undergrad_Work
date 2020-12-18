import javax.swing.*;  // Needed for Swing classes
import java.awt.event.*;  // Needed for event listener interface

/**
This class demonstrates how to retrieve the action command from an event object
**/

public class EventObject extends JFrame
{
   private JButton button1;
   private JButton button2;
   private JButton button3;
   private JPanel panel;
   private final int WINDOW_WIDTH = 300;
   private final int WINDOW_HEIGHT = 100;
   
   /** 
      Constructor
   **/
   
   public EventObject()
   {
      // set the Title bar text
      setTitle("Event Object Demonstration");
      
      // set the size of the window
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      
      //specify what the close button does when clicked
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // create the three buttons
      button1 = new JButton("Button 1");
      button2 = new JButton("Button 2");
      button3 = new JButton("Button 3");
      
      // Register an event listener with all 3 buttons
      button1.addActionListener(new ButtonListener());
      button2.addActionListener(new ButtonListener());
      button3.addActionListener(new ButtonListener());
      // create a panel and add the buttons to the panel 
      panel = new JPanel();
      panel.add(button1);
      panel.add(button2);
      panel.add(button3);
      
      // Add the panel to the content pane
      add(panel);
      
      // display the window
      setVisible(true);
    }
    
    /**
         private inner class that handles the event when the user clicks a button
    **/
    
    private class ButtonListener implements ActionListener
    {
      public void actionPerformed(ActionEvent e)
      {
         if(e.getSource() == button1)
         {
            JOptionPane.showMessageDialog(null,"You clicked the first button.");
         }
         else if(e.getSource() == button2)
         {
             JOptionPane.showMessageDialog(null,"You clicked the second button."); 
         }
         else if(e.getSource() == button3)
         {
            JOptionPane.showMessageDialog(null,"You clicked the third button.");
         }  
      /*   
         // Get the action command
         String actionCommand = e.getActionCommand();
         // Determine which button was clicked and display a message.
         if(actionCommand.equals("Button1"))
         {
            JOptionPane.showMessageDialog(null,"You clicked the first button.");
         }
         else if(actionCommand.equals("Button 2"))
         {
            JOptionPane.showMessageDialog(null,"You clicked the second button.");
         }
         else if(actionCommand.equals("Button3"))
         {
            JOptionPane.showMessageDialog(null,"You clicked the third button.");
         }
       */  
      }
    }
    
    /**
         main method  
    **/ 
    public static void main(String[] args)
   {
      new EventObject();
   }
}                
            
                   