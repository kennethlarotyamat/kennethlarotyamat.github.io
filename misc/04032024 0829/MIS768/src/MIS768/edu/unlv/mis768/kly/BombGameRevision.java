package edu.unlv.mis768.kly; // package edu.unlv.mis768.labwork6;
import java.io.*;
// import java.util.ArrayList;
import java.util.Scanner;

public class BombGameRevision {
	
	final static int NUM_OF_CITY = 5; 	// number of city is fixed.
	
	public static void main(String[] args) throws IOException {
		// declare the array of points
		Point [] cities = new Point [NUM_OF_CITY];
		 
		// call the readCities() method to read the coordinates
		cities = readCities();
		 
		
		try (// Get the X and Y coordinates of the bomb
		Scanner keyboard = new Scanner(System.in)) {
			System.out.print("Please enter the x corrdinate of the bomb: ");
			int bombX = keyboard.nextInt();
			System.out.print("Please enter the y corrdinate of the bomb: ");
			int bombY = keyboard.nextInt();
			
			// instantiate a point as the bomb
			Point bomb = new Point(bombX,bombY);
			
			// get the radius
			System.out.print("Please enter the blast radius: ");
			// the placement of the line break looks funny // System.out.println(" ");
			int radius = keyboard.nextInt();
			System.out.println(" ");
			
			// counter for affected cities
			int hitCount=0;
			
			// for loop to traverse the array
			for(int i=0; i<cities.length;i++){
				// print the distance
				System.out.println("City "+(i+1)+" is "+cities[i].getDistance(bomb)+" units aways from the bomb");
				// cityList[i] // if the distance is less than or equal to the radius
				if (cities[i].getDistance(bomb) <=radius){
					// show affected
					System.out.println("City "+(i+1)+" is affected.");
					// add one to the count
					hitCount++;
				} else {System.out.println("City " + (i + 1) + " is not affected.");} // this was added to indicate a city that has not been affected
			}
			
			// print message to show the final result
			System.out.println(" "); // line break
			System.out.println("A total of "+hitCount+" cities are affected.");
		}

	}
	
	/**
	 * This method reads the X and Y coordinates of 5 cities from a file
	 * @return the array contains five Point objects
	 * @throws IOException
	 */
	public static Point[] readCities() throws IOException{

		// the array of city of objects
		Point [] cities = new Point[NUM_OF_CITY];
		 
		
		// file object to be read
		File file = new File("C:\\Users\\KLYam\\OneDrive\\Documents\\GitHub\\MIS76810032024Sprg\\src\\MIS768\\edu\\unlv\\mis768\\kly\\cities.txt"); // C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\src\MIS768\edu \ unlv \mis768\kly\cities.txt // File file = new File("Y:\\cities.txt");
		// Scanner object the use the file as the input
		Scanner inputFile =new Scanner(file);
		
	    for(int i=0;i<NUM_OF_CITY;i++) {
	    	// Read one line from the file.
	    	String line = inputFile.nextLine();
	    	// find the comma separating X and Y
	    	int indexOfComma = line.indexOf(',');
	    	// read X and Y
	    	int x = Integer.parseInt(line.substring(0, indexOfComma));
	    	int y = Integer.parseInt(line.substring(indexOfComma+1));
	      
	    	// set the location for each city
	    	cities[i] = new Point(x,y);   	  
		  }
	      // Close the file.
	      inputFile.close();
		return cities;
	}

}
