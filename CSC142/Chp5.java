import java.util.Scanner;

public class Chp5

{

public static void main (String[] args)

{

double width=0,length=0,area=0;

length=getLength();

width=getWidth();

area=getArea(width,length);

displayData(width,length,area);

}

public static double getLength()
{  
   Scanner kb = new Scanner(System.in);
   System.out.println("Enter the rectangle's length: ");
   double length = kb.nextDouble();
   return length; 
}   

public static double getWidth()
{
   Scanner kb = new Scanner(System.in);
   System.out.println("Enter the rectangle's width: ");
   double width = kb.nextDouble();
   return width;
}

public static double getArea(double l, double w)
{
  
   double area = l * w;
   return area;
}

public static void displayData(double l, double w, double a)
{
   System.out.println("Rectangle's length: " + l);
   System.out.println("Rectangle's width: " + w);
   System.out.println("Rectangle's Area: " + a);
}






















}