import java.util.Scanner;
public class ForLoopSquare
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      
      final String intPrompt = "Enter the size of sqaure: ";
      System.out.print(intPrompt);
      int n = kb.nextInt();
      
      final char star = '*';
      
     for(int x = 1; x <= n; x++)
     {
        // one line of sqaure
        
     for(int j = 1; j <= n; j++)
     {
         System.out.print(star);
     }
         System.out.println();       
     }
   
   
   
   }
   
   
}   