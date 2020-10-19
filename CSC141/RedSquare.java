import java.awt.*;
import javax.swing.*;

public class RedSquare extends JApplet
{
   public void paint(Graphics graphics)
   {
   
      graphics.setColor(Color.red);
      
      int x = 100;
      int y = 100;
      int size = 200;
   
      graphics.fillRect(x,y,size,size);
   
   
   }
   
}   
