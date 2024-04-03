package edu.unlv.mis768.week2;

import java.util.Scanner;

public class GradedConcertTicketWithSwitch {
	public static void main(String[] args) {
		char ticketClass; // A character entered by the user

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter Ticket Class 1, 2, 3 or 4: ");

		ticketClass = keyboard.next().charAt(0);

		switch (ticketClass) {
			case '1':

				System.out.print("Ticket Class 1 has been added to your cart, the amount due is $15");
				break;
			case '2':

				System.out.print("Ticket Class 2 has been added to your cart, the amount due is $15");
				break;
			case '3':

				System.out.print("Ticket Class 3 has been added to your cart, the amount due is $25");
				break;
			case '4':

				System.out.print("Ticket Class 4 has been added to your cart, the amount due is $35");
				break;
			default:
				System.out.print("The ticket class entered is not a valid ticket class");

				keyboard.close();
		}
	}

}

/*
 * 
 * 
 * 
 * if(ticketClass == '1') {
 * System.out.
 * print("Ticket Class 1 has been added to your cart, the amount due is $15");
 * 
 * }
 * else if(ticketClass =='2') {
 * System.out.
 * print("Ticket Class 2 has been added to your cart, the amount due is $15");
 * 
 * }
 * else if(ticketClass =='3') {
 * System.out.
 * print("Ticket Class 3 has been added to your cart, the amount due is $25");
 * 
 * }
 * else if(ticketClass =='4') {
 * System.out.
 * print("Ticket Class 4 has been added to your cart, the amount due is $35");
 * 
 * }
 * else {
 * System.out.print("The ticket class entered is not a valid ticket class");
 * 
 * }
 * 
 */

// Determine the grade point entered.

// there is no nextChar() method
// we need to use next().charAt(0).
// next() returns the next word in the input as a string
// and charAt(0) function returns the first character in that string.

// Get one of the numbers 1, 2, or 3 from the user.
