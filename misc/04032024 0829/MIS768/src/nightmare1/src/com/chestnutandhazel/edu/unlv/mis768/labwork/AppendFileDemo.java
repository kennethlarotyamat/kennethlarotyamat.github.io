package com.chestnutandhazel.edu.unlv.mis768.labwork; // package com.chestnutandhazel.edu.unlv.mis768.labwork; 

// import java.io.FileNotFoundException;
// import java.io.IOException;
// import java.io.PrintWriter;
import java.io.PrintWriter;
import java.io.*; // this is an alternative, which includes IOException and PrintWriter
import java.util.Scanner;

public class AppendFileDemo {

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
		fileName = kb.nextLine(); 
		
		// open the file
		FileWriter fw = new FileWriter(fileName, true); 
		PrintWriter outputFile = new PrintWriter(fw); 
		
		for (int i=0; i<numOfFriends; i++) { 
			System.out.print("Please enter the name of friend #"+(i+1)+":");
			friendName = kb.nextLine();
			
			outputFile.println(friendName);
		}
		outputFile.close();
		System.out.print("The Data is saved to the file " +fileName);
        kb.close();
		
	}

}



/*







// C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\writefiledemo.txt

// this line has been added to append data, rather than overwrite date
// PrintWriter outputFile = new PrintWriter(fileName); // C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\writefiledemo.txt
		
		//for loop

I still can't get over how long it took me to complete my week 6 assignment. forever.
it always takes me forever.
everything.
takes
forever.
// integer variable i is initialized at zero, and as long as variable i is less than the number of friends or num of friends variable, the program will continue to prompt user to enter new friend names
 // edC:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\writefilemo.txt
I think that I know why it takes so long to commit my changes
I moved my repository to a larger - to my larger external drive
where I have more space, but it's not an ssd it an hd so
it just takes longer to do things, and
i don't know if being external makes it take longer. too.

I'm frustrated that it took my so long to complete the manager class demo, 
the good thing is that i finished it before it was due
but it took me so long to get it done.

Class Exercise (Week 6): Manager Class and Demo
Class Activities



// package edu.unlv.mis768.labwork4; // 
so the answer is yes, it will automatically create a file if that file doesn't already exist
and after creating the file, it proceedes to append the file it just created.

How many friends do you have? 30
Please enter the file name where you would like to store the data: C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfiledemoautomaticallycreatedfile.txt
Please enter the name of friend #1:Hlorna
Please enter the name of friend #2:Glorna
Please enter the name of friend #3:Florna
Please enter the name of friend #4:Flortaki
Please enter the name of friend #5:shorla
Please enter the name of friend #6:hando
Please enter the name of friend #7:comme
Please enter the name of friend #8:larti
Please enter the name of friend #9:shera
Please enter the name of friend #10:gogo
Please enter the name of friend #11:Gugina
Please enter the name of friend #12:gugino
Please enter the name of friend #13:plarkee
Please enter the name of friend #14:Dog
Please enter the name of friend #15:Fish
Please enter the name of friend #16:Orange
Please enter the name of friend #17:These
Please enter the name of friend #18:you are
Please enter the name of friend #19:whatever a moon
Please enter the name of friend #20:has always
Please enter the name of friend #21:meant
Please enter the name of friend #22:oranges
Please enter the name of friend #23:are
Please enter the name of friend #24:I'm going to buy
Please enter the name of friend #25:a bunch of oranges
Please enter the name of friend #26:and then I'm going to squeeze them
Please enter the name of friend #27:I'm going to buy a bag of oranges, and then I'm going to squeeze them.
Please enter the name of friend #28:that's my business Idea
Please enter the name of friend #29:what do you
Please enter the name of friend #30:think?
The Data is saved to the file C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfiledemoautomaticallycreatedfile.txt




This file does not exist yet, I want to see if this program will automatically create it C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfiledemoautomaticallycreatedfile.txt

Please enter the file name where you would like to store the data: C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfiledemo.txt

Please enter the file name where you would like to store the data: C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfiledemo.txt

How many friends do you have?5
Please enter the file name where you would like to store the data: C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfildemo.txt
Please enter the name of friend #1:Fragola
Please enter the name of friend #2:fragolieee
Please enter the name of friend #3:fragonardee
Please enter the name of friend #4:fraswhaa
Please enter the name of friend #5:fransolina
The Data is saved to the file C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfildemo.txt





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