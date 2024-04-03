package mis768unlv;

import java.util.Scanner;

public class GradePointCalculatorWithSwitch {
	public static void main(String[] args) {
		char grade; // A character entered by the user

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get one of the numbers 1, 2, or 3 from the user.
		System.out.print("Enter A, B, or C: ");
		// there is no nextChar() method
		// we need to use next().charAt(0).
		// next() returns the next word in the input as a string
		// and charAt(0) function returns the first character in that string.
		grade = keyboard.next().charAt(0);

		// Determine the grade point entered.
		switch (grade) {
			case 'A':
			case 'a':
				System.out.print("4.0");
				break;
			case 'B':
			case 'b':
				System.out.print("3.0");
				break;
			case 'C':
			case 'c':
				System.out.print("2.0");
				break;
			default:
				System.out.print("0.0");

		}
		keyboard.close();
	}

}



/*






		  try {

		  } finally {
            keyboard.close();
        }


  
 */
