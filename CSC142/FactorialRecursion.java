import java.util.Scanner;
public class FactorialRecursion {
   public static void main(String[] args) { 
   
   System.out.println(n);
   }
   
   public static int factorial(int n = )
   {
      Scanner input = new Scanner(System.in);
      System.out.println("enter a number and get back its factorial: ");
      int n = input.nextInt();
      
      if( n == 0)
      
         return 1;
     else
         return n*factorial(n-1);
   }          
   
}   
