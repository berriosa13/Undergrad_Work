public class Rectangle
{
   //fields 
 //private static int instanceCount = 0;
   private double length;
   private double width;
   
   //methods
   public Rectangle() // constructor 1
   {
      length = 10;
      width = 10;
    //instanceCount++;
   }
   
   public Rectangle(double l) // constructor 2, overloading constructor
   {
      length = l;
      width = 0;  
      //instanceCount++;
   }    
      
   
   public Rectangle(double l, double w) // constructor 3, overloading constructor
   {
      length = l;
      width = w;
   
   }
   
   public void setLength(double l) // mutator: modify the field length
   {
      length = l;
   }
   
   public void setWidth(double w) // mutator: modify the field width
   {
      width = w; 
   }
    
   public double getLength() // accessor: return length
   {
      return length;
   }
     
   public double getWidth()
   {
      return width;
   }
   
   /*public int getIntanceCount()
   {
      return instanceCount;
   }
   */
   public double getArea()
   {
      return length*width;
   }
   
   /* public Rectangle Copy()
   {
   
   }
   */
   public String toString()
   {
      String s = "The length is "+length+"the width is "+width;
      return s;
   
   }
   
   public boolean equals(Rectangle r)
   {
     boolean flag; // if all of the fields in the
     // object are the same flag = true;
     if(length == r.length && width == r.width)
     
        flag = true;
        
     else
        flag = false;
         
     
     return flag;   
     
     }
   
}                   