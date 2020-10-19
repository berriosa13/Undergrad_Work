import java.util.ArrayList;
public class arrayList
{
   public static void main(String[] args)
   {
      ArrayList<String> nameList = new ArrayList<String>();
      add(nameList);
      delete(nameList);
      replace(nameList);
      insert(nameList);
      
    }
    public static void add(ArrayList<String> name)
    {
      name.add("Tom");
      name.add("Evan");
      name.add("James");
      System.out.println("The size of nameList is "+name.size());
      for (int i=0; i<name.size(); i++)
          System.out.println(name.get(i));
    }
   public static void delete(ArrayList<String> name)
   {
      name.remove(1); //delete one element at index number 1 by using method remove90
      System.out.println("The nameList in delete method is");
      for(String n: name)
      System.out.println(n);
   }
   public static void replace(ArrayList<String> name)
   {
      name.set(1,"Jerry");
      System.out.println("The nameList in replace method is");
      System.out.println(name);
      for(String n: name)
      System.out.println(n);
   }
   public static void insert(ArrayList<String> name)
   {
      name.add(1,"George");
      System.out.println("The nameList in insert method is");
      System.out.println(name);  
   }
   
   
 }