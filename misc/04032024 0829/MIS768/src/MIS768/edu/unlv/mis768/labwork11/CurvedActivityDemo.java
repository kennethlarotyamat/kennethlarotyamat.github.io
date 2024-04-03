package edu.unlv.mis768.labwork11;
import java.util.Scanner;

public class CurvedActivityDemo {

	public static  void main(String[] args) {
	      double score;         // Raw score final
	      double curvePercent;  // Curve percentage

	      // Create a Scanner object to read keyboard input.
	      Scanner keyboard = new Scanner(System.in);

	      // Get the unadjusted exam score.
	      System.out.print("Enter the student's raw numeric score: ");
	      score = keyboard.nextDouble();

	      // Get the curve percentage.
	      System.out.print("Enter the curve percentage: ");
	      curvePercent = keyboard.nextDouble();

	      // Create a CurvedActivity object
	      CurvedActivity exam = new CurvedActivity(curvePercent);
	      
	      // Set the exam score
	      exam.setScore(score);
	      
	      
	      // Display the raw score
	      System.out.println("The original score is "+exam.getRawScore());
	      
	      // Display the curved score
	      System.out.println("The curved socre is "+exam.getScore());
	      
	      // Display the exam grade
	      System.out.println("The curved grade is "+exam.getGrade());
	      
	      keyboard.close(); // close the scanner after the results are printed
	      					// to the screen
	      
	}

} // public final void message()
