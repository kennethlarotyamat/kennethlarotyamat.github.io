package nightmare1;

public class Employee {
	private String fullName;
	private double payRate;
	
	//	In Java, the keyword
	//	 double
	//	 is used to declare
	//	 a variable that can store a double-precision floating-point
	//	 number. It is a 64-bit
	//	 data type
	//	 that can store a wide range of decimal
	//	 numbers, from 1.7e−308 to 1.7e+308.
	
	public Employee() {
		fullName = "";
		payRate = 13.5;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public double getPayrate() {
		return payRate;
	}
	
	public void setPayrate(double payrate) {
		this.payRate = payrate;
	}
	
	public double calDailyPay (double hours) {
		return payRate * hours;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The void keyword
		// in Java is a reserved type used to specify that a method does not return
		// any data type. A method that is declared as void does not have a return type
		//, and it does not return a value when it is called.
		//For example, the following method prints "Hello, World!" to the console:
		//public void printMessage() {
		//  System.out.println("Hello, World!");
		// I had to cut my nails right now because i was finding it hard to type or maybe not hard but awkward		
		}

	}

	// model class
	// application class

	// MIS 768: Advanced Software Concepts Spring 2024 MIS 768 1003 2024 Sprg

	// this comment is being written in VS Code
	// so i realized that there. well
	// i jumped into the assignment and was confused about what was going on
	// and i didn't realize that there were modules that led up to the assignment
	// or i mean. lab modules that led up to the assignment-specific lab modules.
	// so I was confused about a number of things before getting started.

	// i need to try and get all of my work done on Thursday, or, I mean I need to try to get all
	// of my coursework done on Thursday.

