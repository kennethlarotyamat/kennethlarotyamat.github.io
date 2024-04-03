/*		
		Author's Name: 		    	Kenneth Larot Yamat

     	Purpose of Program:			To calculate the shipping cost of a parcel at a 
     	                          	parcel service store
     						    	 
  		Date Due:					March 3rd, 2024
*/

package edu.unlv.mis768.kly.individualassignment3.redo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import java.text.DecimalFormat;

/*
 
"Take getPackageWeight() for example, it should just 
return packageWeight while setPackageWeight() is taking 
the value given by the user and set it to the field packageWeight."
	- Han-fen Hu, Ph.D
	
*/

 		// import edu.unlv.mis768.kly.individualassignment2.CreateTranscript; import edu.unlv.mis768.kly.individualassignment2.CreateTranscript; // traveled

public class ParcelTerminalDemo {

	public static void main(String[] args) throws IOException {
		DecimalFormat formatDoubleDollars = new DecimalFormat("0.00");
		String red = "\u001B[31m" + "\u001B[1m";
		String reset = "\u001B[0m";
		String green = "\u001B[32m" + "\u001B[1m";
															
		int entryNumber = 1; 

		double packageWeight = 0;
		double packageLength = 0;
		double packageWidth = 0;
		double packageHeight = 0;
		double dimensionalWeight;
		char yesOrNoEntry;
		double billableWeight = 0;
		Shipment shipment = new Shipment(billableWeight);



		Scanner keyboard = new Scanner(System.in);



		System.out.println(reset + red + "Greetings:  " + reset
				+ " Utilize this terminal to determine the costs of shipping your parcel(s). ");
		System.out.println("             Please enter the" + red + " weight" + reset + " and the " + red + "dimensions "
				+ reset + "of your parcel: ");



		System.out.println(" ");
		do {
			System.out.println(reset + "                                     Data for Parcel # " + entryNumber);
			System.out.println(" ");



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



			shipment.packageShippingChargeArray.add(billableWeight);



			System.out.println(" ");



			System.out.print(reset + "Will you be shipping any additional parcels? " + green + "Yes" + reset + " or "
					+ reset + red + "No" + reset + ": " + green);



			yesOrNoEntry = keyboard.next().charAt(0);



			keyboard.nextLine();
			System.out.println(" ");
			entryNumber++;
		} while (yesOrNoEntry == 'y' || yesOrNoEntry == 'Y');



		ArrayList<Double> packageShippingChargeArray = shipment.getPackageShippingChargeArray();



		String theFrequentShipperIdentificationNumber;



		System.out.print(reset + "Please enter your" + reset + green + " 8 " + reset
				+ "digit frequent shipper identification number, or enter" + reset + red + " 0 " + reset
				+ "if you do not have one: " + green);
		theFrequentShipperIdentificationNumber = keyboard.next();
		keyboard.close();



		shipment.setTheFrequentShipperIdentificationNumber(theFrequentShipperIdentificationNumber);



		System.out.println(reset + " " + reset);
		System.out.println(reset + "You are shipping a total of: " + green + packageShippingChargeArray.size()
				+ " package(s)" + reset);



		shipment.setTheTotalNumberOfPackages(packageShippingChargeArray.size());
		String closingRemarks = shipment.getTheGrandTotal();
		System.out.print(closingRemarks);



	}

}
