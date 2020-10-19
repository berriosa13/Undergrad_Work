import javax.swing.*;
import java.awt.event.*;

// The kiloConverter class displays a JFrame that allows
// the user to enter a distance in kiloemters.
// when the calculate button is clicked, a dilaog box is displayes
// with the distance converted to miles.

public class kiloConverter extends JFrame
{
   private JPanel panel; // reference a panel
   private JLabel messageLabel; // reference a label
   private JTextField kiloTextField; // reference a text field
   private JButton calcButton;  // reference a button
   private final int WINDOW_WIDTH = 310; // window width
   private final int WINDOW_HEIGHT = 100; //window height
   
   // constructor
   public kiloConverter()
   {
      // set the window title
      setTitle("Kilometer Converter");
      
      // set the size of the window
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      
      // specify what happens when the close button is clicked
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // build the panel and add it to frame
      buildPanel();
      
      // add the panel to the frame's content pane
      add(panel);
      
      // display the window
      setVisible(true);
   }  
   
   // The buildPanel method adds a label, a text field, and a button to a panel.
   private void buildPanel()
   {
      // create a label to display instructions
      messageLabel = new JLabel("Enter a distance in kilometers");
      
      // create a text field that's 10 characters wide.
      kiloTextField = new JTextField(10);
      
      // create a button with the caption "Calculate"
      calcButton = new JButton("Calculate");
      
      // add an event listener to the button
      calcButton.addActionListener(new CalcButtonListener());
      
      // create a JPanel object
      panel = new JPanel();
      
      // add the label, text field, and button components to the panel
      panel.add(messageLabel);
      panel.add(kiloTextField);
      panel.add(calcButton);
    }
    
    /** 
         CalcButtonListener is an action listener class for the Calculate button.
    **/     
    
    private class CalcButtonListener implements ActionListener
    {
         public void actionPerformed(ActionEvent e)
         {
            final double CONVERSION = 0.6214;
            String input; // holds user input
            double miles; // number of miles
            
            // get the text entered by the user into the text field
            input = kiloTextField.getText();
            
            //Convert the input to miles
            miles  = Double.parseDouble(input)*CONVERSION;
            
            // display the result
            JOptionPane.showMessageDialog(null,input +" kilometer is "+miles+" miles.");
            
         
         }
    }  
    
    // main method
    public static void main(String[] args)
    {
      new kiloConverter();
    
    }   
      
      
   
   
}