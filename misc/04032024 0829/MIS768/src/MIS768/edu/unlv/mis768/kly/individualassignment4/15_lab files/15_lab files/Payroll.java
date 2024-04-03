/**
 * Author: Han-fen Hu
 * Date: 2021.03.15
 * Program Purpose: This program simulates the data and behavior of a payroll.  
 */

package edu.unlv.mis768.labwork15;

public class Payroll {
		// constants
		public final double MINIMUM_RATE = 10.25;	// defines the minimum hourly pay rate
		public final int REGULAR_HOUR = 40;		// defines the number of regular hours
		public final double OVERTIME_RATE = 1.5;	// defines the pay rate for overtime hours
		
		// fields
		private String empName; // employee name
		private double payRate; // payRate for an employee
		private int numOfHours; // hours worked for an employee
		

		// no-arg constructors. It will set the empName to null, payRate and numOfHours to 0.
		public Payroll(){}

		/**
		 * parameterized constructor. It accepts a value for each field
		 * @param n The value for empName field.
		 * @param r The value for payRate field.
		 *          Value validation will be perform.
		 *          The payRate cannot be set as less than the minimum pay.
		 * @param h The value for numOfHours field.
		 *          Value validation will be perform.
		 *          The numOfHours cannot be a negative number.
		 */
		public Payroll(String n, double r, int h) {
			empName = n;
			
			// if the rate is less than the minimum pay rate
			// set it to the minimum pay rate
			if (r < MINIMUM_RATE)
				payRate = MINIMUM_RATE;
			else
				payRate = r;
			
			// if the hours is negative, set it to 0
			if (h<0)
				numOfHours = 0;
			else
				numOfHours = h;
		}

		// getters and setters for the three fields
		/**
		 * Retrieve the value of the empName field
		 * @return The value of the empName field
		 */
		public String getEmpName() {
			return empName;
		}
		/**
		 * Assign the value of the empName field
		 * @param name The value to be assigned
		 */
		public void setEmpName(String name) {
			this.empName = name;
		}
		/**
		 * Retrieve the value of the payRate field
		 * @return The value of the payRate field
		 */
		public double getPayRate() {
			return payRate;
		}

		/**
		 * Assign the value of the payRate field
		 * @param rate The value to be assigned.
		 *             Value validation will be perform.
		 *             Assign the value of the payRate field
		 */
		public void setPayRate(double rate) {
			// if the rate is less than the minimum pay rate
			// set it to the minimum pay rate
			if (rate < MINIMUM_RATE)
				payRate = MINIMUM_RATE;
			else
				payRate = rate;
		}
		/**
		 * Assign the value of the payRate field, as a string
		 * @param rateString The value to be assigned, as a string.
		 *                   Value validation will be perform.
		 *                   Assign the value of the payRate field
		 */
		public void setPayRate(String rateString) {
			// convert the string to a double number
			double rate = Double.parseDouble(rateString);

			// if the rate is less than the minimum pay rate
			// set it to the minimum pay rate
			if (rate < MINIMUM_RATE)
				payRate = MINIMUM_RATE;
			else
				payRate = rate;
		}
		/**
		 * Retrieve the value of the numOfHours field
		 * @return The value of the numOfHours field
		 */
		public int getNumOfHours() {
			return numOfHours;
		}
		/**
		 * Assign the value of the numOfHours field
		 * @param hours The value for numOfHours field.
		 *              Value validation will be perform.
		 *              The numOfHours cannot be a negative number.
		 */
		public void setNumOfHours(int hours) {
			// if the hours is negative, set it to 0
			if(hours<0)
				this.numOfHours=0;
			else 
				this.numOfHours = hours;
		}
		/**
		 * Assign the value of the numOfHours field, as a string
		 * @param hourString The value for numOfHours field, as a string
		 *                   Value validation will be perform.
		 *                   The numOfHours cannot be a negative number.
		 */
		public void setNumOfHours(String hourString){
			// convert String to a integer number
			int hours = Integer.parseInt(hourString);
			
			// if the hours is negative, set it to 0
			if(hours<0)
				this.numOfHours=0;
			else 
				this.numOfHours = hours;
		}	

		/**
		 * This method calculates the total wage based on the numOfHours and payRate
		 * @return total wage
		 */
		public double calWage(){
			// Overtime pay
			if(numOfHours > REGULAR_HOUR)
				return payRate * ((numOfHours-REGULAR_HOUR)* OVERTIME_RATE+ REGULAR_HOUR);
			// regular pay
			else
				return payRate * numOfHours;		
		}
		
		/**
		 * Override the default toString() method to show the content of the object
		 * @return string that contains the information of the object
		 */
		public String toString(){
			return empName+" worked "+ numOfHours+ " hour(s) at $"+ payRate +" per hour. The total pay is $"+calWage();
		}
}
