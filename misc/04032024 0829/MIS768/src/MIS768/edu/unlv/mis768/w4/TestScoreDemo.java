package edu.unlv.mis768.w4; // package edu.unlv.mis768.kly.individualassignment2;

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

			enterQuestionMissedQty = JOptionPane
					.showInputDialog("Please enter the number of missed questions on the exam # " + (i + 1));

			TestScore examPrintout = new TestScore(enterQuestionQty, enterQuestionMissedQty);

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

/*
 
good lord. I'm having a hard time.
I'm sure it's all of my own doing. my own fault.

group work is nearly impossible for me and.
it's probably. a challenge that I won't be able to overcome.

I'm going to do something right now.

 */


