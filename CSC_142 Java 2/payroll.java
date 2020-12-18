
public class payroll
{
  private String name;
  private int ID;
  private double payRate;
  private double hours;

   public payroll()
   {
      name = null;
      ID = 0;
      payRate = 0.0;
      hours = 0;
   }
   
   public payroll(String n, int id, double pr, double h)
   {
     name = n; 
     ID = id; 
     payRate = pr; 
     hours = h;
   }
   
   public void setName(String n)
   {
      name = n;
   }
   
   public void setID(int id)
   {
      ID = id; 
   }
   
   public void setPayRate(double pr) 
   {
      payRate = pr;
   }    
   
   public void setHours(double h)
   {
      hours = h;
   }
   
   public String getName()
   {
      return name;
   }   
   
   public int getID()
   {
      return ID;
   }
   
   public double getPayRate()
   {
      return payRate;
   }
   
   public double getHours()
   {
      return hours;
   }
   
   public double getGrossPay()
   {
      return payRate * hours;
   }
   
          
}        
   
   