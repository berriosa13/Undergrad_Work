public class Fibonacci
{
   public static void main(String[] args)
   {
      System.out.println("The product of these two numbers is " + mult(3,5));  // 3x5
   }
   
   public static int mult( int n, int m)
   {
      if(m ==1)  // base case
         return n ;
      
      else  // recursive call
         return n + mult(n,m-1) ;             
   }   
   
   public static int fib(int n)
   {
      if(n == 0)
         return 0;
      
      else if(n ==1)
         return 1;
      
      else
         return fib(n-1) + fib(n-2);   
   }     
}   