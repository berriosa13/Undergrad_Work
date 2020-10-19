/*
Name: Anthony Berrio
Date: 10/9/18
Title: ArrayExperiments.java
Description: Various methods that demonstrate the use of arrays
*/

public class ArrayExperiments {
   public static void main(String[] args) {
      int[] ary1 = {55, 66, 77};
      
      int[] ary2 = new int[3];
      ary2[0] = 55;
      ary2[1] = 66;
      ary2[2] = 77;
      
   System.out.println("Arrays equal? " + equals(ary1, ary2));   
   
   System.out.printf("Array before call: %d %d %d \n", ary2[0], ary2[1], ary[2]);
   swapFirstLast(ary2);
   System.out.printf("Array after call: %d %d %d \n", ary2[0], ary2[1], ary[2]);
   System.out.println("Largest value of array: " + largestValue(ary2));
   System.out.println("Largest index of array: " + largestIndex(ary2));

   } // ends main
   
   // a method that returns the index of the largest value in an array
   public static int largestIndex( int[] ary) {
      int largestIndex = 0;
      
      for (int i = 0; i < ar.length; i++) {
         if(ary[i] > ary[largestIndex])
         largestIndex = i;
   }
   
   // a method that returns the largestValue in an array
   public static int largestValue(int[] ary) {
   int largest = ary[0];  // first vaue in array in largest at beginning
   
   // enhanced for loop
   for (int v : ary) {
      if (v > largest) // if current element is larger than the previous largest
         largest = v;  // found a new largest     
   }
      return largest;
   
   // a method that swaps first and last elements in an array
   public static void swapFirstLast(int[] a) {
      int first = a[0];
      int last = a[a.length - 1];
      
      a[0] = last;
      a[a.length -1] = first;
   }
   // a method that checks whether two arrays 
   // have the same elements in the same order
   
   public static boolean equals(int[] a, int[] b) {
      // return a==b;
      // NO! checking memory addresses
      
      boolean returnVal = true;
      // check each position of the array
      for (int i = 0; i < a.length; i++) {
         if (a[i] !=b[i]) // found a difference
            returnVal = false;
      }
      
      return returnVal;     
   }
   
   
} // ends class