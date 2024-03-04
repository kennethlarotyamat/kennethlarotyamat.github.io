/*		
		Author's Name: 		    	Kenneth Larot Yamat

     	Purpose of Program:			To calculate the shipping cost of a parcel at a 
     	                          	parcel service store
     						    	 
  		Date Due:					March 3rd, 2024
*/

package edu.unlv.mis768.kly.individualassignment3;

import java.text.DecimalFormat;
// import java.text.DecimalFormat;
import java.util.ArrayList;

public class Shipment {
	DecimalFormat formatDoubleDollars = new DecimalFormat("0.00");
    String red = "\u001B[31m" + "\u001B[1m";
    String reset = "\u001B[0m";
    String green  = "\u001B[32m" + "\u001B[1m";
    String brown  = "\u001B[33m" + "\u001B[1m";
   //  String invisible ="\u001B[37m";
	private String 	theFrequentShipperIdentificationNumber;
	private int 	theTotalNumberOfPackages;
	final double 	THE_FREQUENT_SHIPPER_DISCOUNT = 0.05; 						// "if so, a 5% discount will be applied to the shipping cost."  /*// //  = ""; //  = 0.00*/
	final double 	THE_BULK_PACKAGE_DISCOUNT = 20.00;							// additional “bulk package” discount of $20 off would be applied. // width // i wasn't sure if that was spelled correctly.
	private String  theGrandTotal = "";
	private double  thePreliminaryGrandTotal = 0.00;
	public double 	billableWeight;
	public String 	theInvoiceStatement;													// I'm trying to think. In the transcript assignment I put and updated the array in the demo class, but assignment
																				// 3 requires that the array list is in the shipment model class. I don't know how this is going to work.
	                                                                            // Here is goes.
	ArrayList<Double> packageShippingChargeArray = new ArrayList<Double>();		// private ArrayList<Double> packageShippingChargeArray = new ArrayList<Double>(); // private ArrayList<Double> packageShippingChargeArray = new ArrayList<Double>();     // ArrayList<Double> packageShippingChargesArray = new ArrayList<Double>(); // ArrayList<Double> packageShippingCostsArray = new ArrayList<Double>();  // ArrayList<Double> pointScaleTimesCreditHoursArray = new ArrayList<Double>();
																
	
																				// This didn't work to resolve the error in the Parcel Terminal Demo // public Object packageShippingCostsArray;
																			    // System.out.println(packageShippingChargeArray);  // System.out.println(packageShippingCostsArray);  // I will need this for testing later. //	System.out.println(courseNumberArray);			// this was for testing it can be reactivated if more testing is needed
																				// well, that was something of a detour. I spent a little while formatting the output, the way things look on the console.
	public Shipment(double billableWt) {
																	// DecimalFormat formatDoubleDollars = new DecimalFormat("0.00");
		this.billableWeight = billableWt;							// formatDoubleDollars.format(billableWt);
																	// this.courseNumber = courseNo;
																	// super();
																	// TO DO Auto-generated constructor stub
																	// let us see if this worked // System.out.println(packageShippingChargeArray);
	}
	public Shipment(String billableWt) {
																	// DecimalFormat formatDoubleDollars = new DecimalFormat("0.00");
		this.billableWeight = Double.parseDouble(billableWt);		// this is such a nightmare. // formatDoubleDollars.format(billableWt);
																	// this.courseNumber = courseNo;
																	// super();
																	// TO DO Auto-generated constructor stub
																	// let us see if this worked // System.out.println(packageShippingChargeArray); // what a nightmare.
		 															// this is for testing .length
																	// what else do I need?
	}
	public ArrayList<Double> getPackageShippingChargeArray() {
		return packageShippingChargeArray;
	}
	
