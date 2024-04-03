package edu.unlv.mis768.labwork11;

import java.util.Date;

public class InClassExercise extends GradedActivity {
	private String title;
	private Date dueDate;
	private boolean completed;
	
	// constructor
	/**
	 * Methods for instantiating an InClassExercise object
	 * @param ttl Title of the exercise is needed for instantiating an object 
	 * @param dDate Due date is needed for instantiating an object
	 */
	public InClassExercise(String ttl, Date dDate) {
		title = ttl;
		dueDate = dDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}	
	
	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isCompleted() {
		return completed;
	}

	/**
	 * When the exercise is completed, check whether it is overdue
	 * set the score accordingly
	 * @param c Completed or not
	 */
	public void setCompleted(boolean c) {
		Date today = new Date(); // get the system date
		
		completed = c; // assign the given value to the field
		
		// if the exercise is completed before due date
		if(completed && (today.compareTo(dueDate)<=0))
		// set the score to 100
			setScore(100);
		
		// otherwise set the score to 0
		else
			setScore(0); // used directly from the super class

	}
	
	
}
