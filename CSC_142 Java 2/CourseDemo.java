public class CourseDemo
{
   public static void main(String[] args)
   {
      Instructor myInstructor = new Instructor("Kramer", "Shawn", "UNA150");
      
      TextBook myTextBook = new TextBook("Starting Out with Java","Gaddis","Pearson");
      
      Course myCourse = new Course("Intro to Java", myInstructor, myTextBook);
      
      System.out.println(myCourse);
   }
}