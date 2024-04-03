/*		
		Author's Name: 		    	Kenneth Larot Yamat

     	Purpose of Program:			To create a student transcript file that includes courses
     								taken, with corresponding credit hour, letter grade, and 
     								grade point values for each course taken, and a grade point average
     								calculated and printed at the end of the file                          		
     						    	 
  		Date Due:					February 18th, 2024
*/

package edu.unlv.mis768.kly.individualassignment2;

import java.text.DecimalFormat; // imports the DecimalFormat Class
import java.util.ArrayList;		// imports the ArrayList Class, used for calculating GPA based on credit hours and the numerical value of a letter grade.

public class CreateTranscript {
	
	private String  courseNumber; 									// course number
	private int 	courseHours; 									// number of credit units per class
	private String  letterGrade; 									// letter grade
	private double  numberGrade; 									// the letter grade converted to a numerical value
	
	private double  gradePointAverage;
	
	DecimalFormat formatDouble = new DecimalFormat("0.00"); 		// Formats doubles to display two decimal points // formatDouble.format( )
	

// Getter and setter methods	
	public String getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}
	public int getCourseHours() {
		return courseHours;
	}
	public void setCourseHours(int courseHours) {
		this.courseHours = courseHours;
	}
	public String getLetterGrade() {
		return letterGrade;
	}
	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}
	
// the above getter and setters are much as they were when created by eclipse	
	public double getNumberGrade() {
		if (letterGrade.trim().equalsIgnoreCase("A") || letterGrade.trim().equalsIgnoreCase("A+")) { 		    		// Assigns numerical value to user entered letter grade ignores white spaces and ignores case 
			numberGrade = 4.00;
		} else if (letterGrade.replaceAll("\\s", "").equalsIgnoreCase("A-")) { 											    		// Assigns numerical value to user entered letter grade ignores white spaces and ignores case 
			numberGrade = 3.70;
		} else if (letterGrade.replaceAll("\\s", "").equalsIgnoreCase("B+")) { 														// Assigns numerical value to user entered letter grade ignores white spaces and ignores case 
			numberGrade = 3.30;
		} else if (letterGrade.replaceAll("\\s", "").equalsIgnoreCase("B" )) { 														// Assigns numerical value to user entered letter grade ignores white spaces and ignores case 
			numberGrade = 3.00;
		} else if (letterGrade.replaceAll("\\s", "").equalsIgnoreCase("B-")) { 														// Assigns numerical value to user entered letter grade ignores white spaces and ignores case 
			numberGrade = 2.70;
		} else if (letterGrade.replaceAll("\\s", "").equalsIgnoreCase("C+")) { 														// Assigns numerical value to user entered letter grade ignores white spaces and ignores case 
			numberGrade = 2.30;
		} else if (letterGrade.replaceAll("\\s", "").equalsIgnoreCase("C" )) { 														// Assigns numerical value to user entered letter grade ignores white spaces and ignores case 
			numberGrade = 2.00;
		} else if (letterGrade.replaceAll("\\s", "").equalsIgnoreCase("C-")) { 														// Assigns numerical value to user entered letter grade ignores white spaces and ignores case 
			numberGrade = 1.70;
		} else if (letterGrade.replaceAll("\\s", "").equalsIgnoreCase("D+")) { 														// Assigns numerical value to user entered letter grade ignores white spaces and ignores case 
			numberGrade = 1.30;
		} else if (letterGrade.replaceAll("\\s", "").equalsIgnoreCase("D")) { 															// Assigns numerical value to user entered letter grade ignores white spaces and ignores case 
			numberGrade = 1.00;
		} else {  																										// Assigns numerical value to user entered letter grade, anything other than A+ through D is valued at zero grade points
			numberGrade = 0.00;
		}
		return numberGrade;
	}
	public void setNumberGrade(double numberGrade) {
		this.numberGrade = numberGrade;
	}
	
	public double getGradePointAverage(ArrayList<Double> pointScaleTimesCreditHoursArray, ArrayList<Integer> courseHoursArray) { 	// this is where
																																	// the grade point average is calculated.
		double sumPointScaleTimesCreditHours = 0;
		int sumCourseHours = 0;
	    for (double value : pointScaleTimesCreditHoursArray) {
	        sumPointScaleTimesCreditHours += value;
	    }


	    for (int value : courseHoursArray) {
	        sumCourseHours += value;
	    }
		gradePointAverage= ((double) sumPointScaleTimesCreditHours/sumCourseHours); 	//  i don't understand math all that well, so i had to create a special array just to 
																						// multiply credit hours and point scale
		return gradePointAverage;
	}
	
	public void setGradePointAverage(double gradePointAverage) {
		this.gradePointAverage = gradePointAverage;
	}
// Constructor	method
	public CreateTranscript(String courseNo, int courseHr, String letterGr) {

		this.courseNumber = courseNo;
		this.courseHours = courseHr;
		this.letterGrade = letterGr;

	}
// Constructor method overload	
	public CreateTranscript(String courseNo, String courseHr, String letterGr) {

		this.courseNumber = courseNo;
		this.courseHours = Integer.parseInt(courseHr);
		this.letterGrade = letterGr;

	}
	

	

	
	
	
}


