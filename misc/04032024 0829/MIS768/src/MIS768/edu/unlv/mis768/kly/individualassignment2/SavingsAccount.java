package edu.unlv.mis768.kly.individualassignment2;

public class SavingsAccount {

	private double balance;
	private double interestRate;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double iRate) {

		if (iRate < 0)
			iRate = 0;
		else if (iRate > .01)
			iRate /= 100;
		interestRate = iRate;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount < 0)
			amount = 0;
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount < 0)
			amount = 0;
		balance -= amount;

	}

	public void addInterest() {
		balance += interestRate * balance;
	}

	public SavingsAccount() {

	}

	public SavingsAccount(double iRate, double bal) {

		if (bal < 0)
			bal = 0;

		balance = bal;

		if (iRate < 0)
			iRate = 0;
		else if (iRate > .01)
			iRate /= 100;
		interestRate = iRate;
	}

	public SavingsAccount(String iRateString, String balString) {

		double iRate = Double.parseDouble(iRateString);
		double bal = Double.parseDouble(balString);
		if (bal < 0)
			bal = 0;

		balance = bal;

		if (iRate < 0)
			iRate = 0;
		else if (iRate > .01)
			iRate /= 100;
		interestRate = iRate;
	}

}

	// startingBalance
// public void setInterestRate(double interestRate) { 		// this.interestRate = interestRate;
		// +SavingsAccount(iRateStr: String, balString: String)
		// +setInterest Rate(iRateStr: String): void
		// +deposit amountStr: String): void
		// +withdraw(amountStr: String): void
		
		// I'm already a little lost about what to do. // the garage door is broken , and I can't go out and work today, but this is kind of
		// a mixed problem blessing because now I HAVE to work on this, since I'm behind, and I can't really leave the house right now.
//method overload to string// public SavingsAccount(double iRate, double bal) {
//		+SavingsAccount()
//		+SavingsAccount(iRate: double, bal: double) 
//		+SavingsAccount(iRateStr: String, balString: String)
// The constructor SavingsAccount(String, String) is undefined
//Type mismatch: cannot convert from String to double
//		+SavingsAccount()
//		+SavingsAccount(iRate: double, bal: double) 
//		+SavingsAccount(iRateStr: String, balString: String)
// The constructor SavingsAccount(String, String) is undefined
// startingBalance
