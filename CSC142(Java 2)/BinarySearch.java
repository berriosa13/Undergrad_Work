public class BinarySearch
{
   public static void main(String[] args)
   {
      int[] numbers = {1,2,3,4,5,6,7,8,9,10};
      int target = 3;
      int index = binarySearch(numbers, target);
      System.out.printf("The position for value %d is %d.",target, index);
   }
   public static int binarySearch(int[] data, int target)
   {
      int first = 0, last = data.length-1, position = -1, middle;
      boolean found = false;
      while(!found && first<=last)
      {
         middle = (first+last)/2;
         // if value is found at the middle point
         if(data[middle] > target)
         {
            found = true;
            position= middle;
         }
         
         else if(data[middle] > target)
         {
            last = middle -1;
         }
         else if(data[middle]>target)
         {
            first = middle +1;
         }
         
       }  
       return position;
            
               
    
   
   }
   
   
}   