public class test3{

public static void main(String[] args) {


public static void f(int x, int a, int b, int c)
{
   if(x > 0)
   {
      f(x-1, a, c, b);
      System.out.printf("x: %d, a: %d, b:%d /n", x, a, b);
      f(x-1, c, b, a);
   }
   
} 

}   
}    