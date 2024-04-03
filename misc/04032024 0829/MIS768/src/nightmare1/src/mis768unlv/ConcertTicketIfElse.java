package mis768unlv;

import java.util.Scanner;

public class ConcertTicketIfElse {

	public static void main(String[] args) {
	      char ticketClass;       
	      
	      Scanner keyboard = new Scanner(System.in);
	      




		  try {
			System.out.print("Enter Ticket Class 1, 2, 3 or 4: ");

			ticketClass = keyboard.next().charAt(0); 

            if (ticketClass == '1') {
                System.out.print("Ticket Class 1 has been added to your cart, the amount due is $15");
            } else if (ticketClass == '2') {
                System.out.print("Ticket Class 2 has been added to your cart, the amount due is $15");
            } else if (ticketClass == '3') {
                System.out.print("Ticket Class 3 has been added to your cart, the amount due is $25");
            } else if (ticketClass == '4') {
                System.out.print("Ticket Class 4 has been added to your cart, the amount due is $35");
            } else {
                System.out.print("The ticket class entered is not a valid ticket class");
            }
        } finally {
            keyboard.close();
        }
    }
}




 

// Close the Scanner in the finally block
// I got a note that there is an issue with my code, and that it's that I have to close the keyboard
// at the end of the code.

// Determine the grade point entered.
// there is no nextChar() method
// we need to use next().charAt(0). 
// next() returns the next word in the input as a string 
// and charAt(0) function returns the first character in that string.
// Get one of the numbers 1, 2, or 3 from the user.
//A character entered by the user

// Create a Scanner object for keyboard input.
