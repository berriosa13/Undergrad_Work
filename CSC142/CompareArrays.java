public class CompareArrays
{
   public static void main(String[] args)
   {
      double[] numbers = { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 };
      double[] n = { 30, 31, 32, 33, 34, 35, 36, 37, 38, 39 };    
      boolean isSame = true;
      
      if(numbers.length == n.length)
      {
         for( int i = 0; i < numbers.length; i++)
         {
            if( numbers[i] != n[i])
               isSame = false;
         }
         System.out.println("These arrays are not the same");
              
      }
      
      else
         System.out.println("These arrays are the same"); 
         
              
   }
    
}   