/*		
		Author's Name: 		    	Kenneth Larot Yamat

     	Purpose of Program:			To calculate the shipping cost of a parcel at a 
     	                          	parcel service store
     						    	 
  		Date Due:					March 3rd, 2024
*/

package edu.unlv.mis768.kly.individualassignment3.redo;

import java.text.DecimalFormat;

import java.util.ArrayList;

public class Shipment {
	DecimalFormat formatDoubleDollars = new DecimalFormat("0.00");
	String red = "\u001B[31m" + "\u001B[1m";

	String reset = "\u001B[0m";

	String green = "\u001B[32m" + "\u001B[1m";

	String brown = "\u001B[33m" + "\u001B[1m";

	private String theFrequentShipperIdentificationNumber;
	private int theTotalNumberOfPackages;
	final double THE_FREQUENT_SHIPPER_DISCOUNT = 0.05;

	final double THE_BULK_PACKAGE_DISCOUNT = 20.00;

	private String theGrandTotal = "";
	private double thePreliminaryGrandTotal = 0.00;
	public double billableWeight;
	public String theInvoiceStatement;

	ArrayList<Double> packageShippingChargeArray = new ArrayList<Double>();

	public Shipment(double billableWt) {

		this.billableWeight = billableWt;

	}

	public Shipment(String billableWt) {

		this.billableWeight = Double.parseDouble(billableWt);

	}

	public ArrayList<Double> getPackageShippingChargeArray() {
		return packageShippingChargeArray;
	}

	public void setPackageShippingChargeArray(ArrayList<Double> packageShippingChargeArray) {

		this.packageShippingChargeArray = packageShippingChargeArray;
	}

	public String getTheFrequentShipperIdentificationNumber() {
		return theFrequentShipperIdentificationNumber;
	}

	public void setTheFrequentShipperIdentificationNumber(String theFrequentShipperIdentificationNo) {
		this.theFrequentShipperIdentificationNumber = theFrequentShipperIdentificationNo;

	}

	public int getTheTotalNumberOfPackages() {
		return theTotalNumberOfPackages;
	}

	public void setTheTotalNumberOfPackages(int theTotalNumberOfPkgs) {
		this.theTotalNumberOfPackages = theTotalNumberOfPkgs;

	}

	public double getThePreliminaryGrandTotal() {

		for (double value : packageShippingChargeArray) {
			thePreliminaryGrandTotal += value;
		}

		return thePreliminaryGrandTotal;
	}

	public void setThePreliminaryGrandTotal(double thePrelimGrandTotal) {
		this.thePreliminaryGrandTotal = thePrelimGrandTotal;
	}

