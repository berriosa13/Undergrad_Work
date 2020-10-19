import java.util.Scanner;
public class ArrayGrades {
   public static void main(String[] args) {
   
   Scanner kb = new Scanner(System.in);
   
   int sum = 0;
   
   int[] grades = new int[5];
   
   for(int i = 0; i < grades.length; i++)
      grades[i] = kb.nextInt();
      
   for(int i = 0; i < grades.length; i++)
      sum += grades[i] ;
      
   double avg = sum/(double)grades.length;     
   
   }
   
}   