/*		
		Author's Name: 		    	Kenneth Larot Yamat

     	Purpose of Program:			To calculate the shipping cost of a parcel at a 
     	                          	parcel service store
     						    	 
  		Date Due:					March 3rd, 2024
*/
package edu.unlv.mis768.kly.individualassignment3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import java.text.DecimalFormat;

// I figured out why it was there, I was reusing code from the Create transcript and it auto imported. // I have no idea why this is here. 		// import edu.unlv.mis768.kly.individualassignment2.CreateTranscript; import edu.unlv.mis768.kly.individualassignment2.CreateTranscript;

public class ParcelTerminalDemo { // this is the demo class// public class ShippingCalculatorDemo {

	public static void main(String[] args) throws IOException { // this is the main argument
		DecimalFormat formatDoubleDollars = new DecimalFormat("0.00"); // formats two places to the right of the decimal
		String red = "\u001B[31m" + "\u001B[1m"; // formats text red and bold
		String reset = "\u001B[0m";// resets the text color
		String green = "\u001B[32m" + "\u001B[1m"; // formats the color of the text to be green and bold.
		// String invisible ="\u001b[38;5; + n + m + n";
		int entryNumber = 1; // initializes the package count.
		// This is no longer being used now that the calculated items are calculated. //
		// final String THE_PLACEHOLDER = "PLACEHOLDER"; // this is used for things that
		// I will calculate later,
		double packageWeight = 0; // the weight of the parcel
		double packageLength = 0; // the length of the parcel
		double packageWidth = 0; // the width of the parcel
		double packageHeight = 0; // = keyboard.nextDouble();
		double dimensionalWeight; // the dimensional weight of a package to be shipped, based on the dimensions of the package.
		char yesOrNoEntry;
		double billableWeight = 0;
		Shipment shipment = new Shipment(billableWeight);

		// new instance of the Shipment class. // pulls Shipment class

		// into the demo class.
		// int theFrequentShipperIdentificationNumber;

		// double theNumberOfOutsideLinerInches = 0;
		// double theDimensionalWeight = 0;

		Scanner keyboard = new Scanner(System.in);

		// initializes the scanner.

		// System.out.println(invisible+"test area");

		System.out.println(reset + red + "Greetings:  " + reset
				+ " Utilize this terminal to determine the costs of shipping your parcel(s). ");
		System.out.println("             Please enter the" + red + " weight" + reset + " and the " + red + "dimensions "
				+ reset + "of your parcel: ");

		// user greeting for the customer

		System.out.println(" ");
		do {
			System.out.println(reset + "                                     Data for Parcel # " + entryNumber);
			System.out.println(" ");

			// /**/System.out.println(" Data for Package # 1"); // entryNumber// this number
			// needs to increment depending on the number of packages. // this number needs
			// to iterate depending on the number of packages.

			// this line is being moved down System.out.println("Please enter the"+ red + "
			// weight "+reset+"of your parcel:"); // " and the "+ red +"dimensions "+reset+
			// System.out.println(" "); // I don't know what's going on here, the line won't
			// skip. I know what it is, it's on the wrong line.
			// keyboard.nextLine();

			// System.out.println("Please enter the"+ red + " weight "+reset+"of your
			// parcel:");
			// double packageWeight = keyboard.nextDouble(); // this needs to be a double.
			// // String packageWeight = keyboard.nextLine(); // this needs to be a double.
			// // String packageWeight = keyboard.nextLine();
			// keyboard.nextLine();

			// Package package = new Package(packageWeight, packageLength, packageWidth,
			// packageHeight);

			Package parcelPackage = new Package(packageWeight, packageLength, packageWidth, packageHeight);

			// creates a
			// new
			// instance
			// of
			// parcelPackage

			// // start while true
			// while(true) {
			//
			// System.out.print("Please enter the"+ red + " weight "+reset+"of your parcel:
			// " +green); // System.out.println("Please enter the"+ red + " weight
			// "+reset+"of your parcel: "); // i figured out what it is. I'm using println
			// rather than just print. // there is something screwy going on here, it keeps
			// skipping a line for the user's input and it's driving me nuts. //
			// System.out.println("Please enter the weight of your parcel: "); //
			// System.out.println("Please enter the"+ red + " weight "+reset+"of your
			// parcel: "); // System.out.println(("Please enter the"+ red + " weight
			// "+reset)+("of your parcel: ")); // user enters and sets the weight of the
			// package being shipped.
			// packageWeight = parcelPackage.keyboard.nextDouble(); // setPackageWeight. //
			// parcelPackage.setPackageWeight(keyboard); // .keyboard.nextDouble();//
			// packageWeight = parcelPackage.setPackageWeight.keyboard.nextDouble(); //
			// this.
			// parcelPackage.setPackageWeight(packageWeight);
			// // System.out.println(" ");
			// packageWeight = parcelPackage.getPackageWeight();
			// if (packageWeight == -1) {
			// System.out.println(" ");
			// // this stops the program if the package weight is invalid. // Break out of
			// the loop
			// } else {
			// break; // // System.out.println("Please enter the"+ red + " weight
			// "+reset+"of your parcel: "); // i figured out what it is. I'm using println
			// rather than just print. // there is something screwy going on here, it keeps
			// skipping a line for the user's input and it's driving me nuts. //
			// System.out.println("Please enter the weight of your parcel: "); //
			// System.out.println("Please enter the"+ red + " weight "+reset+"of your
			// parcel: "); // System.out.println(("Please enter the"+ red + " weight
			// "+reset)+("of your parcel: ")); // user enters and sets the weight of the
			// package being shipped.
			// }
			//
			// } // end while true // System.out.println(" "); // this stops the program if
			// the package weight is invalid. // Break out of the loop // setPackageWeight.
			// // parcelPackage.setPackageWeight(keyboard); // .keyboard.nextDouble();//
			// packageWeight = parcelPackage.setPackageWeight.keyboard.nextDouble(); //
			// this.

			// The Original version is above, I need a clean one without comments for the
			// other user input steps. // refresh

			// if (packageWeight == -1) {
			// System.out.println(" ");
			// System.out.print("Please enter the"+ red + " weight "+reset+"of your parcel:
			// " +green);
			// parcelPackage.setPackageWeight(packageWeight);
			// packageWeight = parcelPackage.getPackageWeight();
			// // break; // this stops the program if the package weight is invalid. //
			// Break out of the loop
			// }
			// packageWeight = parcelPackage.getPackageWeight();
			// packageWeight = pacelPackage.setPackageWeight;// double packageWeight =
			// keyboard.nextDouble();
			// double packageWeight = keyboard.nextDouble();

			// keyboard.nextLine();

			// this is a while loop that processes the user's package weight

			while (true) {

				System.out
						.print("Please enter the" + red + " weight " + reset + "of your parcel: " + green);
				packageWeight = Math.ceil(parcelPackage.keyboard.nextDouble());

				// Math.ceil(

				parcelPackage.setPackageWeight(packageWeight);

				packageWeight = parcelPackage.getPackageWeight();
				if (packageWeight == -1) {
					System.out.println(" ");

				} else {
					break;
				}

			}

			// that took forever, and I'm only done dealing with the package weight.

			/*
			 * while (true) {
			 * 
			 * System.out.print(reset+"Please enter the"+ red +
			 * " length "+reset+"of your parcel: "+green);
			 * packageLength = parcelPackage.keyboard.nextDouble();
			 * parcelPackage.setPackageLength(packageLength);
			 * 
			 * packageLength = parcelPackage.getPackageLength();
			 * if (packageLength == -1) {
			 * System.out.println(" ");
			 * 
			 * } else {
			 * break;
			 * }
			 * 
			 * }
			 * 
			 * 
			 * System.out.print(reset+"Please enter the"+ red +
			 * " length "+reset+"of your parcel: "+green); //
			 * System.out.println("Please enter the"+ red +
			 * " length "+reset+"of your parcel: "); // user enters and sets the length of
			 * the package being shipped.
			 * packageLength = keyboard.nextDouble();// double packageLength =
			 * keyboard.nextDouble();
			 * keyboard.nextLine();
			 * 
			 * 
			 */

			// System.out.print(reset+"Please enter the"+ red + " length "+reset+"of your
			// parcel: "+green); // System.out.println("Please enter the"+ red + " length
			// "+reset+"of your parcel: "); // user enters and sets the length of the
			// package being shipped.
			// packageLength = keyboard.nextDouble();// double packageLength =
			// keyboard.nextDouble();
			// keyboard.nextLine();

			// this is a while loop that processes the user's package length

			while (true) {

				System.out.print(reset + "Please enter the" + red + " length " + reset + "of your parcel: " + green);
				packageLength = Math.ceil(parcelPackage.keyboard.nextDouble());
				parcelPackage.setPackageLength(packageLength);

				// Math.ceil()

				packageLength = parcelPackage.getPackageLength();

				// packageLength + packageWidth + packageHeight

				if (packageLength == -1) {
					System.out.println(" ");

				} else {
					break;
				}

			}

			/*
			 * 
			 * while (true) {
			 * 
			 * System.out.print(reset+"Please enter the"+ red +
			 * " width "+reset+" of your parcel: "+green);
			 * packageWidth = parcelPackage.keyboard.nextDouble();
			 * parcelPackage.setPackageWidth(packageWidth);
			 * 
			 * packageWidth = parcelPackage.getPackageWidth();
			 * if (packageWidth == -1) {
			 * System.out.println(" ");
			 * 
			 * } else {
			 * break;
			 * }
			 * 
			 * }
			 * 
			 * ...
			 * 
			 * System.out.print(reset+"Please enter the"+ red +
			 * " width "+reset+" of your parcel: "+green); //
			 * System.out.println("Please enter the"+ red +
			 * " width "+reset+"of your parcel: "); // user enters and sets the width of the
			 * package being shipped.
			 * packageWidth = keyboard.nextDouble(); // double packageWidth =
			 * keyboard.nextDouble(); // double packageWidth = keyboard.nextDouble();
			 * keyboard.nextLine();
			 * 
			 * ...
			 * 
			 * [0m[31mGreetings: [0m Utilize this terminal to determine the costs of
			 * shipping your parcel(s).
			 * Please enter the[31m weight[0m and the [31mdimensions [0mof your parcel:
			 * 
			 * [0m Data for Parcel # 1
			 * 
			 * Please enter the[31m weight [0mof your parcel: [32m500
			 * 
			 * [0m[33mChestnut[31m + [32mHazel's[0m Parcel Service cannot accept
			 * packages exceeding 120 American Pounds in weight.[0m
			 * Please consider shipping a different Package.
			 * 
			 * Please enter the[31m weight [0mof your parcel: [32m-1
			 * 
			 * [0m[31mThe weight of the parcel has been entered as a negative number.
			 * Please re-enter the package weight.[0m
			 * 
			 * Please enter the[31m weight [0mof your parcel: [32m20
			 * [0mPlease enter the[31m length [0mof your parcel: [32m500
			 * 
			 * [0m[33mChestnut[31m + [32mHazel's[0m Parcel Service cannot accept
			 * packages exceeding 100 British inches in total outside liner inches.[0m
			 * Please consider shipping a different Package.
			 * 
			 * [0mPlease enter the[31m length [0mof your parcel: [32m-1
			 * 
			 * [0m[31mThe length of the parcel has been entered as a negative number.
			 * Please re-enter the package length.[0m
			 * 
			 * [0mPlease enter the[31m length [0mof your parcel: [32m99
			 * [0mPlease enter the[31m width [0m of your parcel: [32m500
			 * 
			 * [0m[33mChestnut[31m + [32mHazel's[0m Parcel Service cannot accept
			 * packages exceeding 100 British inches in total outside liner inches.[0m
			 * Please consider shipping a different Package.
			 * 
			 * [0mPlease enter the[31m width [0m of your parcel: [32m-1
			 * 
			 * [0m[31mThe width of the parcel has been entered as a negative number.
			 * Please re-enter the package width.[0m
			 * 
			 * [0mPlease enter the[31m width [0m of your parcel: [32m3
			 * 
			 * [0m[33mChestnut[31m + [32mHazel's[0m Parcel Service cannot accept
			 * packages exceeding 100 British inches in total outside liner inches.[0m
			 * Please consider shipping a different Package.
			 * 
			 * [0mPlease enter the[31m width [0m of your parcel: [32m1
			 * [0mPlease enter the[31m width [0m of your parcel: [32m1
			 * [0mPlease enter the[31m height [0mof your parcel:
			 * 
			 * System.out.print(reset+"Please enter the"+ red +
			 * " width "+reset+" of your parcel: "+green); //
			 * System.out.println("Please enter the"+ red +
			 * " width "+reset+"of your parcel: "); // user enters and sets the width of the
			 * package being shipped.
			 * packageWidth = keyboard.nextDouble(); // double packageWidth =
			 * keyboard.nextDouble(); // double packageWidth = keyboard.nextDouble();
			 * keyboard.nextLine();
			 * 
			 */



			while (true) {

				System.out.print(reset + "Please enter the" + red + " width " + reset + " of your parcel: " + green);
				packageWidth = Math.ceil(parcelPackage.keyboard.nextDouble());
				parcelPackage.setPackageWidth(packageWidth);

				packageWidth = parcelPackage.getPackageWidth(); // packageWidth + packageHeight
				if (packageWidth == -1) { // invalid information is set in the Package class.
					System.out.println(" ");

				} else {
					break; // this is a while loop that processes the user's package length, it stops when
							// the customer enters a negative number
				}

			}


			/*
			 * 
			 * while (true) {
			 * 
			 * System.out.print(reset+"Please enter the"+ red +
			 * " height "+reset+"of your parcel: "+green);
			 * packageHeight = parcelPackage.keyboard.nextDouble();
			 * parcelPackage.setPackageHeight(packageHeight);
			 * 
			 * packageHeight = parcelPackage.getPackageHeight();
			 * if (packageHeight == -1) {
			 * System.out.println(" ");
			 * 
			 * } else {
			 * break;
			 * }
			 * 
			 * }
			 * 
			 * 
			 * System.out.print(reset+"Please enter the"+ red +
			 * " height "+reset+"of your parcel: "+green); //
			 * System.out.println("Please enter the"+ red +
			 * " height "+reset+"of your parcel: "); // user enters and sets the height of
			 * the package being shipped.
			 * packageHeight = keyboard.nextDouble();// double packageHeight =
			 * keyboard.nextDouble();
			 * keyboard.nextLine();
			 * 
			 */

			/*
			 * System.out.print(reset+"Please enter the"+ red +
			 * " height "+reset+"of your parcel: "+green); //
			 * System.out.println("Please enter the"+ red +
			 * " height "+reset+"of your parcel: "); // user enters and sets the height of
			 * the package being shipped.
			 * packageHeight = keyboard.nextDouble();// double packageHeight =
			 * keyboard.nextDouble();
			 * keyboard.nextLine();
			 */

			// Package pacelPackage = new Package(packageWeight, packageLength,
			// packageWidth, packageHeight);
			// parcelPackage.setPackageWeight(packageWeight);

			// CreateTranscript transcript = new CreateTranscript(courseNumber, courseHours,
			// letterGrade);
			// transcript.setLetterGrade(letterGrade);

			while (true) {

				System.out.print(reset + "Please enter the" + red + " height " + reset + "of your parcel: " + green);
				packageHeight = Math.ceil(parcelPackage.keyboard.nextDouble());
				parcelPackage.setPackageHeight(packageHeight);

				packageHeight = parcelPackage.getPackageHeight();
				if (packageHeight == -1) {
					System.out.println(" ");

				} else {
					break;
				}

			}

			// not I need to set the getters and setters

			System.out.println(" ");

			// /*packageWeight = parcelPackage.getPackageWeight();*/

			DecimalFormat formatDouble = new DecimalFormat("0");

			// the variables are doubles, but that's only to simplify calculations, this
			// displays the user input as a single integer
			// System.out.println("Grade Point Average: " + formatDouble.format(gradePoAv)
			// );
			// DecimalFormat formatDouble = new DecimalFormat("0.00");
			// System.out.println("Grade Point Average: " + formatDouble.format(gradePoAv)
			// );
			// System.out.println(reset+"The parcel has a dimensional weight of: " +
			// formatDouble.format(dimensionalWeight));

			System.out.println(
					reset + "The parcel has an actual weight of:         " + formatDouble.format(packageWeight));

			// System.out.println(reset+"The
			// parcel
			// has
			// an
			// actual
			// weight
			// of:
			// "
			// +
			// getPackageWeight());
			// //
			// System.out.println(reset+"The
			// parcel
			// has
			// an
			// actual
			// weight
			// of:
			// "
			// +
			// THE_PLACEHOLDER);
			// //
			// getPackageWeight()

			dimensionalWeight = Math
					.ceil((Math.ceil(packageLength) * Math.ceil(packageWidth) * Math.ceil(packageHeight)) / 166);

			// dimensionalWeight
			// =
			// Math.ceil((Math.ceil(getPackageLength())
			// *
			// Math.ceil(getPackageWidth())
			// *
			// Math.ceil(getPackageHeight()))/166);
			// //
			// parcelPackage.getDimensionalWeight();
			// //
			// this
			// pulls
			// the
			// calculated
			// dimensional
			// weight
			// from
			// the
			// Package
			// model
			// class.
			// this
			// works
			// -
			// I
			// didn't
			// need
			// a
			// dimensionalWeight
			// with
			// get
			// and
			// set
			// methods
			// in
			// my
			// Package
			// class.
			/*
			 * 
			 * [0m[31m[1mGreetings: [0m Utilize this terminal to determine the costs of
			 * shipping your parcel(s).
			 * Please enter the[31m[1m weight[0m and the [31m[1mdimensions [0mof your
			 * parcel:
			 * 
			 * [0m Data for Parcel # 1
			 * 
			 * Please enter the[31m[1m weight [0mof your parcel: [32m[1m 14.6
			 * [0mPlease enter the[31m[1m length [0mof your parcel: [32m[1m 23.4
			 * [0mPlease enter the[31m[1m width [0m of your parcel: [32m[1m 18.6
			 * [0mPlease enter the[31m[1m height [0mof your parcel: [32m[1m 20.1
			 * 
			 * [0mThe parcel has an actual weight of: 15.0
			 * [0mThe parcel has a dimensional weight of: 58.0
			 * [0mThe parcel has the following dimensions: (24.0 X 19.0 X 21.0)
			 * [0mThe parcel has a shipping cost of: PLACEHOLDER
			 * 
			 * [0mWill you be shipping any additional parcels? (Y/N):
			 * 
			 */

			System.out.println(
					reset + "The parcel has a dimensional weight of:     " + formatDouble.format(dimensionalWeight));
			System.out.println(reset + "The parcel has the following dimensions:    " + ""
					+ formatDouble.format(packageLength) + " X" + " " + formatDouble.format(packageWidth) + " X" + " "
					+ formatDouble.format(packageHeight) + "");

			// System.out.println(reset+"The parcel has the
			// following dimensions: " + THE_PLACEHOLDER); //
			// packageLength + packageWidth + packageHeight // use
			// get height get length get width

			// so I guess I also don't need a variable like theShippingCost
			// it looks like it's Math.max ()
			// The final cost of the shipment is calculated by multiplying the price per
			// pound ($3.12) by the billable weight.

			final double THREE_DOLLARS_AND_TWELVE_CENTS = 3.12;

			// I guess it doesn't have to go at the top. // THIS
			// MIGHT HAVE TO GO AT THE TOP// final double
			// THREE_DOLLARS_AND_TWELVE_CENTS = 3.12; // final
			// double TEN_PERCENT = 0.10; // double
			// double billableWeight=0;
			// DecimalFormat formatDoubleDollars = new DecimalFormat("0.00");

			billableWeight = Math.max(dimensionalWeight * THREE_DOLLARS_AND_TWELVE_CENTS,
					packageWeight * THREE_DOLLARS_AND_TWELVE_CENTS);

			// you know. I might not even need something like theBillableWeight.
			// billableWeight = formatDoubleDollars.format(billableWeight)
			// i don't understand what is wrong here. one million decimal places. //
			// billableWeight = formatDoubleDollars.format(billableWeight)

			// DecimalFormat formatDouble = new DecimalFormat("0.00");
			// System.out.println("Grade Point Average: " + formatDouble.format(gradePoAv)
			// );

			// DecimalFormat formatDoubleDollars = new DecimalFormat("0.00");

			System.out.println(reset + "The parcel has a shipping cost of:          "
					+ formatDoubleDollars.format(billableWeight));

			// Shipment shipment = new Shipment();

			// Shipment shipment = new Shipment(billableWeight);

			shipment.packageShippingChargeArray.add(billableWeight);

			// i really don't know how to resolve this issue.
			// (formatDoubleDollars.format)

			// DecimalFormat formatDoubleDollars = new DecimalFormat("0.00");
			// i don't know what to do here
			// I think that I got this thing to work. let's see if it actually does work or
			// not.

			// System.out.println(packageShippingChargeArray);
			// packageShippingChargeArray
			// I know what the issue is: I changed the name of the array earlier //
			// shipment.packageShippingCostsArray.add(billableWeight);

			// CreateTranscript transcript = new CreateTranscript(courseNumber, courseHours,
			// letterGrade);
			// transcript.setLetterGrade(letterGrade);
			// numberGradeArray.add(transcript.getNumberGrade());

			// shipment.packageShippingCostsArray.add(billableWeight)
			// numberGradeArray.add(transcript.getNumberGrade()); // letter grade converted
			// to numerical value and added to array
			// shipment.addShippingCost(billableWeight); //
			// packageShippingCostsArray.add(shippingCost);

			// System.out.println(reset+"The parcel has a dimensional weight of: " +
			// formatDouble.format(dimensionalWeight));

			System.out.println(" ");

			// entryNumber++;

			System.out.print(reset + "Will you be shipping any additional parcels? " + green + "Yes" + reset + " or "
					+ reset + red + "No" + reset + ": " + green);

			// System.out.print(reset+"Will you be shipping any additional parcels? ("+
			// green +"Y"+reset+"/"+reset+red+"N"+reset+"): "+green); // this was a headache
			// just to make the Y and N green and red
			// I really want to remove these parentheses // let's see if it works.

			yesOrNoEntry = keyboard.next().charAt(0);

			// char yesOrNoEntry = keyboard.next().charAt(0); // allows a Y/N
			// or Yes/No response
			// keyboard.next

			keyboard.nextLine();
			System.out.println(" ");
			entryNumber++;
		} while (yesOrNoEntry == 'y' || yesOrNoEntry == 'Y');

		// keyboard.nextLine(); // what a nightmare.

		ArrayList<Double> packageShippingChargeArray = shipment.getPackageShippingChargeArray();

		// I no longer need this, it works, and I know that //
		// System.out.println(packageShippingChargeArray);
		// keyboard.nextLine(); // this is for testing .length // packageHeight =
		// Math.ceil(parcelPackage.keyboard.nextDouble());
		// public int theFrequentShipperIdentificationNumber;
		// I might have to move this into the Shipment class
		// int theFrequentShipperIdentificationNumber;
		// System.out.print(reset+"Please enter your frequent shipper identification
		// number: " + green);
		// theFrequentShipperIdentificationNumber = keyboard.nextInt();
		// // int // packageShippingChargeArrayLength =0;
		// int packageShippingChargeArrayLength = packageShippingChargeArray.length;
		// System.out.println("You are shipping a total of "+ +); //
		// packageShippingChargeArray.length; packageShippingChargeArray.length
		// This is finally done. I'm not even really ready to read about whatever
		// shortcomings it has.

		String theFrequentShipperIdentificationNumber;

		// i changed this to string to make it easier to process, there
		// kept being an integer error, so i figured, a shipper number
		// is really more like a numberName rather than // it's
		// basically a numerical name, not a real number.

		System.out.print(reset + "Please enter your" + reset + green + " 8 " + reset
				+ "digit frequent shipper identification number, or enter" + reset + red + " 0 " + reset
				+ "if you do not have one: " + green);
		theFrequentShipperIdentificationNumber = keyboard.next();
		keyboard.close();

		// Integer.parseInt(keyboard.nextLine());// keyboard.nextInt(); //
		// Integer.parseInt(keyboard.nextInt())

		shipment.setTheFrequentShipperIdentificationNumber(theFrequentShipperIdentificationNumber);

		// int // packageShippingChargeArrayLength =0;
		// int packageShippingChargeArrayLength = packageShippingChargeArray.size(); //
		// what a nightmare, .length is for an array, for an array list, you use .size()
		// I don't know why I have to do this, but I have -- and i mean, it's required
		// by the assignment that I do this.
		// when i say: i have to do this, I have to make a distinction between my own
		// issues, and the assignment requirements,
		// but i basically have to push the customer ID into the shipment class.
		// and pull it right back out. hahahaha - nightmare.

		// actually I don't think I have to pull it back out, i just have to push it in.
		// i'll pull it out, in the sense that it factors into the discounts, but it's
		// not otherwise being pulled back out in it's original form.

		System.out.println(reset + " " + reset);
		System.out.println(reset + "You are shipping a total of: " + green + packageShippingChargeArray.size()
				+ " package(s)" + reset);

		// packageShippingChargeArray.length; packageShippingChargeArray.length

		shipment.setTheTotalNumberOfPackages(packageShippingChargeArray.size());
		String closingRemarks = shipment.getTheGrandTotal();
		System.out.print(closingRemarks);

		// this pushes the number of packages into the Shipment.java class //
		// shipment.// setTheTotalNumberOfPackages(int theTotalNumberOfPkgs)

	}

}

