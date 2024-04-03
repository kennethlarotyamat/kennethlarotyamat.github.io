package com.chestnutandhazel.edu.unlv.mis768.labwork; // package com.chestnutandhazel.edu.unlv.mis768.labwork; // package edu.unlv.mis768.labwork7;

import javax.swing.JOptionPane;

public class PayrollDialog {

	public static void main(String[] args) {
		// declare variables
		String inputString; // for reading input
		String empName; // the employee's name
		int hours; // the employee's working hours
		// double grossPay; // commented out to remove warning // double grossPay; // the grossPay to be calculated
		
		// get the name using a input box
		empName = JOptionPane.showInputDialog ("Please Enter the Name");
		
		
		// get the hours using a input box
		inputString = JOptionPane.showInputDialog("Please enter the Hours");
		// convert string to int
		hours = Integer.parseInt(inputString); // means parse string and convert it into an integer and assigned to hours variable
		
		

		

		Employee someone = new Employee();
		someone.setFullName(empName);
		

		JOptionPane.showMessageDialog(null, "Hey, "+someone.getFullName()+", the pay is $"+someone.calDailyPay(hours));
		
		System.exit(0); // to end the program properly
		


	}

}

// so what i did here was try and use the original Employee.java file we created earlier in the class. 
// parse methods
// string cannot be saved to an input variable int variable
// yeah, I remember this, I've had to deal with this, or i've come across this
// where something like a data type or incorrect data type error
/* ////////////		// declare an Employee object 8 */
// Show the result in a message box
//