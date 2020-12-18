public class RectangleDemo2
{ 
   public static void main(String[] args)
   {
      Rectangle2 R1 = new Rectangle2("XYZ",3.0,5.0);
      Rectangle2 R2 = new Rectangle2("XYZ",3.0,5.0);
      
      System.out.println(R1.toString());
      System.out.println(R2.toString());
      
      if(R1.equals(R2))
         System.out.println("Both objects are the same.");
      else
         System.out.println("The objects are different.");
   }
}