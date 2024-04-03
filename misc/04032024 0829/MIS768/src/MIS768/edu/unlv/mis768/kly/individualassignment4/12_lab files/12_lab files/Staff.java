package edu.unlv.mis768.labwork12;

public class Staff {
	// Fields
	private String name; // name of the employee
	private double payRate; // the hourly pay rate for the employee
	private double hours; // the number of hours worked
	
	// constants
	final double REGULAR_HOURS = 40; // the regular working hours
	final double MIN_WAGE = 13.5;  // Minimum wage allowed
	
	/* Constructor 
	 * set the default value for experience point*/
	public Staff() {
		payRate = MIN_WAGE;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPayRate() {
		return payRate;
	}

	/**
	 * Set the pay rate of the employee. Make sure it is not less than the minimum wage 
	 * @param rate Hourly pay rate
	 */
	public void setPayRate(double rate) {
		if (rate< MIN_WAGE )
			rate =  MIN_WAGE;
		payRate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double h) {
		if (h <0)
			h=0;
		else if(h>50)
			h=50;
			
		this.hours = h;
	}

	/**
	 * calculate salary based on the number of hours given. Overtime pay is 1.5
	 * @param numOfHours Hours worked.
	 * @return Salary for the employee
	 */
	public double calcSalary() {
		// regular pay
		double salary = hours * payRate;
		// if worked overtime
		if (hours >REGULAR_HOURS) {
			// add the additional 0.8 * BASE_PAY to the salary
			salary += (hours-REGULAR_HOURS)*payRate*0.5;
		}
		return salary;
	}	
	
}
