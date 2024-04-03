package edu.unlv.mis768.kly; // package edu.unlv.mis768.labwork6;

import java.util.Scanner;

public class TestScoreConversion {
	   public static void main(String[] args)   {
		  //constants
	      final int ARRAY_SIZE = 4;  // Size of the array; number of scores
	      
	      // Create a Scanner objects for keyboard input.
	      Scanner keyboard = new Scanner(System.in); // keyboard.close();
	      
	      // Create an array for the scores
	      int [] scores = new int[ARRAY_SIZE];
	      // Create an array for the letter grades
	      String[] letters = new String[ARRAY_SIZE];
	      

	      System.out.println("Enter a series of " + scores.length + " scores.");

	      // Read values into the array
	      for (int index = 0; index < scores.length; index++)      {
	         System.out.print("Enter score " + (index + 1) + ": ");
	         scores[index] = keyboard.nextInt();
	      }
	      
	      System.out.println("Here are the scores that you entered:");

	      // Pass the array to the showArray method.
	      showArray(scores);
	      
	      
	      // Pass the array to convert letters of the score to letter grade
	      convertScores (scores,letters);
	      
	      // show the converted letter grades
	      System.out.println("Here are the corresponding letter grades:");
	      // use a for loop to show each element in the array
	      
	      for(int i=0; i<letters.length;i++) {
	    	  System.out.print(letters[i] + " "); // Created spaced between the letter grades // System.out.print(letters[i]);
	    	  keyboard.close();
	      }


	   }



	private static void convertScores(int[] s, String[] l) { // s originally score and l originally letters from the array
		for(int i=0; i<s.length; i++) // TODO Auto-generated method stub
		if(s[i]>=90)
			l[i]="A";
		else if (s[i]>=80)
			l[i]="B";
		else if (s[i]>=70)
			l[i]="C";
		else 
			l[i]="F";
			
	}



	/**
	      The showArray method accepts an array as
	      an argument and displays its contents.
	      @param array A reference to the array.
	   */

	   public static void showArray(int[] array)  {
	      // Display the array elements.
	      for (int index = 0; index < array.length; index++)
	         System.out.print(array[index] + " ");
	   }


}





// keyboard.close();
/*

public static double[] getArray() {
double[] array = {1.2,2.3,4.5,6.7,8.9};
return array;

}

 * 
 * 
 * 
 * */
