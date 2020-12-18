import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class IotaWindow extends JFrame
{
   private final int WINDOW_WIDTH = 400;
   private final int WINDOW_HEIGHT = 150;
   
   public IotaWindow()
   {
      setTitle("Select One Of The Following Iota Brothers");
      
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setLayout(new FlowLayout());
      
      JPanel justinPanel = new JPanel();
      JPanel zachPanel= new JPanel();
      JPanel christianPanel = new JPanel();   
      JPanel anthonyPanel = new JPanel();
      JPanel benPanel = new JPanel();
      JPanel patPanel = new JPanel();
      
      JButton button1 = new JButton("Justin Roper");
      JButton button2 = new JButton("Zach Wakefield");
      JButton button3 = new JButton("Christian Quirico");
      JButton button4 = new JButton("Anthony Berrios");
      JButton button5 = new JButton("Ben Thomas");
      JButton button6 = new JButton("Pat Davis");
      
      justinPanel.add(button1);
      zachPanel.add(button2);
      christianPanel.add(button3);
      anthonyPanel.add(button4);
      benPanel.add(button5);
      patPanel.add(button6);
      
      add(justinPanel);
      add(zachPanel);
      add(christianPanel);
      add(anthonyPanel);
      add(benPanel);
      add(patPanel);
      
      button1.addActionListener(new Button1Listener());
      button2.addActionListener(new Button2Listener());
      button3.addActionListener(new Button3Listener());
      button4.addActionListener(new Button4Listener());
      button5.addActionListener(new Button5Listener());
      button6.addActionListener(new Button6Listener());
      
      setVisible(true);
       
   }
   
   private class Button1Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         JOptionPane.showMessageDialog(null, "Roper's constantly out here for the"
         + " boys and boozes as much of the rest of us");
      
      }
      
   } 
   
     private class Button2Listener implements ActionListener
     {
         public void actionPerformed(ActionEvent e)
         {
            JOptionPane.showMessageDialog(null, "Wakefield is easily the craziest motherfucker"
            + " out of us all and is a rider");
      
         }
      
     } 
     
       private class Button3Listener implements ActionListener
       {
           public void actionPerformed(ActionEvent e)
           {
              JOptionPane.showMessageDialog(null, "Christian is a finesser regardless of his"
               +" recent pulling struggles this semester");
      
           }
      
       } 
       
       private class Button4Listener implements ActionListener
       {
         public void actionPerformed(ActionEvent e)
         {
            JOptionPane.showMessageDialog(null, "Anthony is a certified beauty and"
             +" puller and is dissapointed he can't become the next Kappa Sigma President");
      
         }
      
       } 
       
      private class Button5Listener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            JOptionPane.showMessageDialog(null, "Ben is a sweet nigga with questionable"
             +" sexual choices but his drawlin nature is what makes him one of the boys");
      
         }
      
      }
      
      private class Button6Listener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            JOptionPane.showMessageDialog(null, "Pat's willingness to use his room"
             +" for parties has led to him successfully clapping cheeks, no matter how young.");
      
         }
      
      } 
      
      public static void main(String[] args)
      {
         IotaWindow theBoys = new IotaWindow();
      
      }       
   
   
   
}   
   