																											// I'm not sure if the setter is going to be used.
	public void setPackageShippingChargeArray(ArrayList<Double> packageShippingChargeArray) { 				// this is set by the user in the ParcelTerminalDemo.java class
		this.packageShippingChargeArray = packageShippingChargeArray;
	}
	public String getTheFrequentShipperIdentificationNumber() {
		return theFrequentShipperIdentificationNumber;
	}
	public void setTheFrequentShipperIdentificationNumber(String theFrequentShipperIdentificationNo) {
		this.theFrequentShipperIdentificationNumber = theFrequentShipperIdentificationNo;            		// theFrequentShipperIdentificationNo // theFrequentShipperIdentificationNumber;
	}
							//	public double getTheFrequentShipperIdentificationNumberDouble() {
							//		return theFrequentShipperIdentificationNumber;
							//	}
							//	public void setTheFrequentShipperIdentificationNumber(double theFrequentShipperIdentificationNo) {
							//		this.theFrequentShipperIdentificationNumber = double.parsedouble(theFrequentShipperIdentificationNo);            		// theFrequentShipperIdentificationNo // theFrequentShipperIdentificationNumber;
							//	}
	public int getTheTotalNumberOfPackages() {
		return theTotalNumberOfPackages;
	}
	public void setTheTotalNumberOfPackages(int theTotalNumberOfPkgs) {
		this.theTotalNumberOfPackages = theTotalNumberOfPkgs; // theTotalNumberOfPackages;                    // theTotalNumberOfPkgs;// theTotalNumberOfPackages;
	}
	
	
	
//	public double getTheGrandTotal() {													
//		
//									
//		for (double value : packageShippingChargeArray) {
//			theGrandTotal += value; 									
//		}
//		return theGrandTotal;
//	} 	
	
	// double theGrandTotal = 0.00;
	// theGrandTotal	
	//
	//double preliminaryCost = 0.00;
	// double t o t // public double getTheGrandTotal(double t o t) {
	
//	public double getThePreliminaryGrandTotal() {													
//		
//		
//		for (double value : packageShippingChargeArray) {
//			thePreliminaryGrandTotal += value; 									
//		}
//		return thePreliminaryGrandTotal;
//	} 	
	public double getThePreliminaryGrandTotal() {
	    // double thePreliminaryGrandTotal = 0.0; // Declare local variable here

	    for (double value : packageShippingChargeArray) {
	    	thePreliminaryGrandTotal += value;
	    }

	    return thePreliminaryGrandTotal;
	}
	
	
	
	public void setThePreliminaryGrandTotal(double thePrelimGrandTotal) {
		this.thePreliminaryGrandTotal = thePrelimGrandTotal;
	}
	
	
	// return thePreliminaryGrandTotal * THE_FREQUENT_SHIPPER_DISCOUNT; // theGrandTotal // if theFreqShipIdenNum != 0; { 	// return theGrandTotal; 							// if theFrequentShipperIdentificationNumber != 0; return theGrandTotal; 																			// I might not need this.  v
	
	
	
	
	
