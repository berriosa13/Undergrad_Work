/*
Name:                Anthony Berrios
Date:                12/4/18
Title:               RecursiveReverseArray.java
Description:         A program that reverses an array into a specified range           

*/



import java.util.Random;

    public class RecursivelyReverseArray{
        public static void main(String[] args) {
            Random rand = new Random();
            
            int[] list = new int[10]; // create an array of length 10
            
            // populate the array with random integers in the range 1..100
            for (int i = 0; i < list.length; ++i) {
                list[i] = rand.nextInt(100) + 1;
            }
            
            // print out the contents of the array
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
            
            // reverse the array
            myReverse(list, 0, list.length);
            
            // print out the contents of the array
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
         private static void myReverse(int[] list, int from, int to) {
            // pseudocode: write code for the below algorithm
            // make no other modifications!

            // (base case)
            // if range size is 0 or 1, there is nothing left to do
            if((to -1) - from == 0 || (to - 1) - from == 1)
               return ; 

            // (recursive step)
            // else:
            //   1. swap the two values on each end 
            //   2. recursively call the method on the portion in-between
            else{
               int temp = list[to - 1];
               list[to -1] = list[from];
               list[from] = temp;
               
               myReverse( list, from +1, to -1);
               
            }
        }
    }       
        
         