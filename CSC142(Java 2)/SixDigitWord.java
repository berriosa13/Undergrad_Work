import java.util.Scanner;

public class SixDigitWord {

       public static void main(String[] args) {

              System.out.println("DIRECTIONS: Enter the same SIX digit word FOUR times to " + "" +
                      "get the 3, 4, 5, & 6 digit combinations." + "\n");

              printThreeCombs(validateString(),"");
              printFourCombs(validateString(),"");
              printFiveCombs(validateString(), "");
              printSixCombs(validateString(),"");
       }

       public static String validateString() {

              Scanner kb = new Scanner(System.in);
              boolean b = false;
              String word;
              do {
                     System.out.print("Please enter a 6 digit word: ");
                     word = kb.nextLine();
                     boolean bool = true;

                     char[] ch = word.toCharArray();

                     for (char c : ch) {
                            if (!Character.isLetter(c)) {
                                   bool = false;
                            }
                     }
                     if (word.length() == 6 && bool)
                            b = true;
                     else
                            System.out.print("Must be 6 digits and ONLY letters. ");

              } while(!b);

              return word.toUpperCase();
       }

       public static void printThreeCombs(String x, String y) {

              if (x.length() == 3) {
                     System.out.print(y + "\n");
                     return;
              }

              for (int i = 0; i < x.length(); i++) {
                     char ch = x.charAt(i);
                     String str = x.substring(0, i) +
                             x.substring(i + 1);
                     printThreeCombs(str, y + ch);
              }
       }
       public static void printFourCombs(String x, String y) {

              if (x.length() == 2) {
                     System.out.print(y + "\n");
                     return;
              }
              for (int i = 0; i < x.length(); i++) {
                     char ch = x.charAt(i);
                     String str = x.substring(0, i) +
                             x.substring(i + 1);
                     printFourCombs(str, y + ch);
              }
       }
       public static void printFiveCombs(String x, String y) {

              if (x.length() == 1) {
                     System.out.print(y + "\n");
                     return;
              }

              for (int i = 0; i < x.length(); i++) {
                     char ch = x.charAt(i);
                     String str = x.substring(0, i) +
                             x.substring(i + 1);
                     printFiveCombs(str, y + ch);
              }
       }
       public static void printSixCombs(String x, String y) {

              if (x.length() == 0) {
                     System.out.print(y + "\n");
                     return;
              }

              for (int i = 0; i < x.length(); i++) {
                     char ch = x.charAt(i);
                     String str = x.substring(0, i) +
                             x.substring(i + 1);
                     printSixCombs(str, y + ch);
              }
       }



}


