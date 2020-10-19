import java.util.Scanner;

//The program demonstrates the recursive gcd method

public class GCDdemo
{
   public static void main(String[] args)
   {
      int num1, num2; //two numbers for gcd calculation
      
      //create a scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //get the first number from the user
      System.out.print("Enter an integer: ");
      num1 = keyboard.nextInt();
      
      //get the second number from the user
      System.out.print("Enter another integer: ");
      num2 = keyboard.nextInt();
      
      //display the GCD
      System.out.println("The greatest common divisor of these two numbers is "+gcd(num1,num2));
   }
   
   public static int gcd(int x, int y)
   {
      if(x%y == 0)
         return y;
      else
         return gcd(y,x%y);
   }
}