public class test2
{
   public static void main(String[] args)
   {
      int[] n = new int[10];
      for(int i = 0; i < n.length; i++)
         n[i] = i;
      for(int a : n)
      System.out.print( a + " ");
      n = new int[5];
      for(int a : n)
      System.out.print( a + " ");
      
     // System.out.println(n[4]);   
   
   }
   
}   