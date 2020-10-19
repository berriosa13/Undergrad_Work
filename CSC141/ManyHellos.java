import java.util.Scanner;

public class ManyHellos
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      
      String prompt = "Enter an integer (>0): ";
      
      final String message = "Hello";
    
      System.out.print(prompt);
      int n = kb.nextInt();
     
      while (n > 0)
      {
         System.out.printf("%d: %s\n",n, message);
         n--;   
      }
      
      
      
      }
      
         
}         
         