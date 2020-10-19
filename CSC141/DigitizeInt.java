public class DigitizeInt
{
   public static void main(String[] args)
   {
   
      System.out.println(digitizeInt(23456));
   }
   
   public static String digitizeInt(int n)
   { 
      int last = 0;
      String x ="";
   
      while(n!=0)
      {
         last = n%10;
         x=Integer.toString(last)+ " "+x;
         n=n/10;
      }
      return x ;
   
   }
   
}   
