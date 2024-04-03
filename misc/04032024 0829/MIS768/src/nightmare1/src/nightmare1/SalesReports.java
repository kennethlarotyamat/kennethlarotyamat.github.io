package nightmare1; // package edu.unlv.mis768.labwork5;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

// C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\src\nightmare1\src\nightmare1\MonthlySales.txt
// path for file name being used.
// the results that i get after running the program are different from what han-fen hu gets in the instruction video, but i think this 
// is because the data file that i'm using has different sales figures.

public class SalesReports {
	/**
	 * This program opens a file containing the sales
	 * amounts for 30 days. It calculates and displays
	 * the total sales and average daily sales.
	 * 
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException { // i only entered the throws IO exception for the method
																// below, not this one, but it seems to have been added
																// automatically to all the methods
		final int NUM_DAYS = 30; 								// Number of days of sales
		String filename; 										// The name of the file to open
		double totalSales; 										// Total sales for period
		double averageSales; 									// Average daily sales

		// declare a Scanner object for keyboard input
		Scanner kb = new Scanner(System.in);
		try {// prompt the user to enter the file name
			System.out.print("File name please?");
			// get the string from the user
			filename = kb.nextLine();

			// Get the total sales from the file.
			totalSales = getTotalSales(filename);

			// Calculate the average.
			averageSales = totalSales / NUM_DAYS;
			DecimalFormat formatter = new DecimalFormat("#,###.00"); // formats the number

			// Display the total and average.
			System.out.println("The total sales for the period is $" + formatter.format(totalSales)); // System.out.println(formatter.format(number1));
			System.out.println("The average daily sales were $" + formatter.format(averageSales));
		} finally {
			kb.close();
		} // System.out.println(formatter.format(number1)); // "The average daily sales
			// were $"+ averageSales // System.out.println("The average daily sales were $"+
			// averageSales);} finally {kb.close();} //
		/**
		 * 
		 * 
		 * File name please?
		 * C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\src\nightmare1\src\nightmare1\MonthlySales.txt
		 * The total sales for the period is $56437.41999999999
		 * Exception in thread "main" java.lang.IllegalArgumentException: Cannot format
		 * given Object as a Number
		 * at java.base/java.text.DecimalFormat.format(DecimalFormat.java:546)
		 * at java.base/java.text.Format.format(Format.java:159)
		 * at nightmare1/nightmare1.SalesReports.main(SalesReports.java:40)
		 * 
		 */

	}

	public static String getFileName() {

		Scanner kb = new Scanner(System.in); // Scanner Object
		try {
			System.out.print("Please enter the file name:");
			return kb.nextLine(); // it isn't clear to me where to put kb.close(); because i have opened a
									// keyboard twice
		} finally {
			kb.close();
		}

		/**
		 * 0 digit always displays
		 * # leading zeroes omitted
		 * % percentage shows
		 * DecimalFormat formatter = new DecimalFormat("#0.00")
		 * DecimalFormat formatter = new DecimalFormat("#0.00")
		 * DecimalFormat formatter = new DecimalFormat("00.00")
		 * can add a thousands separator - can add a percentage sign
		 * System.out.println(formatter.format(number1));
		 */

	}

	public static double getTotalSales(String filename) throws IOException { // need to add a throws declaration, but
																				// not the main method
		double sales;
		double total = 0;

		// sales = iFile.nextDouble(); I accidentally typed these in the wrong order, so
		// I copied and pasted them below and commented these lines out
		// total+= sales;
		// C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\src\nightmare1\src\nightmare1\MonthlySales.txt
		File file = new File(filename);
		try (Scanner iFile = new Scanner(file)) { // i don't understand what just happened, but it only has a try block.
													// but i guess it's fixed.
			while (iFile.hasNext()) {
				sales = iFile.nextDouble();
				total += sales;

			}
		}

		return total;

	}

}

/*



int[] firstArray =
int[] secondArray = new int[5]

public static void showArray (int[] array) {
for (int i = o; i< array.length; i++)
S



 * */
