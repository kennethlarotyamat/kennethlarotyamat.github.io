package com.chestnutandhazel.edu.unlv.mis768.labwork;

public class WageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// constants
		// does eclipse ide autosace how do I turn on autosave? the google instructions aren't making sense to me.		

		final double BASE_PAY = 25;
		final double REGULAR_HOURS = 40;
		
		//		declare variables
		double salary;  // salary to be calculated
		double hours = 57; // hours worked
		
		salary = (hours - REGULAR_HOURS) * BASE_PAY * 0.5 + hours * BASE_PAY;
		System.out.print("The salary is $" + salary);
		// this was originally created in eclipse IDE, but this specific comment was written in VS Code
		// I think that it makes sense that I try using both.
		// i almost want to say that it can't really hurt to use both, i'm just
		// not sure how much extra time it would take to learn both.
		// I'm already tired. I think that i have. i . well. i actually do have a group meeting
		// for my other class later today.
	}
		// i had a small victory just now. i was able to get my info@chestnutandhazel email to link
		// with my main github account but basically. it was kind of a difficult process.
		// with a lot of things, there seems to be a kind of runaround, but i was eventually
		// able to unlink info@chestnutandhazel from my old account, and re-link it after being unlinked
		// to my main account. i think the old account was finally deleted.  

}
