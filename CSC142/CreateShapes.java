/*
    Name:         Anthony Berrios
    Date:         11/13/18
    Title:        CreateShapes.java
    Description:  Program that creates a bunch of rectangles.
    */
    
    public class CreateShapes {
        public static void main(String[] args) {
    
            // create some rectangles
            Rect r1 = new Rect (2,3,1,1);
            Rect r2 = new Rect (8,8,3,5);
            Rect r3 = new Rect (-1,2,1,1);
            Rect r4 = new Rect (r3);   // uncomment this line after modifying Rect.java
            
            Rect[] rects = new Rect[4];  // creates array for all four rectangles
            rects[0] = r1;
            rects[1] = r2;
            rects[2] = r3;
            rects[3] = r4;
    
            System.out.print("Created 4 shapes \n");
    
            // shift some of the rectangles around
            r1.shift(5,0);
            r3.shift(2,2);
    
            // print out final locations of rectangles
            System.out.println(r1);
            System.out.println(r2);
            System.out.println(r3);
            System.out.println(r4);    // uncomment this line after modifying Rect.java
            
            System.out.println(areAnySquare(rects));
        }
        
        
        
          public static boolean areAnySquare(Rect[] r)
          {
            boolean Val = false;
            for(int i = 0; i < r.length; i++)
            {
            return Val = r[i].isSquare();
            }
            return Val;  // returns false if there are any squares
          }
          
        
    }  