// talk about 1 minute to midnight - good lord! 
//keyboard.nextLine();
//}  while (yesOrNoEntry == 'y' || yesOrNoEntry == 'Y') {
//if (yesOrNoEntry == 'y' || yesOrNoEntry == 'Y') {
//    
//} else {
//	break;
//    
//}
//}
//
//    
//
//    
//
//}
//
//}
//
//}  while (yesOrNoEntry == 'y' || yesOrNoEntry == 'Y') {
//	if (yesOrNoEntry == 'y' || yesOrNoEntry == 'Y') {
//	    
//	} else {
//		break;
//	    
//	}
//}
//
//        
//
//        
//
//	}
//
//}
// while (yesOrNoEntry == 'y' || yesOrNoEntry == 'Y')
// so trim() only replaces leading and trailing empty white spaces - I've had to use this instead - replaceAll("\\s", "")
//	        double sumPointScaleTimesCreditHours = 0.0; double  int 
//    int sumCourseHours = 0;
// Calculate the sum of the second array
// Calculate the sum of the second array
//ArrayList<Double> numberGradeArray, ArrayList<Integer> courseHoursArray
//double summationNumberGradeArray = 0;
//int summationCourseHoursArray = 0;
//
//for (double gradeSum : numberGradeArray) {
//    summationNumberGradeArray+= gradeSum;
//}
////
//for (int hoursSum : courseHoursArray) {
//	summationCourseHoursArray+= hoursSum;
//}
////
// well, actually, it does look like summation does refer to adding up a sequence of integers in an array list, so i'm going to change it back

// sum and summation are different, a summation does add up a sequence of integers, 
// but it seems like it's a sequence of integers is determined by some formula or algorithm, 
// it's not a manually entered sequence of integers like a sequence of integers in an arrayList
//this.numberGrade = numberGr; mation mation
//this.gradePointAverage = grPointAve;
 // , double numberGr, double grPointAve

//this.numberGrade = Double.parseDouble(numberGr);
//this.gradePointAverage = Double.parseDouble(grPointAve);
 // , String numberGr, String grPointAve

//(letterGrade.trim().equalsIgnoreCase("A") || letterGrade.trim().equalsIgnoreCase("A+"))// ignores white spaces and ignores case
// formatDouble.format(numberGrade) // formatDouble.format( )
//letterGrade.equalsIgnoreCase("A")
// (letterGrade.equals("A") || letterGrade.equals("a")// (letterGrade = "A" || letterGrade = "a" )
/*

Letter Grade

Point Scale

A+ and A

4.0

A-

3.7

B+

3.3

B

3.0

B-

2.7

C+

2.3

C

2.0

C-

1.7

D+

1.3

D

1.0

D- and below

0

*/

// Double.parseDouble(grPointAve);
// ; // Double.parseDouble(numberGr);
// Integer.parseInt(courseHr);
//super(); 		//super();
//public CreateTranscript() {
//
//}
// I don't know what this is: // super();
// TODO Auto-generated constructor stub
//public CreateTranscript(String courseNumber, int courseHours, String letterGrade, double numberGrade,
//		double gradePointAverage) {
//	super();
//	this.courseNumber = courseNumber;
//	this.courseHours = courseHours;
//	this.letterGrade = letterGrade;
//	this.numberGrade = numberGrade;
//	this.gradePointAverage = gradePointAverage;
//}
//public CreateTranscript() {
//	super();
//	// TODO Auto-generated constructor stub
//}
//private String studentName;			// these aren't required, and I might not get around to implementing them
//private String studentNumber;
// i was setting up the getter and setter methods manually, but i remember that there is a button for this.
// so i'm going to redo them using the button.
////
//public void setCourseNumber(String courseNumber) {
//this.courseNumber = courseNumber;
//}
//public String setCourseNumber() {
//return courseNumber;
//
//}
//
////
//public void setcourseHours(int courseHours) {
//this.courseHours = courseHours;
//}
//public int setcourseHours() {
//return courseHours;
//
//}
////
//public void setletterGrade(String letterGrade) {
//this.letterGrade = letterGrade;
//}
//public String letterGrade() {
//return letterGrade;
//
//}
////
//public void setNumberGrade(double numberGrade) {
//this.numberGrade = numberGrade;
//}
//public double getNumberGrade() {
//return numberGrade;
//}
//
////

// I'm running up against the deadline here. it's 4 PM on the due date.

// make sure parameters don't have the same name as fields because it is called shadowing and it can be confusing
// template or model class this refer to itself

/*
 * public void setFeet (int ft) {
 * this.feet = ft;
 * 
 *public class Stock {
private String symbol; // Trading symbol of stock private double share Price; // Current price per share /**
Constructor
@param symbol The stock's trading symbol. @param price The stock's share price.
*/ 
//public Stock (String symbol, double sharePrice) { this symbol = symbol; s.sharePrice = sharePrice;
//}
//symbol here refers to the parameter.
//this here refers to the object
//this.symbol thus refers to the object's symbol field.
// * 
// * 
// * 
// */

// I think that I'm going to finish the class exercise first, and then come back around to the individual assignment 2

// Class Exercise (Week 5): Test Class and Application

// https://unlv.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=de989245-06e2-4ab9-979f-b107012e3618&start=0 

// 1. The duration needs a default value. 2. The set methods need the return type of void.

// The method names should be verbs/verb phrases, such as processScore(), getLetterGrade() to show the "action".

// Suggestions: 1. you can combine the for loops at lines 42-44 and 55-61. Just move the statements in the second loop into the first one. 2. The amounts can be aligned to be right.
