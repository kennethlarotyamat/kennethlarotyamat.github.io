package edu.unlv.mis768.labwork12;

import java.util.ArrayList;
import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {
		// Scanner object for keyboard input
		Scanner kb = new Scanner(System.in);
		// variables for the employee data
		String name; // name of the employee
		double rate, hours; // pay rate and working hours for the employee
		int level; // manager level, if any

		int count = 0; // a counter for the number of employee
		
		// declare an ArrayList to store the employee data
		// the elements in this ArrayList can be either Staff or Manager
		
		
		// print the purpose of the program
		System.out.println("This program summarize the payroll for a coffee shop.");
		
		char more ='Y'; // to indicate whether the while loop should continue
		// when there are more data to be entered.
		while(more=='Y') {
			// increase the counter
			count++;
			
			// prompt for data entry for an employee
			System.out.println("Please enter the data for employee "+count);
			
			// get name, pay rate, and working hours
			System.out.print("Name:");
			name = kb.nextLine();
			System.out.print("Pay rate: ");
			rate = kb.nextDouble();		
			System.out.print("Hours worked: ");
			hours = kb.nextDouble();
			
			// consume the additional newline char after newDouble()
			kb.nextLine();
			
			// 
			//get whether this person is a manager
			System.out.print("A manager? (Y/N)");
			
			// get a string from the keyboard, convert to all uppercase letters, use only the first char
			char manager = kb.nextLine().toUpperCase().charAt(0);
			
			// for a manager
			if (manager=='Y') {
				// get the level
				System.out.print("What level (1-5)?");
				level=kb.nextInt();
				
				// consume the additional newline char after nextInt()
				kb.nextLine();
				
				// instantiate a manager object
				
				// assign the name, method from the super class
				// assign pay rate, method from the super class
				// assign working hours, method from the super class
				// assign the level
				
				// add the Manager object to the ArrayList
				
			}
			// for a staff
			else {
				// instantiate a staff object
				Staff sf = new Staff();
				sf.setName(name); // assign the name
				sf.setPayRate(rate); // assign the pay rate
				sf.setHours(hours); // assign the working hours
				
				// add the Staff object to the ArrayList
				empList.add(sf);
			}
			
			// check whether there are more employees to be entered
			System.out.print("More employee? (Y/N)");
			// get a string from the keyboard, convert to all uppercase letters, use only the first char
			more = kb.nextLine().toUpperCase().charAt(0);
		}
		
		// display the payroll
		System.out.println("\nThe summary of salary to pay are listed below:");
		// Traverse the ArrayList to print the salary for every employee
		for(;;) {
			// empList.get(i) represents one employee
			// user getName() to print name, use calcSalary() to show salary
			
		}
		
	}

}
