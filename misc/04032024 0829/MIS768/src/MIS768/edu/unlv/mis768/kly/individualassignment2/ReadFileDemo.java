package edu.unlv.mis768.kly.individualassignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileDemo {

	public static void main(String[] args) throws IOException, FileNotFoundException {   // Replaced with throws of both exceptions // throws IOException  {
		// Create a Scanner object for keyboard input.
	      Scanner keyboard = new Scanner(System.in);
	      String line;

	      // Get the file name.
	      System.out.print("Enter the name of a file: ");
	      String fileName = keyboard.nextLine();

	      // Open the file.
	      File file = new File(fileName); 										// an error will pop up, and the solution is to select the java import
	      Scanner inputFile = new Scanner(file);
	      
	      
	      																		// Display the line.
	      System.out.println("The names in the file is:");
	      
	      while(inputFile.hasNext()) {
	    	  
		      																	 // Read the first line from the file.
		      line = inputFile.nextLine();
		      System.out.println(line);
	    	  
	      }

	      

  		  								// This is the name of the file I'm using //   C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfildemo.txt
	      
	      								// Close the file.
	      inputFile.close();
	      keyboard.close();  			// kb.close();
	}
}






// here it is, the file that i was looking for.
/*

Detecting the End of a File

The scanner class's has next() method
will return true if another item can be read from the file

open the file
File file = new File(filename);
Scanner inutFile = new Scanner(file);
// read until the end of the file
while (inputFile.hasNext(){
String str = inputFile.nextLine();
System.out.println(str);



Enter the name of a file: C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfildemo.txt
The names in the file is:
Sharlika
sharliponi
Tarantula
Doogie
Elephant
Toucan
Pig
Appendia
Appendio
appendiala
apendila dicshonario
appendia theosauriseena
appendia referencia
appendio blormeesa
appendeema bloggienemo
apendorglimorna blorgarlika
aplorika blorglika
Shorna
Shorneena
Shorliga
shorlaga
Shorlaika



Enter the name of a file: C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfildemo.txt
The names in the file is:
Sharlika
sharliponi
Tarantula
Doogie
Elephant
Toucan
Pig
Appendia
Appendio
appendiala
apendila dicshonario
appendia theosauriseena
appendia referencia
appendio blormeesa
appendeema bloggienemo
apendorglimorna blorgarlika
aplorika blorglika
Shorna
Shorneena
Shorliga
shorlaga
Shorlaika



How many friends do you have?5
Please enter the file name where you would like to store the data: C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfildemo.txt
Please enter the name of friend #1: Shorna
Please enter the name of friend #2:Shorneena
Please enter the name of friend #3:Shorliga
Please enter the name of friend #4:shorlaga
Please enter the name of friend #5:Shorlaika
The Data is saved to the file C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfildemo.txt




C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfildemo.txt

Enter the name of a file: C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfildemo.txt
The names in the file is:
 Sharlika
 sharliponi
Tarantula
Doogie
Elephant
Toucan
Pig
 Appendia
Appendio
appendiala
apendila dicshonario
appendia theosauriseena
appendia referencia
appendio blormeesa
appendeema bloggienemo
apendorglimorna blorgarlika
aplorika blorglika


//   C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfildemo.txt
only the first name in the file will print until a while
loop is created

File file = new File(filename);
Scanner inputFile = new Scanner(file);
// Read until the end of the file.
while (inputFile.hasNext()) {
String str = inputFile.nextLine();
System.out.println(str);
}
inputFile.close;// close the file when done.


//open the file.
File file = new File ("Names.txt");
Scanner inputFile = new Scanner(file;
// Read a line from the file
String str = inputFile.nextLine();
// Close the File.

inputFile.close();

Once an instance of Scanner is created, data can be
read using the same methods that you have used to
read keyboard input (nextLine, nextInt, nextDouble, etc).

Scanner keyboard = new Scanner(System.in);
System.out.print("Enter the filename: ");
String filename = keyboard.nextLine();
File file = new File(filename;
Scanner inputFile = new Scanner(file);

File myFile = new File ("Customers.txt");
Scanner inputFile = new Scanner(myFile;

*/