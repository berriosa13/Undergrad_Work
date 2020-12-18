public class HW2tester
{
   public static void main(String[] args)
   {
      Car car1 = new Car();
      Car car2 = new Car("Ford", 2013, 20000);
      Car car3 = new Car("Audi", 2012, 25000);
      Car car4 = new Car();
      
      car2.setPrice(22000);
      car2.setYear(2011);
      
      car4.setBrand("Cadillac");
      
      System.out.println("This car is " + car1.getBrand() + ", year " + car1.getYear() + ", price " + car1.getPrice());
      System.out.println("This car is " + car2.getBrand() + ", year " + car2.getYear() + ", price " + car2.getPrice());
      System.out.println("This car is " + car3.getBrand() + ", year " + car3.getYear() + ", price " + car3.getPrice());
      System.out.println("This car is " + car4.getBrand() + ", year " + car4.getYear() + ", price " + car4.getPrice());
      
      System.out.println("The total car number is: " + car1.getNumber());
      System.out.println("The total car number is: " + car2.getNumber());
      System.out.println("The total car number is: " + car3.getNumber());
      System.out.println("The total car number is: " + car4.getNumber());

   }
}