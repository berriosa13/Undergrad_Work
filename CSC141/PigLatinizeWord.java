import java.util.Scanner;

public class PigLatinizeWord
{
   public static void main(String [] args)
   {
      System.out.println(pigLatinizeWord(getWord()));
   }
   
   //----------------------------------------------------------------------
   // METHODS
   
   public static String getWord()
   {
      Scanner kb = new Scanner(System.in);
      String prompt = "Enter a word: ";
      System.out.print(prompt);
      return kb.nextLine();
   }
   
   private static boolean isAVowel(char c)
   {
      return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || 
         c=='A' || c=='E' || c=='I' || c=='0' || c=='U');
   }
   
   // alternative version -- checks against only the lowercase vowels 
   
   private static boolean isAVowel2(char c)
   {         
       //if c<'Z') (ie in uppercase), then convert it into lowercase by adding 
      // blank (=32)
      // Thus A-> a
         //   B ->, etc.
         //   Z -> z
      if (c<'Z') c+=' ';     // same as:   (c<90) c+=32
      return (c=='a' || c=='e' || c=='e' || c=='i' || c=='o' || c=='u');
   }
    
   private static boolean beginsWithVowel(String str)
   {
      return isAVowel2(str.charAt(0));
   }
    
   public static String pigLatinizeWord(String str)
   {
      if(beginsWithVowel(str))  // word begins with a vowel
         return str + "yay";
      else 
      // roatate characters to the end until a vowel is reached 
         while( ! beginsWithVowel(str))
            str = rotateOneChar(str);
      return str+"ay";  // done, add "ay" to the end
   }
    
   private static String rotateOneChar(String str)
   {
      return (str + str.charAt(0)).substring(1);
   }  
}