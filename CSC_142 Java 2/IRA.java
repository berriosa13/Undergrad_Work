/*
Name:        Anthony Berrios
Date:        9/24/18
Title:       IRA.java
Description: Program that repeatedly performs deposits
             interest calculations, etc on
             the bank account object.
             
*/

public class IRA {

public static void main(String[] args) {

BankAccount bank = new BankAccount(); // Creates instance of BankAccout 
int age = 22; // field
bank.setBalance(0.00); // field

while( bank.getBalance() < 1000000) // loop iterates as long as balance is less than 1 million
{
   age++; // increases age by one after every iteration
  bank.setBalance(bank.getInterest() +
  bank.getBalance() + 2000); // sets balance, gets the new balance plus interest, and adds 2000 to that amount.
}

System.out.println(age); // prints out age when IRA holds 1 million

  }
  
}             

