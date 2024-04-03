package edu.unlv.mis768.week2;

import java.util.Scanner;

public class TicketPriceHFHSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare constants
		final String CLASS_1 = "$15";
		final String CLASS_2 = "$15";
		final String CLASS_3 = "$25";
		final String CLASS_4 = "$35";
		final String OTHER = "Invalid";
		// declare variable
		String input = ""; //variable to store user input
		String result = ""; // result to be determined by the program
		
		// Scanner object for keyboard input
		Scanner kb = new Scanner (System.in);
		//Get user input
		System.out.print("Please enter the ticket class: ");
		input = kb.nextLine();
		
		// use a switch-case statement to determine the price
		
		switch(input) {
			case "1":
				result = CLASS_1;
				break;
			case "2":
				result = CLASS_2;
				break;
			case "3":
				result = CLASS_3;
				break;
			case "4":
				result = CLASS_4;
				break;
			default:
				result = OTHER;
		}
		//display the result
		System.out.print("The price is: " +result);
		kb.close();

	}

}
