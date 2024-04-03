package com.chestnutandhazel.edu.unlv.mis768.labwork;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		//declare variable
		double salary;
		EmployeeOO someone = new EmployeeOO();
		
		someone.setName("Sam");
		someone.earnExperiencePoint(100);
		
		salary = someone.calcSalary(57);
		
		System.out.println("Name: "+ someone.getName());
		System.out.println("Experience: " +someone.getExperiencePoint());
		System.out.println("Salary: " + salary);

	}

}
