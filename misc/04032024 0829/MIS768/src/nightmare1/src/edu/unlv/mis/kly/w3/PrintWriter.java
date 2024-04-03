package edu.unlv.mis.kly.w3;

public class PrintWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*



Handling Exceptions

to insert a throws class 

PrintWriter objects can throw an IOException

public static void main (String[] args) throws
IOException

on a windows computer, paths contain backslash characters.

if the backslash is used in a string literal,
it is the escape character so you must use two of them:

PrintWriter outFile = 
new PrintWriter ("D:\\PriceList.txt")



to use the PrintWriter class, put the following
import statement at the top of the source file:

import java.io.*;

PrintWriter outputFile = new PrintWriter ("Names.txt")
outputFile.println ("Chris");
outputFile.println ("Kathryn");
outputFile.println ("Jean");
outputFile.close();


PrintWriter outputFile = new PrintWriter ("StudentData.txt")
//  PrintWriter outputFile = new PrintWriter ("StudentData.txt");
//  C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text
*/
/*

import java.io.*;

PrintWriter outputFile = new PrintWriter ("Names.txt");
outputFile.println("Chris");
outputFile.println("Kathryn");
outputFile.println("Jean");
outputFile.close();

must use two backslash characters

PrintWriter outFile =
new PrintWriter("D:\\PriceList.txt");

handle exceptions

public static void main (String[] args) throws IOException

*/ 
