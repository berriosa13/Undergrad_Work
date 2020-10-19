import java.util.Scanner;
import java.io.*;
public class ArrayIO
{
   public static void main(String[] args) throws IOException
   {
      // output:
      // create a connection
      PrintWriter outputFile = new PrintWriter("a.txt");
      // writing
      for( int index = 0; index < n.length; index++)
         outputFile.println(n[index]);
      // close connection
      outputFile.close();
        
   }
   
    public static void main(String[] args) throws IOException
   {
      // input:
      // create a connection
      File f = new File("number.txt");
      //reading 
      Scanner inputFile = new Scanner(f);
      double[] n = new double[1000];
      while(inputFile.hasNext() && index < n.length)
      {
         n[index] = inputFile.nextInt();
         index++;
      }
      
      // close the file
      inputFile.close();   
   
      }   
      
 }     