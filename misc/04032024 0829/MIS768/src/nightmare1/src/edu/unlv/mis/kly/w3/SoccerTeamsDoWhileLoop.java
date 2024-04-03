package edu.unlv.mis.kly.w3;
import java.util.Scanner;


public class SoccerTeamsDoWhileLoop {
	public static void main(String[] args)	   {
		// Declare constants and variables
	    final int MIN_PLAYERS = 9;  // Minimum players per team
	    final int MAX_PLAYERS = 15; // Maximum players per team
	    int players;                // Number of available players
	    int teamSize;               // Number of players per team
	    int teams;                  // Number of teams
	    int leftOver;               // Number of leftover players

	    
	    // Scanner object for keyboard input
	    Scanner kb = new Scanner(System.in);


     
	    // Validate the number entered.
	    do  {
	    	// if the value is not valid, ask the user to enter again
	    	System.out.print("Enter the number of players. \n The number must be at least " + MIN_PLAYERS +
	    		 	         " and no more than " + MAX_PLAYERS + 
	    		 	         ".\n  ");
	        teamSize = kb.nextInt();
	    } while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS);


	    
	    // Validate the number entered.    
	    do {
	    	System.out.print("Enter the available number of players.\n(The number of players should be positive.)");
	    	players = kb.nextInt();
	    } while (players <=0);
	 
	    // Calculate the number of teams.
	    teams = players / teamSize; 

	    // Calculate the number of leftover players.
	    leftOver = players % teamSize;

	    // Display the results.
	    System.out.print("There will be "+ teams + 
	    		         " teams with " + leftOver +
	    		         " players left over.");
        kb.close();
	   }
	
}

/*
 
	    // Get the number of available players.
	    System.out.print("");
	    players = kb.nextInt();
	    
	    
	    
 
  Enter Again:
 
 	    // Get the number of players per team.
	    System.out.print("Enter the number of players per team: ");
	    teamSize = kb.nextInt();
	    
	    
	    
 */
