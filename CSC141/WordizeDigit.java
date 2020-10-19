public class WordizeDigit
{
   public static void main(String [] args)
   {
      System.out.println(wordizeDigit(0));
      System.out.println(wordizeDigit(1));
      System.out.println(wordizeDigit(2));
      System.out.println(wordizeDigit(3));
      System.out.println(wordizeDigit(4));
      System.out.println(wordizeDigit(5));
      System.out.println(wordizeDigit(6));
      System.out.println(wordizeDigit(7));
      System.out.println(wordizeDigit(8));
      System.out.println(wordizeDigit(9));
   }
   
   public static String wordizeDigit(int digit)
   {
      switch (digit)
      {
         case 0: 
            return "zero";
         case 1: 
            return "one";
         case 2: 
            return "two";
         case 3: 
            return "three";
         case 4: 
            return "four";
         case 5: 
            return "five";
         case 6: 
            return "six"; 
         case 7: 
            return "seven";
         case 8: 
            return "eight";
         case 9: 
            return "nine";
         default: 
            return "****";
      }
       
   }     
     
      
        
      
   
}