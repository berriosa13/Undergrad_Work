public class EnumerateDemo
{
   enum Day{SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};
   public static void mian(String[] args)
   {
      Day myDay = Day.WEDNESDAY;
      System.out.println("The ordinal value for myDay is "+myDay.ordinal());
      
      if(myDay.equals(Day.TUESDAY))
         System.out.println("Both of them are Tuesday");
      else
         System.out.println("myDay is not Tuesday");
      
      if(myDay.compareTo(Day.TUESDAY) > 0)
         System.out.println("myDay is greater than TUESDAY");
      else if(myDay.compare(Day.TUESDAY) == 0)
      
         
         