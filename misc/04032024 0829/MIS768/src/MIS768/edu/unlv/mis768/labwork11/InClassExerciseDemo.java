package edu.unlv.mis768.labwork11; // application that contains the main method

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InClassExerciseDemo {

	public static void main(String[] args) throws ParseException {
		// Scanner for keyboard input
		Scanner keyboard = new Scanner(System.in);
		// Define the date format
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// variables for values to be entered by the user 
		String title =""; // title of exercise
		Date dueDate; // due date of exercise
		char completion; // completed or not
		
		// prompt for title of exercise
		System.out.println("Please enter the name of the exercise: ");
		title = keyboard.nextLine();
		
		// prompt for due date of exercise
		System.out.println("Please enter the due date  (yyyy-mm-dd): ");
		// use the parse() method of the SimpleDateFormat class to convert a string to date format
		dueDate = sdf.parse(keyboard.nextLine());
		
		// instantiate the object using title and due date
		InClassExercise ex = new InClassExercise(title, dueDate);
		
		// prompt for completion or not
		System.out.println("Complete? (y/n)");
		// get the answer, convert to all upper-case letters, and get the first character
		completion = keyboard.nextLine().toUpperCase().charAt(0); // scanner.next(); // scanner.nextInt(); // scanner.nextDouble(); // scanner.nextLine(); // x
		
		// if the answer is Y
		if(completion=='Y')
		// mark this exercise as completed
			ex.setCompleted(true);

		// display the score for this exercise
		System.out.println("The exercise is due on "+ex.getDueDate());
		System.out.println("The score for the exercise is: "+ex.getScore());
		
	}

}
// not entirely correct - public or private - not inherited by the subclass