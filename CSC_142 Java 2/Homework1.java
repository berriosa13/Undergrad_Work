// neccesary imports for program
import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Homework1
{
   public static void main(String[] args) throws IOException 
   {
       // reads file in
       File num = new File("numbers.txt");
       Scanner inputFile = new Scanner(num);
       // creates rounding object
        DecimalFormat rounding = new DecimalFormat("0.00");
        // necesary variables
        int count = 0;
        double numbers =0;
        int evenNum =0;
        int oddNum =0;
        double avg;
        double evenAvg;
        double oddAvg;
        double sum = 0.0;
        double evenSum = 0.0;
        double oddSum = 0.0;
        
  // reads in numbers file until last line is read
  while(inputFile.hasNext())
  {
         String nums = inputFile.nextLine();
  // converts string to ints so numbers can be added
         sum += Integer.parseInt(nums);
  // converts string to ints to so odd/even nums can be distinguished
         numbers = Integer.parseInt(nums);
  // updates total number count
         count++;
  
  // separates evens from odds
  if(numbers % 2 == 0)
      {
         evenNum++;  // counts total even number
         evenSum += Integer.parseInt(nums); // adds total sum of even numbers
      }
      
      else
      {
         oddNum++; // counts total odd number
         oddSum += Integer.parseInt(nums); // adds total sum of even numbers
      }   
   } 
     
   // calculates total number average
         avg = sum/count; 
   // calculates total even numbers average
         evenAvg = evenSum/evenNum;
   // calculates total odd numbers average
         oddAvg =  oddSum/oddNum;
  
   // output of credentials and results
   System.out.println("Student Name: Anthony Berrios" +"\n");
   System.out.println("Email: ab905436@wcupa.edu"+"\n");
   System.out.println("There are " +count+ " numbers in the file"+"\n");
   System.out.println("There are " +evenNum+ " even numbers"+"\n");
   System.out.println("There are " +oddNum+ " odd numbers"+"\n");
   // displays averages and rounds decimals at hundredths place (0.00)
   System.out.println("The total average value is " +rounding.format(avg)+"\n"); 
   System.out.println("The even number average is " +rounding.format(evenAvg)+"\n");
   System.out.println("The odd number average is " +rounding.format(oddAvg)+"\n");
  
  }
  
}  
