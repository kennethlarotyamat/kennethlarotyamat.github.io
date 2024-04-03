package edu.unlv.mis768.labwork11;
/**
   This class determines a passing or failing grade for
   an exam.
*/

public class PassFailExam extends PassFailActivity {
   private int numQuestions;  // Number of questions
   private int numMissed;     // Number of questions missed

   /**
      The constructor sets the number of questions, the
      number of questions missed, and the minimum passing
      score.
      @param questions The number of questions.
      @param missed The number of questions missed.
      @param minPassing The minimum passing score.
   */
   public PassFailExam(int questions, int missed, double minPassing) {
      // Call the superclass constructor.
      super(minPassing);

      // Declare a local variable for the score.
      double numericScore;

      // Set the numQuestions and numMissed fields.
      numQuestions = questions;
      numMissed = missed;

      // Calculate the points for each question and
      // the numeric score for this exam.
      numericScore = 100.0/numQuestions * (numQuestions-numMissed);

      // Call the superclass's setScore method to
      // set the numeric score.
      setScore(numericScore);
   }
}