	public String getTheGrandTotal() {
		
		int theFreqShipIdenNum = Integer.parseInt(theFrequentShipperIdentificationNumber);
		double thePrelim = getThePreliminaryGrandTotal();
		// String grandTotal;
		if (     (theFreqShipIdenNum != 0) && (thePrelim - (thePrelim * THE_FREQUENT_SHIPPER_DISCOUNT)  ) <= 300)  { // thePreliminaryGrandTotal

			
			System.out.println(   reset+"The preliminary cost of shipping your "+ packageShippingChargeArray.size() + " package(s) amounts to: "+ green+ formatDoubleDollars.format(   thePrelim   ) +" USD"+reset   );
			System.out.println(   reset+"You will be receiving a frequent shipper discount in the amount of: "+ green+ formatDoubleDollars.format(   (   THE_FREQUENT_SHIPPER_DISCOUNT * thePrelim   )   ) +" USD"+reset   );
			System.out.println(reset+" "+reset);
			// double theFinalGrandTotalAggregateShipmentExpenses = getTheGrandTotal();
			System.out.println(   reset+"The total final cost of shipping your "+ packageShippingChargeArray.size() + " package(s) amounts to a Grand Total of: "+ green+ formatDoubleDollars.format(     thePrelim-(   thePrelim*THE_FREQUENT_SHIPPER_DISCOUNT   )      ) +" USD" +reset+ "deliverable as pounds of British Eurodollars"+reset); // Pounds of +invisible
			// So it's actually this line that was driving me crazy // System.out.println(reset+" "+reset);
			//return theGrandTotal;
			// String grandTotal = this.grandTotal = theGrandTotal
			
			
		} else if ((theFreqShipIdenNum != 0) && ((thePrelim - (thePrelim * THE_FREQUENT_SHIPPER_DISCOUNT)) >= 300) ) {

			System.out.println(   reset+"The preliminary cost of shipping your "+ packageShippingChargeArray.size() + " package(s) amounts to: "+ green+ formatDoubleDollars.format(   thePrelim   ) +" USD"+reset)   ;
			System.out.println(    reset+"You will be receiving a frequent shipper discount in the amount of: "+ green+ formatDoubleDollars.format(        THE_FREQUENT_SHIPPER_DISCOUNT * thePrelim        ) +" USD"+reset     );
			// double theBulkDiscountAmount = THE_BULK_PACKAGE_DISCOUNT;
			System.out.println(reset+"You will also be receiving a frequent shipper bulk shipment discount in the amount of: "+ green+ (THE_BULK_PACKAGE_DISCOUNT) +" USD"+reset); // Pounds of 
			System.out.println(reset+" "+reset);
			// double theFinalGrandTotalAggregateShipmentExpenses = getTheGrandTotal();
			System.out.println(reset+"The total final cost of shipping your "+ packageShippingChargeArray.size() + " package(s) amounts to a Grand Total of: "+ green+ formatDoubleDollars.format(   (thePrelim-(thePrelim*THE_FREQUENT_SHIPPER_DISCOUNT))-THE_BULK_PACKAGE_DISCOUNT   ) +" USD" +reset+ "deliverable as pounds of British Eurodollars"+reset); // +invisible
			// So it's actually this line that was driving me crazy // System.out.println(reset+" "+reset);// System.out.println(reset+" "+reset);
			//return theGrandTotal;

			
			
		}	else {
			// theGrandTotal = getThePreliminaryGrandTotal();

			System.out.println(reset+" "+reset);
			// double theFinalGrandTotalAggregateShipmentExpenses = getTheGrandTotal();
			System.out.println(reset+"The total final cost of shipping your "+ packageShippingChargeArray.size() + " package(s) amounts to a Grand Total of: "+ green+ formatDoubleDollars.format(   thePrelim   ) +" USD" +reset+ "deliverable as pounds of British Eurodollars"+reset); // +invisible // Pounds of 
			// So it's actually this line that was driving me crazy // System.out.println(reset+" "+reset);// System.out.println(reset+" "+reset);
			//return theGrandTotal;
			
			// I'm a little irritated. It finally works. but it's taken forever.
			// thankYou = "thank You for shipping"
			// theGrandTotal = theGrandTotal;

		}

		return theGrandTotal;
		// System.out.println(reset + brown + "Chestnut" + red + " + " + green + "Hazel's" + reset + " Parcel Service cannot accept packages exceeding 120 American Pounds in weight." + reset);
		//  = "Thank you for shipping your packages with"brown+ "Chestnut" + Hazel's Parcel Services"  	    	
		// System.out.println(reset + brown + "Chestnut" + red + " + " + green + "Hazel's" + reset + 
		// " Parcel Service cannot accept packages exceeding 120 American Pounds in weight." + reset);		
														
	}
	// public double getTheGrandTotal() {}
	// it didn't work after - i basically moved it from ParcelTerminalDemo to Shipment.java, it didn't work the first time 
	// I'm going to try it again.
	
