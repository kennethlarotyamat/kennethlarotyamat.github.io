package com.chestnutandhazel.edu.unlv.mis768.labwork;

public class WageCalculatorP {

	public static void main(String[] args) {
		// constants
		
		final double BASE_PAY = 25;
		final double REGULAR_HOURS = 40;
		
		// declare variables
		double salary; // salary to be calculated
		double hours = 57;
		
		salary = (hours - REGULAR_HOURS) * BASE_PAY * 0.5 + hours * BASE_PAY;
		
		
		System.out.print("The Salary is $" + salary);

	}

}
