package edu.unlv.mis768; // Book
// package edu;


import java.io.*;
import java.util.Scanner;

public class ImprovedBookDataFormatter {

	public static void main(String[] args) throws IOException {

		Scanner keyboard = new Scanner(System.in);
		
		// Prompt the user to enter the input file name
		System.out.print("Please enter the name of the input file: ");
		// Get the input from the keyboard and store the String in inputFileName
		String inputFileName = keyboard.nextLine();
		
		// generate the output file name
		String outputFileName = generateOutputFileName(inputFileName);

		// A file object is created with the inputFileName specified by the user
	    File file = new File(inputFileName);
	    // A Scanner object for getting input from the file
		Scanner inputFile = new Scanner(file);
		// A PrintWriter object for writing output to a file, created with outputFileName 
		

		PrintWriter outputFile = new PrintWriter(outputFileName);
		
		keyboard.close();
		

		// read the first line // "For instance, Ransbotham, Kiron, Gerbert, // 		ecosystem). 
		String line = inputFile.nextLine();

		// while loop that runs until the program reaches the end of the input file
		// the </catalog> tag specifies the end of the xml file.

		// while it is not the end of the file
		while (!line.equals("</catalog>")) {

			// the the line contains the beginning of the book record
			if(line.contains("<book ")){

				// create a book object
				ImprovedBook aBook = new ImprovedBook(); 
				
				// find the position of the quotation mark (") that indicates the beginning of the book id
				int startPosition = line.indexOf("\"")+1; // \ is an escape character that allows you to use an actual character
				// find the position of the quotation mark (") that indicates the end of the book id
				int endPosition = line.lastIndexOf("\"");
				// use the substring method to retrieve the book id
				String content =line.substring(startPosition, endPosition);
				// the the book id
				aBook.setId(content);
				
				// read the next line
				line = inputFile.nextLine();
				
				// the </book> tag specifies the end of a book record
				// while it is not the end of a book record
				while (!line.contains("</book>")){
					
					
					startPosition =line.indexOf(">")+1;
					//find the position of < the indicates the beginning of the data field
					endPosition = line.lastIndexOf("<");
					// use the substring method to retrieve the content of the data field 
					content =line.substring(startPosition, endPosition);
					
					// if the tag says <author>
					if(line.contains("<author>"))
						// the content of the data field is set to the author field
						aBook.setAuthor(content);
					// if the tag says <title>
					else if(line.contains("<title>"))
						// the content of the data field is set to the title field
						aBook.setTitle(content);
					// if the tag says <genre>
					else if(line.contains("<genre>"))
						// the content of the data field is set to the genre field
						aBook.setGenre(content); 
					// if the tag says <price>
					else if(line.contains("<price>"))
						// the content of the data field is set to the price field
						 aBook.setPrice(Double.parseDouble(content)); // to set the process
					

					line=inputFile.nextLine();
				}

				outputFile.println(aBook);
				
				

			
			
			
			}
			

			line = inputFile.nextLine();

			
	}

		inputFile.close();

		outputFile.close();
	}


	private static String generateOutputFileName(String inputFileName) {
		String filename; 
		int index = inputFileName.indexOf(".");
		

		filename = inputFileName.substring(0, index+1)+"csv";

		
		return filename;
	}

}








// substring the file name, but add the file extension as csv
// index, // filename = inputFileName.substring(0,index, index+1)+"csv";
/*
Multiple markers at this line
- The method substring(int, int) in the type String is not applicable for the arguments (int, int, int)
- The method substring(int, int) in the type String is not applicable for the arguments (int, int, int)
*/










