/*
   Name:                Anthony Berrios
   Date:                10/11/18
   Title:               Salesorder.java
   Description:         A program to practice with the use of arrays
                            The program will calculate the cost of a
                            number of items, after the user has entered in the
                            unit cost, number ordered, and id of each item
   Input:               the cost, number and ID of ITEMNUM items
   Output:              the total cost of the order

 */
 
 import java.util.Scanner;

public class SalesOrder {

    public static void main (String[] args) {

    	final int ITEMNUM = 10;
      double leastCost = 999; 

        //  *** arrays we'll need ***
        double[] price = new double[ITEMNUM]; /* unit prices of items */
        int[] id = new int[ITEMNUM];          /* IDs of items */
        int[] quantity = new int[ITEMNUM];    /* quantities of each item type */

        double tot_cost = 0.0;   /* total cost of items bought */
        int i;                   /* for array indexing */

        /* input object */
        Scanner in = new Scanner(System.in);

        /* Enter sales data */
        for ( i = 0; i < ITEMNUM; ++i)  {
            System.out.println("Item " + (i+1) + ":");
            System.out.print("Unit price: ");
            price[i] = in.nextDouble();
            System.out.print("ID number: ");
            id[i] = in.nextInt();
            System.out.print("Quantity: ");
            quantity[i] = in.nextInt();
        }

        System.out.println("Thank you. \n");

        /*** Compute total bill ***/
        for (i=0; i < ITEMNUM; ++i)   {
            tot_cost += price[i] * quantity[i];
        }
           

        /*** Print total ***/
         
        System.out.printf("%3s %3s %3s %3s\n", "Item   ", "Id   ", "  Price   ", "Quantity   ");
        
        System.out.println("-----  "  +  " -----   " +
        "-----  " + "  ----- ");
        
        for(i = 0; i <ITEMNUM; i++) {
        
        System.out.printf("%3d     %3d       %3.2f   %3d\n", i+1, id[i], price[i], quantity[i]);     
        
        }
        
           
       System.out.printf("\nYour bill comes to $%,.2f\n", tot_cost );
       
       for (i = 0; i < ITEMNUM; i++) {
         if (leastCost > price[i]) {
            leastCost = price[i];
            }
        }
        
        System.out.println("The least expensive item was $" + leastCost);  
                
    }  // ends the main
} // ends the class


