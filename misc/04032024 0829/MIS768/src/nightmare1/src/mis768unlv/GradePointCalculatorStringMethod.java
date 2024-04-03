package mis768unlv;

import java.util.Scanner;

public class GradePointCalculatorStringMethod {

	public static void main(String[] args) {
	      char grade;       // A character entered by the user
          
	      // Create a Scanner object for keyboard input.
	      Scanner keyboard = new Scanner(System.in);
	      
	      // Get one of the numbers 1, 2, or 3 from the user.
	      System.out.print("Enter A, B, or C: ");
	      // there is no nextChar() method
	      // we need to use next().charAt(0). 
	      // next() returns the next word in the input as a string 
	      // and charAt(0) function returns the first character in that string.
	      grade = keyboard.next().toUpperCase().charAt(0); 

	      // Determine the grade point entered.
	      if(grade == 'A') {
	    	  System.out.print("4.0");
	    	  
	      }
	      else if(grade =='B') {
	    	  System.out.print("3.0");
	    	  
	      }
	      else if(grade =='C') {
	    	  System.out.print("2.0");
	    	  
	      }
	      else {
	    	  System.out.print("0.0");
	    	  
	      }
		  keyboard.close();
	}

}

/*






		  try {

		  } finally {
            keyboard.close();
        }


  
 */
