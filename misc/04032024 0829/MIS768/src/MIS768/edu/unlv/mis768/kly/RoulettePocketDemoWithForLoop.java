package edu.unlv.mis768.kly;

import java.text.DecimalFormat;
import java.util.Random;

public class RoulettePocketDemoWithForLoop {
	   public static void main(String [] args)   {
		   String black = "\u001B[30m";
		   String red = "\u001B[31m";
	        String green = "\u001B[32m";
	        String reset = "\u001B[0m";

		   for (int i = 0; i < 10; i++) {Random rand = new Random();

		   int num = rand.nextInt(37);
	

		   RoulettePocket pocket = new RoulettePocket();

		   pocket.setNumber(num);
		   DecimalFormat formatter = new DecimalFormat("00");

		   
		   String color = pocket.getColor();
		   
		   String coloredText = "";
	        if ("red".equals(color)) {
	            coloredText = red + "red"+reset;
	        } else if ("black".equals(color)) {
	            coloredText = black + "black"+reset;
	        } else if ("green".equals(color)) {
	            coloredText = green + "green"+reset;
	        }
		   
		   
		   System.out.println("The number is: "+formatter.format(pocket.getNumber())+" and the color is "+coloredText);
		   
		   }
		   
		   
		   
		   
		   

	   }
}


// generate a random number between 0 (inclusive) and 37(exclusive)
// instantiate a Roulette Pocket object
// set the number		   
// I wanted this to have leading zeroes		   

// print out the number and color for testing //       for (int i = 0; i < array.length; i++) // from sales reports		   
//  + coloredText) // pocket.getColor()		   
//+ number  + number 	        + number  String red = "\u001B[31m";
// String green = "\u001B[32m";
// String reset = "\u001B[0m";
// Create a Random object for generating random numbers		   
/*
 * 			
 * DecimalFormat formatter = new DecimalFormat("#,###.00"); // formats the number

	// Display the total and average.
	System.out.println("The total sales for the period is $" + formatter.format(totalSales)); // System.out.println(formatter.format(number1));
	System.out.println("The average daily sales were $" + formatter.format(averageSales));
	*/
// so if you put the for loop -- for (int i = 0; i < 10; i++) {Random rand = new Random(); -- just around the print command, you get the same
// number generated over and over or the same statement over and over.
// the for loop has to be started before the random number is generated.
// unfortunately i was not recording the work from the very beginning, so I had to do it -- i had to make the video by doing undo and redo.
// package edu.unlv.mis768.labwork8;