	public String getTheGrandTotal() {

		int theFreqShipIdenNum = Integer.parseInt(theFrequentShipperIdentificationNumber);
		double thePrelim = getThePreliminaryGrandTotal();

		if ((theFreqShipIdenNum != 0) && (thePrelim - (thePrelim * THE_FREQUENT_SHIPPER_DISCOUNT)) <= 300) {

			System.out.println(reset + "The preliminary cost of shipping your " + packageShippingChargeArray.size()
					+ " package(s) amounts to: " + green + formatDoubleDollars.format(thePrelim) + " USD" + reset);
			System.out.println(reset + "You will be receiving a frequent shipper discount in the amount of: " + green
					+ formatDoubleDollars.format((THE_FREQUENT_SHIPPER_DISCOUNT * thePrelim)) + " USD" + reset);
			System.out.println(reset + " " + reset);

			System.out.println(reset + "The total final cost of shipping your " + packageShippingChargeArray.size()
					+ " package(s) amounts to a Grand Total of: " + green
					+ formatDoubleDollars.format(thePrelim - (thePrelim * THE_FREQUENT_SHIPPER_DISCOUNT)) + " USD"
					+ reset + " deliverable as pounds of British Eurodollars" + reset);

		} else if ((theFreqShipIdenNum != 0) && ((thePrelim - (thePrelim * THE_FREQUENT_SHIPPER_DISCOUNT)) >= 300)) {

			System.out.println(reset + "The preliminary cost of shipping your " + packageShippingChargeArray.size()
					+ " package(s) amounts to: " + green + formatDoubleDollars.format(thePrelim) + " USD" + reset);
			System.out.println(reset + "You will be receiving a frequent shipper discount in the amount of: " + green
					+ formatDoubleDollars.format(THE_FREQUENT_SHIPPER_DISCOUNT * thePrelim) + " USD" + reset);

			System.out.println(
					reset + "You will also be receiving a frequent shipper bulk shipment discount in the amount of: "
							+ green + formatDoubleDollars.format(THE_BULK_PACKAGE_DISCOUNT) + " USD" + reset);
			System.out.println(reset + " " + reset);

			System.out.println(reset + "The total final cost of shipping your " + packageShippingChargeArray.size()
					+ " package(s) amounts to a Grand Total of: " + green
					+ formatDoubleDollars.format(
							(thePrelim - (thePrelim * THE_FREQUENT_SHIPPER_DISCOUNT)) - THE_BULK_PACKAGE_DISCOUNT)
					+ " USD" + reset + " deliverable as pounds of British Eurodollars" + reset);

		} else {

			System.out.println(reset + " " + reset);

			System.out.println(reset + "The total final cost of shipping your " + packageShippingChargeArray.size()
					+ " package(s) amounts to a Grand Total of: " + green + formatDoubleDollars.format(thePrelim)
					+ " USD" + reset + " deliverable as pounds of British Eurodollars" + reset);

		}

		return theGrandTotal;

	}

	public void setTheGrandTotal(String theGrandTotal) {

		this.theGrandTotal = theGrandTotal;
	}

	public String getTheInvoiceStatement() {

		return theInvoiceStatement;

	}

}




/*

I'm using this area to add words to the dictionary.

// website // websites // gpt // gaussian // Gaussian // pretrained // dispersant // Artificial // Blockchain // Han-fen Hu // Spira // Sloan // Duan et al. // regulatory // Regulatory // Affordances // paradigms
// Jablonka, K. M., Schwaller, P., Ortega-Guerrero, A., & Smit, B. (2024). //
// anomalies // fraudulent // Siri // siri // Susan Alice Bennett // psychology // neurosciences // fraudulent // approval // neurosciences

These are where the oranges
spent most of their time on the
trees before
they were 
squeeze and became a
cup of juice.









*/



// I'm going to perform a re-write of this program. I think that I might do a re-write of this program.
// i don't know . it kind of depends on what time constrains I have to deal with these next few weeks.
// right now I'm working on my MIS 764 paper, and this one article is taking basically an eternity
// to get through. I don't even want to think about how many hours I've been listening to the browser read
// this article to me. Forever. forever. it has taken forever. it is taking forever. I'm tired.

// set text color to red and bold.
// resets the text color to default text color
// set text color to green and bold.
// set text color to brown and bold.
// String invisible ="\u001B[37m";
// "if so, a 5% discount will be applied to the shipping cost." -

// Han-fen Hu, Ph.D /*// // = ""; // = 0.00*/
// DecimalFormat formatDoubleDollars = new DecimalFormat("0.00");
// formatDoubleDollars.format(billableWt);
// this.courseNumber = courseNo;
// super();
// TO DO Auto-generated constructor stub
// let us see if this worked //
// System.out.println(packageShippingChargeArray);

// I'm trying to think. In the transcript assignment I put and updated the array
// in the demo class, but assignment
// 3 requires that the array list is in the shipment model class. I don't know
// how this is going to work.
// Here is goes.

// "additional “bulk package” discount of $20 off would be applied."
// - Han-fen Hu, Ph.D // width // i wasn't sure if that was spelled
// correctly.

