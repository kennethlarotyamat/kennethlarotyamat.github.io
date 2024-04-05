package edu.unlv.mis768.kly.redo;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class SavingsAccountDemo {

	public static void main(String[] args) {
		String startingBalance; 	//Starting balance
		String monthlyInterestRate; //Monthly interest rate
		int numOfMonth; 			//Number of months that have passed since the amount was established.
		String withdraw;			//The amount of withdraw for each month
		String deposit;				//The amount of deposit for each month
		
		DecimalFormat ft = new DecimalFormat("$###,###.00");
		
		//get the user input of starting balance
		startingBalance = JOptionPane.showInputDialog("Please enter the starting balance: ").replaceAll("\\s", "").replaceAll("[oO]", "0");
		
		//get  the user input of the interest rate
		monthlyInterestRate = JOptionPane.showInputDialog("Please enter the monthly interest rate: ").replaceAll("\\s", "");
		
		//get the user input of  numbers of months that have passed.
		// parse the string to integer
		numOfMonth = Integer.parseInt(JOptionPane.showInputDialog("How many months have passed by since the account was established? ").replaceAll("\\s", "")); // Double.parseDouble() // I had to do this after testing the program again // numOfMonth = Integer.parseInt(JOptionPane.showInputDialog("How many months have passed by since the the account was established? "));
		
		//Create a SavingAccount object
		//At the same time set the starting balance and the interestRate
		SavingsAccount myAccount = new SavingsAccount(monthlyInterestRate,startingBalance); // The constructor SavingsAccount(String, String) is undefined
/*
    Exception in thread "main" java.lang.NumberFormatException: For input string: "00001.000"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:662)
	at java.base/java.lang.Integer.parseInt(Integer.java:778)
	at edu.unlv.mis768.kly.redo.SavingsAccountDemo.main(SavingsAccountDemo.java:27)		
 */
		//User a for loop to loop through the months
		//Starts from 1, ends at the month specified by the user, with an increment of 1 
		for (int i =1; i <= numOfMonth; i++) {
			
			//get the user input of withdraw amount
			withdraw=JOptionPane.showInputDialog("Please enter the withdraw amount for month " + i +": ").replaceAll("\\s", "");
			
																																			//			withdraw the amount using the object's withdraw method
			//String withdrawString = JOptionPane.showInputDialog("Please enter the withdraw amount for month " + i +": ");																		//			String withdrawString = "123.45";
			double withdrawAmount = Double.parseDouble(withdraw);																			//			double withdrawAmount = Double.parseDouble(withdrawString);
			myAccount.withdraw(withdrawAmount); 																							// 			The method withdraw(double) in the type SavingsAccount is not applicable for the arguments (String)
			
			//get the user input of withdraw amount
			deposit = JOptionPane.showInputDialog("Please enter the deposit amount for month " +i+": ").replaceAll("\\s", "");
			//String depositString = JOptionPane.showInputDialog("Please enter the deposit amount for month " +i+": ");
			double depositAmount = Double.parseDouble(deposit);
			//deposit the amount using the object's deposit method
			myAccount.deposit(depositAmount); // myAccount.deposit(deposit);
			
			//add interest for this month using the object's addInterest method
			myAccount.addInterest();
		}
		
		//Print out the ending balance
		JOptionPane.showMessageDialog(null,"The ending balance is " + ft.format(myAccount.getBalance()));
	}
}





// constructors have the same name as the class, have no return type, not even void
// public RoulettePocket (int num) {number = num;}
// package edu.unlv.mis768.labwork8;
/*
Lab
- SavingsAccount
- Based on the class diagram, please implement the class
Savings Account
-interestRate : double
-balance: double
+SavingsAccount()
+SavingsAccount(iRate: double, bal: double) +SavingsAccount(iRateStr: String, balString: String)
+getInterest Rate(): double
+setInterest Rate (interestRate: double): void
+setInterest Rate (iRateStr: String): void
+getBalance(): double
+deposit(amount: double): void
+deposit(amountStr: String): void
+withdraw(amount: double): void
+withdraw(amountStr: String): void
+addInterest(): void
UNIV

BankAccount
-balance:double
+BankAccount()
+BankAccount(startBalance:double)
+BankAccount(strString):
+deposit(amount:double):void
+deposit(str:String):void
+withdraw(amount:double):void
+withdraw(str:String):void
+setBalance(b:double):void
+setBalance(str:String):void
+getBalance():double


*/
