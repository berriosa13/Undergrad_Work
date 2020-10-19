public class overloadingMethod
{
   public static void main(String[] args)
   {
      System.out.println(plus("James","Fabrey"));
      System.out.println(plus(10,15));
      
   }
   public static String plus(String s1, String s2)
   {
      return s1+ " " +s2;
   }  
   
   public static double plus(double n1, double n2 )
   {
      return n1+n2;
   }   
   
   
}   