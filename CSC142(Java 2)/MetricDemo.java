public class MetricDemo
{

   public static void main(String[] args)
   {
      double kilo = Metric.getKilo(10);
      double mile = Metric.getMile(10);
      
      System.out.println("The length in kilometers is "+kilo);
      System.out.println("The length in miles is "+mile);
      
   
   }
   
}   