import java.util.Scanner;
public class bill
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      double hours;
      double totalA = 0.0;
      double totalB = 0.0;
      double totalC = 0.0;
      
      double totalSavingAtoB = totalA - totalB; 
      
      String packs = "Enter the package letter (A, B or C):";
      System.out.println(packs);
      packs = kb.nextLine();
      
      String hoursPrompt = "Enter the amount of hours used";
      System.out.println(hoursPrompt);
      hours = kb.nextInt();
      
      if (packs.equals("A")) { 
         totalA = 9.95 + (hours -10.0) *2.0;
         System.out.println("Your total charges for the month are $" + totalA);
      //  Systme.out.println("Package B savin
         }   
       
         
      if (packs.equals("B")) {
         totalB = 13.95 + (hours -20.0) *1.0;
         System.out.println("Your total charges for the month are $" + totalB);
         }
         
         
      if (packs.equals("C")) {
         totalC = 19.95;
         System.out.println("Your total charges for the month are $" + totalC); 
         }
          
      
       
    
    }
    
}      