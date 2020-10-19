import javax.swing.*;  // Needed for Swing classes
import java.awt.*; // Needed for Color classes
import java.awt.event.*; // Needed for event listener interface

/**
   This class demonstatres how to set the background color of a panel and the foreground color of a label.
**/

public class ColorWindow extends JFrame
{
   private JLabel messageLabel;  // Displays a message
   private JButton redButton;  // Changes color to red
   private JButton blueButton;  // Changes color to blue
   private JButton yellowButton;  // Changes color to yellow
   private JPanel panel;  // Panel holds components  
   private final int WINDOW_WIDTH = 200; // Window width
   private final int WINDOW_HEIGHT = 125;  // Window height
   
   /**
      Constructor
   **/
   
   public ColorWindow()
   {
      // set the title bar text
      setTitle("Colors");
      
      // set the size of the window
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      
      // specify an action for the close button
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // create a label
      messageLabel = new JLabel("Click a button to select a color");
      
      // create the three buttons
      redButton = new JButton("Red");
      blueButton = new JButton("Blue");
      yellowButton = new JButton("Yellow");
      
      // Register an event listener with all three buttons
      redButton.addActionListener(new RedButtonListener());
      blueButton.addActionListener(new BlueButtonListener());
      yellowButton.addActionListener(new YellowButtonListener());
      
      // create a panel and add the components to it
      panel = new JPanel();
      panel.add(messageLabel);
      panel.add(redButton);
      panel.add(blueButton);
      panel.add(yellowButton);
      
      // add the panel to the content pane
      add(panel);
      
      // set the display window
      setVisible(true);
   }
   
   /**
      private inner class that handles the event when the user clicks the Red button
   **/
      
    private class RedButtonListener implements ActionListener   
    {
      public void actionPerformed(ActionEvent e)
      {
         // set the panel's background to red
         panel.setBackground(Color.RED);
         
         // set the label's text to blue
         messageLabel.setForeground(Color.BLUE);
      }
    }
    
      private class BlueButtonListener implements ActionListener   
    {
      public void actionPerformed(ActionEvent e)
      {
         // set the panel's background to red
         panel.setBackground(Color.BLUE);
         
         // set the label's text to blue
         messageLabel.setForeground(Color.YELLOW);
      }
    }
    
      private class YellowButtonListener implements ActionListener   
    {
      public void actionPerformed(ActionEvent e)
      {
         // set the panel's background to red
         panel.setBackground(Color.YELLOW);
         
         // set the label's text to blue
         messageLabel.setForeground(Color.BLACK);
      }
    }
    
    /**
         MAIN METHOD
    **/
    
    public static void main(String[] args)
    {
      new ColorWindow();
    }       
    
}          
      
      
      
      