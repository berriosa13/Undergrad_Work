import java.util.*;
public class payrollDemo
{
   public static void main(String[] args)
   {
   
   Scanner kb = new Scanner(System.in);
   payroll p1 = new payroll();
   payroll p2 = new payroll("Anthony",905436, 40, 10);
   payroll p3 = new payroll("James",1234,100,5);
   
   System.out.println("Employees name is: " +p1.getName()+ " ID number is: " +p1.getID()+
   " Hours worked: " +p1.getHours()+ " Gross pay is: "+p1.getGrossPay());
   
   System.out.println("Employees name is: " +p2.getName()+ " ID number is: " +p2.getID()+
   " Hours worked: " +p2.getHours()+ " Gross pay is: "+p2.getGrossPay());
   
     System.out.println("Employees name is: " +p3.getName()+ " ID number is: " +p3.getID()+
   " Hours worked: " +p3.getHours()+ " Gross pay is: "+p3.getGrossPay());
   
   
   }
   
   
}   