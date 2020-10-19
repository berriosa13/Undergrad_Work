import java.text.DecimalFormat;

public class DecFormatExample
{
   public static void main(String[] args)
   {
      double
         x = 1.6789,
         y = .1,
         z = 12345.6,
         w = 0.1234;
   
   // DecimalFormat formatter = new DecimalFormat(".00");
   // DecimalFormat formatter = new DecimalFormat("0.000);
   // DecimalFormat formatter = new DecimalFormat("00.0");
   // DecimalFormat formatter = new DecimalFormat("#,###.000");
   // DecimalFormat formatter = new DecimalFormat("#,##.00");
      DecimalFormat formatter = new DecimalFormat( "$0.00");
   // DecimalFormat formatter = new DecimalFormat("000.00%");
     
      System.out.println(formatter.format(x));
      System.out.println(formatter.format(y));
      System.out.println(formatter.format(z));
      System.out.println(formatter.format(w));
     
   }
     
}