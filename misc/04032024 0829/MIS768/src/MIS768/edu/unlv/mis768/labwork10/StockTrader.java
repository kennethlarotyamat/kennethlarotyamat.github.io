package edu.unlv.mis768.labwork10;
import java.text.DecimalFormat;
import java.util.Scanner;
import edu.unlv.mis768.labwork9.Stock;

public class StockTrader {
	public static void main(String[] args) {
		int sharesToBuy;  // Number of shares to buy.
	      
	      // Create a Stock object for the company stock.
	      // The trading symbol is XYZ and the stock is 
	      // currently $9.62 per share.
	      Stock compXYZ = new Stock("XYZ", 9.62);
	      
	      // Create a Scanner object for keyboard input.
	      Scanner keyboard = new Scanner(System.in);
	      
	      // Display the current share price.
	      System.out.println("The current price is: "+                      );

	                         
	      // Get the number of shares to purchase.
	      System.out.print("How many shares do you want to buy? ");
	      sharesToBuy = keyboard.nextInt();
	      
	      // Create a StockPurchase object for the transaction.
	      
	      
	      // Display the cost of the transaction.
	      DecimalFormat formatter = new DecimalFormat("'$'###,###,###.00");
	      System.out.println("The total cost is "+                                      );



	}

}
