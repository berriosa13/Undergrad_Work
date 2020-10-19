import java.util.*;
public class FactorialInput
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number to view its factorial");
      int num = input.nextInt();
      System.out.println("The factorial of "+num+ "is :" +fact());  
   }
   
   public static int fact(int f)
   {
      if(f <= 1)
         return 1;
      
      else 
            return f * fact(f-1);   
   }
   
   
}   