public class Rectangle2
{
   private double length;
   private double width;
   private String name;
   
   public Rectangle2()
   {
      length = 0;
      width = 0;
   }
   public Rectangle2(String n,double l,double w)
   {
      name = n;
      length = l;
      width = w;
   }
   public double getArea()
   {
      return length*width;
   }
   public String toString()
   {
      String str = "The name of the rectangle is "+name
         +".\nThe length of this rectangle is "+length
         +".\nThe width of this rectangle is "+width;
      return str;
   }
   public boolean equals(Rectangle2 r)
   {
      boolean status = false;
      if (name.equals(r.name) && length==(r.length) && width==(r.width))
         status = true;
      return status;
   }
}
     