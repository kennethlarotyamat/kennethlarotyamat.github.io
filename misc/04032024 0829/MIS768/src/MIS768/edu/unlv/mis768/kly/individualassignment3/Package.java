/*		
		Author's Name: 		    	Kenneth Larot Yamat

     	Purpose of Program:			To calculate the shipping cost of a parcel at a 
     	                          	parcel service store
     						    	 
  		Date Due:					March 3rd, 2024
*/

package edu.unlv.mis768.kly.individualassignment3;

import java.util.Scanner;

public class Package {
    String red = "\u001B[31m" + "\u001B[1m";
    String reset = "\u001B[0m";
    String green  = "\u001B[32m" + "\u001B[1m";
    String brown  = "\u001B[33m" + "\u001B[1m";
	private double packageWeight;
	private double packageLength;
	private double packageWidth;
	private double packageHeight;
	// These were not needed. // private double theDimensionalWeight;
	// private double dimensionalWeight; // the
	// "Design a program that computes the cost of shipping packages at a parcel
	// service store.
	// A customer can ship multiple packages at the store.
	// The program should prompt the users to enter the weight and the package
	// dimension for each package."  - Han-fen Hu, Ph.D
	/*
	 
	"For each package that can be shipped, the dimensional weight should be calculated. 
	Dimensional weight reflects the amount of space a package occupies; dimensional weight 
	is calculated by the following steps: (1) Determine the package dimensions in inches. 
	For each dimension, any fraction of the measurement should be increased to the nearest 
	whole number (for example, 1.3 will be considered 2). (2) Multiply the package length by 
	the width by the height. The result is the cubic size in inches. (3) Divide the cubic size 
	in inches by 166 to determine dimensional weight in pounds. (4) Increase any fraction to 
	the next whole pound."
	
	Individual Assignment 3, Han-fen Hu, Ph.D. (2024)
	
	"numberGrade is determined by letterGrade. Therefore numberGrade should not be a field of the class. The getNumberGrade() is sufficient!"
	
	"Rather than using theScore, use getScore(). 3. The getScore() should just return the calculation result, 
	"instead of assigning the value to theScore. 4. The getPointsEach() method will just return the calculation result, instead of assignment the value to questionValue."

	 I'm really tired.
	 what a nightmare.
	 */
	
	/*
	
	For each accepted package, the program should show the 
	actual weight, 
	calculated dimensional weight, and the 
	shipping cost for 
	the package.
	
	*/
	
	Scanner keyboard = new Scanner(System.in);
	
											// 100 outside linear inches (length plus width plus height).
											// private String errorMessage = "You have entered invalid information, please review your input, and re-enter.";
											// https://gist.github.com/mgumiero9/665ab5f0e5e7e46cb049c1544a00e29f
											// Yellow: \u001B[33m // 43: Yellow or brown
										
//		public double getDimensionalWeight() { // Math.ceil(
//			dimensionalWeight = Math.ceil((Math.ceil(getPackageLength()) * Math.ceil(getPackageWidth()) * Math.ceil(getPackageHeight()))/166); 
////																		Please enter the[31m[1m weight [0mof your parcel: [32m[1m14.6
////			                                                            [0mPlease enter the[31m[1m length [0mof your parcel: [32m[1m23.4
////			                                                            [0mPlease enter the[31m[1m width [0m of your parcel: [32m[1m18.6
////			                                                            [0mPlease enter the[31m[1m height [0mof your parcel: [32m[1m20.1			
////			should be 58
//			return dimensionalWeight;
//	}
//
//	public void setDimensionalWeight(double dimensionalWeight) {
//		this.dimensionalWeight = dimensionalWeight;
//	} // I might not need a method called dimensionalWeight because I can calculate this in the model class.

