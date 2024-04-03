package edu.unlv.mis768.labwork11;
/**
   This class holds a numeric score and determines
   whether the score is passing or failing.
*/


public class PassFailActivity extends GradedActivity {
   // Specialized field Minimum passing score
	private double minPassingScore;


   /**
      The constructor sets the minimum passing score.
      @param mps The minimum passing score.
   */
	public PassFailActivity(double mps) {
		minPassingScore = mps;
	}



   /**
      The getGrade method returns a letter grade determined
      from the score field. This method overrides the
      superclass method.
      @return The letter grade.
   */
	public char getGrade() {
		char grade = 'P';
		if(super.getScore()<minPassingScore)
			grade='F';
		return grade;





	}

}