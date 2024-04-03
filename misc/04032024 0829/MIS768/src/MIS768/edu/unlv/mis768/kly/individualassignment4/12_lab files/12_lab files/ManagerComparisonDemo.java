package edu.unlv.mis768.labwork12;

public class ManagerComparisonDemo {

	public static void main(String[] args) {
		// instantiate the first Manager object.
		Manager mgr = new Manager();
		// set the name, pay rate, hours, and level.
		mgr.setName("Sam"); // set name
		mgr.setPayRate(30);// set pay rate as $30
		mgr.setHours(40);// set hours as 40
		mgr.setLevel(3);// set level to 3
		
		
		// instantiate the second object as a Staff
		Staff sf = new Staff();
		// set the name, pay rate, hours, and level.
		sf.setName("Alex"); // set name
		sf.setPayRate(40);// set pay rate as $40
		sf.setHours(50);// set hours as 50

		// compare whether the two objects
		if ()
			System.out.println("The manager gets higher pay.");
		else
			System.out.println("The manager does not get higher pay.");

	}

}
