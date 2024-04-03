package edu.unlv.mis.kly.w3; // package edu.unlv.mis768.labwork4;

// import java.io.FileNotFoundException;
// import java.io.IOException;
// import java.io.PrintWriter;
import java.io.PrintWriter;
import java.io.*; // this is an alternative, which includes IOException and PrintWriter
import java.util.Scanner;

public class WriteFileDemoAppend {

	public static void main(String[] args) throws IOException {
		// declare variables
		String fileName; // name of the file to store the data
		String friendName; // name of a friend to be written to the file
		int numOfFriends;  // number of friends to be entered by the user
		
		// Scanner object for keyboard input
		Scanner kb = new Scanner(System.in);
		
		// get user input for number of friend
		System.out.print("How many friends do you have?");
		numOfFriends = kb.nextInt();
		
		// Consume the remaining newline character
		kb.nextLine();
		
		// get the filename
		System.out.print("Please enter the file name where you would like to store the data: ");
		fileName = kb.nextLine(); // C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\writefiledemo.txt
		
		// open the file
		FileWriter fw = new FileWriter(fileName, true); // this line has been added to append data, rather than overwrite date
		PrintWriter outputFile = new PrintWriter(fw); // PrintWriter outputFile = new PrintWriter(fileName); // C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\writefiledemo.txt
		
		//for loop
		
		for (int i=0; i<numOfFriends; i++) { // integer variable i is initialized at zero, and as long as variable i is less than the number of friends or num of friends variable, the program will continue to prompt user to enter new friend names
			System.out.print("Please enter the name of friend #"+(i+1)+":");
			friendName = kb.nextLine();
			
			outputFile.println(friendName);
		}
		outputFile.close();
		System.out.print("The Data is saved to the file " +fileName); // edC:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\writefilemo.txt
        kb.close(); // 		outputFile.close();
		
	}

}



/*

C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfildemo.txt

This is the file path for the file that I'm going to use here. It was interesting because as i was appending the appendfiledemo.txt 
the eclipse dictionary file was also appended with new words

C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfildemo.txt

these file names have been used:

Please enter the file name where you would like to store the data: 

C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfildemo.txt

C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\src\nightmare1\sharlilponi 			// this one was accidentally created when i entered friend name when prompted to enter a file name

C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\writefilemo.txt
C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\writefilemo2.txt
C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\writefilemo3.txt



*/