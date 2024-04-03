package edu.unlv.mis768.kly; // package edu.unlv.mis768.labwork7;

import java.util.Scanner;

// import javax.swing.JOptionPane; // commented out to remove warning, may need to use later

/**
   This program displays the number of letters,
   digits, and whitespace characters in a string.
*/

public class StringAnalyzer{
   public static void main(String [] args)   {
      String input;        // To hold input
      char[] array;        // Array for input
      int letters = 0;     // Number of letters
      int digits = 0;      // Number of digits
      int whitespaces = 0; // Number of whitespace s

      // Get a string from the user.
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter a string:");
      input= keyboard.nextLine();

      // Convert the string to a char array.
      array = input.toCharArray(); // converts to string to array is that the character wrapper class needs an array

      // Analyze the characters.
      for (int i = 0; i < array.length; i++) {
    	  if(Character.isLetter(array[i]))
    		  letters++;
    	  else if(Character.isDigit(array[i])) // if(Character.isDigit(array[i]))
    		  digits++;
    	  else if(Character.isWhitespace(array[i])) // if(Character.isWhitespace(array[i]))
    		  whitespaces++;


      }

      // Display the results.
      System.out.println("That string contains " +
                      letters + " letters, " +
                      digits + " digits, and " +
                      whitespaces + " whitespace characters.");
      keyboard.close();
   }
}
/*
 * 
 * user enters a string, analyzes the string string
 * char is the char array
 * 
 * 
 * 
 * */
 // */
//getChars




