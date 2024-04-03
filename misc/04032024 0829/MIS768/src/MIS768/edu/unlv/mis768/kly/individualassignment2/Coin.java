package edu.unlv.mis768.kly.individualassignment2;

import java.util.Random;

public class Coin {
	
	// field
	private String sideUp;
	
	// constructor
	
	public Coin() {
		Random rand = new Random();
		
		int number = rand.nextInt(2);
		
		if (number ==0)
			sideUp="Heads";
		else
			sideUp="Tails";
		
	}
	public void toss () {
		Random rand = new Random();
		
		int number = rand.nextInt(2);
		
		if (number ==0)
			sideUp="Heads";
		else
			sideUp="Tails";
		
	}
	
	public String getSideUp() {
		return sideUp;
	}


}
