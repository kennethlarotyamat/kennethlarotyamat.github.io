package edu.unlv.mis768.kly.individualassignment2; // package edu.unlv.mis768.labwork9;

import java.text.DecimalFormat;

// import javax.swing.JOptionPane; 		// commented out to remove warning // may need to reactivate later

public class TwoCoinTossing {
	public static void main(String[] args) {
		//Define the format of the numbers
		DecimalFormat formatter = new DecimalFormat("0.00"); // allows 2 decimal places 
		// version in SavingsAccountDemo - DecimalFormat ft = new DecimalFormat("$###,###.00");
		// JOptionPane.showMessageDialog(null,"The ending balance is " + ft.format(myAccount.getBalance()));
		
		//Starting balance
		double balance = 0.0;
		//Create the two coins
		Coin quarter = new Coin();
		Coin dime = new Coin();
		
		//Toss the quarter
		//If it lands heads-up, add 25 cents to the balance
		quarter.toss();
		System.out.println(quarter.getSideUp());
		if (quarter.getSideUp().equalsIgnoreCase("heads"))
			balance = balance + 0.25;
		//If the dime lands heads-up, add 10 cents to the balance
		dime.toss();
		System.out.println(dime.getSideUp());
		if (dime.getSideUp().equalsIgnoreCase("heads"))
			balance = balance + 0.10;
			
		System.out.print("The ending balance is: ");
		//Print the balance using the formatter
		System.out.println("$"+formatter.format(balance));
	}
}
