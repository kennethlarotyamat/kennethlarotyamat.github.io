package edu.unlv.mis768.kly; // package edu.unlv.mis768.labwork7;

import java.util.Scanner;

/**
   This program uses the startsWith method to search using
   a partial string.
*/

public class PersonSearch{
   public static void main(String[] args)   {
      String lookUp;  // To hold a lookup string
      
      // Create an array of names.
      String[] people = { "Cutshaw, Will", "Davis, George",
                          "Davis, Jenny", "Russert, Phil",
                          "Russell, Cindy", "Setzer, Charles",
                          "Smathers, Holly", "Smith, Chris",
                          "Smith, Brad", "Williams, Jean" };

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get a partial name to search for.
      System.out.print("Enter the first few characters of " +
                       "the last name to look up: ");
      lookUp = keyboard.nextLine();

      // Display all of the names that begin with the 
      // string entered by the user.
      System.out.println("Here are the names that match:");
      
      for(int i=0; i<people.length; i++) {
    	  if(people[i].toUpperCase().startsWith(lookUp.toUpperCase())) // this makes the string lookup not case sensitive by converting the user input to upper case and the lookup item also upper case 			//[people]  // this is case sensitive - if(people[i].startsWith(lookUp)) //[people]
    		  System.out.println(people[i]);  // indexOf lastIndexOf
    		  
      }

   }
}

// https://unlv.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=2b0ed1c4-5c1f-407d-b521-b10601367a2d&start=0
// how to search a string will return negative 1
