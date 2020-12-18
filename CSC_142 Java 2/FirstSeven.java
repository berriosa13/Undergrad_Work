import java.util.Scanner;
	public class FirstSeven
	{

	    // returns the first student who scored a 7 on the quiz, or -1 if no
	    // student scored a 7
	    public static int first (int[] scores, int num)
	    {
	        int returnval = -1;
	        int i;
	        for (i = 0 ; i < num ; i++)
	        {
	            if (scores [i] == 7)
	            {
	                returnval = i;
	            }
	        }

	        return returnval;
	    }


	    public static void main (String [] args)
	    {
	        int[] grade;
	        int number;
	        Scanner kb = new Scanner(System.in);
	        int i, score7;

	        System.out.println ("How many students?");
	        number = kb.nextInt ();
	        grade = new int[number];

	        for (i = 0 ; i < number ; i++)
	        {
	            System.out.println ("Enter grade for student #" + (i + 1));
	            grade [i] = kb.nextInt ();
	        }

	        score7 = first(grade, number);
	        if (score7 == -1)
	        {
	            System.out.println("No student scored a 7.");
	        }
	        else
	        {
	            System.out.println ("The first student who scored a 7 was # " + (score7 + 1));
	        }

	    } // ends the main
	}