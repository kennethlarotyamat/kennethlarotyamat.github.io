package edu.unlv.mis768.kly.individualassignment2.redo2;

import java.text.DecimalFormat;

public class TestScore {

	private int numQuestions;
	private int numMissed;


	public int getNumQuestions() {
		return numQuestions;
	}

	public Integer setNumMissed(int numMissed) {
		return this.numMissed = numMissed;
	}


	
	public int getNumMissed() {
		if (numMissed < 0) {
			return 0;
		} else
		return numMissed;
	}

	public double getPointsEach() {
		if (numQuestions <= 0 || numMissed < 0) {
			return 0;
		} else {
			return (100 / (double) numQuestions);
		}

	}

	public double getScore() {
		if (numQuestions <= 0 || numMissed < 0) {
			return 0;
		} else {
			return ((double) (numQuestions - numMissed) / numQuestions) * 100;
		}

	}

	public boolean equals(TestScore o2) {
		if (this.getScore() == o2.getScore())
			return true;
		else
			return false;

	}

	DecimalFormat ft = new DecimalFormat("0.00");

	public String toString() {
		String theString = null;
		theString = "The test includes " + numQuestions + " question(s).\n" + "Each question is valued at "
				+ ft.format(getPointsEach()) + " points. \n"
				+ "The test-taker missed " + getNumMissed() + " question(s).\n"
				+ "The score is " + ft.format(getScore()) + ".";

		return theString;
	}

	public TestScore(int numQ, int numM) {

		if (numQ < 0 || numM < 0) {

			numQ = 0;
			numM = 0;


		}

		numQuestions = numQ;
		numMissed = numM;

	}

	public TestScore(String numQtyString) {

		int numM = numMissed;

		int numQ = Integer.parseInt(numQtyString);

		if (numQ < 0 || numM < 0) {

			numQ = 0;
			numM = 0;


		}

		numQuestions = numQ;
		numMissed = numM;

	}


}

//public void setNumMissed(int numMissed) {
//this.numMissed = numMissed;
//
//}
//public Integer setNumMissed(int numMissed) {
//	this.numMissed = numMissed;
//}
//it broke around here.	

//	public void setNumMissed(int numMissed) {
//		if (numMissed<0) {
//		this.numMissed = 0;
//		} else {
//		this.numMissed = numMissed;	
//		}
//
//	}
	
//The get and set methods of numMissed is provided.
//	In the setNumMissed() method, if the value passed to this method is not a positive number, make numMissed as 0.	
//	5. setNumMissed() should check the value and assign the value to numMissed.
// 4. The getPointsEach() method will just return the calculation result, instead of assignment the value to questionValue.
// 3. The getScore() should just return the calculation result, instead of assigning the value to theScore.
// 1. theScore and questionValue should be removed. They are values determined by other fields. Whenever the two are needed, just call getScore() and getPointsEach()
// 2. The equals() method needs to be revise accordingly. Rather than using theScore, use getScore().

// 		String numWrongString = numMissed; // , 
// I removed theScore

//private double theScore;
//theScore = 0;
//getScore() = 0; // theScore = 0;
// return theScore;
// theScore = 0;
// theScore = ((double) (numQuestions - numMissed) / numQuestions) * 100;