// for the ParcelTerminalDemo class I used the selection formatter to clearn up
// the
// apperance of my program, but the code looks funny so I won't be doing that
// here. // import java.text.DecimalFormat;

// private ArrayList<Double>
// packageShippingChargeArray = new
// ArrayList<Double>(); // private
// ArrayList<Double>
// packageShippingChargeArray = new
// ArrayList<Double>(); // ArrayList<Double>
// packageShippingChargesArray = new
// ArrayList<Double>(); // ArrayList<Double>
// packageShippingCostsArray = new
// ArrayList<Double>(); // ArrayList<Double>
// pointScaleTimesCreditHoursArray = new
// ArrayList<Double>();

// This didn't work to resolve the error in the Parcel Terminal Demo // public
// Object packageShippingCostsArray;
// System.out.println(packageShippingChargeArray); //
// System.out.println(packageShippingCostsArray); // I will need this for
// testing later. // System.out.println(courseNumberArray); // this was for
// testing it can be reactivated if more testing is needed
// well, that was something of a detour. I spent a little while formatting the
// output, the way things look on the console.

// DecimalFormat formatDoubleDollars = new DecimalFormat("0.00");
// this is such a nightmare. //
// formatDoubleDollars.format(billableWt);
// this.courseNumber = courseNo;
// super();
// TO DO Auto-generated constructor stub
// let us see if this worked //
// System.out.println(packageShippingChargeArray); //
// what a nightmare.
// this is for testing .length
// what else do I need?
// I'm not sure if the setter is going to be used.
// this is set by the user
// in the
// ParcelTerminalDemo.java
// class

// theFrequentShipperIdentificationNo
// //
// theFrequentShipperIdentificationNumber;
// public double getTheFrequentShipperIdentificationNumberDouble() {
// return theFrequentShipperIdentificationNumber;
// }
// public void setTheFrequentShipperIdentificationNumber(double
// theFrequentShipperIdentificationNo) {
// this.theFrequentShipperIdentificationNumber =
// double.parsedouble(theFrequentShipperIdentificationNo); //
// theFrequentShipperIdentificationNo // theFrequentShipperIdentificationNumber;
// }
// theTotalNumberOfPackages;
// theTotalNumberOfPackages; // theTotalNumberOfPkgs;//

// public double getTheGrandTotal() {
//
//
// for (double value : packageShippingChargeArray) {
// theGrandTotal += value;
// }
// return theGrandTotal;
// }

// double theGrandTotal = 0.00;
// theGrandTotal
//
// double preliminaryCost = 0.00;
// double t o t // public double getTheGrandTotal(double t o t) {

// public double getThePreliminaryGrandTotal() {
//
//
// for (double value : packageShippingChargeArray) {
// thePreliminaryGrandTotal += value;
// }
// return thePreliminaryGrandTotal;
// }

// double thePreliminaryGrandTotal = 0.0; // Declare local variable here

// return thePreliminaryGrandTotal * THE_FREQUENT_SHIPPER_DISCOUNT; //
// theGrandTotal // if theFreqShipIdenNum != 0; { // return theGrandTotal;

// if theFrequentShipperIdentificationNumber != 0; return theGrandTotal; // I
// might not need this. v

// this was something I actually had a hard time with. I was trying to use the
// method getThePreliminaryGrandTotal(), but I think
// that it kept calling it over and over in my calculations, so I had to set. i
// had to create a variable that called the method
// the variable is thePrelim, which is where the method
// getThePreliminaryGrandTotal() is called and the value of the variable is set
// and used for calculations in the getTheGrandTotal method.

// this method alone took me a really long time to deal with.
// I think I started it earlier today and allocated one hour to get it done, it
// took me six or so.
// it started off in the ParcelTerminalDemo class, but I had to move it to the
// Shipment class as a requirement of the assignment.
// adjusting it took a while because. there's a slightly different process that
// goes on when it's done in the ParcelTerminalDemo