// everything always takes twice as long as I anticipate it will.
//
//
//
// // for (double value : pointScaleTimesCreditHoursArray) {
// // sumPointScaleTimesCreditHours += value;
//
// // for (double value : packageShippingChargeArray) {
// // packageShippingChargeArray += value;
//
// // double preliminaryCost = 0.00;
// // for (double value : packageShippingChargeArray) {
// // preliminaryCost += value; //
// // }
// // i eliminated preliminaryCost and replaced it with theGrandTotal
//
// // double thePreliminaryGrandTotal = shipment.getThePreliminaryGrandTotal();
// // private double thePreliminaryGrandTotal
// // System.out.println(reset+"The preliminary cost of shipping your "+
// packageShippingChargeArray.size() + " package(s) amounts to: "+ green+
// formatDoubleDollars.format(thePreliminaryGrandTotal) +" USD"+reset); //
// getTheGrandTotal()// v// "British Euro Dollars");
// // START - turned out to be a huge waste of time
// // shipment.setThePreliminaryGrandTotal(thePreliminaryGrandTotal);
// // String tFsIn = shipment.getTheFrequentShipperIdentificationNumber();
// // double frequentShipperDiscount = shipment.THE_FREQUENT_SHIPPER_DISCOUNT;
// // double theBulkDiscountAmount = shipment.THE_BULK_PACKAGE_DISCOUNT;
// /*
// if (Integer.parseInt(tFsIn) !=0 &&
// (thePreliminaryGrandTotal-(thePreliminaryGrandTotal *
// frequentShipperDiscount)) <= 300) {
//
// System.out.println(reset+"The preliminary cost of shipping your "+
// packageShippingChargeArray.size() + " package(s) amounts to: "+ green+
// formatDoubleDollars.format(thePreliminaryGrandTotal) +" USD"+reset);
// System.out.println(reset+"You will be receiving a frequent shipper discount
// in the amount of: "+ green+
// formatDoubleDollars.format((frequentShipperDiscount *
// thePreliminaryGrandTotal)) +" USD"+reset);
// System.out.println(reset+" "+reset);
// double theFinalGrandTotalAggregateShipmentExpenses =
// shipment.getTheGrandTotal();
// System.out.println(reset+"The total final cost of shipping your "+
// packageShippingChargeArray.size() + " package(s) amounts to a Grand Total of:
// "+ green+
// formatDoubleDollars.format(theFinalGrandTotalAggregateShipmentExpenses) +"
// USD"+reset);
// System.out.println(reset+" "+reset);
//
// } else if (Integer.parseInt(tFsIn) !=0 &&
// (thePreliminaryGrandTotal-(thePreliminaryGrandTotal *
// frequentShipperDiscount)) >= 300) {
// System.out.println(reset+"The preliminary cost of shipping your "+
// packageShippingChargeArray.size() + " package(s) amounts to: "+ green+
// formatDoubleDollars.format(thePreliminaryGrandTotal) +" USD"+reset);
// System.out.println(reset+"You will be receiving a frequent shipper discount
// in the amount of: "+ green+
// formatDoubleDollars.format((frequentShipperDiscount *
// thePreliminaryGrandTotal)) +" USD"+reset);
// System.out.println(reset+"You will also be receiving a frequent shipper bulk
// shipment discount in the amount of: "+ green+ (theBulkDiscountAmount) +"
// USD"+reset);
// System.out.println(reset+" "+reset);
// double theFinalGrandTotalAggregateShipmentExpenses =
// shipment.getTheGrandTotal();
// System.out.println(reset+"The total final cost of shipping your "+
// packageShippingChargeArray.size() + " package(s) amounts to a Grand Total of:
// "+ green+
// formatDoubleDollars.format(theFinalGrandTotalAggregateShipmentExpenses) +"
// USD"+reset);
// System.out.println(reset+" "+reset);
//
// } else {
// System.out.println(reset+" "+reset);
// double theFinalGrandTotalAggregateShipmentExpenses =
// shipment.getTheGrandTotal();
// System.out.println(reset+"The total final cost of shipping your "+
// packageShippingChargeArray.size() + " package(s) amounts to a Grand Total of:
// "+ green+
// formatDoubleDollars.format(theFinalGrandTotalAggregateShipmentExpenses) +"
// USD"+reset);
// System.out.println(reset+" "+reset);
// }
// */
// // END - turned out to be a huge waste of time
// // START - Let's see if this works
// // I found it this thing was annoying the hell out of me. //
// System.out.print(shipment.getTheGrandTotal());

