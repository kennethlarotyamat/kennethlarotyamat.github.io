package edu.unlv.mis768.labwork12;



/**
   This program demonstrates polymorphic behavior.
*/

public class PolymorphicExam {
   public static void main(String[] args)   {
      // Create an array of GradedActivity references.
      GradedActivity[] tests = new GradedActivity[3];

      // The first test is a regular exam with a numeric score of 75.


	  
      // The second test is a pass/fail test. 
      // The student missed 5 out of 20 questions, and the minimum passing grade is 60.


      // The third test is an curved exam. It will be curved by 1.25
      // The original score is 62



      // Display the grades.
      for (int i = 0; i < tests.length; i++) {
         System.out.println("Test " + (i + 1) + ": " +
                    "score " + tests[i].getScore() +
                    ", grade " + tests[i].getGrade());
      }
   }
}
