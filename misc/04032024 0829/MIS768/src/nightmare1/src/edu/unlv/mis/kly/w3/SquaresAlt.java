package edu.unlv.mis.kly.w3;

import java.util.Scanner;

public class SquaresAlt {

	public static void main(String[] args) {
		int number; // Loop control variable
		
		// Scanner object for keyboard input
		Scanner kb = new Scanner(System.in);
		
		// Get user input for the size of the square table
		System.out.print("Please enter an integer for printing the squares table: ");
		number = kb.nextInt();
		
		// print the table header
		System.out.println("Number   Number Squared");
		System.out.println("-----------------------");
		
		// use a loop to print from 1 to the number entered
		for (int i=1; i<=number; i++) {
			// can also do    
			System.out.println(i+"      "+(i+1)*(i+1));
			
	        kb.close();
	         
	    }

	}

}

/*




// (int i=0; i<number; i++)
 * 
 * (int i=1; i<=number; i++)   
 */
// System.out.println(i+1+"      "+(i+1)*(i+1));
