import javax.swing.*;

// this program displays a single window with a title
// the application exits when the user clicks the close button

public class showWindow
{
   public static void main(String[] args)
   {
      final int WINDOW_WIDTH = 350;  // Window width in pixels
      final int WINDOW_HEIGHT =  250; // Window height in pixels
      
      // create a window
      JFrame window = new JFrame();
      
      // set the title
      window.setTitle("A single Window.");
      
      // set the size of the window
      window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
      
      // Specify what happens when the closed button is clicked
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // display the window
      window.setVisible(true);
   
   }
   
}   
   