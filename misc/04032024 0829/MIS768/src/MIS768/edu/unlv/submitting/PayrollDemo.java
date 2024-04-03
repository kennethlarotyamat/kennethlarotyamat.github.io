package edu.unlv.submitting;

import java.util.Scanner;

public class PayrollDemo {


    private static String employee = "employee";
    private static String staff = "staff";
    private static String manager = "manager";
    private static String classification = employee;
	

	public static void main(String[] args) {

		boolean validInput = false;
		Scanner keyboard = new Scanner(System.in);
		do {
			
			System.out.print("Is the employee classified as Staff or Manager?");
			System.out.println("                                             ");

			String str = keyboard.nextLine().toLowerCase();

			if (str.contains("staff") || str.charAt(0) == 's') {
				classification = staff;
				System.out.println("The employee has been classified as Staff.");
				System.out.println("                                          ");
				validInput = true;
			} else if (str.contains("manager") || str.charAt(0) == 'm') {
				classification = manager;
				System.out.println("The employee has been classified as Manager.");
				System.out.println("                                            ");
				validInput = true;
			} else {
				classification = employee;
				System.out.println(
						
						"Please indicate if the employee in question is classified as either Staff or Manager.");
			}

		} while (!validInput);
		
		Manager m = new Manager();
		Staff s = new Staff();
		
		System.out.println("Please enter the number of hours worked by the employee.");
		System.out.println("                                                        ");
		double hours = keyboard.nextDouble();
		s.setHours(hours);
		m.setHours(hours);
		if (classification.equals(staff)) {
			System.out.println("The Employee's Salary for the pay period amounts to: "+ s.calcSalary(hours));

		} else if (classification.equals(manager)) {
			System.out.println("Please enter the Manager's stipend Level");
			double stipend = keyboard.nextDouble();
			m.setStipendLevel(hours);
			System.out.println("The Employee's Salary for the pay period amounts to: "+m.calcSalary(hours, stipend));

		} else  {
			System.out.println("The Employee's classification has not been previously indicated.");

		}
		keyboard.close();
	}
}

//Is the employee classified as Staff or Manager?                                             
//s
//The employee has been classified as Staff.
//                                          
//Please enter the number of hours worked by the employee.
//                                                        
//100
//The Employee's Salary for the pay period amounts to: 742.5 

//Is the employee classified as Staff or Manager?                                             
//m
//The employee has been classified as Manager.
//                                            
//Please enter the number of hours worked by the employee.
//                                                        
//100
//Please enter the Manager's stipend Level
//2
//The Employee's Salary for the pay period amounts to: 1042.5

//1 150 +135 = 285 
//2 300 +135 = 435 
//3 450 +135 = 585
//4 600 +135 = 735
//5 750 +135 = 885


// so dumb. I think that I finally got it, but basically // this was the issue. I have to have one that sets manager hours // that took forever.
// this is taking forever, and I'm still not ever really knowing what I'm doing wrong.
// 0, 0 length,width,height // Cube c = new Cube(length,width,height);
// 
//classification == staff;
// TO DO Auto-generated method stub
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke
// "String.contains(java.lang.CharSequence)" because "str" is null
// classification = keyboard.nextLine();
// System.out.println("Please indicate if the employee in question is classified
// as either Staff or Manager.");
// System.out.println("Please enter the number of hours worked by the
// employee.");
// System.out.println("Please enter the number of hours worked by the
// employee.");
// if classification = staff {
// break;
// String str = keyboard.nextLine().toLowerCase();

// Is the employee in question classified as Staff or Manager staff
// at edu.unlv.mis768.labwork11.PayrollDemo.main(PayrollDemo.java:16)