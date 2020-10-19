import java.util.Scanner;
public class WordizeInt
{
   public static void main(String [] args)
   {
      final int a = getInt();
      System.out.println(a);
      System.out.println(wordizeInt(a));
      
   }
   
   public static String wordizeInt(int n)
   {
      String answer = "";
      String space = " ";
      int digit;
      while(n>0)
      {
         digit = n%10;
         n     = n/10;
         //if (answer.equals(""))
         answer = wordizeDigit(digit) + space + answer;
            //answer = (digit) + space + answer;
      }
      return answer;
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
      
   public static int getInt()
   {
      Scanner kb = new Scanner(System.in);
      final String prompt = "Enter int: ";
      System.out.print(prompt);
      return kb.nextInt(); 
   }         
            
         
   
}   
 
