package edu.unlv.mis768.kly.individualassignment2.redo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TestScoreDemo {

	public static void main(String[] args) {

		ArrayList<Double> sequenceOfScores = new ArrayList<Double>();
		ArrayList<Double> questionValueArray = new ArrayList<Double>();

		for (int i = 0; i < 2; i++) {
			String enterQuestionQty;
			String enterQuestionMissedQty;

			enterQuestionQty = JOptionPane
					.showInputDialog("Please enter the number of test questions on the exam # " + (i + 1));
			int numQuestions = Integer.parseInt(enterQuestionQty);
			
			TestScore testScore = new TestScore(0);
			testScore.setNumQuestions(numQuestions);

			
			enterQuestionMissedQty = JOptionPane
					.showInputDialog("Please enter the number of missed questions on the exam # " + (i + 1));

			TestScore examPrintout = new TestScore(enterQuestionQty);

			Double calculateQuestionValue = examPrintout.getPointsEach();
			Double calculateExamScore = examPrintout.getScore();

			System.out.println("These are the details for Exam # " + (i + 1));
			System.out.println("");
			System.out.println(
					"Please enter the number of test questions on the exam # " + (i + 1) + " : " + enterQuestionQty);
			System.out.println("Please enter the number of missed questions on the exam # " + (i + 1) + " : "
					+ enterQuestionMissedQty);

			System.out.println("");
			System.out.println(examPrintout.toString());
			sequenceOfScores.add(calculateExamScore);
			questionValueArray.add(calculateQuestionValue);
			System.out.println("");
			System.out.println("==============================================================");
			System.out.println("");

		}
		Double testOne = sequenceOfScores.get(0);
		Double testTwo = sequenceOfScores.get(1);
		if (testOne.equals(testTwo))
			System.out.print("The scores are the same");
		else
			System.out.print("The scores are not the same");

	}
}
// int numQuestions = Integer.parseInt(enterQuestionQty);
// I don't know what's going on, but it's not working any more.
// , enterQuestionMissedQty
//	private double questionValue; 	 // question value Removed // 1. theScore and questionValue should be removed. They are values determined by other fields. Whenever the two are needed, just call getScore() and getPointsEach()

/*

You have a very good starting point. I think you over-think the question.

Please revise the program and resubmit. Please let me know if you need me to walk over this with you.


A few issues of the program that can be fixed:
1. theScore and questionValue should be removed. They are values determined by other fields. Whenever the two are needed, just call getScore() and getPointsEach()
2. The equals() method needs to be revise accordingly. Rather than using theScore, use getScore().
3. The getScore() should just return the calculation result, instead of assigning the value to theScore.
4. The getPointsEach() method will just return the calculation result, instead of assignment the value to questionValue.
5. setNumMissed() should check the value and assign the value to numMissed.
6. According to the class diagram, the constructor should have only one parameter, numQ.
Han-Fen Hu , Feb 25 at 3:20pm

*/

// this was added to remove the warning
// 		ArrayList<Double> questionValueArray = new ArrayList<Double>();  // this was added to remove the warning
// expenseDescriptionArray.add(expenseDescription);
// this was added to remove the warning
// 		questionValueArray.add(calculateQuestionValue); // this was added to remove the warning
// I was actually ready to turn this in but there is actually still an issue:
//The test includes 0 question(s).
//Each question is valued at ∞ points. 
//The test-taker missed 5 question(s).
//The score is -∞.

// i could not figure out how to do this without creating an ArrayList


// I'm having a really hard time here. with the comparisons
//if(.equals(getScore(i + 1)))
//System.out.print("same");
//else
//System.out.print("not the same");


//double scoreOne = get(i)getScore();
//double scoreTwo =
// Please enter the number of test questions on the exam # 2 : 14
// ==============================================================

//System.out.println("");
// okay, at some point it broke, but I realize how I broke it, i thought
// that i could remove these two things 
// Double calculateQuestionValue = firstExam.getPointsEach();
// and 
// Double calculateExamScore = firstExam.getScore();
// because eclipse says that I'm not using them, but I actually am using them.