// String grandTotal;
// thePreliminaryGrandTotal
// double theFinalGrandTotalAggregateShipmentExpenses = getTheGrandTotal();

// So it's actually this line that was driving me crazy //
// System.out.println(reset+" "+reset);
// return theGrandTotal;
// String grandTotal = this.grandTotal = theGrandTotal

// Pounds
// of
// Pounds of +invisible // +invisible // Pounds of deliverable in vs deliverable
// as // +invisible

// double theBulkDiscountAmount = THE_BULK_PACKAGE_DISCOUNT;
// double theFinalGrandTotalAggregateShipmentExpenses = getTheGrandTotal();
// So it's actually this line that was driving me crazy //
// System.out.println(reset+" "+reset);// System.out.println(reset+" "+reset);
// return theGrandTotal;

/*
 * I'm having a hard time. I'm always having a hard time. when does that ever
 * change?
 */

// theGrandTotal = getThePreliminaryGrandTotal(); // .xml

// double theFinalGrandTotalAggregateShipmentExpenses = getTheGrandTotal();

// So it's actually this line that was driving me crazy //
// System.out.println(reset+" "+reset);// System.out.println(reset+" "+reset);
// return theGrandTotal;

// I'm a little irritated. It finally works. but it's taken forever.
// thankYou = "thank You for shipping"
// theGrandTotal = theGrandTotal;

// System.out.println(reset + brown + "Chestnut" + red + " + " + green +
// "Hazel's" + reset + " Parcel Service cannot accept packages exceeding 120
// American Pounds in weight." + reset);
// = "Thank you for shipping your packages with"brown+ "Chestnut" + Hazel's
// Parcel Services"
// System.out.println(reset + brown + "Chestnut" + red + " + " + green +
// "Hazel's" + reset +
// " Parcel Service cannot accept packages exceeding 120 American Pounds in
// weight." + reset);

// public double getTheGrandTotal() {}
// it didn't work after - i basically moved it from ParcelTerminalDemo to
// Shipment.java, it didn't work the first time
// I'm going to try it again.

// return getThePreliminaryGrandTotal()-(getThePreliminaryGrandTotal() *
// THE_FREQUENT_SHIPPER_DISCOUNT);
// return ((getThePreliminaryGrandTotal()- (getThePreliminaryGrandTotal() *
// THE_FREQUENT_SHIPPER_DISCOUNT)) - THE_BULK_PACKAGE_DISCOUNT);
// return theGrandTotal;
// } else if (theFreqShipIdenNum != 0 && getThePreliminaryGrandTotal() >= 300 )
// {

// int theFrequentShipperIdentificationNumber;
// System.out.print(reset+"Please enter your frequent shipper identification
// number: " + green);
// theFrequentShipperIdentificationNumber = keyboard.nextInt();
//// int // packageShippingChargeArrayLength =0;
// int packageShippingChargeArrayLength = packageShippingChargeArray.Length;
// System.out.println("You are shipping a total of "+ +); //
// packageShippingChargeArray.length; packageShippingChargeArray.length
// return theInvoiceStatement;
// if (theFrequentShipperIdentificationNumber !=0) {

// good lord. i thought that I was almost done here, but. I really feel like
// this is going to take
// yet another eternity.}
// return theInvoiceStatement;
// public String getTheInvoiceStatement() {
//
//// int theFrequentShipperIdentificationNumber;
//// System.out.print(reset+"Please enter your frequent shipper identification
// number: " + green);
//// theFrequentShipperIdentificationNumber = keyboard.nextInt();
//// // int // packageShippingChargeArrayLength =0;
//// int packageShippingChargeArrayLength = packageShippingChargeArray.Length;
//// System.out.println("You are shipping a total of "+ +); //
// packageShippingChargeArray.length; packageShippingChargeArray.length
//
// return theInvoiceStatement;
// // return theInvoiceStatement;
// // if (theFrequentShipperIdentificationNumber !=0) {
//
// // good lord. i thought that I was almost done here, but. I really feel like
// this is going to take
// // yet another eternity.}
// // return theInvoiceStatement;
// }
// public void setTheInvoiceStatement(String theInvoice) {
// this.theInvoiceStatement = theInvoiceStatement;
// }

