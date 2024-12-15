// package edu.unlv.mis768.kly; // package edu.unlv.mis768.labwork10; // package edu.unlv.mis768.labwork10;
// // this is the demo class demo application
// import java.text.DecimalFormat;
// import java.util.Scanner;
// // import edu.unlv.mis768.labwork9.Stock;
// // So rather than importing the version from labwork9, i guess I'm setting it up so that it references
// // the Stock.java class from - the version from inside the same package.
// public class StockTrader {
// 	public static void main(String[] args) {
// 		int sharesToBuy;  // Number of shares to buy.
	      
// 	      // Create a Stock object for the company stock.
// 	      // The trading symbol is XYZ and the stock is 
// 	      // currently $9.62 per share.
// 	      Stock compXYZ = new Stock("XYZ", 9.62);
	      
// 	      // Create a Scanner object for keyboard input.
// 	      Scanner keyboard = new Scanner(System.in);
	      
// 	      // Display the current share price.
// 	      System.out.println("The current price is: "+   "compXYZ.getSharePrice());"                   );

	                         
// 	      // Get the number of shares to purchase.
// 	      System.out.print("How many shares do you want to buy? ");
// 	      sharesToBuy = keyboard.nextInt();
	      
// 	      // Create a StockPurchase object for the transaction.
// 	      StockPurchase tran = new StockPurchase(compXYZ,sharesToBuy); 
	      
// 	      // Display the cost of the transaction.
// 	      DecimalFormat formatter = new DecimalFormat("'$'###,###,###.00");
// 	      System.out.println("The total cost is "+ formatter.format(tran.getCost())                                     ); // I don't understand what happened in the video
// 	      // there is a keyboard shortcut or something that allows formatter.format to wrap tran.getCost into a set of parentheses



// 	}

// }
