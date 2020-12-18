public class Notes

print/println - can be hard to use
int x =4, y=5; // print 4=+5+9
System,out.print(x+"+"y+"="+(x+y));
ok, but rricky. Easier is 
print this- "_+_=_,x,y,(x+y) 

Printf continued
We need:
-a new String escape: %(the specifier char)
-We need to specify the type of the value to be "sliced in"
%d is for ints. So %d is the Specifier for an int.
System.out.printf

Threes Speficiers 
-%d : int
-%f : double
-%s : String 
(There are many others, we ignore them).
%d - splice in an int
%nd - splice in an int in a field width of n with the value right unjustified. 
int x=4, y=5 
System.printf("%3d+%3d=%3d",x,y,(x+y)); 
//output
__4 + __5 = __9

%d - what if the field is to small for the int?
   A - The field width expands automatically to be just big enough.
   
Statement Vs. Expression
int max;
if (x>y)
   max = x
else
int max = (x>y)? x:y;

%f -- spilce in a double 

%8.4 --spilce in a double in a total field width of 8.(decimal point counts as a spot)
 with 4 digits after point rounded
 
%8f -- also allowed

%4f -- also allowed 
comma: %8.4 - inserts a comma every 3 digits. Agian, if field is too small
 it expands to be just big enough. 

%s -- spilce in a string 
%12s -- splice in a string in a field of 12 
%s -- spilce in a string in uppercase 
Again, if field is too small it expands to be just as big enough 
***If you want to put a precent sign in printf string use %% ***

What if we want an output where
int x=10
String name = tom output: It's 10% Tom
System.out.printf("it\'s %d%%,%s.",x,name");
String Comparison 
relationship operators (<,<=,>>=,==,)
String s1= "tom" if (s1==s2) legal but DO NOT USE
       s2= "sam" Use: if(s1.equals(s2))
s1.equalsIgnoreCase(s2)

Strings ca also be compared 
(for less than, greater than, ...)  Note these cases too: "111" < "222" )and 111<222)
- All these are true                                      "111" < "22"
"aaa" < "abc"
"aaa" < "bbb"
"AAA" < "aaa"
"aa_"   "aaa" (note blank)

String - comapareTo
s1.compareTo(s2) = 0, if s1=s2
s1.compareTo(s2) = a negative #, if s1<s2
Also note - s1.compareToIgnoreCase

Decimal Format Class
-Another way to format decimal #'s (doubles)
import.java.text.Decimal.format;
double x=0.1

//create a Decimalformat object
DecimalFormatfMat = new Decimal Format("0.00");
System.out.println(fMat.format(x));
 0- display digit if present, else nothing
 ex. - "0.000" - 3 digits after point(rounded) one digit before even if 0
     - "#.00"  - 2 digits after point no digits nefore unless real
     
 -Inserting commas
 "#,##0.000" - commas every 3 digits
 "#,#.000"   - commas every digit
 -Currency
 "$0.00" - $ sign at front
 -Percentages
 "00.00%" - add % and value *100

  
     
