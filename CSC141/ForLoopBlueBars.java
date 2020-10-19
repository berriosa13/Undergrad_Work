import java.awt.*;
import javax.swing.*;

public class ForLoopBlueBars extends JApplet
{
   public void paint(Graphics graphics)
   {
      final int xInitial =   4,   // INITIAL VALUE OF X COORD
                yInitial =   4,   // INITIAL VALUE OF Y COORD
                height   =   1,   // HEIGHT OF EACH BAR
                yGap     =   20;  // VERTICAL GAP BETWEEN EACH TWO BARS
      
      final double totalTime = 2.0;
      
      final int maxPanel = 400;
      
      int x = xInitial;
      int y = yInitial;
      final int length = maxPanel-(2*x);
      
      int n = (maxPanel-(2 * yInitial))/(height + yGap);
      final double delay = totalTime/n;
      
      graphics.setColor(Color.blue);
      
      for(int i = 1; i<=n; i++)
      {
         graphics.fillRect(x,y,length,height);
         
         y+=(height+yGap);
         
         Wait.pause(delay); 
      }  
      
      
      
      
   
   
   
   }
   
   
}   
   
   
   
   
   
   
   
   
