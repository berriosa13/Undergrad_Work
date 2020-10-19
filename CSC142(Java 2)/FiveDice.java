
public class FiveDice
{
 
   public static void main(String[] args)
   {
   
      Die die1 = new Die(6);
      Die die2 = new Die(6);
      Die die3 = new Die(6);
      Die die4 = new Die(6);
      Die die5 = new Die(6); 
      
      die1.roll();
      die2.roll();
      die3.roll();
      die4.roll();
      die5.roll();
      
      System.out.println("Player roll: " + die1.getValue() + " " + die2.getValue() +
      " " + die3.getValue() + " " + die4.getValue() + " " + die5.getValue());
      
      if(fiveKind(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())!=-1)
         
         System.out.println("Player has a pair of " + fiveKind(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue()) +"s.");
         
      else if(fourKind(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())!=-1)
      
         System.out.println("Player has a pair of " + fourKind(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())+"s.");
      
      else if(threeKind(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())!=-1)
      
         System.out.println("Player has a pair of " + threeKind(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())+"s.");
      
      else if(pair(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())!=-1)
      
         System.out.println("Player has a pair of " + pair(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())+"s.");
                
      
   }
  
   public static int fiveKind(int die1, int die2, int die3,int die4, int die5)
   {
      if(die1==die2&&die2==die3&&die3==die4&&die4==die5)  // returns die1 if all die are equal to eachother
         return die1;
      else 
         return -1;  // returns -1 if not fiveKind
   
   }
  
   public static int fourKind(int die1, int die2, int die3, int die4, int die5)
   {
   
      if (die1==die2&&die2==die3&&die3==die4)
         return die1; 
      
      else if (die2==die3&&die3==die4&&die4==die5)
         return die2;
      
      else if (die3==die4&&die4==die5&&die5==die1)
         return die3;
         
      else if (die4==die5&&die5==die1&&die1==die2)
         return die4;
         
      else if (die5==die1&&die1==die2&die2==die3)
         return die5;
      else
         return -1;       
             
   }   
 
  
   public static int threeKind(int die1, int die2, int die3,int die4, int die5)
   {
      if (die1==die2&die2==die3||die1==die3&&die3==die4||die1==die4&&die4==die5)
         return die1;
            
      else if(die2==die3&&die3==die4||die2==die4&&die4==die5)
         return die2;
       
      else if(die3==die4&&die4==die5)
         return die3;
      else
         return -1;
                                       
   }
  
   public static int pair(int die1, int die2, int die3,int die4, int die5)
   {
   
   int high = -1;
   
      if(die1==die2)
         if (high < die1)
         high = die1;
      
      
      if(die1==die3)
         if (high < die1)
         high = die1;
      
      if(die1==die4)
         if (high < die1)
         high = die1;  
      
      if(die1==die5)
         if (high < die1)
         high = die1;
         
      if(die2==die3) 
         if (high < die2)
         high = die2;
         
      if(die2==die4)
         if (high < die2)
         high = die2;

         
      if(die2==die5) 
         if (high < die2)
         high = die2;

      
      if(die3==die4)
         if (high < die3)
         high = die3;

      
      if(die3==die5)
         if (high < die3)
         high = die3;
      
      if(die4==die5)
         if (high < die4)
         high = die4; 
         
         return high;
                              
     
                    
          
   }
  

   
  
}