public class Student {
   private String name; 
   private int ID, age;
   
   public Student(String n, int i, int a) 
   {
      ID = i;
      age = a;
      name = n;
   }

   public int getAge() {
      return age;
   }   

   public void setAge(int newAge) {
      age = newAge;
   }   

   public String getName() {
      return name;
   }

   public int getID() {
      return ID;
   }
      
                     
}