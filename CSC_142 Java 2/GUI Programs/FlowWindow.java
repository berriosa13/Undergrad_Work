import javax.swing.*;
import java.awt.*;

/**
This class demonstrates how to use a FlowLayout manager with the content pace
*/
public class FlowWindow extends JFrame
{
   private final int WINDOW_WIDTH = 200;
   private final int WINDOW_HEIGHT = 150;
   
   /**
   Constructor
   */
   public FlowWindow()
   {
      // set the title bat text.
      setTitle("Flow Layout");
      
      // set size of the window
      setSize( WINDOW_WIDTH, WINDOW_HEIGHT);
      
      // specify an action for the close button
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
      // add a FlowLayout manager to the content pane.
      setLayout(new FlowLayout());
      
      // create three buttons
      JButton button1 = new JButton("Button 1");
      JButton button2 = new JButton("Button 2");
      JButton button3 = new JButton("Button 3");
      
      // add the three buttons to the content map
      add(button1);
      add(button2);
      add(button3);
      
      // display the window
      setVisible(true);
   }
   
   /**
   This main method creates an instance of the FlowWindow class
   causing it to display its window
   **/
   
   public static void main(String[] args)
   {
      new FlowWindow();
   }
   
}      