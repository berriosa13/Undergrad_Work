public class Wait
{
   public static void pause(double sec)
   {
      //Causes the terminal to pause for SEC seconds
      int msec = (int)(1000.0*sec + 0.5);
      final int max = 3000; // pause no more than 3 seconds 
      msec = msec>max ? max : msec;
      try
      {
         Thread.currentThread().sleep(msec);
      }
          
      catch    (InterruptedException e)
      {
               //e.printStackTrace();
      }
          
   }
    
}