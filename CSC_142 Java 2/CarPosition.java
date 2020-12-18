public class CarPosition {
   // fields
   private int x;
   private int y;
   
   // methods
   public void goForward() {
      y = y + 5;
   }
   
   public void goForwardAndSwitchLanes() {
      x = x + 1;  // turn lanes
      y = y + 1;  // move forward
   }
   
   public void printCoordinates() {
      System.out.println(x + " " + y);
   }
}