/*

Anthony Berrios

ab905436@wcupa.edu

*/

public class Car
{
   // intialize fields
   int year;
   String brand;
   int price;
   static int number;
   
public Car()
{
   // set fields equal to first car object
   brand = "Chevy";
   year = 2005;
   price = 3000;
   number++;
}

// constructor
public Car( String b, int y, int p)
{
   brand = b;
   year = y;
   price = p;
   number++;
   
}

// mutator for car year field 
public void setYear( int y)
{
   year = y;
}

// mutator for car brand field
public void setBrand( String b)
{
   brand = b; 
}

// mutator for car price field
public void setPrice( int p)
{
   price = p;
}

// accessor method for car year
public int getYear()
{
   return year;
}

// accessor method for car brand
public String getBrand()
{
   return brand;
}

// accessor method for car price
public int getPrice()
{
   return price;
}

// accessor method for car amount
public int getNumber()
{
   return number;
}
   
} // end of class file                   