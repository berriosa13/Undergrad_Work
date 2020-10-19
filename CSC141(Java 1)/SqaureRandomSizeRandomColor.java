import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class SquareRandomSizeRandomColor extends JApplet
{
   public void paint(Graphics gphs)
   {
      Random randomNumb = new Random();
      
      final int colorMax = 256;
      int r = randomNumb.nextInt(colorMax);
          g = randomNumb.nextInt(colorMax);
          b = randomNumb.nextInt(colorMax);
      Color shade = new Color(r,g,b);
      
      gphs.setColor(shade);
      
      final int panelMax = 400;bb
      final int sizeMax = panelMax-50, 
                sizeMin = panelMax-350;
                
      int size = randomNumb.nextInt(sizeMax-sizeMin) + sizeMin;          
      
      final int x = (panelMax-size)/2,
                y = x;
                    
      gphs.fillRect(x,y,size,size);
      
      
    }
      
      
}         