											//		public double getPackageWeight() {
											//		if (0 < packageWeight && packageWeight <= 120) {
											//	        return packageWeight;
											//	    } else if (packageWeight < 0) {
											//	        System.out.println(reset + red + "The weight of the parcel has been entered as a negative number. Please re-enter the package weight." + reset);
											//	        return -1.00;   // return -1;
											//	    } /* else if (packageWeight > 120) {
											//	        System.out.println(reset + brown + "Chestnut" + red + "+" + green + "Hazel's" + reset + " Parcel Service cannot accept packages greater than 120 American Pounds." + reset);
											//	        return -1;
											// 		//	    }*/ else if (packageWeight > 120) /*(packageWeight > 120)*/ {
											// 		//	        System.out.println(reset + brown + "Chestnut" + red + "+" + green + "Hazel's" + reset + " Parcel Service cannot accept packages greater than 120 American Pounds." + reset);
											// 		//	        return -2.00; // return -1;
											//	    }
											//		}
	public double getPackageWeight() {
	    if (packageWeight > 0 && packageWeight <= 120) {
	        return packageWeight;
	    } else if (packageWeight < 0) {
	    	System.out.println(" ");System.out.println(reset + red + "The weight of the parcel has been entered as a negative number. Please re-enter the package weight." + reset);
	        return -1;
	        // break;
	    } else if (packageWeight > 120) {
	    	System.out.println(" ");
	    	System.out.println(reset + brown + "Chestnut" + red + " + " + green + "Hazel's" + reset + " Parcel Service cannot accept packages exceeding 120 American Pounds in weight." + reset); // System.out.println(reset + brown + "Chestnut" + red + " + " + green + "Hazel's" + reset + " Parcel Service cannot accept packages weighing in excess of 120 American Pounds." + reset); // System.out.println(reset + brown + "Chestnut " + red + " + " + green + " Hazel's" + reset + " Parcel Service cannot accept packages greater than 120 American Pounds." + reset); 
	    	System.out.println("Please consider shipping a different Package.");
	        return -1;
	    } else {
	    	System.out.println(" ");System.out.println(reset + red + "You have entered invalid information, please review your input, and re-enter." + reset);
	        return -1;
	    }
	} //  = "Thank you for shipping your packages with"brown+ "Chestnut" + Hazel's Parcel Services"  	    	System.out.println(reset + brown + "Chestnut" + red + " + " + green + "Hazel's" + reset + " Parcel Service cannot accept packages exceeding 120 American Pounds in weight." + reset);

	public void setPackageWeight(double packageWeight) {
		this.packageWeight = packageWeight; 	
													// keyboard.nextDouble();
													// keyboard.nextLine();
	}

	public Package(double packageWeight, double packageLength, double packageWidth, double packageHeight ) {
		this.packageWeight = packageWeight;
		this.packageLength = packageLength;
		this.packageWidth = packageWidth;
		this.packageHeight = packageHeight;
		// super();
		// TO DO Auto-generated constructor stub
	}
	public Package(String packageWeight, String packageLength, String packageWidth, String packageHeight ) {
		this.packageWeight = Double.parseDouble(packageWeight);
		this.packageLength = Double.parseDouble(packageLength);
		this.packageWidth  = Double.parseDouble(packageWidth );
		this.packageHeight = Double.parseDouble(packageHeight);
		// super();
		// TO DO Auto-generated constructor stub
	}

	public double setPackageWeight(Scanner keyboard2) {
		// TO DO Auto-generated method stub
		return 0;
	}

	public double getPackageLength() {
		if (packageLength > 0 && (packageLength+packageWidth+packageHeight)<=100) {
			return packageLength;
			
		} else if (packageLength < 0) { 					// } else if (packageLength > 0) {
			System.out.println(" ");System.out.println(reset + red + "The length of the parcel has been entered as a negative number. Please re-enter the package length." + reset);
			return -1;
			
		} else if (packageLength+packageWidth+packageHeight >= 100) {
	    	System.out.println(" ");
	    	System.out.println(reset + brown + "Chestnut" + red + " + " + green + "Hazel's" + reset + " Parcel Service cannot accept packages exceeding 100 British inches in total outside liner inches." + reset); // System.out.println(reset + brown + "Chestnut" + red + " + " + green + "Hazel's" + reset + " Parcel Service cannot accept packages weighing in excess of 120 American Pounds." + reset); // System.out.println(reset + brown + "Chestnut " + red + " + " + green + " Hazel's" + reset + " Parcel Service cannot accept packages greater than 120 American Pounds." + reset); 
	    	System.out.println("Please consider shipping a different Package.");
        return -1;
		} else {
			System.out.println(" ");System.out.println(reset + red + "You have entered invalid information, please review your input, and re-enter." + reset);
	        return -1;
	    }

	}