	// return getThePreliminaryGrandTotal()-(getThePreliminaryGrandTotal() * THE_FREQUENT_SHIPPER_DISCOUNT);
	// return ((getThePreliminaryGrandTotal()- (getThePreliminaryGrandTotal() * THE_FREQUENT_SHIPPER_DISCOUNT)) - THE_BULK_PACKAGE_DISCOUNT);
	// return theGrandTotal;
	//		} else if (theFreqShipIdenNum != 0 && getThePreliminaryGrandTotal() >= 300 ) {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void setTheGrandTotal(String theGrandTotal) {

		this.theGrandTotal = theGrandTotal;
	}
	
	public String getTheInvoiceStatement() {
		

		
		return theInvoiceStatement;

	}
	
//	int 	theFrequentShipperIdentificationNumber;
//	System.out.print(reset+"Please enter your frequent shipper identification number: " + green);
//	theFrequentShipperIdentificationNumber = keyboard.nextInt();
//	// int // packageShippingChargeArrayLength =0;
//	int packageShippingChargeArrayLength = packageShippingChargeArray.Length;
//	System.out.println("You are shipping a total of "+ +); // packageShippingChargeArray.length; packageShippingChargeArray.length
	// return theInvoiceStatement;
	// if (theFrequentShipperIdentificationNumber !=0) {
		
	// good lord. i thought that I was almost done here, but. I really feel like this is going to take
	// yet another eternity.}
	// return theInvoiceStatement;
//	public String getTheInvoiceStatement() {
//		
////		int 	theFrequentShipperIdentificationNumber;
////		System.out.print(reset+"Please enter your frequent shipper identification number: " + green);
////		theFrequentShipperIdentificationNumber = keyboard.nextInt();
////		// int // packageShippingChargeArrayLength =0;
////		int packageShippingChargeArrayLength = packageShippingChargeArray.Length;
////		System.out.println("You are shipping a total of "+ +); // packageShippingChargeArray.length; packageShippingChargeArray.length
//		
//		return theInvoiceStatement;
//		// return theInvoiceStatement;
//		// if (theFrequentShipperIdentificationNumber !=0) {
//			
//		// good lord. i thought that I was almost done here, but. I really feel like this is going to take
//		// yet another eternity.}
//		// return theInvoiceStatement;
//	}
//	public void setTheInvoiceStatement(String theInvoice) {
//		this.theInvoiceStatement = theInvoiceStatement;
//	}
	
	
	
	
	
	
	
}

// Frequent shipper
// Total package(s) being shipped
// Total shipping costs
// Frequent shipper discount
// Bulk shipment discount
/*

The following symbols are used in reporting and recording graduate student grades:

A		Superior (4.0)
B  		Passing (3.0)
C   	Average (2.0)
D		Below Average (1.0)
F		Failing

AD		Audit (not graded, no credit toward GPA)
I   	Incomplete (expires after one year; if not grade is submitted in that time-frame, the ‘I’ will default to an ‘F’ grade)

S  		Satisfactory

X		Hold: Grade is submitted upon completion of Thesis or Dissertation or Professional Paper
		Note: Faculty members have the option of using plus (+) and minus (-) for grades of A, B, C, and D. Exception: A+ grades are not given. 
		At the graduate level, grades below a B are generally considered unacceptable. Graduate students must have a 3.0 GPA in order to qualify for graduation.
		
		What a nightmare. So the highest possible grade I can obtain in the course is a C, but it's not clear to me. As a graduate student, if I would get a 2, or a 0.
		I would rather get a C than audit the class.



*/
/*

After all the packages are entered, the program will prompt the users to enter if they have “frequent-shipper” numbers; 
if so, a 5% discount will be applied to the shipping cost. If the total amount after the frequent-shipper discount is greater than $300, 
an additional “bulk package” discount of $20 off would be applied. The program shows the total number of packages to ship, subtotal 
before discount, frequent-shipper discount if applied, bulk package discount if applied, and the grand total.


*/