/*

1. theScore and questionValue should be removed. They are values determined by other fields. Whenever the two are needed, just call getScore() and getPointsEach()

questionValue  * 

so i removed questionValue - this is my second attempt at redoing this, meaning this is my third attempt at completing this.


You have a very good starting point. I think you overthink the question.

Please revise the program and resubmit. Please let me know if you need me to walk over this with you.


A few issues of the program that can be fixed:
1. theScore and questionValue should be removed. They are values determined by other fields. Whenever the two are needed, just call getScore() and getPointsEach()
2. The equals() method needs to be revise accordingly. Rather than using theScore, use getScore().
3. The getScore() should just return the calculation result, instead of assigning the value to theScore.
4. The getPointsEach() method will just return the calculation result, instead of assignment the value to questionValue.
5. setNumMissed() should check the value and assign the value to numMissed.
6. According to the class diagram, the constructor should have only one parameter, numQ.
Han-Fen Hu , Feb 25 at 3:20pm





You have a very good starting point. I think you overthink the question.

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



//
//You have a very good starting point. I think you overthink the question. Please revise the program and resubmit. Please let me know if you need me to walk over this with you. A few issues of the program that can be fixed: 1. theScore and questionValue should be removed. They are values determined by other fields. Whenever the two are needed, just call getScore() and getPointsEach() 2. The equals() method needs to be revise accordingly. Rather than using theScore, use getScore(). 3. The getScore() should just return the calculation result, instead of assigning the value to theScore. 4. The getPointsEach() method will just return the calculation result, instead of assignment the value to questionValue. 5. setNumMissed() should check the value and assign the value to numMissed. 6. According to the class diagram, the constructor should have only one parameter, numQ.
//Han-Fen Hu, Feb 25 at 3:20pm
//


//

//package edu.unlv.mis768.kly.individualassignment2.redo;
//
//import java.util.ArrayList;
//
//import javax.swing.JOptionPane;
//
//public class TestScoreDemo {
//
//	public static void main(String[] args) {
//
//		ArrayList<Double> sequenceOfScores = new ArrayList<Double>();
//		ArrayList<Double> questionValueArray = new ArrayList<Double>();
//
//		for (int i = 0; i < 2; i++) {
//			String enterQuestionQty;
//			String enterQuestionMissedQty;
//
//			enterQuestionQty = JOptionPane
//					.showInputDialog("Please enter the number of test questions on the exam # " + (i + 1));
//			int numQuestions = Integer.parseInt(enterQuestionQty);
//			
//			TestScore testScore = new TestScore(0);
//			testScore.setNumQuestions(numQuestions);
//
//			
//			enterQuestionMissedQty = JOptionPane
//					.showInputDialog("Please enter the number of missed questions on the exam # " + (i + 1));
//
//			TestScore examPrintout = new TestScore(enterQuestionQty);
//
//			Double calculateQuestionValue = examPrintout.getPointsEach();
//			Double calculateExamScore = examPrintout.getScore();
//
//			System.out.println("These are the details for Exam # " + (i + 1));
//			System.out.println("");
//			System.out.println(
//					"Please enter the number of test questions on the exam # " + (i + 1) + " : " + enterQuestionQty);
//			System.out.println("Please enter the number of missed questions on the exam # " + (i + 1) + " : "
//					+ enterQuestionMissedQty);
//
//			System.out.println("");
//			System.out.println(examPrintout.toString());
//			sequenceOfScores.add(calculateExamScore);
//			questionValueArray.add(calculateQuestionValue);
//			System.out.println("");
//			System.out.println("==============================================================");
//			System.out.println("");
//
//		}
//		Double testOne = sequenceOfScores.get(0);
//		Double testTwo = sequenceOfScores.get(1);
//		if (testOne.equals(testTwo))
//			System.out.print("The scores are the same");
//		else
//			System.out.print("The scores are not the same");
//
//	}
//}

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












//package edu.unlv.mis768.kly.individualassignment2.redo;
//
//import java.text.DecimalFormat;
//
//public class TestScore {
//
//	private int numQuestions;
//	private int numMissed;
//
//	public int getNumQuestions() {
//		return numQuestions;
//	}
//
//	public void setNumQuestions(int numQuestions) {
//		this.numQuestions = numQuestions;
//	}
//
//	public void setNumMissed(int numMissed) {
//		if (numMissed > numQuestions)
//			this.numMissed = numQuestions;
//		else if (numMissed > 0)
//			this.numMissed = numMissed;
//		else
//			this.numMissed = 0;
//
//	}
//
//	public int getNumMissed() {
//		return numMissed;
//	}
//
//	public double getPointsEach() {
//		if (numQuestions <= 0 || numMissed < 0) {
//			return 0;
//		} else {
//			return (100 / (double) numQuestions);
//		}
//
//	}
//
//	public double getScore() {
//		if (numQuestions <= 0 || numMissed < 0) {
//			return 0;
//		} else {
//			return ((double) (numQuestions - numMissed) / numQuestions) * 100;
//		}
//
//	}
//
//	public boolean equals(TestScore o2) {
//		if (this.getScore() == o2.getScore())
//			return true;
//		else
//			return false;
//
//	}
//
//	DecimalFormat ft = new DecimalFormat("0.00");
//
//	public String toString() {
//		String theString = null;
//		theString = "The test includes " + numQuestions + " question(s).\n" + "Each question is valued at "
//				+ ft.format(getPointsEach()) + " points. \n"
//				+ "The test-taker missed " + numMissed + " question(s).\n"
//				+ "The score is " + ft.format(getScore()) + ".";
//
//		return theString;
//	}
//
//	public TestScore(int numQ) {
//
//
//
//	}
//
//	public TestScore(String numQtyString) {
//
//
//
//	}
//
//}


// I don't even know exactly what's wrong here.

//if (numQ < 0 || getNumMissed() < 0) {
//
//	numQ = 0;
//
//}
//
//numQuestions = numQ;
//

//
//int numQ = Integer.parseInt(numQtyString);
//
//if (numQ < 0) {
//
//	numQ = 0;
//
//}
//numQuestions = numQ;
// int numM = getNumMissed();
// || numM < 0 //			numM = 0;
//numMissed = numM; // , String numWrongString
// numMissed = numM; // , int numM
// 6. According to the class diagram, the constructor should have only one parameter, numQ.
//		getNumMissed() = 0;



/*
 
5. setNumMissed() should check the value and assign the value to numMissed.
6. According to the class diagram, the constructor should have only one parameter, numQ.
* 
 
 * 
 * 

You have a very good starting point. I think you overthink the question.

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

// if (this.theScore == o2.theScore) // getScore()


// 2. The equals() method needs to be revise accordingly. Rather than using
					// theScore, use getScore().
// theScore = ((double) (numQuestions - numMissed) / numQuestions) * 100;

//	return theScore; 
// theScore = 0;
					// 1. theScore and questionValue should be removed. They are values determined
					// by other fields. Whenever the two are needed, just call getScore() and
					// getPointsEach()
			//private double theScore; // 1. theScore and questionValue should be removed. They are values determined
			// by other fields. Whenever the two are needed, just call getScore() and
			// getPointsEach()
// theScore = 0;
//	theScore = 0;
//getPointsEach()
// questionValue = 0; // getPointsEach() // questionValue = 0; // getPointsEach()

//public double getPointsEach() {
//if (numQuestions <= 0 || numMissed < 0) {
//	questionValue = 0;
//} else {
//	questionValue = (100 / (double) numQuestions);
//}
//return questionValue; // 1. theScore and questionValue should be removed. They are values determined by other fields. Whenever the two are needed, just call getScore() and getPointsEach()
//}
// return = (100 / (double) numQuestions);
// return = 0;
// return questionValue; 
// 1. theScore and questionValue should be removed. They are values determined by other fields. Whenever the two are needed, just call getScore() and getPointsEach()

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

// i think that it's done but this basically took forever.
//}
// else {theScore=0;}
// if ((double)numQuestions < 0 || (double) numMissed < 0) {
//}
//questionValue = queVal;
//questionValue = 0;
//theScore = 0;
//questionValue = 0;
//theScore = 0;
//if	(numM < 0)
//
//	numM = 0;
//	numQ = 0;
//I can't even believe how long this is taking me.
//	String calculateQuestionValue;
//,calculateQuestionValue,calculateExamScore
//// enterQuestionQty //100;

//public double getPointsEach() {
//
//questionValue = (double) numQuestions / 100;
//return questionValue;
//}
//double calculateQuestionValue;
//double calculateExamScore;
//String calculateFirstExamScore;
//I might have to do this again using system in keyboard -- but I don't want to do that considering how long I've already taken just getting this far.
//SavingsAccount myAccount = new SavingsAccount(monthlyInterestRate,startingBalance);
//TODO Auto-generated method stub
//SavingsAccount myAccount = new SavingsAccount(monthlyInterestRate,startingBalance); // The constructor SavingsAccount(String, String) is undefined

//TestScore firstExam = new TestScore (enterQuestionQty);
//SavingsAccount myAccount = new SavingsAccount(monthlyInterestRate,startingBalance);
//		private static 
//	Create a program to demonstrate this Test class.
//	In this program, ask the user to enter the number of questions 
//	for the first test, and also enter the number of questions missed 
//	in the first test. After showing the content of the object representing 
//	the first test, the program asks the user to enter the same information 
//	for the second test. The program then shows the content of the second Test 
//	object. Finally, the program should indicate whether the scores of the two 
//	tests are the same.

//
//if(compXYZ.equals(compABC))
//System.out.print("same");
//else
//System.out.print("not the same");
//
//}

//I still don't understand this whole - two different files kind of thing
//all I know is that I have to put some things in one file, and a bunch of
//other things in some other file.
//so I have a TestScore.java - and a TestScoreDemo.java

//-numQuestions: int
//-numMissed: int
//+Test(numQ: int)
//+getNumQuestions(): int
//+setNumMissed (numMissed: int): void
//+getNumMissed(): int
//+getPoints Each(): double
//+getScore(): double
//+equals(test2: Test): boolean
//+toString(): String
//System.out.println("");
//I can't figure out how to do this as a for loop // for (int i = 0; i < 2; i++) {	}
//I'm tired already and this is taking forever, but I've managed to get the first test to display
//all i have to do left is have the second test display, and then make them equal.
//Double calculateQuestionValue = firstExam.getPointsEach();
//Double calculateExamScore = firstExam.getScore();
//I can't even believe how long this is taking me.
//		String calculateQuestionValue;
//,calculateQuestionValue,calculateExamScore
//// enterQuestionQty //100;

//public double getPointsEach() {
//
//	questionValue = (double) numQuestions / 100;
//	return questionValue;
//}
//double calculateQuestionValue;
//double calculateExamScore;
//String calculateFirstExamScore;
//I might have to do this again using system in keyboard -- but I don't want to do that considering how long I've already taken just getting this far.
//SavingsAccount myAccount = new SavingsAccount(monthlyInterestRate,startingBalance);
//TODO Auto-generated method stub
//SavingsAccount myAccount = new SavingsAccount(monthlyInterestRate,startingBalance); // The constructor SavingsAccount(String, String) is undefined

//TestScore firstExam = new TestScore (enterQuestionQty);
//SavingsAccount myAccount = new SavingsAccount(monthlyInterestRate,startingBalance);
//			private static 
//			Create a program to demonstrate this Test class.
//			In this program, ask the user to enter the number of questions 
//			for the first test, and also enter the number of questions missed 
//			in the first test. After showing the content of the object representing 
//			the first test, the program asks the user to enter the same information 
//			for the second test. The program then shows the content of the second Test 
//			object. Finally, the program should indicate whether the scores of the two 
//			tests are the same.

//
//if(compXYZ.equals(compABC))
//	System.out.print("same");
//else
//	System.out.print("not the same");
//
//}

//I still don't understand this whole - two different files kind of thing
//all I know is that I have to put some things in one file, and a bunch of
//other things in some other file.
//so I have a TestScore.java - and a TestScoreDemo.java

//	-numQuestions: int
//	-numMissed: int
//	+Test(numQ: int)
//	+getNumQuestions(): int
//	+setNumMissed (numMissed: int): void
//	+getNumMissed(): int
//	+getPoints Each(): double
//	+getScore(): double
//	+equals(test2: Test): boolean
//	+toString(): String

//Double quesVal = Double.parseDouble(quesValString);
//Double score = Double.parseDouble(scoreString);
//theScore = score; // questionValue = quesVal; // , String quesValString, String scoreString
//theScore = score; // questionValue = quesVal; // , double quesVal, double score
//The parameterized constructor accepts an argument representing the number of questions. That is, 
//when a Test object is instantiated, the number of questions needs to be specified.
//However, if the value passed to this constructor is not a positive number, make numQuestion as 0.
//The get method of numQuestions is provided, but not the set method.

// int numQ = numQuestions;
// Integer.parseInt(numQtyString)  //		v // double iRate = Double.parseDouble(iRateString);
// all right - it's all set up - well, i think so.

//The test includes 18 question(s); each question is 5.56 points.
//The test-taker missed 2 question(s).
//The score is 88.89
// I had to create a field again, rather than just a local variable, because it - questionValue - is used later on in toString()

// questionValue = (double) numQuestions/100; // I had to create a field again, 
//rather than just a local variable, because it - questionValue - is used later on in toString()

//+toString(): String


//The toString() method can be used to show the content of an object. 
//It should return a String indicating the number of questions, points 
//for each question, number of questions missed, and the score. For example, 
//with 18 questions in the Test and missed 2 questions, the toString() method 
//should return the following:

// i was originally going to declare and initialize theScore inside the method, 
// but since i use theScore in the equals method, i actually had to create a theScore 
// field // double theScore = ((double) numMissed-(double) numQuestions)/(double) numQuestions;



//  && this.symbol.equals(o2.symbol)
// overwrite the equals method

//The equals() method can be used to compare two Test objects, by the score. 
//It should return true if the scores of the two Test objects are the same, 
//		and return false if the scores of the two Test objects are not the same.	

//+equals(test2: Test): boolean
//			public boolean equals(Stock o2) {
//				if (this.sharePrice == o2.sharePrice && this.symbol.equals(o2.symbol))
//					return true;
//				else
//					return false;
//				
//			}





//The getScore() method should calculate the final score for this test. 
//This method thus should return a double number. For example, if there 
//		are 40 questions in the test and the test-taker missed 3 questions, the score should be 92.5.

//+getScore(): double // +getScore(): double
// i just took a survey from visual studio code, and it asked me how i liked developing java in visual studio code,
// and i wrote that i just really don't even use vs code for java because I really don't know how.

// I guess this wasn't too bad, I was worried at first

//	double questionValue = 0;
//+getPoints Each(): double
//The getPointsEach() method will determine how many points for each question. 
//Assume the test is 100 points and each question accounts for the same points. 
//Thus, this method will calculate the points for each question, and return a double number.

////+getPoints Each(): double
//public double getPointsEach() {
//return numMissed;
//}

//+getNumMissed(): int

//public int getNumMissed() {
//	return NumMissed;
//}



//+setNumMissed (numMissed: int): void


//public void setInterestRate(double iRate) { // public void setInterestRate(double interestRate) {
//	// this.interestRate = interestRate;
//	if(iRate<0)
//		iRate=0;
//	else if(iRate>.01)
//		iRate /=100;
//	interestRate=iRate;
//}



//+getNumQuestions(): int
//public double getBalance() {
//	return balance;
//}





//+TestScore(numQ: int)
//+TestScore(numQ: int)

//+Test(numQ: int)

//-numQuestions: int
//-numMissed: int

//public SavingsAccount(String iRateString, String balString) { //method overload to string// public SavingsAccount(double iRate, double bal) {
//	
//	//		+SavingsAccount()
//	//		+SavingsAccount(iRate: double, bal: double) 
//	//		+SavingsAccount(iRateStr: String, balString: String)
//	// The constructor SavingsAccount(String, String) is undefined
//    double iRate = Double.parseDouble(iRateString);
//    double bal = Double.parseDouble(balString);	
//if(bal<0)
//	bal=0;
//
//balance = bal;
//
//if(iRate<0)
//	iRate=0;
//else if(iRate>.01)
//	iRate /=100;
//interestRate=iRate; // Type mismatch: cannot convert from String to double
//}

//-numQuestions: int
//-numMissed: int

//+Test(numQ: int)
//+getNumQuestions(): int
//+setNumMissed (numMissed: int): void
//+getNumMissed(): int
//+getPoints Each(): double
//+getScore(): double
//+equals(test2: Test): boolean
//+toString(): String


	// private with negative sign
//-numQuestions: int
//-numMissed: int
	// public with positive sign

//+Test(numQ: int)
//+getNumQuestions(): int
//+setNumMissed (numMissed: int): void
//+getNumMissed(): int
//+getPoints Each(): double
//+getScore(): double
//+equals(test2: Test): boolean
//+toString(): String

//I still don't understand this whole - two different files kind of thing
//all I know is that I have to put some things in one file, and a bunch of
//other things in some other file.
//so I have a TestScore.java - and a TestScoreDemo.java

//	-numQuestions: int
//	-numMissed: int

//	+Test(numQ: int)
//	+getNumQuestions(): int
//	+setNumMissed (numMissed: int): void
//	+getNumMissed(): int
//	+getPoints Each(): double
//	+getScore(): double
//	+equals(test2: Test): boolean
//	+toString(): String

//getPointsEach() // 			questionValue = 0;
			// getPointsEach() //			questionValue = 0;
//	private double questionValue; getPointsEach()
// questionValue = 0;
// questionValue = (100 / (double) numQuestions);	
// return questionValue;	
//public double getPointsEach() {
//	if (numQuestions <= 0 || numMissed < 0) {
//		questionValue = 0;
//	} else {
//		questionValue = (100 / (double) numQuestions);
//	}
//	return questionValue;
//}


// i think that it's done but this basically took forever.
//}
// else {theScore=0;}
// if ((double)numQuestions < 0 || (double) numMissed < 0) {
//}
//questionValue = queVal;
//questionValue = 0;
//theScore = 0;
//questionValue = 0;
//theScore = 0;
//if	(numM < 0)
//
//	numM = 0;
//	numQ = 0;
//I can't even believe how long this is taking me.
//	String calculateQuestionValue;
//,calculateQuestionValue,calculateExamScore
//// enterQuestionQty //100;

//public double getPointsEach() {
//
//questionValue = (double) numQuestions / 100;
//return questionValue;
//}
//double calculateQuestionValue;
//double calculateExamScore;
//String calculateFirstExamScore;
//I might have to do this again using system in keyboard -- but I don't want to do that considering how long I've already taken just getting this far.
//SavingsAccount myAccount = new SavingsAccount(monthlyInterestRate,startingBalance);
//TODO Auto-generated method stub
//SavingsAccount myAccount = new SavingsAccount(monthlyInterestRate,startingBalance); // The constructor SavingsAccount(String, String) is undefined

//TestScore firstExam = new TestScore (enterQuestionQty);
//SavingsAccount myAccount = new SavingsAccount(monthlyInterestRate,startingBalance);
//		private static 
//	Create a program to demonstrate this Test class.
//	In this program, ask the user to enter the number of questions 
//	for the first test, and also enter the number of questions missed 
//	in the first test. After showing the content of the object representing 
//	the first test, the program asks the user to enter the same information 
//	for the second test. The program then shows the content of the second Test 
//	object. Finally, the program should indicate whether the scores of the two 
//	tests are the same.

//
//if(compXYZ.equals(compABC))
//System.out.print("same");
//else
//System.out.print("not the same");
//
//}

//I still don't understand this whole - two different files kind of thing
//all I know is that I have to put some things in one file, and a bunch of
//other things in some other file.
//so I have a TestScore.java - and a TestScoreDemo.java

//-numQuestions: int
//-numMissed: int
//+Test(numQ: int)
//+getNumQuestions(): int
//+setNumMissed (numMissed: int): void
//+getNumMissed(): int
//+getPoints Each(): double
//+getScore(): double
//+equals(test2: Test): boolean
//+toString(): String
//System.out.println("");
//I can't figure out how to do this as a for loop // for (int i = 0; i < 2; i++) {	}
//I'm tired already and this is taking forever, but I've managed to get the first test to display
//all i have to do left is have the second test display, and then make them equal.
//Double calculateQuestionValue = firstExam.getPointsEach();
//Double calculateExamScore = firstExam.getScore();
//I can't even believe how long this is taking me.
//		String calculateQuestionValue;
//,calculateQuestionValue,calculateExamScore
//// enterQuestionQty //100;

//public double getPointsEach() {
//
//	questionValue = (double) numQuestions / 100;
//	return questionValue;
//}
//double calculateQuestionValue;
//double calculateExamScore;
//String calculateFirstExamScore;
//I might have to do this again using system in keyboard -- but I don't want to do that considering how long I've already taken just getting this far.
//SavingsAccount myAccount = new SavingsAccount(monthlyInterestRate,startingBalance);
//TODO Auto-generated method stub
//SavingsAccount myAccount = new SavingsAccount(monthlyInterestRate,startingBalance); // The constructor SavingsAccount(String, String) is undefined

//TestScore firstExam = new TestScore (enterQuestionQty);
//SavingsAccount myAccount = new SavingsAccount(monthlyInterestRate,startingBalance);
//			private static 
//			Create a program to demonstrate this Test class.
//			In this program, ask the user to enter the number of questions 
//			for the first test, and also enter the number of questions missed 
//			in the first test. After showing the content of the object representing 
//			the first test, the program asks the user to enter the same information 
//			for the second test. The program then shows the content of the second Test 
//			object. Finally, the program should indicate whether the scores of the two 
//			tests are the same.

//
//if(compXYZ.equals(compABC))
//	System.out.print("same");
//else
//	System.out.print("not the same");
//
//}

//I still don't understand this whole - two different files kind of thing
//all I know is that I have to put some things in one file, and a bunch of
//other things in some other file.
//so I have a TestScore.java - and a TestScoreDemo.java

//	-numQuestions: int
//	-numMissed: int
//	+Test(numQ: int)
//	+getNumQuestions(): int
//	+setNumMissed (numMissed: int): void
//	+getNumMissed(): int
//	+getPoints Each(): double
//	+getScore(): double
//	+equals(test2: Test): boolean
//	+toString(): String

//Double quesVal = Double.parseDouble(quesValString);
//Double score = Double.parseDouble(scoreString);
//theScore = score; // questionValue = quesVal; // , String quesValString, String scoreString
//theScore = score; // questionValue = quesVal; // , double quesVal, double score
//The parameterized constructor accepts an argument representing the number of questions. That is, 
//when a Test object is instantiated, the number of questions needs to be specified.
//However, if the value passed to this constructor is not a positive number, make numQuestion as 0.
//The get method of numQuestions is provided, but not the set method.

// int numQ = numQuestions;
// Integer.parseInt(numQtyString)  //		v // double iRate = Double.parseDouble(iRateString);
// all right - it's all set up - well, i think so.

//The test includes 18 question(s); each question is 5.56 points.
//The test-taker missed 2 question(s).
//The score is 88.89
// I had to create a field again, rather than just a local variable, because it - questionValue - is used later on in toString()

// questionValue = (double) numQuestions/100; // I had to create a field again, 
//rather than just a local variable, because it - questionValue - is used later on in toString()

//+toString(): String


//The toString() method can be used to show the content of an object. 
//It should return a String indicating the number of questions, points 
//for each question, number of questions missed, and the score. For example, 
//with 18 questions in the Test and missed 2 questions, the toString() method 
//should return the following:

// i was originally going to declare and initialize theScore inside the method, 
// but since i use theScore in the equals method, i actually had to create a theScore 
// field // double theScore = ((double) numMissed-(double) numQuestions)/(double) numQuestions;



//  && this.symbol.equals(o2.symbol)
// overwrite the equals method

//The equals() method can be used to compare two Test objects, by the score. 
//It should return true if the scores of the two Test objects are the same, 
//		and return false if the scores of the two Test objects are not the same.	

//+equals(test2: Test): boolean
//			public boolean equals(Stock o2) {
//				if (this.sharePrice == o2.sharePrice && this.symbol.equals(o2.symbol))
//					return true;
//				else
//					return false;
//				
//			}





//The getScore() method should calculate the final score for this test. 
//This method thus should return a double number. For example, if there 
//		are 40 questions in the test and the test-taker missed 3 questions, the score should be 92.5.

//+getScore(): double // +getScore(): double
// i just took a survey from visual studio code, and it asked me how i liked developing java in visual studio code,
// and i wrote that i just really don't even use vs code for java because I really don't know how.

// I guess this wasn't too bad, I was worried at first

//	double questionValue = 0;
//+getPoints Each(): double
//The getPointsEach() method will determine how many points for each question. 
//Assume the test is 100 points and each question accounts for the same points. 
//Thus, this method will calculate the points for each question, and return a double number.

////+getPoints Each(): double
//public double getPointsEach() {
//return numMissed;
//}

//+getNumMissed(): int

//public int getNumMissed() {
//	return NumMissed;
//}



//+setNumMissed (numMissed: int): void


//public void setInterestRate(double iRate) { // public void setInterestRate(double interestRate) {
//	// this.interestRate = interestRate;
//	if(iRate<0)
//		iRate=0;
//	else if(iRate>.01)
//		iRate /=100;
//	interestRate=iRate;
//}



//+getNumQuestions(): int
//public double getBalance() {
//	return balance;
//}





//+TestScore(numQ: int)
//+TestScore(numQ: int)

//+Test(numQ: int)

//-numQuestions: int
//-numMissed: int

//public SavingsAccount(String iRateString, String balString) { //method overload to string// public SavingsAccount(double iRate, double bal) {
//	
//	//		+SavingsAccount()
//	//		+SavingsAccount(iRate: double, bal: double) 
//	//		+SavingsAccount(iRateStr: String, balString: String)
//	// The constructor SavingsAccount(String, String) is undefined
//    double iRate = Double.parseDouble(iRateString);
//    double bal = Double.parseDouble(balString);	
//if(bal<0)
//	bal=0;
//
//balance = bal;
//
//if(iRate<0)
//	iRate=0;
//else if(iRate>.01)
//	iRate /=100;
//interestRate=iRate; // Type mismatch: cannot convert from String to double
//}

//-numQuestions: int
//-numMissed: int

//+Test(numQ: int)
//+getNumQuestions(): int
//+setNumMissed (numMissed: int): void
//+getNumMissed(): int
//+getPoints Each(): double
//+getScore(): double
//+equals(test2: Test): boolean
//+toString(): String


	// private with negative sign
//-numQuestions: int
//-numMissed: int
	// public with positive sign

//+Test(numQ: int)
//+getNumQuestions(): int
//+setNumMissed (numMissed: int): void
//+getNumMissed(): int
//+getPoints Each(): double
//+getScore(): double
//+equals(test2: Test): boolean
//+toString(): String

//I still don't understand this whole - two different files kind of thing
//all I know is that I have to put some things in one file, and a bunch of
//other things in some other file.
//so I have a TestScore.java - and a TestScoreDemo.java

//	-numQuestions: int
//	-numMissed: int

//	+Test(numQ: int)
//	+getNumQuestions(): int
//	+setNumMissed (numMissed: int): void
//	+getNumMissed(): int
//	+getPoints Each(): double
//	+getScore(): double
//	+equals(test2: Test): boolean
//	+toString(): String