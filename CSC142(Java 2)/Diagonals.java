/* 
Name:        Anthony Berrios
Date:        9/6/18
Title:       Diagonals.java
Description: Write a program that asks a user for an integer.
             Display a diagonal line of X's of the specified size
Input:       Integer
Output:      Diagonal line of X's
*/
import java.util.Scanner;
public class Diagonals {
   public static void main(String[] args) { 
   
   Scanner kb = new Scanner(System.in);
   System.out.println("Enter an integer");
   int num = kb.nextInt();
   
   final char diagonal = 'x';
   
   for (int i = 1; i <= num; i++) {
   
   for ( int j = 1; j <= i-1; j++) { 
   
   System.out.print(" "); }
   System.out.print(diagonal + "\n"); }
          
   
   }
   
}   
