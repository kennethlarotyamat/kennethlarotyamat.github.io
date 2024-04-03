package edu.unlv.mis768.labwork11;

/**
   This class computes a curved grade. It extends
   the GradedActivity class.
*/
public class CurvedActivity extends GradedActivity {
   double rawScore;     // Unadjusted score
   double percentage;   // Curve percentage

   /**
      The constructor sets the curve percentage.
      @param percent The curve percentage.
   */
   public CurvedActivity(double percent)   {
      percentage = percent;
   }

   /**
      The setScore method overrides the superclass
      setScore method. This version accepts the
      unadjusted score as an argument. That score is
      multiplied by the curve percentage and the
      result is sent as an argument to the superclass's
      setScore method.
      @param s The unadjusted score.
   */

   public void setScore(double s) {
	   											// the given score will be stored as the raw score
      rawScore = s;
       											// call the setScore() method of the superclass to set the new score (after curving)
      super.setScore(rawScore * percentage); 	// will be the new score in the graded activity will be used to get the new grade
   }

   /**
      The getRawScore method returns the raw score.
      @return The value in the rawScore field.
   */
   public double getRawScore() {
      return rawScore;
   }

   /**
      The getPercentage method returns the curve
      percentage.
      @return The value in the percentage field.
   */
   public double getPercentage() {
      return percentage;
   }
}