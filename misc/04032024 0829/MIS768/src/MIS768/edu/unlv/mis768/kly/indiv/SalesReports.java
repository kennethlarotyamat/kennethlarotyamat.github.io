package edu.unlv.mis768.kly.indiv; // package edu.unlv.mis768.kly;// package nightmare1; // package edu.unlv.mis768.labwork5;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;
// D:\GitHub\MIS76810032024Sprg\src\nightmare1\src\nightmare1\MonthlySales.txt

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
//C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\src\nightmare1\src\nightmare1\MonthlySales.txt
//path for file name being used.
//the results that i get after running the program are different from what han-fen hu gets in the instruction video, but i think this 
//is because the data file that i'm using has different sales figures.
/*



int[] firstArray =
int[] secondArray = new int[5]

public static void showArray (int[] array) {
for (int i = o; i< array.length; i++)
S



 * */




/*package edu.unlv.mis768.kly; // package edu.unlv.mis768.labwork5;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SalesReports {
	/**
	This program opens a file containing the sales
	amounts for 30 days. It calculates and displays
	the total sales and average daily sales.
	 * @throws IOException 
	*/
	/*public static void main(String[] args) throws IOException  {
	      final int NUM_DAYS = 30;  // Number of days of sales
	      String filename;          // C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\src\nightmare1\src\edu\ unlv\mis768\kly\MonthlySales.txt // The name of the file to open // 
	      double totalSales;        // Total sales for period
	      double averageSales;      // Average daily sales
	      	/**/	
		  // declare a Scanner object for keyboard input
		  // 
		   /** 
		   */
		  // prompt the user to enter the file name
		  //System.out.print("File name please?");
		  // get the string from the user 
		  //filename = kb.nextLine();			
	      
	      // Get the total sales from the file.
	      //totalSales = getTotalSales(filename);
	      
	      // Calculate the average.
//	      averageSales = totalSales / NUM_DAYS;
	      
	      // Display the total and average.
//	      System.out.println("The total sales for the period is $"+totalSales);
//	      System.out.println("The average daily sales were $"+ averageSales);
//	}
//	
//	public static double getTotalSales(String filename) {

	
	
	
	
	
	
	
	
//	}
//
//}/*/

//  this creates double brackets 2 dimensional array // double [] [] scores = new double [3] [4]

/**
 * 	// Declare a reference to an array that will hold integers
 * 
 
 
 rows for a two dimensional array that are that have
 different lengths is called a ragged array
 
 specific number of rows, but no columns
 
 
 for (int row = 0; row < 3; row++) {
 for (int col = 0; col < 4; col ++){
 
 System.out.print ("Enter a score: ");
 scores [row] [col] = keyboard.nextDouble();
 }
 
 }
 
 
 float [] temperatures = new float [100];
 char [] letters = new char [41];
 long [] letters = new char [41]
 
 int numTests;
 int [] test;
 Scanner keyboard = new Scanner (System.in);
 System.out.print ("how many tests do you have?");
 numTests = keyboard.nextInt();
 tests = new int [numTests];
 
 
 
 
 ArrayList object automatically expend when new item is added
 or automatically shrinks 
 
 import java.util.ArrayList
 
 ArrayList<String> list = new ArrayList<String>(100);
 
 leave it blank
 nameList.add("James");
 nameList.add("Catherine");
 
 System.out.println(nameList);
 
 
 
 * 
 */

// Scanner kb = new Scanner(System.in);

//package edu.unlv.mis768.kly.indiv; // package edu.unlv.mis768.labwork5;
//import java.io.*;
//import java.text.DecimalFormat;
//import java.util.Scanner;
//
//public class SalesReports {
//	/**
//	This program opens a file containing the sales
//	amounts for 30 days. It calculates and displays
//	the total sales and average daily sales.
//	 * @throws IOException 
//	*/
//	public static void main(String[] args) throws IOException  {
//	      final int NUM_DAYS = 30; // Number of days of sales
//	      String filename;         // The name of the file to open
//	      double totalSales;       // Total sales for period
//	      double averageSales;     // Average daily sales
//	      		
//		  // declare a Scanner object for keyboard input
//		  Scanner kb = new Scanner(System.in);
//		  // prompt the user to enter the file name
//		  System.out.print("File name please?");
//		  // get the string from the user 
//		  filename = kb.nextLine();			
//	      
//	      // Get the total sales from the file.
//	      totalSales = getTotalSales(filename);
//	      
//	      // Calculate the average.
//	      averageSales = totalSales / NUM_DAYS;
//	      
//	      // Display the total and average.
//	      System.out.println("The total sales for the period is $"+totalSales);
//	      System.out.println("The average daily sales were $"+ averageSales);
//	}
//	
//	public static double getTotalSales(String filename) {
//
//	
//	
//	
//	
//	
//	
//	
//	
//	}
//
//}