// System.out.println(reset+(thePreliminaryGrandTotal-(thePreliminaryGrandTotal
// * frequentShipperDiscount))+reset); // for testing

// Integer.parseInt(tFsIn) !=0 && // } else if (Integer.parseInt(tFsIn) !=0 &&
// (thePreliminaryGrandTotal-(thePreliminaryGrandTotal *
// frequentShipperDiscount)) >= 300) {

// THE_FREQUENT_SHIPPER_DISCOUNT * thePreliminaryGrandTotal
// [0mThe preliminary cost of shipping your 1 package(s) amounts to:
// [32m[1m3.12 USD
// this pushes the preliminary cost of the transaction into the Shipment.java
// but this is actually wrong, so i actually have to do this in the Shipment
// class.
// it's a simple move, but i'm already tired of this.

// British Eurodollars // this is actually supposed to be extremely funny!
// because, at first is seems wrong, the British don't use euro(s), or dollars,
// but British Eurodollars are real, like, they're US dollars held in bank in
// London, or something.
// but yeah, that's supposed to be really funny.

// this alone took forever. the preliminary cost.
// this is taking forever. not only. am not going to get anything higher than a
// C, - what a nightmare.

// I really just want to put the discounts here, but they have to go. inside the
// shipment class. - this is a nightmare -

