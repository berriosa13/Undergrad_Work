public class SquareInt
{
   public static void main (String [] args)
   {
      final int max = 10;
      System.out.printf("%12s%12s\n","NUMBER","SQUARE");
      for(int i=0;i<=max;i++)
      {
         System.out.printf("%10d%12d",i,square(i)); // better is to use \n and omit newLine(1)
         newLine(1);
      }
      
   }  
      /** Returns the sqaure of an integer
    @param i in the integer to be sqaured
    @return the sqaure or i 
    */ 
   public static int square(int i)
   {
      return i*i;
   }
      
   public static void newLine(int n)
   {
      System.out.println();
   }
         
         
     
      
}  
   
/** Returns the sqaure of an integer
    @param i in the integer to be sqaured  **/       
