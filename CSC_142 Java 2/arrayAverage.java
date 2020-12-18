public class arrayAverage
{
   public static void main(String[] args)
   {
      double[] a = { 3,4,2,1,10,9};
      double average = getAverage(a);
      System.out.println(average);
   }
   
   public static double getAverage(double[] n) 
   {
      double average = 0;
      double sum = 0;
      for(int index = 0; index < n.length; index++)
      {
         sum += n[index];
      }
      average = sum/n.length;
      return average;   
   } 
   
}    