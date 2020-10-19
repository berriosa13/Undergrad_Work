import java.util.*;
public class MutipleNumbers
{
   public static void main(String[] args)
   {
     final String prompt="Enter a digit: ";
     System.out.print(prompt);
     getInt();
   }  
     
   public static int getInt()
   {
   Scanner kb = new Scanner(System.in);
   int n = kb.nextInt();
   return n;
   }
   
   
}   
   
   
     
     
     