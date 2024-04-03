package edu.unlv.mis768.labwork11;
import java.util.Scanner;

/**
   This program demonstrates the PassFailExam class.
*/

public class PassFailExamDemo {
   public static void main(String[] args) {
      int questions=0;     // Number of questions
      int missed=0;        // Number of questions missed
      double minPassing=0; // Minimum passing score

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the number of questions on the exam.
      System.out.print("How many questions are on the exam? ");
      questions = keyboard.nextInt();

      // Get the number of questions missed.
      System.out.print("How many questions did the student miss? ");
      missed = keyboard.nextInt();

      // Get the minimum passing score.
      System.out.print("What is the minimum passing score? ");
      minPassing = keyboard.nextDouble();

      // Create a PassFailExam object.
      PassFailExam exam = new PassFailExam(questions,missed,minPassing);
      

      // Display the exam score.
      System.out.println("The exam score is: "+exam.getScore());

      // Display the exam grade.
      System.out.println("The grade is: "+exam.getGrade());
   }
}
