import javax.swing.*;

// This class extend the JFrame class. Its consstructor displays a simple window 
// with a title.  The application exits when the user clicks the close button.

public class SimpleWindow extends JFrame
{

   // constructor
   public SimpleWindow()
   {
      final int WINDOW_WIDTH = 350; // width in pixels
      final int WINDOW_HEIGHT = 250; // height in pixels
      
      //set window's title
      setTitle("A Simple Window.");
      
      //set window's size
      setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
      
      //  specify when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // display the window
      setVisible(true);
      
    } 
   
   // The main mehtod creates an instance of the simpleWindow class, which displays its window. 
   public static void main(String[] args)
   {
      SimpleWindow myWindow = new SimpleWindow();
   }
}     
}      
