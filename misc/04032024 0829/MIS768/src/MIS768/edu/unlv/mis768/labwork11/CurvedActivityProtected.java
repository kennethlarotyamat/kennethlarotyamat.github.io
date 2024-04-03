package edu.unlv.mis768.labwork11;

/**
   This class computes a curved grade. It extends
   the GradedActivity class.
*/
public class CurvedActivityProtected extends GradedActivityProtected {
   double rawScore;     // Unadjusted score
   double percentage;   // Curve percentage

   /**
      The constructor sets the curve percentage.
      @param percent The curve percentage.
   */
   public CurvedActivityProtected(double percent)   {
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
      // update the score as the new score (after curving)
      score = rawScore * percentage; // I am almost done with my assignments or the modules for week 6 // I don't even know if it's week six, I just know that this is the week that I'm working on right now // 
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