package edu.unlv.mis768.labwork12;

import java.util.Scanner;

public class BusinessStudentDemo {

	public static void main(String[] args) {
		// Create a Scanner object for keyboard input.
		Scanner kb = new Scanner(System.in);
		
		// Get the student's name, id, and year admitted
		System.out.print("Please enter the student's name: ");
		String sName = kb.nextLine();
		System.out.print("Please enter the student's ID: ");
		String sID = kb.nextLine();
		System.out.print("Please enter the student's admitted year: ");
		int year = kb.nextInt();
		
	    // Create a BusinessStudent object.


	    // Get the student's business hours
        System.out.print("Please enter the student's business hours fulfilled: ");
		int hour = kb.nextInt();
        
		// Set the business hours
		
		
		// Get the student's General Ed hours
        System.out.print("Please enter the student's general ed hours fulfilled: ");
		hour = kb.nextInt();
        
		// Set the gen ed hours
	    

	    // Display the number of remaining hours.
	    System.out.println("Hours remaining: ");       
	}
}
