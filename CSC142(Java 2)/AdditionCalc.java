import java.util.Scanner;
public class AdditionCalc {
   public static void main(String[] args)  {
   
   Scanner kb = new Scanner(System.in);
   final int SENTINEL = -1;
   int sum = 0;
   System.out.print("Enter numbers and get their sum: ");
   int num = kb.nextInt();
   
   while ( num != SENTINEL) {
   System.out.print("Enter another number or type -1 to quit: ");
   num = kb.nextInt();
   sum = sum + num;
   }
   
   System.out.println("The sum of the inputted "
   + "numbers is: " + sum);
   
   
   
   }
   
}   