//
//

// I think that this is where I would put it.
// packageWidth = parcelPackage.getPackageWidth();

// System.out.println(packageShippingChargeArray); // ArrayList<Double>
// packageShippingChargeArray = new ArrayList<Double>();

// I'm starting to understand what object oriented design is
//
// it's like this - the demo class is like an HTML page, and the model class is
// like the JavaScript file.
// when I was starting this assignment, I started with the demo class, because
// like an HTML page, it's
// something I can see. and it's something I can interact with.

// I'm trying to think. I think that the package class is done, but I need
// something to happen once this while loop ends. or.
// I think that it just goes after the end of the while loop, so once a person
// enters N, then the next part of the program starts.
// this is almost done.
// System.out.println(packageShippingChargeArray);
// /*
//
//
// System.out.print("Please enter your frequent shipper identification number:"
// + green);
// packageWeight = Math.ceil(parcelPackage.keyboard.nextDouble()); // Math.ceil(
// parcelPackage.setPackageWeight(packageWeight);
//
//

//
// "However, each package should not exceed 120 pounds (actual weight) and 100
// outside linear inches (length plus width plus height)."  - Han-fen Hu, Ph.D
//
// "Overweight or over-sized packages are not accepted."  - Han-fen Hu, Ph.D
//
// "If the user enters a zero or a negative number, the program should show an
// error message and request input again until a positive number is entered."  - Han-fen Hu, Ph.D
//
//
//
// "For the actual weight, any fraction of the measurement should be increased to
// the nearest whole number (for example, 20.1 will be considered 21)."  - Han-fen Hu, Ph.D
//
// "For each package that can be shipped, the dimensional weight should be
// calculated. Dimensional weight reflects the amount of space a package
// occupies; dimensional weight is calculated by the following steps: (1)
// Determine the package dimensions in inches. For each dimension, any fraction
// of the measurement should be increased to the nearest whole number (for
// example, 1.3 will be considered 2). (2) Multiply the package length by the
// width by the height. The result is the cubic size in inches. (3) Divide the
// cubic size in inches by 166 to determine dimensional weight in pounds. (4)
// Increase any fraction to the next whole pound."  - Han-fen Hu, Ph.D
//
// "The shipping cost of each package is calculated by comparing the actual
// weight to the dimensional weight. The greater of the two is the billable
// weight and should be used to calculate the rate. The final cost of the
// shipment is calculated by multiplying the price per pound ($3.12) by the
// billable weight."  - Han-fen Hu, Ph.D
//
// "For each accepted package, the program should show the actual weight,
// calculated dimensional weight, and the shipping cost for the package."  - Han-fen Hu, Ph.D
//
// After all the packages are entered, the program will prompt the users to
// enter if they have “frequent-shipper” numbers; if so, a 5% discount will be
// applied to the shipping cost. If the total amount after the frequent-shipper
// discount is greater than $300, an additional “bulk package” discount of $20
// off would be applied. The program shows the total number of packages to ship,
// subtotal before discount, frequent-shipper discount if applied, bulk package
// discount if applied, and the grand total. -  - "Han-fen Hu, Ph.D
//
// "Please use the object-oriented approach to design the program. Specifically,
// a Package class and a Shipment class should be designed and implemented. The
// Package class represents the data and behavior for each individual package.
// The Shipment class represents the entire transaction made by a user."  - Han-fen Hu, Ph.D
//
//
//
// */
//
//
// /*
// [0m[31mGreetings: [0m Utilize this terminal to determine the cost to ship
// your parcel.
// Please enter the[31m weight[0m and the [31mdimensions [0mof your parcel:
//
// [0m Data for Parcel # 1
//
// Please enter the[31m weight [0mof your parcel: [32m50
// [0mPlease enter the[31m length [0mof your parcel: [32m50
// [0mPlease enter the[31m width [0m of your parcel: [32m50
// [0mPlease enter the[31m height [0mof your parcel: [32m50
//
// [0mThe parcel has an actual weight of: PLACEHOLDER
// [0mThe parcel has a dimensional weight of: PLACEHOLDER
// [0mThe parcel has the following dimensions: PLACEHOLDER
// [0mThe parcel has a shipping cost of: PLACEHOLDER
//
// [0mWill you be shipping any additional parcels? (Y/N): [32my
//
// [0m Data for Parcel # 2
//
// Please enter the[31m weight [0mof your parcel: [32m50
// [0mPlease enter the[31m length [0mof your parcel: [32m50
// [0mPlease enter the[31m width [0m of your parcel: [32m50
// [0mPlease enter the[31m height [0mof your parcel: [32m50
//
// [0mThe parcel has an actual weight of: PLACEHOLDER
// [0mThe parcel has a dimensional weight of: PLACEHOLDER
// [0mThe parcel has the following dimensions: PLACEHOLDER
// [0mThe parcel has a shipping cost of: PLACEHOLDER
//
// [0mWill you be shipping any additional parcels? (Y/N): [32my
//
// [0m Data for Parcel # 3
//
// Please enter the[31m weight [0mof your parcel: [32m50
// [0mPlease enter the[31m length [0mof your parcel: [32m50
// [0mPlease enter the[31m width [0m of your parcel: [32m50
// [0mPlease enter the[31m height [0mof your parcel: [32m50
//
// [0mThe parcel has an actual weight of: PLACEHOLDER
// [0mThe parcel has a dimensional weight of: PLACEHOLDER
// [0mThe parcel has the following dimensions: PLACEHOLDER
// [0mThe parcel has a shipping cost of: PLACEHOLDER
//
// [0mWill you be shipping any additional parcels? (Y/N): [32my
//
// [0m Data for Parcel # 4
//
// Please enter the[31m weight [0mof your parcel: [32m50
// [0mPlease enter the[31m length [0mof your parcel: [32m50
// [0mPlease enter the[31m width [0m of your parcel: [32m50
// [0mPlease enter the[31m height [0mof your parcel: [32m50
//
// [0mThe parcel has an actual weight of: PLACEHOLDER
// [0mThe parcel has a dimensional weight of: PLACEHOLDER
// [0mThe parcel has the following dimensions: PLACEHOLDER
// [0mThe parcel has a shipping cost of: PLACEHOLDER
//
// [0mWill you be shipping any additional parcels? (Y/N): [32my
//
// [0m Data for Parcel # 5
//
// Please enter the[31m weight [0mof your parcel: [32m50
// [0mPlease enter the[31m length [0mof your parcel: [32m50
// [0mPlease enter the[31m width [0m of your parcel: [32m50
// [0mPlease enter the[31m height [0mof your parcel: [32m50
//
// [0mThe parcel has an actual weight of: PLACEHOLDER
// [0mThe parcel has a dimensional weight of: PLACEHOLDER
// [0mThe parcel has the following dimensions: PLACEHOLDER
// [0mThe parcel has a shipping cost of: PLACEHOLDER
//
// [0mWill you be shipping any additional parcels? (Y/N): [32my
//
// [0m Data for Parcel # 6
//
// Please enter the[31m weight [0mof your parcel: [32mchickens
// Exception in thread "main" java.util.InputMismatchException
// at java.base/java.util.Scanner.throwFor(Scanner.java:947)
// at java.base/java.util.Scanner.next(Scanner.java:1602)
// at java.base/java.util.Scanner.nextDouble(Scanner.java:2573)
// at
// edu.unlv.mis768.kly.individualassignment3.ShippingCalculatorDemo.main(ShippingCalculatorDemo.java:44)
// */
//
// //Please enter the file name where you would like to print your transcript:
// D:\GitHub\MIS76810032024Sprg\src\MIS768\edu\
// unlv\mis768\kly\individualassignment2\transcript02292024.txt
// //Data has been written to D:\GitHub\MIS76810032024Sprg\src\MIS768\edu\
// unlv\mis768\kly\individualassignment2\transcript02292024.txt successfully.
// //
// //Enter a course number for entry # 1: Advanced Studies in Chickens 101
// //Enter credit hours for entry # 1: 3
// //Enter letter grade earned for entry # 1: a
// //Do you have additional course details to enter? (Y/N): y
// //Enter a course number for entry # 2: advanced studies in geese 102
// //Enter credit hours for entry # 2: 3
// //Enter letter grade earned for entry # 2: a
// //Do you have additional course details to enter? (Y/N): y
// //Enter a course number for entry # 3: intermediate duck related conspiracy
// theories 103
// //Enter credit hours for entry # 3: a
// //Exception in thread "main" java.util.InputMismatchException
// // at java.base/java.util.Scanner.throwFor(Scanner.java:947)
// // at java.base/java.util.Scanner.next(Scanner.java:1602)
// // at java.base/java.util.Scanner.nextInt(Scanner.java:2267)
// // at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
// // at
// edu.unlv.mis768.kly.individualassignment2.CreateTranscriptDemo.main(CreateTranscriptDemo.java:59)
// //
// //
// // Enter a course number for entry # 1: Advanced Studies in Chickens 232
// //Enter credit hours for entry # 1: 4
// //Enter letter grade earned for entry # 1: a
// //Do you have additional course details to enter? (Y/N): y
// //Enter a course number for entry # 2: Advanced Studies in Orange Juice 443
// //Enter credit hours for entry # 2: 3.5
// //Exception in thread "main" java.util.InputMismatchException
// // at java.base/java.util.Scanner.throwFor(Scanner.java:947)
// // at java.base/java.util.Scanner.next(Scanner.java:1602)
// // at java.base/java.util.Scanner.nextInt(Scanner.java:2267)
// // at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
// // at
// edu.unlv.mis768.kly.individualassignment2.CreateTranscriptDemo.main(CreateTranscriptDemo.java:59)
// //
// //
// // String red = "\u001B[31m";
// // String reset = "\u001B[0m";
// //
// // ANSI escape codes
// //
// // String black = "\u001B[30m";
// // String red = "\u001B[31m";
// // String green = "\u001B[32m";
// // String reset = "\u001B[0m";
// //
// // Black: \u001B[30m
// // Red: \u001B[31m
// // Green: \u001B[32m
// // Yellow: \u001B[33m
// // Blue: \u001B[34m
// // Magenta: \u001B[35m
// // Cyan: \u001B[36m
// // White: \u001B[37m
//
// //System.out.println("[31mGreetings: [0m Utilize this terminal to determine
// the shipping costs of your parcel.");
// /*
// Nectar
// Enter a course number for entry # 1: Orange Juice 232
// Enter credit hours for entry # 1: 3
// Enter letter grade earned for entry # 1: a
// Do you have additional course details to enter? (Y/N): y
// Enter a course number for entry # 2: Lemonade 443
// Enter credit hours for entry # 2: 3
// Enter letter grade earned for entry # 2: a
// Do you have additional course details to enter? (Y/N): y
// Enter a course number for entry # 3: Milk 868
// Enter credit hours for entry # 3: 3
// Enter letter grade earned for entry # 3: c
// Do you have additional course details to enter? (Y/N): y
// Enter a course number for entry # 4: Nectar
// Enter credit hours for entry # 4: 3
// Enter letter grade earned for entry # 4: a
// Do you have additional course details to enter? (Y/N): n
// Grade Point Average: 3.50
// Would you like to printout of your transcript? (Y/N): y
//
//
//
//
// */
// // public class ShippingCalculatorDemo {
// // The name of a class should be a noun/noun-phrase.
// // I'm frustrated right now. everything is a disaster, and nothing is going
// right.'
// // and I don't anticipate things getting better. this is a nightmare.'
//
//
// /*
// "Dimensional weight, also known as volumetric weight, is a pricing technique
// used
// by postal services and commercial freight companies. It's based on the cubic
// capacity
// of a package, rather than its weight.""
// */

// I'm really stressed out right now. such a nightmare - I filed a software copyright for the computer program for
// individual assignment # 3.

// here is one of the major challenges I'm facing right now.
// I won't get any credit for turning in a group project because I would have to be part of a group
// in order to receive any credit for doing a group project. and it's due. later today. this is a nightmare.

// I don't know what to do - life is such a nightmare
// a real nightmare.
// a headache beyond anything anyone can imagine.

// there is a strong chance that I will have to audit this course MIS 768 // and
// that's a nightmare // and a disappointment
// a real disappointment for me.