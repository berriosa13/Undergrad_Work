 /*
    Name:        Anthony Berrios
    Date:        11/13/18
    Title:       Rect.java
    Description: A class that represents the location of a rectangle, as well as its 
                 width and height.
    Public methods:
        toString() -- retruns a String representation of the object
        shift(int, int) -- shifts the location of the rectangle by the specified arguments
        isSquare() -- returns if the object is a square
        getNumShapes() -- returns the number of shapes that have been created so far
        Rect(int, int, int, int) -- creates a Rectangle from the specified arguements
            1st arg: x
            2nd arg: y
            3rd arg: width
            4th arg: height
    Private fields:
        x -- the top left x-coord of the rectangle
        y -- the top left y-coord of the rectangle
        width -- the width of the rectangle
        height -- the height of the rectangle 
    */
    
    public class Rect {
        Coords coordinate = new Coords();
        private int width;    // width of the rectangle
        private int height;   // height of the rectangle
    
        private static int shapesCreated = 0;   // counter for the number of shapes created so far
    
        // arg constructor
        // creates a Rectangle from the specified arguements
        // 1st arg: x
        // 2nd arg: y
        // 3rd arg: width
        // 4th arg: height
        
        public Rect(int x, int y, int width, int height) {
            coordinate.x = x;
            coordinate.y = y;
            this.width = width;
            this.height = height;
    
            shapesCreated = shapesCreated + 1;   // increment the counter
        }
        
        public Rect (Rect r) 
        {
           coordinate.x = r.coordinate.x;  // copies x coordinate
           coordinate.y = r.coordinate.y;  // copies y coordinate
           width = r.width;  // copies width
           height = r.height;  // copies height
        }
    
        // method that returns whether the object is a square
        public boolean isSquare() {
            return width == height;
        }
    
        // method that shifts the rectangle by the amount specified in the 
        // given arguments
        public void shift (int xShift, int yShift) {
            coordinate.x += xShift;
           coordinate.y += yShift;
        }
    
        // accessor method that returns the number of shapes created so far 
        public static int getNumShapes() {
            return shapesCreated;
        }
    
        // method that returns a String representation of the object
        public String toString() {
            String s = "";
    
            s += "Top-left of rect is at: " + coordinate.x + "," + coordinate.y + " ";
            s += "width: " + width + " height: " + height; 
    
            return s;
        }
    }    