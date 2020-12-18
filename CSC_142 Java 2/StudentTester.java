
public class StudentTester 
{   
   public static void main(String[] args) 
   {
      Student s1 = new Student("Anthony Berrios", 905436, 19);
      Student s2 = new Student("Austin Mizerak", 847352, 19);
      Student s3 = new Student("Nico Berrios", 294728, 16);
      
      System.out.println(s1.getName());
      System.out.println(s2.getName());
      System.out.println(s3.getName());
      System.out.println(s1.getID());
      System.out.println(s2.getID());
      System.out.println(s3.getID());
      System.out.println(s1.getAge());
      System.out.println(s2.getAge());
      System.out.println(s3.getAge());
      // s1.setAge(20);
      // s2.setAge(21);
      // s3.setAge(17);
      // System.out.println(s1.getAge());
      // System.out.println(s2.getAge());
      // System.out.println(s3.getAge());
   }
   
   
}

   
