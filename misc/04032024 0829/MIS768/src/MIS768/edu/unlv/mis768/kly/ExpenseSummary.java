package edu.unlv.mis768.kly;

import java.util.Scanner;
import java.util.ArrayList;


public class ExpenseSummary { 
	public static void main(String[] args) {

		ArrayList<String> expenseDescriptionArray = new ArrayList<String>(); 

		char yesOrNoEntry;
						
				Scanner keyboard = new Scanner(System.in); 
			
			String expenseDescription = ""; 


			do {

				System.out.print("Enter an expense category: "); 
				expenseDescription = keyboard.nextLine();


				expenseDescriptionArray.add(expenseDescription);
				
				System.out.print("Enter total expenses for the "+expenseDescription + " category: "); 
				expenseDescription =  keyboard.nextLine();
				expenseDescriptionArray.add(expenseDescription);
				
				
				System.out.print("Do you have additional expenses to enter (Y/N): ");
				yesOrNoEntry = keyboard.next().charAt(0);
				keyboard.nextLine();
			} while (yesOrNoEntry == 'y' || yesOrNoEntry == 'Y'); 
		
			System.out.println(" ");
			System.out.println("=================================================");
			System.out.println(" ");
			System.out.println("Summary:");
			
			for (int i = 0; i < expenseDescriptionArray.size(); i+=2) {
				System.out.println("\t"+"\t"+"\t"+ String.format("%-20s %-10s", expenseDescriptionArray.get(i), expenseDescriptionArray.get(i + 1)));
			}
			
			
			
			System.out.println(" ");
			System.out.println("=================================================");
			System.out.println(" ");
			System.out.println("Total Expenses:" );
			
			double sumExpenses = 0.0;
			
			for (int i = 1; i < expenseDescriptionArray.size(); i+=2) {
				String expenseAmountString = expenseDescriptionArray.get(i);
				double expenseAmount = Double.parseDouble(expenseAmountString);
				sumExpenses += expenseAmount;
			

			}
			System.out.println("\t"+"\t"+"\t"+ sumExpenses );
			keyboard.close();


	}
}

// all right -it seems that i almost thought i submitted something before i finally saved it, but the only update was making note of the file path for the file that i uploaded.



//           C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\src\MIS768\edu\ unlv\mis768\kly\ExpenseSummary.java
// System.out.println("\t"+"\t"+"\t"+ sumExpenses );
/*




		System.out.println("The ArrayList has " + " objects stored in it.");


		System.out.println(expenseDescriptionArray);


		for (int i = 0; i < expenseDescriptionArray.size(); i++) {
			System.out.println(expenseDescriptionArray.get(i));
		}




this was thrown up when I entered empty spaces

Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 8 out of bounds for length 8
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
	at java.base/java.util.Objects.checkIndex(Objects.java:385)
	at java.base/java.util.ArrayList.get(ArrayList.java:427)
	at edu.unlv.mis768.kly.ExpenseSummary.main(ExpenseSummary.java:42)









*/
// here is what I'm thinking, the expense amount is going to be on odd-numbered lines, so I think i might be able to use just an array list
//try ()  -- i removed what usually gives me warnings. I'll worry about this later
// what I'm thinking is, okay, how do i get expense categories to work.

//I should have started this assignment sooner // public class ExpenseSummary {
//public class FriendList {
// Create an ArrayList to hold some names.
//has been changed again to
// expenseDescriptionArray //nameList
// has been replaced with
// expenseDescriptionArray // name list
// ha
// I had to remove all the comments from right next to the change, to the bottom, it was becoming hard for me to understand.
//friendName has been changed to expenseDescription
//variable for name to be entered by the user
//Scanner object for keyboard input
// use a do-while loop to get the names
// char yesOrNoEntry;
// prompt and get the name string
//System.out.print("Please enter a name
// (empty to end): ");
// add the name to the ArrayList
//single or double quotation marks depend on if it's
// a string or character // }
// while(!expenseDescription.equals("")); // repeat
// if the name is not empty
// Now display the items in expenseDescriptionArray. This is printing the entire
// ArrayList object

// print the content using a loop and get() method.
// remove the last element (i.e., the empty string)
// this line was removed because it is no longer needed, when the user enters
// yes or no, determines if it ends or not, rather than if the user enters an
// empty space or not //
// expenseDescriptionArray.remove(expenseDescriptionArray.size()-1); //
// expenseDescriptionArray.remove("");

// Display the size of the ArrayList.

// char yesOrNoEntry;
/*
 * public static void main(String[] args) {
 * // TODO Auto-generated method stub
 * 
 * }
 * 
 * }
 * 
 */
/*
 * 
 * instantiate object - refers to the creation of an object
 * 
 * 
 * Scanner kb = new Scanner(System.in);
 * // get the age, weight, and height
 * System.out.print("Please enter your age: ");
 * age = kb.nextInt();
 * 
 * 
 * 
 */