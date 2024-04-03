package edu.unlv.mis768.kly;

import java.text.DecimalFormat;
import java.util.Random;

public class RoulettePocketDemo {
	   public static void main(String [] args)   {
		   String black = "\u001B[30m";
		   String red = "\u001B[31m";
	        String green = "\u001B[32m";
	        String reset = "\u001B[0m";
		   // Create a Random object for generating random numbers
		   Random rand = new Random();
		   // generate a random number between 0 (inclusive) and 37(exclusive)
		   int num = rand.nextInt(37);
	
		   // instantiate a Roulette Pocket object
		   RoulettePocket pocket = new RoulettePocket(num);
		   pocket.setNumber(num);
		   DecimalFormat formatter = new DecimalFormat("00");
		   // set the number
		   //pocket.setNumber(num);
		   
		   // print out the number and color for testing
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


// package edu.unlv.mis768.labwork8;

// no-arg Constructor