	public void setPackageLength(double packageLength) {
		this.packageLength = packageLength;
	}
	

	
/*	
	public double getPackageWidth() {
		if (packageWidth > 0 && (packageLength+packageWidth+packageHeight)<=100) {
			return packageWidth;
			
		} else if (packageWidth < 0) { 					// } else if (packageLength > 0) {
			System.out.println(" ");System.out.println(reset + red + "The width of the parcel has been entered as a negative number. Please re-enter the package width." + reset);
			return -1;
			
		} else if (packageLength+packageWidth+packageHeight >= 100) {
	    	System.out.println(" ");
	    	System.out.println(reset + brown + "Chestnut" + red + " + " + green + "Hazel's" + reset + " Parcel Service cannot accept packages exceeding 100 British inches in total outside liner inches." + reset); // System.out.println(reset + brown + "Chestnut" + red + " + " + green + "Hazel's" + reset + " Parcel Service cannot accept packages weighing in excess of 120 American Pounds." + reset); // System.out.println(reset + brown + "Chestnut " + red + " + " + green + " Hazel's" + reset + " Parcel Service cannot accept packages greater than 120 American Pounds." + reset); 
	    	System.out.println("Please consider shipping a different Package.");
        return -1;
		} else {
	        System.out.println(reset + red + "You have entered invalid information, please review your input, and re-enter." + reset);
	        return -1;
	    }

	}
*/
	
	// /*	// } else if (packageLength > 0) {
	public double getPackageWidth() {
		if (packageWidth > 0 && (packageLength+packageWidth+packageHeight)<=100) {
			return packageWidth;
			
		} else if (packageWidth < 0) { 					
			System.out.println(" ");System.out.println(reset + red + "The width of the parcel has been entered as a negative number. Please re-enter the package width." + reset);
			return -1;
			
		} else if (packageLength+packageWidth+packageHeight >= 100) {
	    	System.out.println(" ");
	    	System.out.println(reset + brown + "Chestnut" + red + " + " + green + "Hazel's" + reset + " Parcel Service cannot accept packages exceeding 100 British inches in total outside liner inches." + reset); 
	    	System.out.println("Please consider shipping a different Package.");
        return -1;
		} else {
			System.out.println(" ");System.out.println(reset + red + "You have entered invalid information, please review your input, and re-enter." + reset);
	        return -1;
	    }

	}
// */	// System.out.println(reset + brown + "Chestnut" + red + " + " + green + "Hazel's" + reset + " Parcel Service cannot accept packages weighing in excess of 120 American Pounds." + reset); // System.out.println(reset + brown + "Chestnut " + red + " + " + green + " Hazel's" + reset + " Parcel Service cannot accept packages greater than 120 American Pounds." + reset); 
	
	
	

	public void setPackageWidth(double packageWidth) {
		this.packageWidth = packageWidth;
	}

	/*

	public double getPackageHeight() {
		if (packageHeight > 0 && (packageLength+packageWidth+packageHeight)<=100) {
			return packageHeight;
			
		} else if (packageHeight < 0) { 					
			System.out.println(" ");System.out.println(reset + red + "The Height of the parcel has been entered as a negative number. Please re-enter the package Height." + reset);
			return -1;
			
		} else if (packageLength+packageWidth+packageHeight >= 100) {
	    	System.out.println(" ");
	    	System.out.println(reset + brown + "Chestnut" + red + " + " + green + "Hazel's" + reset + " Parcel Service cannot accept packages exceeding 100 British inches in total outside liner inches." + reset); 
	    	System.out.println("Please consider shipping a different Package.");
        return -1;
		} else {
	        System.out.println(reset + red + "You have entered invalid information, please review your input, and re-enter." + reset);
	        return -1;
	    }

	}

	 */
	
	/*
	public double getPackageHeight() {
		return packageHeight;
	}
	*/
	public double getPackageHeight() {
		if (packageHeight > 0 && (packageLength+packageWidth+packageHeight)<=100) {
			return packageHeight;
			
		} else if (packageHeight < 0) { 					
			System.out.println(" ");System.out.println(reset + red + "The Height of the parcel has been entered as a negative number. Please re-enter the package Height." + reset);
			return -1;
			
		} else if (packageLength+packageWidth+packageHeight >= 100) {
	    	System.out.println(" ");
	    	System.out.println(reset + brown + "Chestnut" + red + " + " + green + "Hazel's" + reset + " Parcel Service cannot accept packages exceeding 100 British inches in total outside liner inches." + reset); 
	    	System.out.println("Please consider shipping a different Package.");
        return -1;
		} else {
			System.out.println(" ");System.out.println(reset + red + "You have entered invalid information, please review your input, and re-enter." + reset);
	        return -1;
	    }

	}

	public void setPackageHeight(double packageHeight) {
		this.packageHeight = packageHeight;
	}
	
	

}
