/* 
Name" Anthony Berrios
Date: 9/6/18
Title: Ordering.java
Description: Program that asks a user to enter three integers and displays
 them in ascending and descnending order. 
Input: Three integers
Output: Given integers in ascending and descending order
*/

import java.util.Scanner;
public class Ordering {
   public static void main(String[] args) {  
   
Scanner kb = new Scanner(System.in);
System.out.println("Enter three integers:");
int n1 = kb.nextInt();
int n2 = kb.nextInt();
int n3 = kb.nextInt();
int high, med, small;

if (n1 > n2 && n1 > n3){
   high = n1;

if (n2 > n3){ 
med = n2;
small = n3; }

else {
med = n3;
small = n2;}
}

else if (n2 > n1 && n2 > n3) {
      high = n2;
if (n1 > n3) {
med = n1;
small = n3; }
else {
med = n3;
small = n1; } 
}    

else {
high = n3; 
if ( n1 > n2) {
med = n1;
small = n2; }
else {
med = n2;
small = n1; }
}

System.out.println("The numbers in ascending order are: " +
small + " " + med + " " + high); 

System.out.println("The numbers in descending order are: " +
high + " " + med + " " + small); 

   }  
   
}   
   
   
   
   
   
 

