import java.util.*;
public class partiallyFilledArray
{
   public static void main(String[] args)
   {
      int[] n = new int[1000];
      int count = 0;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number or -1 to quit");
      int number = input.nextInt();
      while(number != -1 && count < n.length)
      {
         n[count] = number;
         count++;
         System.out.println("Enter a number or -1 to quit");
         number = input.nextInt();  
      }
      
    } 
   
}   