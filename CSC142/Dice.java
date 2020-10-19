import java.util.Random;
public class Dice
{
   //fields   
   private int side;
   private int value;
   
   //methods
   public Dice(int s)
   {
      side = s;
      value = 0;
      roll();
   }
   
   public void roll()
   {
      Random rand = new Random();
      value = rand.nextInt(side)+1;
    }
    
    public int getSide()
    {
      return side;
    }     
   
    public int getValue()
    {
      return value;
    }
    
}      
      