package com.chestnutandhazel.edu.unlv.mis768.labwork;

public class EmployeeOO {
	// field
	private String name;
	private int experiencePoint;
	// constants
	public final double BASE_PAY = 25;
	public final double REGULAR_HOURS = 40;
	
	// constructor
	public EmployeeOO() {
		experiencePoint = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperiencePoint() {
		return experiencePoint;
	}
	
	public void earnExperiencePoint(int numOfPoints) {
		experiencePoint += numOfPoints;
		
	}
	public double calcSalary(int numOfHours) {
		double salary;
		salary = (numOfHours - REGULAR_HOURS) * BASE_PAY *1.5 + REGULAR_HOURS * BASE_PAY;
		return salary;
		
	}

}
