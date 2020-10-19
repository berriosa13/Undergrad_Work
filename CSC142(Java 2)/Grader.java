import java.util.*;
public class Grader
{
   double[] testScores;
   int size;
   
   public static void main(String[] args)
   {  
      Scanner kb = new Scanner(System.in);
      System.out.println("Please enter the grade percentages in the following format (00.00)");
      int size = kb.nextInt();
      System.out.println("The test average was " +getAverage() + " and the lowest score was a " +getLowestScore());
      
   }
   public Grader(double[] t)
   {
      testScores = t;
   
   }
    public double getLowestScore()
    {
      double lowestScore = testScores[0];
      for(int i = 0; i < testScores.length; i++)
      {
         if(testScores[0] < lowestScore)
            lowestScore = testScores[i];
      }
         return lowestScore;      
    
    }
    
    public double getAverage(double lowestScore)
    { 
      int total = 0;
      for(double n : testScores)
      {
         total += n;
      } 
         return (total - lowestScore) / size;  
    }
   
    
    
}   