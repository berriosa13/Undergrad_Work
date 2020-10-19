public class SelfDrivingCar {
   public static void main(String[] args) {
      CarPosition car1 = new CarPosition();
      CarPosition car2;
      car2 = new CarPosition();
      
      car1.goForward();
      
      // System.out.println("Car1 = " + car1.x + " " + car1.y);
      // System.out.println("Car2 = " + car2.x + " " + car2.y);
      System.out.print("Car 1: ");
      car1.printCoordinates();
      System.out.print("Car 2: ");
      car2.printCoordinates();
   }
}