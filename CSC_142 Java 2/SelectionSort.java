public class SelectionSort
{
   public static void main(String[] args)
   {
      int[] numbers = {5,7,2,8,9,1};
      int n = numbers.length;
      
   for(int startScan = 0; startScan < n-1; startScan++)
   {
      int minIndex = startScan;
      int[] minValue = new int[startScan];
      
      for(int index = startScan+1; index < n; index++)
      {
         if(numbers[index] < minValue)
         {
            minValue = n[index];
            minIndex = index;
         }
         
      }
      
      numbers[minIndex] = numbers[startScan];
      numbers[startScan] = minValue;
    }
    
    for(int i = 0; i < n; i++)
      System.out.print(numbers[i]+"\t");
              
         
   
   
  }
   
}
        
   

   
   
   
    