package edu.unlv.mis768.kly; // edu.unlv.mis768.labwork5 // package edu.unlv.mis768.labwork5;

import java.util.Scanner;

public class CreditCardApproval2 {

	public static void main(String[] args) {
		// variables for user input and result
	    double salary;    // Annual salary
	    int creditRating; // Credit rating
	    boolean isQualified;  // whether the user is qualified.
	    
	    // Scanner object for keyboard input
	    Scanner kb = new Scanner(System.in);
	    
	    // Get the user's annual salary.
	    System.out.print("What is your annual salary?");
	    salary = kb.nextDouble();

	    // Get the user's credit rating (1 through 10).
	    System.out.print("On a scale of 1 through 10, what is your credit rating?\n" +
	             "(10 = excellent, 1 = very bad)");
	    creditRating = kb.nextInt();
	      
	    // call a method to determine whether the user qualifies.
	    isQualified = determineQualification(salary, creditRating);
	    
	    if(isQualified)
	    	System.out.println("Congratulations! You can get the credit card.");
	    else
	    	System.out.println("Sorry, you cannot get the credit card.");
	    
        kb.close();
	         
	}

	private static boolean determineQualification(double salary, int creditRating) { // parameter name doesn't always need to be the same as the argument name
		// TODO Auto-generated method stub
		// return false;
		// it is fine that this class is called private because we will only use this method 
		// in this class
		//	
		if(salary >=20000 && creditRating >=7 || salary >=15000 && creditRating >=8) // but the parameters would have to be the same as in the method.
			return true;
		else
			return false;
	}


	
	
	
	
	
	
	
	

}
