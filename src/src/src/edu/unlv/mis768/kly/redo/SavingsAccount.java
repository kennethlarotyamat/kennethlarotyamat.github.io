package edu.unlv.mis768.kly.redo;

public class SavingsAccount {
	
	private double balance;
	// private String balance;
	private double interestRate;
		
		public double getInterestRate() {
		return interestRate;
	}
		
	public void setInterestRate(double iRate) { 
		// public void setInterestRate(double interestRate) {
		// this.interestRate = interestRate;
		if(iRate<0)
			iRate=0;
		else if(iRate>.01)
			iRate /=100;
		interestRate=iRate;
	}
	public void setInterestRate(String iRateString) { 
		iRateString = iRateString.replaceAll("E", "3");
		iRateString = iRateString.replaceAll("b", "6");				// amountString = amountString.replace("b,d", "6"); // case sensitive // not case sensitive amountString = amountString.replaceAll("(?i)b,d", "6");
		iRateString = iRateString.replaceAll("[oO]", "0");			// amountString = amountString.replaceAll("[oO]", "0"); e3  3 E qwertyuioopppppp asdfghjkkl 
		iRateString = iRateString.replaceAll("\\s", "");
		double iRate = Double.parseDouble(iRateString);
																	// public void setInterestRate(double interestRate) {
																	// this.interestRate = interestRate;
		if(iRate<0)
			iRate=0;
		else if(iRate>.01)
			iRate /=100;
		interestRate=iRate;
	}
	public double getBalance() {
		// balance = balance.replaceAll("[oO]", "0");			// amountString = amountString.replaceAll("[oO]", "0"); e3  3 E qwertyuioopppppp asdfghjkkl 
		// balance = balance.replaceAll("\\s", "");
		// double balance = Double.parseDouble(balance);
		return balance;
	}
//	public String getBalance() {
//		double balance = Double.parseDouble(balanceString);
//		return balance;
//	}
	/*
	public double getBalance(String balanceString) {
	    return Double.parseDouble(balanceString);
	}
	
	Exception in thread "main" java.lang.NumberFormatException: For input string: "1oooOOO000"
	at java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
	at java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
	at java.base/java.lang.Double.parseDouble(Double.java:792)
	at edu.unlv.mis768.kly.redo.SavingsAccount.<init>(SavingsAccount.java:130)
	at edu.unlv.mis768.kly.redo.SavingsAccountDemo.main(SavingsAccountDemo.java:31)
	
	*/
	public void deposit (double amount) {
		if (amount<0)
			amount=0;
		balance+= amount;
	}
	public void deposit (String amountString) {
		amountString = amountString.replaceAll("E", "3");
		amountString = amountString.replaceAll("b", "6");				// amountString = amountString.replace("b,d", "6"); // case sensitive // not case sensitive amountString = amountString.replaceAll("(?i)b,d", "6");
		amountString = amountString.replaceAll("[oO]", "0");			// amountString = amountString.replaceAll("[oO]", "0"); e3  3 E qwertyuioopppppp asdfghjkkl 
		amountString = amountString.replaceAll("\\s", "");
		double amount = Double.parseDouble(amountString);
		if (amount<0)
			amount=0;
		balance+= amount;
	}
	public void withdraw (double amount) {
		if (amount<0)
			amount=0;
		balance-= amount;
		
	}
	public void withdraw (String amountString) {
		amountString = amountString.replaceAll("E", "3");
		amountString = amountString.replaceAll("b", "6");				// amountString = amountString.replace("b,d", "6"); // case sensitive // not case sensitive amountString = amountString.replaceAll("(?i)b,d", "6");
		amountString = amountString.replaceAll("[oO]", "0");			// amountString = amountString.replaceAll("[oO]", "0"); e3  3 E qwertyuioopppppp asdfghjkkl 
		amountString = amountString.replaceAll("\\s", "");					// d6  d 9    123456789000000000  b d  6
																	// amountString = amountString.replaceAll(" ", "");
	    double amount = Double.parseDouble(amountString); 			// I'm wondering if I should remove spaces too.
	    															// qwertyuiopasdfghjkl zxcvbnm
		if (amount<0)
			amount=0;
		balance-= amount;
		
	}
	
//	In addition to the constructor, withdraw() and deposit() with Strings as parameters should also be implemented.
//
//	(SavingsAccountDemo should not be revised.)
//
//	Please revise the methods and resubmit. Let me know if you need help.
//	Han-Fen Hu , Feb 25 at 2:55pm
	
	public void addInterest() {
		balance += interestRate * balance;
	}
		public SavingsAccount() {
		
	}
		// +SavingsAccount(iRateStr: String, balString: String)
		// +setInterest Rate(iRateStr: String): void
		// +deposit amountStr: String): void
		// +withdraw(amountStr: String): void
		
		// I'm already a little lost about what to do. // the garage door is broken , and I can't go out and work today, but this is kind of
		// a mixed problem blessing because now I HAVE to work on this, since I'm behind, and I can't really leave the house right now.
	public SavingsAccount(double iRate, double bal) {
		
			//		+SavingsAccount()
			//		+SavingsAccount(iRate: double, bal: double) 
			//		+SavingsAccount(iRateStr: String, balString: String)
			// The constructor SavingsAccount(String, String) is undefined
		
		if(bal<0)
			bal=0;
		
		balance = bal;
		
		if(iRate<0)
			iRate=0;
		else if(iRate>.01)
			iRate /=100;
		interestRate=iRate;
	}
	
	public SavingsAccount(String iRateString, String balString) { 
		
		//method overload to string// public SavingsAccount(double iRate, double bal) {
		
		//		+SavingsAccount()
		//		+SavingsAccount(iRate: double, bal: double) 
		//		+SavingsAccount(iRateStr: String, balString: String)
		// The constructor SavingsAccount(String, String) is undefined
		
	    double iRate = Double.parseDouble(iRateString);
	    double bal = Double.parseDouble(balString);	
	if(bal<0)
		bal=0;
	
	balance = bal;
	
	if(iRate<0)
		iRate=0;
	else if(iRate>.01)
		iRate /=100;
	interestRate=iRate; // Type mismatch: cannot convert from String to double
}

}
