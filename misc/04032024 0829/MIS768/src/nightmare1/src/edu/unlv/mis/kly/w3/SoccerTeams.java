package edu.unlv.mis.kly.w3;
import java.util.Scanner;


public class SoccerTeams {
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

	    // Get the number of players per team.
	    System.out.print("Enter the number of players per team: ");
	    teamSize = kb.nextInt();
     
	    // Validate the number entered.
	    while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS) {
	    	// if the value is not valid, ask the user to enter again
	    	System.out.print("The number must be at least " + MIN_PLAYERS +
	    		 	         " and no more than " + MAX_PLAYERS + 
	    		 	         ".\n Enter the number of players: ");
	        teamSize = kb.nextInt();
	    }

	    // Get the number of available players.
	    System.out.print("Enter the available number of players.");
	    players = kb.nextInt();
	    
	    // Validate the number entered.    
	    while (players <=0) {
	    	System.out.print("The number of players should be positive. Enter Again:");
	    	players = kb.nextInt();
	    }
	 
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
