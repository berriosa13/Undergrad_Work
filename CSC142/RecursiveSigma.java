/*
    Name:         Anthony Berrios
    Date:         11/27/18
    Title:        RecursiveSigma.java
    Description:  
    */

public class RecursiveSigma {
   public static void main(String[] args) {
      System.out.println("the result of sigma(4): " + sigma(4));
   }
   
   // recursive method
   public static int sigma( int n) {
   if ( n == 1 )  // base case 
      return 1;
   else      // recursive step    
      return n + sigma(n-1); 
   }
      
      
}      