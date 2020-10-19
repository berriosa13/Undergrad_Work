/* 
Name:        Anthony Berrios
Date:        9/6/18
Title:       Factorials.java
Description: Program that calculates the factorial 
             for every integer value from 1 to 10
Input:       number 1-10
Output:      1-10 factorials
*/
public class Factorials {
   public static void main(String[] args) { 
   

    int x,fact =1;  
    for (int number = 1; number <=10; number++) 
    { 
      for(x = 1; x <= number;x++)
      {    
         fact = fact*x; 
      }    
      System.out.println(+number+"! = "+fact); 
      fact = 1;    
    }
   
   }
   
}   