// Frequent shipper
// Total package(s) being shipped
// Total shipping costs
// Frequent shipper discount
// Bulk shipment discount
/*
 * 
 * "The following symbols are used in reporting and recording graduate student
 * grades:
 * 
 * A Superior (4.0)
 * B Passing (3.0)
 * C Average (2.0)
 * D Below Average (1.0)
 * F Failing
 * 
 * AD Audit (not graded, no credit toward GPA)
 * I Incomplete (expires after one year; if not grade is submitted in that
 * time-frame, the ‘I’ will default to an ‘F’ grade)
 * 
 * S Satisfactory
 * 
 * X Hold: Grade is submitted upon completion of Thesis or Dissertation or
 * Professional Paper
 * Note: Faculty members have the option of using plus (+) and minus (-) for
 * grades of A, B, C, and D. Exception: A+ grades are not given.
 * At the graduate level, grades below a B are generally considered
 * unacceptable. Graduate students must have a 3.0 GPA in order to qualify for
 * graduation." - UNLV
 * 
 * What a nightmare. So the highest possible grade I can obtain in the course is
 * a C, but it's not clear to me. As a graduate student, if I would get a 2, or
 * a 0.
 * I would rather get a C than audit the class.
 * 
 * 
 * 
 */
/*
 * 
 * After all the packages are entered, the program will prompt the users to
 * enter if they have “frequent-shipper” numbers;
 * if so, a 5% discount will be applied to the shipping cost. If the total
 * amount after the frequent-shipper discount is greater than $300,
 * an additional “bulk package” discount of $20 off would be applied. The
 * program shows the total number of packages to ship, subtotal
 * before discount, frequent-shipper discount if applied, bulk package discount
 * if applied, and the grand total.
 * 
 * 
 */

/*
 * 
 * ...
 * 
 * Revision Notes:
 * 
 * "Take getPackageWeight() for example, it should just
 * return packageWeight while setPackageWeight() is taking
 * the value given by the user and set it to the field packageWeight."
 * - Han-fen Hu, Ph.D (2024)
 * 
 * ...
 * 
 * I find this rather annoying. not the comment, but
 * I spent all that time moving all that stuff from ParcelTerminalDemo into
 * the Shipment class, and I was actually just supposed to keep it in the
 * ParcelTerminalDemo class.
 * 
 * nightmare
 * 
 * it was the stuff related to the grand total, and the discounts. i moved it
 * from ParcelTerminalDemo into shipment.java
 * 
 * ...
 * 
 * "Everything I had done has to be done
 * over; I was on the wrong track entirely,
 * and after working hard most of that time:
 * I'm still only at the beginning."
 * - Gustave Flaubert
 * 
 * ...
 * 
 */
// illiquid // laborious // bollinger band // Bollinger Band // fulfillment //
// preferred // miscellaneous

/*
 * 
 * kennethsAvailability
 * 
 * if ( 1200AM =< time && time =< 600PM ) {
 * system.out.println(the meeting can take place in person)
 * } else if (time =< 1200AM && time =< 600AM) {
 * System.out.println (the meeting can take place virtually or online)
 * } else {
 * System.out.prinntline (the meeting cannot take place)
 * }
 * 
 * hanfenHuPhdsAvailability
 * 
 * if (time == officeHours && location == online) {
 * system.out.println( the meeting can take place)
 * } else {
 * System.out.println ( the meeting cannot take place)
 * }
 * 
 * willKennethMeetHanfenHu {
 * System.out.println ( the meeting cannot take place)
 * }
 * 
 */

// investopedia // midsize