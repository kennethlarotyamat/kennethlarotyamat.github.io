package edu.unlv.mis768.labwork11;

public class Manager extends Staff { 

	private double stipendLevel=1; 
	private double stipendLevelValue = 150;
	private double baseSalary;
	private double additionalStipend; 

	public double getStipendLevel(double stipend) {
		if (1   <= stipend && stipend <= 5 ) {
			stipendLevel = stipend * stipendLevelValue; 
		} else {
			stipendLevel = 1 * stipendLevelValue; 
		}
		return stipendLevel;
	}

	public void setStipendLevel(double stipend) {
		this.stipendLevel = stipend; 
	}

	public double calcSalary(double hours, double stipdend) {
		baseSalary = super.calcSalary(hours); 
		additionalStipend = getStipendLevel(stipdend);
		return baseSalary + additionalStipend;
	} 

	public Manager(double stipendLevel, double basePay) {
		super();
		this.stipendLevel = stipendLevel;
		this.baseSalary = basePay;
	}

	public Manager() {

	}
	

}
//return calcSalary(hours) + getStipendLevel(stipend);
// stipend
// ; 
//public class Cube extends Rectangle {

//private double stipend; // private double height;
//StipendLevel//System.out.print("Ticket Class 1 has been
// added to your cart, the amount due is $15");

//System.out.print("Ticket Class 2 has been added to your
// cart, the amount due is $15");

//System.out.print("Ticket Class 3 has been added to your
// cart, the amount due is $25");
//the base salary

//System.out.print("Ticket Class 4 has been added to your
// cart, the amount due is $35");

//System.out.print("Ticket Class 4 has been added to your
// cart, the amount due is $35");

//System.out.print("The ticket class entered is not a
// valid ticket class");

//The stipend is $150 per level (e.g., $750 for a level 5 manager).
//;
//the given score will be stored as the raw score
//rawSalary = salary;
//call the setScore() method of the superclass to set the new score (after
		// curving)
		// rawSalary + stipendLevel super.calc Salary(rawSalary + stipendLevel); // will
		// be the new score in the graded activity will be used to get the new grade
		// return calcSalary() + stipendLevel; // return salary;


// TO DO Auto-generated constructor stub
// public Manager() {
// super();
//// TODO Auto-generated constructor stub
// }

// public Manager(double stipendLevel, double rawSalary) {
// super();
// this.stipendLevel = stipendLevel;
// this.rawSalary = rawSalary;
// }

/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * public Manager(double stipendLevel, double rawSalary) {
 * this.stipendLevel = stipendLevel;
 * this.rawSalary = rawSalary;
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * public void setScore(double s) {
 * // the given score will be stored as the raw score
 * rawScore = s;
 * // call the setScore() method of the superclass to set the new score (after
 * curving)
 * super.setScore(rawScore * percentage); // will be the new score in the graded
 * activity will be used to get the new grade
 * }
 * 
 */
/*
 * 
 * Based on the superclass Staff (included in the lab files), please implement
 * Manager class
 * 
 * The field level ranges between 1-5. If the value is not within the range, set
 * the value to 1.
 * 
 * Getter and setter for the field should also be provided.
 * 
 * Please override the calcSalary() method. A manager’s salary is calculated as
 * regular salary plus a stipend.
 * 
 * The stipend is $150 per level (e.g., $750 for a level 5 manager).
 * Please create an application class to test your Manager class.
 * 
 * 
 * Please submit the .java file (i.e., the source files).
 * 
 */
