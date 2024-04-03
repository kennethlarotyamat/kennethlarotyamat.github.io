package edu.unlv.mis768.kly;

import java.util.Random;

public class RoulettePocket {
	// fields
	private int number;

	
	
	public RoulettePocket() { // default constructor
		
		   // Create a Random object for generating random numbers
		   Random rand = new Random();
		   // generate a random number between 0 (inclusive) and 37(exclusive)
		   int num = rand.nextInt(37);
		   
		   number = num;
		
	}
	
	public RoulettePocket(int num) {
		if (num<0 || num>36)
			number = 0;
		else
			number=num; // instantiate set a value
		// - number : int
		// when number is instantiated construction is always called
		// default constructor all numbers are zero and all boolean false special values are null
		
	}
	/*

	
	
	
	
	*/
	
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int num) {
		if (num<0 || num>36)
			number = 0;
		else
			number=num; // this.number = num;
	}
	
	public void setNumber(String str) {
		// convert string to int
		int num = Integer.parseInt(str);
		if (num<0 || num>36)
			number = 0;
		else
			number=num; // this.number = num;
	}
	
	public String getColor() {
		//Static is only used for the controller class 
		//model class do not use static
		String color = "green";
									// 1-10 19-28
		if ((number>=1 && number<=10) || (number >=19 && number <=28)) { // i had to fix this, i had 19 - 28
			if(number %2 ==0) // even numbers
				color = "black";
			else
				color ="red";
		} else if ((number>=11 && number <=18) || (number>=29 && number <=36)) {
			if (number % 2 ==0)
				color ="red";
			else
				color = "black";
		}
		
		return color;
	}

}
