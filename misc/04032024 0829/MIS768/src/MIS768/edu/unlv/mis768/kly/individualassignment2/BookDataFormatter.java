package edu.unlv.mis768.kly.individualassignment2;

import java.io.*;
import java.util.Scanner;

public class BookDataFormatter {

	public static void main(String[] args) throws IOException {

		// A Scanner object for getting input from the keyboard
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
		//   specified by the user
		PrintWriter outputFile = new PrintWriter(outputFileName);
		
		keyboard.close();
		

		// read the first line
		String line = inputFile.nextLine();

		// while loop that runs until the program reaches the end of the input file
		// the </catalog> tag specifies the end of the xml file.

		// while it is not the end of the file
		while (!line.equals("</catalog>")) {

			// the the line contains the beginning of the book record
			if(line.contains("<book ")){

				// create a book object
				Book aBook = new Book();
				
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
					
					//find the position of > the indicates the beginning of the data field
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
					
					// read the next line
					line=inputFile.nextLine();
				}
				// write the content of the Book object
				outputFile.print(aBook.getId());
				outputFile.print(",");
				outputFile.print(aBook.getAuthor());
				outputFile.print(",");
				outputFile.print(aBook.getTitle());
				outputFile.print(",");
				outputFile.print(aBook.getGenre());
				outputFile.print(",");
				outputFile.print(aBook.getPrice());
				outputFile.print("\n");
			}
			
			// read the next line // booktest.xml
			/*
			
			i couldn't see the csv folder that was being created, it was being filtered out
			so i removed all filters, and now I see everything. 
			
			D:\GitHub\MIS76810032024Sprg\src\MIS768\booktest.csv 
																	// for whatever reason this doesn't seem to be showing up in my eclipse like in the video. in the class.
																    // https://unlv.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=c65b75ac-c935-4946-bc8d-b117002f504a&start=0
			
			Please enter the name of the input file: booktest.xml
			Exception in thread "main" java.io.FileNotFoundException: booktest.xml (The system cannot find the file specified)
				at java.base/java.io.FileInputStream.open0(Native Method)
				at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
				at java.base/java.io.FileInputStream.<init>(FileInputStream.java:152)
				at java.base/java.util.Scanner.<init>(Scanner.java:645)
				at edu.unlv.mis768.kly.individualassignment2.BookDataFormatter.main(BookDataFormatter.java:24)
			
			*/
			line = inputFile.nextLine();

			
	}
		// close the input file
		inputFile.close();
		// close the ouput file
		outputFile.close();
	}

	/**
	 * This method receives a file name, take the file extension out and 
	 * add csv as the file extension
	 * @param inputFileName 
	 * @return outputFileName with csv file extension
	 */
	private static String generateOutputFileName(String inputFileName) {
		String filename; // the resulting filename
		
		// find the position of period "."
		int index = inputFileName.indexOf(".");
		
		// substring the file name, but add the file extension as csv
		filename = inputFileName.substring(0, index+1)+"csv"; // index, // filename = inputFileName.substring(0,index, index+1)+"csv";
		/*
					Multiple markers at this line
					- The method substring(int, int) in the type String is not applicable for the arguments (int, int, int)
					- The method substring(int, int) in the type String is not applicable for the arguments (int, int, int)
		*/
		
		return filename;
	}

}

// int index = inputFileName.indexof(".");
// filename = inputFile.substring(0,index, index+1)+"csv";
