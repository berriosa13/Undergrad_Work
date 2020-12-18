/**
 * CSC 345 Assignment #1
 * 
 * On my honor, <NAME>, this assignment is my own work and I have
 * not shared my solution with anyone.
 *
 */
 
import java.io.*;

// Students -- Add your import declarations here

public class A1 {
	
	// Students -- Add your constants here
	
	public static void main(String[] args) {
		try {
			// do not make any changes to the following TWO lines
			File file = new File(args[0]);		
			Scanner sc = new Scanner(file);		// do not make any other Scanners
			
			// Students -- your code and methods calls go here
			
			
			
			
			sc.close();
		} catch (Exception e) {
			System.out.println("ERROR - cannot open front.in \n");
		}
	}
	
	// Students -- add your method declarations here
}
