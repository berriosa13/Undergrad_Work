/**
name:          Anthony Berrios
Student ID:    905436     
Professor:     Lui Cui
**/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class JavaCalculator extends JFrame {

   private JButton Num1;
   private JButton Num2;
   private JButton Num3;
   private JButton Num4;
   private JButton Num5;
   private JButton Num6;
   private JButton Num7;
   private JButton Num8;
   private JButton Num9;
   private JButton Num0;
   private JButton decimal;
   private JButton Equal;
   private JButton add;
   private JButton sub;
   private JButton mult;
   private JButton divide;
   private JButton solve;
   private double Number1;
   private double Number2;
   private int c;
   private JTextField jtfResult;
   String display = "";

   public JavaCalculator() {
   
   setTitle("Java Calculator");
   
   JPanel panel1 = new JPanel();
      panel1.setLayout(new FlowLayout());
      panel1.add(jtfResult = new JTextField(15));
      jtfResult.setHorizontalAlignment(JTextField.CENTER);
      jtfResult.setEditable(true);
   
      JPanel panel2 = new JPanel();
      panel2.setLayout(new GridLayout(4, 4));
      panel2.add(Num7 = new JButton("7"));
      panel2.add(Num8 = new JButton("8"));
      panel2.add(Num9 = new JButton("9"));
      panel2.add(mult = new JButton("*"));
      panel2.add(Num4 = new JButton("4"));
      panel2.add(Num5 = new JButton("5"));
      panel2.add(Num6 = new JButton("6"));
      panel2.add(sub = new JButton("-"));
      panel2.add(Num1 = new JButton("1"));
      panel2.add(Num2 = new JButton("2"));
      panel2.add(Num3 = new JButton("3"));
      panel2.add(add = new JButton("+"));
      panel2.add(Num0 = new JButton("0"));
      panel2.add(decimal = new JButton("."));
      panel2.add(solve = new JButton("="));  
      panel2.add(divide = new JButton("/"));  
      
      
      JPanel panel3 = new JPanel();
      panel3.setLayout(new GridLayout(4,4));
      panel3.add(panel1,BorderLayout.NORTH);
      panel3.add(panel2, BorderLayout.SOUTH);
   
      add(panel3);
   
      Num1.addActionListener(new ListenToOne());
      Num2.addActionListener(new ListenToTwo());
      Num3.addActionListener(new ListenToThree());
      Num4.addActionListener(new ListenToFour());
      Num5.addActionListener(new ListenToFive());
      Num6.addActionListener(new ListenToSix());
      Num7.addActionListener(new ListenToSeven());
      Num8.addActionListener(new ListenToEight());
      Num9.addActionListener(new ListenToNine());
      Num0.addActionListener(new ListenToZero());
      decimal.addActionListener(new ListenToDecimal());
   
      add.addActionListener(new ListenToAdd());
      sub.addActionListener(new ListenTosub());
      mult.addActionListener(new ListenTomultiply());
      divide.addActionListener(new ListenToDivide());
      solve.addActionListener(new ListenToSolve());
   
   
   
   } 

   private class ListenToOne implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display = jtfResult.getText();
         jtfResult.setText(display + "1");
      }
   }
   
   private class ListenToTwo implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display = jtfResult.getText();
         jtfResult.setText(display + "2");
      }
   }
   
   private class ListenToThree implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display = jtfResult.getText();
         jtfResult.setText(display + "3");
      }
   }
   
   private class ListenToFour implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display = jtfResult.getText();
         jtfResult.setText(display + "4");
      }
   }
   
   private class ListenToFive implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display = jtfResult.getText();
         jtfResult.setText(display + "5");
      }
   }
   
   private class ListenToSix implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display = jtfResult.getText();
         jtfResult.setText(display + "6");
      }
   }
   
   private class ListenToSeven implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display = jtfResult.getText();
         jtfResult.setText(display + "7");
      }
   }
   
   private class ListenToEight implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display = jtfResult.getText();
         jtfResult.setText(display + "8");
      }
   }
   
   private class ListenToNine implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display = jtfResult.getText();
         jtfResult.setText(display + "9");
      }
   }
   
   private class ListenToZero implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display = jtfResult.getText();
         jtfResult.setText(display + "0");
      }
   }

   private class ListenToAdd implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         Number1 = Double.parseDouble(jtfResult.getText());
         jtfResult.setText("");
         c =1;     
      }
   }
   
   private class ListenTosub implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         Number1 = Double.parseDouble(jtfResult.getText());
         jtfResult.setText("");
         c=2;
      }
   }
   
   private class ListenTomultiply implements ActionListener 
   {
      public void actionPerformed(ActionEvent e) 
      {
         Number1 = Double.parseDouble(jtfResult.getText());
         jtfResult.setText("");
         c=3;
      }
   }
   
   private class ListenToDivide implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         Number1 = Double.parseDouble(jtfResult.getText());
         jtfResult.setText("");
         c=4;
      }
   }
   
   private class ListenToSolve implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         Number2 = Double.parseDouble(jtfResult.getText());
         double i=0.0;
         if(c==1){
            i = Number1+Number2;
            jtfResult.setText(Double.toString(i));}
           
         else if(c==2){
            i = Number1-Number2;
            jtfResult.setText(Double.toString(i));}
         
         else if(c==4){
            i = Number1/Number2;
            jtfResult.setText(Double.toString(i));}
            
         else if(c==3){
            i = Number1*Number2;
            jtfResult.setText(Double.toString(i));}
        }
     }       
            
     class ListenToDecimal implements ActionListener
     {
         public void actionPerformed( ActionEvent e)
         {
            display = jtfResult.getText();
            jtfResult.setText(display + ".");
         }
         
     }        
                              
   public static void main(String[] args) {
      JavaCalculator calc = new JavaCalculator();
      calc.pack();
      calc.setLocationRelativeTo(null);
      calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      calc.setVisible(true);
   }

}
