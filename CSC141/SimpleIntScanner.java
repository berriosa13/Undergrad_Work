 /* This program demonstrates the Scanner class.
 */ 
 
 import java.util.Scanner;
 
 public class SimpleIntScanner
   {
   
  public static void main(String[] args)
  {
  
  //Instructions
  
  System.out.println("Enter an integer and "
                     + "see it printed back "
                     + "on the screen "); 
                     
  // Create a Scanner object to read the input
  
  Scanner Kbd = new Scanner(System.in);
  
  // Create the prompt
  String prompt = "Enter an integer";  //input prompt
  
  // Get the number
  System.out.print(promptInt);
  int x = kbd.nextInt();
  
  // Output the number
  System.out.println("The integer was " + x + ".");
  
  }
  
  }