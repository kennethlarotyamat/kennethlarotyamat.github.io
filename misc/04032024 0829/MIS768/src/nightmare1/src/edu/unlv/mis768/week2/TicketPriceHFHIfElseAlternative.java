package edu.unlv.mis768.week2;

import java.util.Scanner;

public class TicketPriceHFHIfElseAlternative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String CLASS_1_AND_2 = "$15";
		final String CLASS_3 = "$25";
		final String CLASS_4 = "$35";
		final String OTHER = "Invalid";
		
		String input = "";
		String result = "";
		
		Scanner kb = new Scanner (System.in);
		
		System.out.print("Please enter the ticket class: ");
		input = kb.nextLine();
		
		if (input.equals("1") || input.equals("2"))
			result = CLASS_1_AND_2;
//		else if (input.equals("2"))
//			result = CLASS_2;
		else if (input.equals("3"))
			result = CLASS_3;
		else if (input.equals("4"))
			result = CLASS_4;
		else
			result = OTHER;
		System.out.print("The Price is: "+result);
		
		kb.close();
	}


}
/*
 

Spring 24 Office Hours-Han-fen Hu
tuesday & thursday 12 pm - 2 pm






 */
