package edu.unlv.mis768.kly.indiv; // package edu.unlv.mis768.labwork5;

import java.util.Scanner;

public class ExerciseTargetSetter {

	public static void main(String[] args) {
		// variable declaration
		int age; // age to be entered by user
		double height; // height to be entered
		double weight; // weight to be entered
		int restingHeartRate; // the heart rate with the user is resting. to be entered.
		
		double trainingHeartRate; // the target heart rate for the user. to be calculated
		
		// Scanner object for input
		Scanner kb = new Scanner(System.in);
		// get the age, weight, and height
		System.out.print("Please enter your age: ");
		age = kb.nextInt();
		System.out.print("Please enter your weight in kilogram: ");
		weight = kb.nextDouble();
		System.out.print("Please enter your height in cetimeter: ");
		height = kb.nextDouble();
		// call a method to determine whether the BMI is above 25 and the person is above 18 years old
		if(isOverweight(height, weight) && age >=18) {
			System.out.print("You can exercise to improve your health condition.");
			// get resting heart rate from the user
			System.out.print("Please enter your resting heart rate: ");
			restingHeartRate = kb.nextInt();
			// call a method to calculate the target heart rate
			trainingHeartRate = calcTrainingRate(age,restingHeartRate); 
			// show result
			System.out.print("Please exercise to reach the training heart rate of "+
					trainingHeartRate+" per minute.");
		}

	}

	private static boolean isOverweight(double height, double weight) {
		boolean isOverweight = true; // the individual is overweight or not
		double bmi; // BMI to be calculated

		// Calculate the BMI
		bmi= weight/ (height/100*height/100);
		
		if(bmi<=25) // determine whether the person is overweight
			isOverweight = false;
		
		// return the result
		return isOverweight;
	}
	private static double calcTrainingRate(int age, int restingRate) {
		// user the formula to calculate the target training heart rate
		return 0.6* (220-age)+restingRate;
	}


}
