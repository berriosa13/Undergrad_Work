import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
   The MetricConverter class lets the user unter a distance
   in kilometers. Radio buttons can be selected to convert
   the kilometers to miles, feet, or inches.
**/

public class MetricConverter extends JFrame
{
   private JPanel panel; // A holding panel
   private JLabel messageLabel;  // message to the user
   private JTextField kiloTextField; // holds user input
   private JRadioButton milesButton; // to convert to miles
   private JRadioButton feetButton; // to convert to feet
   private JRadioButton inchesButton; // to conver to inches
   private ButtonGroup radioButtonGroup; // to group radio buttons
   private final int WINDOW_WIDTH = 400; // window width
   private final int WINDOW_HEIGHT = 100; // window height
   
   /**
   Constructor
   **/
   
   public MetricConverter()
   {
      // set the title
      setTitle("Metric Converter");
      
      // set the size of the window
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      
      // specify an action for the close button
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // build a panel and add it to the content pane
      buildPanel();
      
      // Add the panel to the frame's content pane.
      add(panel);
      
      // display the window
      setVisible(true);
    }
    
    /**
    The buildPanel method adds a label
    ,text field, and three buttons to a panel.
    **/
    
    private void buildPanel()
    {
      // create the label, text field, and radio buttons
      messageLabel = new JLabel("Enter a distance in kilometers");
      kiloTextField = new JTextField(10);
      milesButton = new JRadioButton("Convert to miles");
      feetButton = new JRadioButton("Convert to feet");
      inchesButton = new JRadioButton("Conver to inches");
      
      // group the radio buttons
      radioButtonGroup = new ButtonGroup();
      radioButtonGroup.add(milesButton);
      radioButtonGroup.add(feetButton);
      radioButtonGroup.add(inchesButton);
      
      // add action listeners to the radio buttons
      milesButton.addActionListener(new RadioButtonListener());
      feetButton.addActionListener(new RadioButtonListener());
      inchesButton.addActionListener(new RadioButtonListener());
      
      // create a panel and add the components to it 
      panel = new JPanel();
      panel.add(messageLabel);
      panel.add(kiloTextField);
      panel.add(milesButton);
      panel.add(feetButton);
      panel.add(inchesButton);
     }
     
     /**
     Private inner class that handles the event
     when the user clicks on of the radio buttons
     **/
     
     private class RadioButtonListener implements ActionListener
     {
      public void actionPerformed(ActionEvent e)
      {
         String input;
         String convertTo = "";
         double result = 0.0;
         
         // get the kilometers enetered
         input = kiloTextField.getText();
         
         // determine which radio buttons wad clicked
         if(e.getSource() == milesButton)
         {
            //convert to miles
            convertTo = " miles. ";
            result = Double.parseDouble(input) * 0.6214;
         }
         
         else if(e.getSource() == feetButton)
         {
            //convert to feet
            convertTo = " feet. ";
            result = Double.parseDouble(input) * 3281.0;  
         }
         
         else if(e.getSource() == inchesButton)
         {
            //convert to inches
            convertTo = " inches. ";
            result = Double.parseDouble(input) * 39370.0;
         }
         
         // display the conversion
         JOptionPane.showMessageDialog(null,input+" kilometers is "+result +convertTo);
         
        }
      }
      /**
      The main method creates an instance of the MetricConverter
      and displays its window.         
      **/   
      
      public static void main(String[] args)
      {
         new MetricConverter();
      }
   }       
      