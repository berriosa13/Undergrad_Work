/*
Name:                Anthony Berrios
Date:                12/4/18
Title:               RecursiveExp.java
Description:         A program that raises exponents by repeated multiplying
                     the same number.  
                    
Input:               the two integers, base and the power being raised
                     ex. (8,5) would be 32768.
Output:              the result of the repeated multiplication.

*/

import java.util.Scanner;

public class RecursiveExp {

    public static void main(String[] args) {
    
    int number1, number2, result;
                
        Scanner in = new Scanner(System.in);
    
        System.out.print("Enter an integer: ");
        number1 = in.nextInt();
        System.out.print("Enter a second integer: ");
        number2 = in.nextInt();
                    
        result = exp(number1, number2);
        System.out.println("The value of " + number1 + " to the power of " +
        number2 + " is " + result);
        }
        
        public static int exp( int n1, int n2) {
        if( n2 == 0 ) {
        return 1;
        }
        
        else if( n2 < 0 ) {
              return - n1 * exp(n1, n2 + 1);
        }      
        
        else {
            return n1 * exp(n1, n2 - 1);
        }  
        
          

    
    
    
    
   } 
    
}    

