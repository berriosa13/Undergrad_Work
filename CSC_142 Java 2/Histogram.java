/*
	   Name:                your name
	   Date:                today's date
	   Title:               Histogram.java
	   Description:         A program to practice with the use of arrays
	                            The program will read in a series of grades (note
	                            that all of the grades should be integers between
	                            0 and 10 (terminated by a -1). The computer will
	                            produce a histogram of those grades.
	   Input:               a series of grades between 0 and 10, terminated by a -1
	   Output:              the histogram of those grades

	 */

	import java.util.Scanner;
	public class Histogram {

	    public static void main (String[] args) {

	    	    final int GRADERANGE = 11; // allow for scores from 0 - 10

	            int[] gradeList = new int[GRADERANGE];
	            int grade;

		    Scanner in = new Scanner(System.in);

	            // Now read in the input
	            System.out.println("Enter a grade (-1 to terminate)");
	            grade = in.nextInt();
	            while (grade != -1) {
	                /* modify the gradeList array to account for the grade
	                    how do you do this? */
                       
               gradeList[grade]++;


	                // now read in another grade
	                System.out.println("Enter a grade (-1 to terminate)");
	                grade = in.nextInt();
	            }
               
               // now print out the histogram
	            printHistogram (gradeList);
               System.out.println("Your class average is: "+average(gradeList));  // output for avg
               System.out.println("Your most frequent number is: "+getFrequency(gradeList)); // outpupt for freq



	    } // ends the main


	    /****************************************************************
		method printHistogram
		This function draws a histogram of the values passed in by
		  an array
		Input: an array of ints
		Output: None, but the histogram is drawn
	     ***************************************************************/
	    public static void printHistogram (int[] list) {

	        int index;
	        for (index = 0; index < list.length; index ++) {
	            System.out.print(index + " |");
	            drawRow( list[index] );
	        }
	    }

	    /*****************************************************************
		method drawRow
		This function draws a row of stars, whose length is specified
		   by the caller
		Input: the length of the row of stars to be drawn (an int)
		Output: None, but a row of stars is drawn
	     ****************************************************************/
	    public static void drawRow (int numstars) {
	        int count;
	        for (count = 1; count <= numstars; count ++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
       
        public static int average( int[] grades)
        {
         int total = 0;
         int x = 0;
         for (int i = 0; i < grades.length; i++)
         {
           total+= i * grades[i];
           x+=grades[i];
         }
         int average = total/x;
         return average;
         }
         
         
         
        public static int getFrequency( int[] g)
        {
            int high = 0;
            int a = 0;
            for(int j = 0; j < g.length; j++){ 
               high = g[j];
               a = j;
           }
           return a;
            
         } 
       
            
            
                        

	}  // ends the class
	
