public class Course
{
   private String courseName;
   private Instructor instructor;
   private TextBook textBook;
   
   public Course(String name, Instructor instr, TextBook text)
   {
      courseName = name;
      instructor = new Instructor(instr);
      textBook = new TextBook(text);
   }
   
   public String getName()
   {
      return courseName;
   }
   
   public Instructor getInstructor()
   {
      //return a copy of the instructor object.
      return new Instructor(instructor);
   }
   
   public TextBook getTextBook()
   {
      //return a copy of textbook object
      return new TextBook(textBook);
   }
   
   public String toString()
   {
      String str = "Course name: "+courseName+
         "\nInstructor information: \n"+instructor+
         "\nTextbook Inforamtion:\n" + textBook;
      return str;
   }
}