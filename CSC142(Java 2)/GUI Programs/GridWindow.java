import javax.swing.*; // needed for swing
import java.awt.*; // needed for Grid Layout

/**
This class demonstrates the GridLayout manager
**/

public class GridWindow extends JFrame
{
   private final int WINDOW_WIDTH = 1000;
   private final int WINDOW_HEIGHT = 1000;
   
   /**
   Constructor 
   **/
   
   public GridWindow()
   {
      // set the title bar text
      setTitle("Grid Layout");
      
      // speficy an action for the close button
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //add the GridLayout manager to the content pane
      setLayout(new GridLayout(2,3));
      
      // create six buttons
      JButton button1 = new JButton("Button 1");
      JButton button2 = new JButton("Button 2");
      JButton button3 = new JButton("Button 3");
      JButton button4 = new JButton("Button 4");
      JButton button5 = new JButton("Button 5");
      JButton button6 = new JButton("Button 6");
      
      // add the six buttons to the content pane
      add(button1); // goes into row 1, column 1
      add(button2); // goes into row 1, column 2
      add(button3); // goes into row 1, column 3
      add(button4); // goes into row 2, column 1
      add(button5); // goes into row 2, column 2
      add(button6); // goes into row 2, column 3
      
      // display the window
      setVisible(true);
    }
    
    /**
    The main method creates an instance window class,
    casuing it to display its window
    **/
    
    public static void main(String[] args)
    {
      new GridWindow();
    }
    
}      
        
      