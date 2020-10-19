public class Geometry
{
   private double radius;
   private double length;
   private double width;
   private double base;
   private double height;
   
   public static void main(String[] args)
   {
      
      
   
public Geometry(double r, double l, double w, double b, double h)
{
   radius = r;
   length = l;
   width = w; 
   base = b; 
   height = h;
}

public static double getCircleArea(double radius)
{
   return Math.PI * (radius*radius);

}

public static double getRectArea(double length, double width)
{
   return length*width;
}

public static double getTriArea(double base, double height)
{
   return base*height*0.5;
}
   



}
