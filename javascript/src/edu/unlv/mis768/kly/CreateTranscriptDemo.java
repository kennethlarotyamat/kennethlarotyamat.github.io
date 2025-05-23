// /*		
// 		Author's Name: 		    	Kenneth Larot Yamat

//      	Purpose of Program:			To create a student transcript file that includes courses
//      								taken, with corresponding credit hour, letter grade, and 
//      								grade point values for each course taken, and a grade point average
//      								calculated and printed at the end of the file                          		
     						    	 
//   		Date Due:					February 18th, 2024
// */

// package edu.unlv.mis768.kly.individualassignment2;

// import java.util.Scanner;
// import java.util.ArrayList;
// import java.text.DecimalFormat;
// import java.io.*;







// public class CreateTranscriptDemo {

	

// 	private static int courseHours;
// 	private static String letterGrade;
// 	private static String courseNumber;
//     private static PrintWriter writer;				// i'm pretty sure i actually did use this // variable not used warning //  // resource leak // i finally have this finished and i'm 9 minutes away. i can't risk changing the code to closing it.
//     private static String fileName;


// 	public static void main(String[] args)  throws IOException {
		
// 		char yesOrNoEntry;
// 		int entryNumber = 1;
// 		String enterCourseNo = courseNumber;
// 		int enterCourseHr = courseHours;
// 		String enterLetterGr = letterGrade;
		
// 		Scanner keyboard = new Scanner(System.in); // where user input is made //  // resource leak // i finally have this finished and i'm 9 minutes away. i can't risk changing the code to closing it.
		
// 		ArrayList<String> courseNumberArray = new ArrayList<String>(); // array holding course section number
// 		ArrayList<Integer> courseHoursArray = new ArrayList<Integer>(); // array holding course credit unit hours value
// 		ArrayList<String> letterGradeArray = new ArrayList<String>(); //  // array holding student letter grade for a given course
// 		ArrayList<Double> numberGradeArray = new ArrayList<Double>();//  // array holding a students letter grade represented numerically
// 		ArrayList<Double> pointScaleTimesCreditHoursArray = new ArrayList<Double>(); //  // array holding a mathematical calculation basically credit unit hours times point scale

// 		do {

// 			System.out.print("Enter a course number for entry # "+entryNumber+": "); 
// 			String courseNumber = keyboard.nextLine();
// 			courseNumberArray.add(courseNumber); // enters course number
			
// 			System.out.print("Enter credit hours for entry # "+entryNumber+": "); 
// 			int courseHours = keyboard.nextInt();
// 			keyboard.nextLine();
// 			courseHoursArray.add(courseHours);  // enters course credit hours
			
// 			System.out.print("Enter letter grade earned for entry # "+entryNumber+": "); 
// 			String letterGrade = keyboard.nextLine();
// 			letterGradeArray.add(letterGrade);   // enters course letter grade



// 			CreateTranscript transcript = new CreateTranscript(courseNumber, courseHours, letterGrade);
// 			transcript.setLetterGrade(letterGrade);
// 			numberGradeArray.add(transcript.getNumberGrade()); // letter grade converted to numerical value and added to array 
// 			double pointScale = transcript.getNumberGrade();
// 			pointScaleTimesCreditHoursArray.add(pointScale * courseHours); // preliminary calculation for GPA based on credit unit hours
			



			
// 			entryNumber++; 
// 			System.out.print("Do you have additional course details to enter? (Y/N): "); // where additional courses are added
// 			yesOrNoEntry = keyboard.next().charAt(0);
// 			keyboard.nextLine();
// 		} while (yesOrNoEntry == 'y' || yesOrNoEntry == 'Y'); 
		
// do {
// //		System.out.println(courseNumberArray);			// this was for testing it can be reactivated if more testing is needed
// //		System.out.println(courseHoursArray);
// //		System.out.println(letterGradeArray);
// //		System.out.println(numberGradeArray);
		
		

// 		CreateTranscript transcript = new CreateTranscript(enterCourseNo, enterCourseHr, enterLetterGr);
// 		double gradePoAv = transcript.getGradePointAverage(pointScaleTimesCreditHoursArray, courseHoursArray);
// 		DecimalFormat formatDouble = new DecimalFormat("0.00");
//         System.out.println("Grade Point Average: " + formatDouble.format(gradePoAv) );
        
//         System.out.print("Would you like to printout of your transcript? (Y/N): "); // where a user can ask for a print out
// 		yesOrNoEntry = keyboard.next().charAt(0);
// 		keyboard.nextLine();
// 		if (yesOrNoEntry == 'y' || yesOrNoEntry == 'Y') {  									// user input for if they want a print out
// 		    System.out.print("Please enter the file name where you would like to print your transcript: ");
// 		    fileName = keyboard.nextLine();				// where a user enters a file name
// 		    FileWriter fw = new FileWriter(fileName, true);
// 		    PrintWriter writer = new PrintWriter(fw);

// 		    int maxSize = Math.max(Math.max(courseNumberArray.size(), courseHoursArray.size()),
// 		            Math.max(letterGradeArray.size(), numberGradeArray.size()));
// 		    writer.println("Course Number\tCredit Hours\tLetter Grade\tNumber Grade");
// 		    for (int i = 0; i < maxSize; i++) {
// 		        writer.print((i < courseNumberArray.size()) ? courseNumberArray.get(i) : "");
// 		        writer.print("\t\t\t\t");
// 		        writer.print((i < courseHoursArray.size()) ? courseHoursArray.get(i) : "");
// 		        writer.print("\t\t\t\t");
// 		        writer.print((i < letterGradeArray.size()) ? letterGradeArray.get(i) : "");
// 		        writer.print("\t\t\t\t");
// 		        writer.println((i < numberGradeArray.size()) ? numberGradeArray.get(i) : "");
// 		    }
// 		    writer.println("Grade Point Average: " + gradePoAv);

// 		    // Close and flush the PrintWriter
// 		    writer.close();
// 		    fw.close();

// 		    System.out.println("Data has been written to " + fileName + " successfully.");
// 		    break; //  so that it stops asking me over and over again if i want a print out.
// 		}


// }  while (yesOrNoEntry == 'y' || yesOrNoEntry == 'Y');

        

        

// 	}

	
// }
// // D:\GitHub\MIS76810032024Sprg\media\text\transcript.txt
// // D:\GitHub\MIS76810032024Sprg\src\nightmare1\src\edu\ unlv\mis\kly\w3\transcript.txt
// //keyboard.close(); 
// /*  // writer = new PrintWriter(f w);

// 			writer = new PrintWriter(new FileWriter(fileName, true);
			
//  = null
// 		if (yesOrNoEntry == 'y' || yesOrNoEntry == 'Y') {
// 			 PrintWriter writer = new PrintWriter(new File("transcript.txt"));

// 	            // Determine the maximum size of any ArrayList
// 	            int maxSize = Math.max(Math.max(courseNumberArray.size(), courseHoursArray.size()),
// 	                                   Math.max(letterGradeArray.size(), numberGradeArray.size()));

// 	            // Write column headers
// 	            writer.println("Course Number\tCredit Hours\tLetter Grade\tNumber Grade");

// 	            // Write data
// 	            for (int i = 0; i < maxSize; i++) {
// 	                writer.print((i < courseNumberArray.size()) ? courseNumberArray.get(i) : "");
// 	                writer.print("\t\t");
// 	                writer.print((i < courseHoursArray.size()) ? courseHoursArray.get(i) : "");
// 	                writer.print("\t\t");
// 	                writer.print((i < letterGradeArray.size()) ? letterGradeArray.get(i) : "");
// 	                writer.print("\t\t");
// 	                writer.println((i < numberGradeArray.size()) ? numberGradeArray.get(i) : "");
	        
// 	    }

// */
// /*
//  * 
//  * 
//  * 
//  * 
//  */
// //	private static PrintWriter writer;	
// 	 // PrintWriter writer = null;
// //              break;      Continue with any other logic you need inside the loop
// // Exit the loop
// //PrintWriter writer = new PrintWriter(new File("transcript.txt")) { 
// //	int maxSize = Math.max(Math.max(courseNumberArray.size(), courseHoursArray.size()),
// //            Math.max(letterGradeArray.size(), numberGradeArray.size()));
// //	writer.println("Course Number\tCredit Hours\tLetter Grade\tNumber Grade");
// //}


// // formatDouble.format(gradePoAv) 
// //CreateTranscript transcript = new CreateTranscript(enterCourseNo, enterCourseHr, enterLetterGr);
// //transcript.setLetterGrade(letterGrade);
// //numberGradeArray.add(transcript.getNumberGrade());
// //double pointScale = transcript.getNumberGrade();
// //pointScaleTimesCreditHoursArray.add(pointScale*enterCourseHr);


// // I don't really even understand math, so I'm going to have to do it this way.
// // new CreateTranscript();
// //		double grPoiAve = transcript.getGradePointAverage(pointScaleTimesCreditHoursArray, courseHoursArray);
// // 			System.out.println("Grade Point Average: " + grPoiAve );
// // ArrayList<Double> pointScaleTimesCreditHoursArray = new ArrayList<Double>(); // I don't really even understand math, so I'm going to have to do it this way.
// // pointScaleTimesCreditHours.add // I'm running out of time 
// // anyway, it looks like the arrays are working // remove when program is finished
// // testing area // it's working
// // testing area // it's working
// //System.out.println(courseNumberArray);
// //System.out.println(courseHoursArray);
// //System.out.println(letterGradeArray);
// //System.out.println(numberGradeArray);

// //These are calculated and not entered, i am removing them  //			String enterNumberGr = null;
// //String enterGrPointAve = null;


// // , enterNumberGr, enterGrPointAve
// //String courseHoursString = keyboard.nextLine();
// //int courseHours = Integer.parseInt(courseHoursString);
// // i selected the option to create a field, but i decided to create a local variable instead // private static String enterCourseNo;

// // 
// //	CreateTranscript transcript = new CreateTranscript(enterCourseNo, enterCourseHr, enterLetterGr, enterNumberGr, entherGrPointAve); 
// // String courseNo, String courseHr, String letterGr, String numberGr, String grPointAve 		
// //			TestScore examPrintout = new TestScore(enterQuestionQty, enterQuestionMissedQty);
// //
// //Double calculateQuestionValue = examPrintout.getPointsEach();
// //Double calculateExamScore = examPrintout.getScore();
// // (int i = 0; i < 2; i++)
// // 		https://unlv.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=44972106-8d10-4e61-af3d-accc0170d18e&start=0
// //		ArrayList<Double> sequenceOfScores = new ArrayList<Double>();
// //		ArrayList<Double> questionValueArray = new ArrayList<Double>(); 
// // 		so I didn't really use two different arrays in the TestScoreDemo, 
// //		I set it up just to remove the warning, but i didn't use the questionValueArray
// //		private String courseNumber;

// //		private int courseHours;

// //		private String letterGrade;
// //		private double numberGrade;
// // ArrayList<String> expenseDescriptionArray = new ArrayList<String>();
// //ArrayList<String> courseNumberArray = new ArrayList<String>();	//		private String courseNumber;
// //ArrayList<int> courseHoursArray = new ArrayList<String>();	//		private int courseHours;
// //ArrayList<String> letterGradeArray = new ArrayList<String>();	//		private String letterGrade;
// //ArrayList<double> numberGradeArray = new ArrayList<String>();	//		private double numberGrade;
// //import java.text.DecimalFormat; // I don't think that I'll need this on the Demo file
// // as of 5 PM, I've managed to declare the authors name, the purpose of the program, and the due date

// //You can choose to use the object-oriented or procedural approach in this assignment.

// /*
//  * 
// given a tiered marginal income tax structure
// based on a user-entered amount of taxable income
// To calculate the amount of tax due
// , the credit hour value of 

//  * 
//  */
// //Author’s name
// //		Please provide proper comments to document your code, including the following:
// //		Author’s name
// //		Purpose of the program
// //		In-line comments for the statements, including the variable/constant declaration and initialization
// //		Please submit the .java file(s) that contains the program for solving the following question.
// //		You can choose to use the object-oriented or procedural approach in this assignment.
// // 		import javax.swing.JOptionPane;
// //		import java.util.Random;
// //		import java.io.FileNotFoundException;
// //		import java.io.IOException;
// //		import java.io.File;
// //
// //		import java.util.Scanner;
// //		import java.io.PrintWriter;
// //		import java.io.*; // this is an alternative, which includes IOException and PrintWriter
// //		import java.util.Scanner;
// //		TO DO Auto-generated method stub
// /* 

// > git push origin main:main
// error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
// send-pack: unexpected disconnect while reading sideband packet
// fatal: the remote end hung up unexpectedly
// Everything up-to-date

// > git push origin main:main
// error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
// send-pack: unexpected disconnect while reading sideband packet
// fatal: the remote end hung up unexpectedly
// Everything up-to-date

//  */

//  /*

// 2024-02-21 03:03:09.680 [info] Log level: Info
// 2024-02-21 03:03:09.680 [info] Validating found git in: "C:\Program Files\Git\cmd\git.exe"
// 2024-02-21 03:03:10.091 [info] Using git "2.42.0.windows.1" from "C:\Program Files\Git\cmd\git.exe"
// 2024-02-21 03:03:10.227 [info] > git rev-parse --show-toplevel [123ms]
// 2024-02-21 03:03:10.227 [info] fatal: not a git repository (or any of the parent directories): .git
// 2024-02-21 03:03:10.333 [info] > git rev-parse --show-toplevel [102ms]
// 2024-02-21 03:03:10.333 [info] fatal: not a git repository (or any of the parent directories): .git
// 2024-02-21 03:03:10.641 [info] > git rev-parse --show-toplevel [304ms]
// 2024-02-21 03:03:10.754 [info] > git rev-parse --git-dir --git-common-dir [100ms]
// 2024-02-21 03:03:10.765 [info] Open repository: d:\GitHub\kennethlarotyamat.github.io
// 2024-02-21 03:03:10.946 [info] > git config --get commit.template [158ms]
// 2024-02-21 03:03:11.004 [info] > git rev-parse --show-toplevel [186ms]
// 2024-02-21 03:03:11.210 [info] > git rev-parse --git-dir --git-common-dir [201ms]
// 2024-02-21 03:03:11.221 [info] Open repository: d:\GitHub\MIS76810032024Sprg
// 2024-02-21 03:03:11.769 [info] > git config --get commit.template [538ms]
// 2024-02-21 03:03:11.772 [info] > git rev-parse --show-toplevel [531ms]
// 2024-02-21 03:03:11.895 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [1066ms]
// 2024-02-21 03:03:12.405 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [1117ms]
// 2024-02-21 03:03:12.536 [info] > git rev-parse --git-dir --git-common-dir [747ms]
// 2024-02-21 03:03:12.552 [info] Open repository: d:\GitHub\miscellaneous
// 2024-02-21 03:03:12.671 [info] > git config --get commit.template [111ms]
// 2024-02-21 03:03:12.786 [info] > git check-ignore -v -z --stdin [972ms]
// 2024-02-21 03:03:13.046 [info] > git rev-parse --show-toplevel [480ms]
// 2024-02-21 03:03:13.064 [info] > git check-ignore -v -z --stdin [1263ms]
// 2024-02-21 03:03:13.173 [info] > git rev-parse --git-dir --git-common-dir [119ms]
// 2024-02-21 03:03:13.175 [info] Open repository: d:\GitHub\project15
// 2024-02-21 03:03:13.295 [info] > git status -z -uall [1370ms]
// 2024-02-21 03:03:13.341 [info] > git config --get commit.template [159ms]
// 2024-02-21 03:03:13.353 [info] > git rev-parse --show-toplevel [161ms]
// 2024-02-21 03:03:13.433 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [114ms]
// 2024-02-21 03:03:13.433 [info] > git config --get commit.template [120ms]
// 2024-02-21 03:03:13.518 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [947ms]
// 2024-02-21 03:03:13.518 [info] > git merge-base refs/heads/main refs/remotes/origin/main [147ms]
// 2024-02-21 03:03:13.526 [info] > git rev-parse --git-dir --git-common-dir [166ms]
// 2024-02-21 03:03:13.534 [info] Open repository: d:\GitHub\project16
// 2024-02-21 03:03:13.611 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [412ms]
// 2024-02-21 03:03:13.678 [info] > git config --get commit.template [129ms]
// 2024-02-21 03:03:13.698 [info] > git rev-parse --show-toplevel [143ms]
// 2024-02-21 03:03:13.698 [info] fatal: not a git repository (or any of the parent directories): .git
// 2024-02-21 03:03:14.025 [info] > git status -z -uall [446ms]
// 2024-02-21 03:03:14.062 [info] > git rev-parse --show-toplevel [361ms]
// 2024-02-21 03:03:14.062 [info] fatal: not a git repository (or any of the parent directories): .git
// 2024-02-21 03:03:14.119 [info] > git rev-parse --show-toplevel [52ms]
// 2024-02-21 03:03:14.119 [info] fatal: not a git repository (or any of the parent directories): .git
// 2024-02-21 03:03:14.195 [info] > git status -z -uall [609ms]
// 2024-02-21 03:03:14.200 [info] > git rev-parse --show-toplevel [68ms]
// 2024-02-21 03:03:14.200 [info] fatal: not a git repository (or any of the parent directories): .git
// 2024-02-21 03:03:14.265 [info] > git status -z -uall [615ms]
// 2024-02-21 03:03:14.538 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [1012ms]
// 2024-02-21 03:03:14.557 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [948ms]
// 2024-02-21 03:03:14.588 [info] > git rev-parse --show-toplevel [369ms]
// 2024-02-21 03:03:14.588 [info] fatal: not a git repository (or any of the parent directories): .git
// 2024-02-21 03:03:14.588 [info] > git config --get commit.template [377ms]
// 2024-02-21 03:03:14.613 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [389ms]
// 2024-02-21 03:03:14.658 [info] > git merge-base refs/heads/main refs/remotes/origin/main [102ms]
// 2024-02-21 03:03:14.671 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [199ms]
// 2024-02-21 03:03:14.686 [info] > git config --get commit.template [221ms]
// 2024-02-21 03:03:14.743 [info] > git status -z -uall [122ms]
// 2024-02-21 03:03:14.849 [info] > git status -z -uall [160ms]
// 2024-02-21 03:03:14.893 [info] > git status -z -uall [306ms]
// 2024-02-21 03:03:14.963 [info] > git config --get commit.template [62ms]
// 2024-02-21 03:03:14.970 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [56ms]
// 2024-02-21 03:03:15.037 [info] > git status -z -uall [57ms]
// 2024-02-21 03:03:15.062 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [398ms]
// 2024-02-21 03:03:15.424 [info] > git merge-base refs/heads/main refs/remotes/origin/main [62ms]
// 2024-02-21 03:03:15.429 [info] > git merge-base refs/heads/main refs/remotes/origin/main [62ms]
// 2024-02-21 03:03:15.671 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [239ms]
// 2024-02-21 03:03:15.672 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [244ms]
// 2024-02-21 03:03:15.731 [info] > git check-ignore -v -z --stdin [73ms]
// 2024-02-21 03:03:15.809 [info] > git status -z -uall [3281ms]
// 2024-02-21 03:03:15.904 [info] > git config --get commit.template [82ms]
// 2024-02-21 03:03:15.914 [info] > git merge-base refs/heads/main refs/remotes/origin/main [87ms]
// 2024-02-21 03:03:15.928 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [82ms]
// 2024-02-21 03:03:16.027 [info] > git status -z -uall [93ms]
// 2024-02-21 03:03:16.113 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [187ms]
// 2024-02-21 03:03:16.622 [info] > git config --get commit.template [89ms]
// 2024-02-21 03:03:16.630 [info] > git config --get commit.template [100ms]
// 2024-02-21 03:03:16.643 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [105ms]
// 2024-02-21 03:03:16.643 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [93ms]
// 2024-02-21 03:03:16.750 [info] > git status -z -uall [97ms]
// 2024-02-21 03:03:16.787 [info] > git status -z -uall [138ms]
// 2024-02-21 03:03:16.812 [info] > git check-ignore -v -z --stdin [93ms]
// 2024-02-21 03:03:16.817 [info] > git check-ignore -v -z --stdin [107ms]
// 2024-02-21 03:03:29.419 [info] > git rev-parse --show-toplevel [79ms]
// 2024-02-21 03:03:29.419 [info] fatal: not a git repository (or any of the parent directories): .git
// 2024-02-21 03:03:29.962 [info] > git add -A -- . [6738ms]
// 2024-02-21 03:03:36.062 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [8043ms]
// 2024-02-21 03:03:36.132 [info] > git config --get commit.template [66ms]
// 2024-02-21 03:03:36.201 [info] > git config --get commit.template [56ms]
// 2024-02-21 03:03:36.212 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [65ms]
// 2024-02-21 03:03:36.281 [info] > git status -z -uall [67ms]
// 2024-02-21 03:03:36.400 [info] > git merge-base refs/heads/main refs/remotes/origin/main [83ms]
// 2024-02-21 03:03:36.481 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [77ms]
// 2024-02-21 03:03:37.427 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [7455ms]
// 2024-02-21 03:03:37.512 [info] > git config --get commit.template [69ms]
// 2024-02-21 03:03:37.596 [info] > git config --get commit.template [81ms]
// 2024-02-21 03:03:37.603 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [76ms]
// 2024-02-21 03:03:37.688 [info] > git status -z -uall [77ms]
// 2024-02-21 03:03:37.825 [info] > git merge-base refs/heads/main refs/remotes/origin/main [89ms]
// 2024-02-21 03:03:37.902 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [72ms]
// 2024-02-21 03:03:38.411 [info] > git add -A -- . [5976ms]
// 2024-02-21 03:03:39.022 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [605ms]
// 2024-02-21 03:03:39.096 [info] > git config --get commit.template [70ms]
// 2024-02-21 03:03:39.151 [info] > git config --get commit.template [49ms]
// 2024-02-21 03:03:39.158 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [51ms]
// 2024-02-21 03:03:39.212 [info] > git status -z -uall [50ms]
// 2024-02-21 03:03:39.365 [info] > git push origin main:main [3066ms]
// 2024-02-21 03:03:39.365 [info] To https://github.com/kennethlarotyamat/MIS76810032024Sprg.git
//    447d59a..66adf12  main -> main
// 2024-02-21 03:03:39.372 [info] > git merge-base refs/heads/main refs/remotes/origin/main [110ms]
// 2024-02-21 03:03:39.525 [info] > git config --get commit.template [153ms]
// 2024-02-21 03:03:39.541 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [154ms]
// 2024-02-21 03:03:39.543 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [164ms]
// 2024-02-21 03:03:39.668 [info] > git status -z -uall [121ms]
// 2024-02-21 03:03:39.832 [info] > git merge-base refs/heads/main refs/remotes/origin/main [133ms]
// 2024-02-21 03:03:39.845 [info] > git config --get commit.template [123ms]
// 2024-02-21 03:03:39.860 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [134ms]
// 2024-02-21 03:03:39.945 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [108ms]
// 2024-02-21 03:03:39.980 [info] > git status -z -uall [114ms]
// 2024-02-21 03:04:15.758 [info] > git add -A -- . [680ms]
// 2024-02-21 03:04:15.758 [info] warning: in the working copy of 'src/MIS768/edu/unlv/mis768/kly/indiv/.gitignore', LF will be replaced by CRLF the next time Git touches it
// 2024-02-21 03:04:16.199 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [439ms]
// 2024-02-21 03:04:16.247 [info] > git config --get commit.template [44ms]
// 2024-02-21 03:04:16.324 [info] > git config --get commit.template [68ms]
// 2024-02-21 03:04:16.327 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [64ms]
// 2024-02-21 03:04:16.406 [info] > git status -z -uall [68ms]
// 2024-02-21 03:04:16.531 [info] > git merge-base refs/heads/main refs/remotes/origin/main [90ms]
// 2024-02-21 03:04:16.587 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [44ms]
// 2024-02-21 03:04:18.436 [info] > git push origin main:main [2016ms]
// 2024-02-21 03:04:18.436 [info] To https://github.com/kennethlarotyamat/MIS76810032024Sprg.git
//    66adf12..59290ab  main -> main
// 2024-02-21 03:04:18.517 [info] > git config --get commit.template [79ms]
// 2024-02-21 03:04:18.521 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [80ms]
// 2024-02-21 03:04:18.606 [info] > git status -z -uall [79ms]
// 2024-02-21 03:04:18.707 [info] > git merge-base refs/heads/main refs/remotes/origin/main [91ms]
// 2024-02-21 03:04:18.742 [info] > git config --get commit.template [88ms]
// 2024-02-21 03:04:18.757 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [94ms]
// 2024-02-21 03:04:18.790 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [78ms]
// 2024-02-21 03:04:18.848 [info] > git status -z -uall [85ms]
// 2024-02-21 03:11:24.574 [info] > git config --get commit.template [55ms]
// 2024-02-21 03:11:24.576 [info] > git config --get commit.template [54ms]
// 2024-02-21 03:11:24.576 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [51ms]
// 2024-02-21 03:11:24.580 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [53ms]
// 2024-02-21 03:11:24.612 [info] > git status -z -uall [34ms]
// 2024-02-21 03:11:24.623 [info] > git status -z -uall [38ms]
// 2024-02-21 03:11:25.289 [info] > git check-ignore -v -z --stdin [27ms]
// 2024-02-21 03:11:25.290 [info] > git check-ignore -v -z --stdin [27ms]
// 2024-02-21 03:11:29.658 [info] > git config --get commit.template [31ms]
// 2024-02-21 03:11:29.661 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [31ms]
// 2024-02-21 03:11:29.691 [info] > git status -z -uall [27ms]
// 2024-02-21 03:11:30.880 [info] > git add -A -- . [1649ms]
// 2024-02-21 03:11:31.178 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [295ms]
// 2024-02-21 03:11:31.204 [info] > git config --get commit.template [24ms]
// 2024-02-21 03:11:31.234 [info] > git config --get commit.template [28ms]
// 2024-02-21 03:11:31.236 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 03:11:31.271 [info] > git status -z -uall [33ms]
// 2024-02-21 03:11:31.319 [info] > git merge-base refs/heads/main refs/remotes/origin/main [33ms]
// 2024-02-21 03:11:31.352 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [30ms]
// 2024-02-21 03:11:36.797 [info] > git add -A -- . [4350ms]
// 2024-02-21 03:11:37.078 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [278ms]
// 2024-02-21 03:11:37.103 [info] > git config --get commit.template [23ms]
// 2024-02-21 03:11:37.132 [info] > git config --get commit.template [27ms]
// 2024-02-21 03:11:37.135 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 03:11:37.162 [info] > git status -z -uall [25ms]
// 2024-02-21 03:11:37.224 [info] > git merge-base refs/heads/main refs/remotes/origin/main [30ms]
// 2024-02-21 03:11:37.251 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [24ms]
// 2024-02-21 03:19:24.552 [info] > git push origin main:main [473274ms]
// 2024-02-21 03:19:24.552 [info] To https://github.com/kennethlarotyamat/miscellaneous.git
//    67f7983..9058e43  main -> main
// 2024-02-21 03:19:24.581 [info] > git config --get commit.template [26ms]
// 2024-02-21 03:19:24.582 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
// 2024-02-21 03:19:24.613 [info] > git status -z -uall [29ms]
// 2024-02-21 03:19:24.646 [info] > git merge-base refs/heads/main refs/remotes/origin/main [29ms]
// 2024-02-21 03:19:24.653 [info] > git config --get commit.template [29ms]
// 2024-02-21 03:19:24.654 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 03:19:24.676 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [27ms]
// 2024-02-21 03:19:24.689 [info] > git status -z -uall [32ms]
// 2024-02-21 03:24:07.480 [info] > git push origin main:main [1228250ms]
// 2024-02-21 03:24:07.480 [info] remote: 
// remote: GitHub found 4 vulnerabilities on kennethlarotyamat/project15's default branch (1 high, 3 moderate). To find out more, visit:        
// remote:      https://github.com/kennethlarotyamat/project15/security/dependabot        
// remote: 
// To https://github.com/kennethlarotyamat/project15.git
//    d54394b..b82007f  main -> main
// 2024-02-21 03:24:07.510 [info] > git config --get commit.template [26ms]
// 2024-02-21 03:24:07.511 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 03:24:07.537 [info] > git status -z -uall [24ms]
// 2024-02-21 03:24:07.571 [info] > git merge-base refs/heads/main refs/remotes/origin/main [29ms]
// 2024-02-21 03:24:07.578 [info] > git config --get commit.template [28ms]
// 2024-02-21 03:24:07.581 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
// 2024-02-21 03:24:07.601 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [27ms]
// 2024-02-21 03:24:07.611 [info] > git status -z -uall [28ms]
// 2024-02-21 03:24:08.801 [info] > git push origin main:main [1231100ms]
// 2024-02-21 03:24:08.801 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
// send-pack: unexpected disconnect while reading sideband packet
// fatal: the remote end hung up unexpectedly
// Everything up-to-date
// 2024-02-21 03:24:08.830 [info] > git config --get commit.template [27ms]
// 2024-02-21 03:24:08.832 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 03:24:08.861 [info] > git status -z -uall [27ms]
// 2024-02-21 03:24:09.029 [info] > git config --get commit.template [34ms]
// 2024-02-21 03:24:09.034 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [37ms]
// 2024-02-21 03:24:09.064 [info] > git status -z -uall [26ms]
// 2024-02-21 03:24:09.556 [info] > git check-ignore -v -z --stdin [28ms]
// 2024-02-21 03:24:14.700 [info] > git config --get commit.template [42ms]
// 2024-02-21 03:24:14.706 [info] > git config --get commit.template [45ms]
// 2024-02-21 03:24:14.707 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [41ms]
// 2024-02-21 03:24:14.711 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [41ms]
// 2024-02-21 03:24:14.753 [info] > git status -z -uall [38ms]
// 2024-02-21 03:24:14.757 [info] > git status -z -uall [47ms]
// 2024-02-21 03:25:59.108 [info] > git config --get commit.template [30ms]
// 2024-02-21 03:25:59.111 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [31ms]
// 2024-02-21 03:25:59.143 [info] > git status -z -uall [29ms]
// 2024-02-21 03:25:59.798 [info] > git check-ignore -v -z --stdin [24ms]
// 2024-02-21 03:26:11.338 [info] > git add -A -- . [1459ms]
// 2024-02-21 03:26:11.544 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [204ms]
// 2024-02-21 03:26:11.569 [info] > git config --get commit.template [23ms]
// 2024-02-21 03:26:11.599 [info] > git config --get commit.template [28ms]
// 2024-02-21 03:26:11.601 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 03:26:11.631 [info] > git status -z -uall [27ms]
// 2024-02-21 03:26:11.674 [info] > git merge-base refs/heads/main refs/remotes/origin/main [30ms]
// 2024-02-21 03:26:11.706 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [30ms]
// 2024-02-21 03:26:17.643 [info] > git check-ignore -v -z --stdin [43ms]
// 2024-02-21 03:26:17.645 [info] > git check-ignore -v -z --stdin [40ms]
// 2024-02-21 03:26:17.646 [info] > git check-ignore -v -z --stdin [43ms]
// 2024-02-21 03:26:17.651 [info] > git check-ignore -v -z --stdin [43ms]
// 2024-02-21 03:26:17.651 [info] > git check-ignore -v -z --stdin [40ms]
// 2024-02-21 03:26:22.715 [info] > git check-ignore -v -z --stdin [26ms]
// 2024-02-21 03:26:24.989 [info] > git check-ignore -v -z --stdin [24ms]
// 2024-02-21 03:26:26.420 [info] > git check-ignore -v -z --stdin [25ms]
// 2024-02-21 03:26:28.054 [info] > git ls-files --stage -- D:\GitHub\project16\index.html [33ms]
// 2024-02-21 03:26:28.157 [info] > git cat-file -s ac24ffcf963501b08dd6b8e882b5d29c31f4cb55 [99ms]
// 2024-02-21 03:26:28.158 [info] > git show --textconv :index.html [142ms]
// 2024-02-21 03:26:40.713 [info] > git check-ignore -v -z --stdin [23ms]
// 2024-02-21 03:26:41.326 [info] > git ls-files --stage -- D:\GitHub\project15\index.html [24ms]
// 2024-02-21 03:26:41.427 [info] > git show --textconv :index.html [128ms]
// 2024-02-21 03:26:41.428 [info] > git cat-file -s 8474ddb3fcc0bee0d368890089173821eb6619a1 [99ms]
// 2024-02-21 03:26:46.231 [info] > git config --get commit.template [26ms]
// 2024-02-21 03:26:46.232 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 03:26:46.257 [info] > git status -z -uall [23ms]
// 2024-02-21 03:26:47.197 [info] > git check-ignore -v -z --stdin [27ms]
// 2024-02-21 03:26:48.456 [info] > git ls-files --stage -- D:\GitHub\miscellaneous\index.html [25ms]
// 2024-02-21 03:26:48.466 [info] > git show --textconv :index.html [37ms]
// 2024-02-21 03:26:48.484 [info] > git cat-file -s 2877edd64405c37bc4ddb15b746d189b5a86656f [26ms]
// 2024-02-21 03:26:52.350 [info] > git config --get commit.template [28ms]
// 2024-02-21 03:26:52.352 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 03:26:52.383 [info] > git status -z -uall [29ms]
// 2024-02-21 03:26:54.353 [info] > git ls-files --stage -- D:\GitHub\MIS76810032024Sprg\index.html [26ms]
// 2024-02-21 03:26:54.439 [info] > git cat-file -s 25d07aba976876b5e5037538bc433f0c2773c2ae [84ms]
// 2024-02-21 03:26:54.439 [info] > git show --textconv :index.html [116ms]
// 2024-02-21 03:27:00.846 [info] > git config --get commit.template [26ms]
// 2024-02-21 03:27:00.847 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [24ms]
// 2024-02-21 03:27:00.875 [info] > git status -z -uall [25ms]
// 2024-02-21 03:27:02.263 [info] > git check-ignore -v -z --stdin [23ms]
// 2024-02-21 03:27:03.215 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\index.html [26ms]
// 2024-02-21 03:27:03.355 [info] > git cat-file -s f8e5fa4325c8503a4690f87a4d31238581376636 [137ms]
// 2024-02-21 03:27:03.356 [info] > git show --textconv :index.html [170ms]
// 2024-02-21 03:27:20.646 [info] > git add -A -- . [48ms]
// 2024-02-21 03:27:20.897 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [249ms]
// 2024-02-21 03:27:20.931 [info] > git config --get commit.template [31ms]
// 2024-02-21 03:27:20.964 [info] > git config --get commit.template [29ms]
// 2024-02-21 03:27:20.966 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
// 2024-02-21 03:27:20.995 [info] > git status -z -uall [26ms]
// 2024-02-21 03:27:21.033 [info] > git merge-base refs/heads/main refs/remotes/origin/main [30ms]
// 2024-02-21 03:27:21.063 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [28ms]
// 2024-02-21 03:27:22.310 [info] > git push origin main:main [1311ms]
// 2024-02-21 03:27:22.310 [info] remote: 
// remote: GitHub found 4 vulnerabilities on kennethlarotyamat/project15's default branch (1 high, 3 moderate). To find out more, visit:        
// remote:      https://github.com/kennethlarotyamat/project15/security/dependabot        
// remote: 
// To https://github.com/kennethlarotyamat/project15.git
//    b82007f..bac9f01  main -> main
// 2024-02-21 03:27:22.342 [info] > git config --get commit.template [29ms]
// 2024-02-21 03:27:22.344 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
// 2024-02-21 03:27:22.371 [info] > git status -z -uall [25ms]
// 2024-02-21 03:27:22.412 [info] > git merge-base refs/heads/main refs/remotes/origin/main [34ms]
// 2024-02-21 03:27:22.415 [info] > git config --get commit.template [32ms]
// 2024-02-21 03:27:22.419 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [35ms]
// 2024-02-21 03:27:22.443 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [28ms]
// 2024-02-21 03:27:22.449 [info] > git status -z -uall [27ms]
// 2024-02-21 03:27:23.312 [info] > git add -A -- . [193ms]
// 2024-02-21 03:27:23.508 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [195ms]
// 2024-02-21 03:27:23.534 [info] > git config --get commit.template [23ms]
// 2024-02-21 03:27:23.566 [info] > git config --get commit.template [28ms]
// 2024-02-21 03:27:23.568 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 03:27:23.603 [info] > git status -z -uall [32ms]
// 2024-02-21 03:27:23.645 [info] > git merge-base refs/heads/main refs/remotes/origin/main [33ms]
// 2024-02-21 03:27:23.677 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [28ms]
// 2024-02-21 03:27:25.074 [info] > git push origin main:main [1465ms]
// 2024-02-21 03:27:25.074 [info] To https://github.com/kennethlarotyamat/miscellaneous.git
//    9058e43..217ea4d  main -> main
// 2024-02-21 03:27:25.112 [info] > git config --get commit.template [35ms]
// 2024-02-21 03:27:25.115 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [35ms]
// 2024-02-21 03:27:25.156 [info] > git status -z -uall [38ms]
// 2024-02-21 03:27:25.192 [info] > git merge-base refs/heads/main refs/remotes/origin/main [32ms]
// 2024-02-21 03:27:25.195 [info] > git config --get commit.template [30ms]
// 2024-02-21 03:27:25.197 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
// 2024-02-21 03:27:25.221 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [27ms]
// 2024-02-21 03:27:25.233 [info] > git status -z -uall [33ms]
// 2024-02-21 03:27:25.714 [info] > git add -A -- . [140ms]
// 2024-02-21 03:27:25.838 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [121ms]
// 2024-02-21 03:27:25.863 [info] > git config --get commit.template [22ms]
// 2024-02-21 03:27:25.894 [info] > git config --get commit.template [29ms]
// 2024-02-21 03:27:25.896 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 03:27:25.925 [info] > git status -z -uall [26ms]
// 2024-02-21 03:27:25.964 [info] > git merge-base refs/heads/main refs/remotes/origin/main [33ms]
// 2024-02-21 03:27:25.998 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [30ms]
// 2024-02-21 03:27:27.219 [info] > git push origin main:main [1290ms]
// 2024-02-21 03:27:27.219 [info] To https://github.com/kennethlarotyamat/MIS76810032024Sprg.git
//    59290ab..e5cee0f  main -> main
// 2024-02-21 03:27:27.248 [info] > git config --get commit.template [26ms]
// 2024-02-21 03:27:27.250 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
// 2024-02-21 03:27:27.279 [info] > git status -z -uall [26ms]
// 2024-02-21 03:27:27.316 [info] > git merge-base refs/heads/main refs/remotes/origin/main [33ms]
// 2024-02-21 03:27:27.335 [info] > git config --get commit.template [36ms]
// 2024-02-21 03:27:27.339 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [35ms]
// 2024-02-21 03:27:27.351 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [32ms]
// 2024-02-21 03:27:27.370 [info] > git status -z -uall [29ms]
// 2024-02-21 03:27:30.930 [info] > git log --format=%H%n%aN%n%aE%n%at%n%ct%n%P%n%D%n%B -z --shortstat --diff-merges=first-parent --author-date-order 0f74f39d9422082c4ddb1f2137ed007921979c60..7e371f03b247c92726b32e43bd6367e7cec363ce [155ms]
// 2024-02-21 03:27:31.084 [info] > git diff --shortstat 0f74f39d9422082c4ddb1f2137ed007921979c60...7e371f03b247c92726b32e43bd6367e7cec363ce [146ms]
// 2024-02-21 03:28:15.969 [info] > git merge-base refs/heads/main refs/remotes/origin/main [26ms]
// 2024-02-21 03:28:15.998 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [26ms]
// 2024-02-21 03:28:23.680 [info] > git merge-base refs/heads/main refs/remotes/origin/main [25ms]
// 2024-02-21 03:28:23.709 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [26ms]
// 2024-02-21 03:28:28.423 [info] > git merge-base refs/heads/main refs/remotes/origin/main [24ms]
// 2024-02-21 03:28:28.450 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [25ms]
// 2024-02-21 03:28:32.817 [info] > git merge-base refs/heads/main refs/remotes/origin/main [26ms]
// 2024-02-21 03:28:32.846 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [26ms]
// 2024-02-21 03:28:39.781 [info] > git ls-files --stage -- D:\GitHub\project15\index.html [25ms]
// 2024-02-21 03:28:39.784 [info] > git show --textconv :index.html [31ms]
// 2024-02-21 03:28:39.811 [info] > git cat-file -s 96a2799305f6644f2545d9825ac1b7f2094c59ff [27ms]
// 2024-02-21 03:28:45.201 [info] > git config --get commit.template [28ms]
// 2024-02-21 03:28:45.202 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 03:28:45.229 [info] > git status -z -uall [25ms]
// 2024-02-21 03:28:49.257 [info] > git add -A -- . [43ms]
// 2024-02-21 03:28:49.463 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [203ms]
// 2024-02-21 03:28:49.488 [info] > git config --get commit.template [23ms]
// 2024-02-21 03:28:49.534 [info] > git config --get commit.template [42ms]
// 2024-02-21 03:28:49.535 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [42ms]
// 2024-02-21 03:28:49.569 [info] > git status -z -uall [32ms]
// 2024-02-21 03:28:49.613 [info] > git merge-base refs/heads/main refs/remotes/origin/main [30ms]
// 2024-02-21 03:28:49.643 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [27ms]
// 2024-02-21 03:28:50.739 [info] > git ls-files --stage -- D:\GitHub\project15\index.html [23ms]
// 2024-02-21 03:28:50.765 [info] > git cat-file -s b1b43291bc46519a619f5b5b0ed789bda07dfeb6 [23ms]
// 2024-02-21 03:28:50.791 [info] > git show --textconv :index.html [24ms]
// 2024-02-21 03:28:50.924 [info] > git push origin main:main [1349ms]
// 2024-02-21 03:28:50.924 [info] remote: 
// remote: GitHub found 4 vulnerabilities on kennethlarotyamat/project15's default branch (1 high, 3 moderate). To find out more, visit:        
// remote:      https://github.com/kennethlarotyamat/project15/security/dependabot        
// remote: 
// To https://github.com/kennethlarotyamat/project15.git
//    bac9f01..124694a  main -> main
// 2024-02-21 03:28:50.952 [info] > git config --get commit.template [26ms]
// 2024-02-21 03:28:50.954 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 03:28:50.981 [info] > git status -z -uall [24ms]
// 2024-02-21 03:28:51.020 [info] > git merge-base refs/heads/main refs/remotes/origin/main [33ms]
// 2024-02-21 03:28:51.030 [info] > git config --get commit.template [34ms]
// 2024-02-21 03:28:51.035 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [35ms]
// 2024-02-21 03:28:51.051 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [29ms]
// 2024-02-21 03:28:51.063 [info] > git status -z -uall [25ms]
// 2024-02-21 03:28:51.096 [info] > git config --get commit.template [28ms]
// 2024-02-21 03:28:51.098 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 03:28:51.125 [info] > git status -z -uall [25ms]
// 2024-02-21 03:28:52.123 [info] > git ls-files --stage -- D:\GitHub\project15\index.html [25ms]
// 2024-02-21 03:28:52.152 [info] > git cat-file -s b1b43291bc46519a619f5b5b0ed789bda07dfeb6 [26ms]
// 2024-02-21 03:28:52.186 [info] > git show --textconv :index.html [26ms]
// 2024-02-21 03:29:04.210 [info] > git ls-files --stage -- D:\GitHub\miscellaneous\index.html [27ms]
// 2024-02-21 03:29:04.214 [info] > git show --textconv :index.html [33ms]
// 2024-02-21 03:29:04.237 [info] > git cat-file -s 2ad28e44da3d7be4c1ac939bf275ccd1e0812a58 [23ms]
// 2024-02-21 03:29:09.286 [info] > git config --get commit.template [27ms]
// 2024-02-21 03:29:09.288 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 03:29:09.320 [info] > git status -z -uall [30ms]
// 2024-02-21 03:29:13.060 [info] > git add -A -- . [119ms]
// 2024-02-21 03:29:13.335 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [273ms]
// 2024-02-21 03:29:13.360 [info] > git config --get commit.template [22ms]
// 2024-02-21 03:29:13.388 [info] > git config --get commit.template [26ms]
// 2024-02-21 03:29:13.391 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 03:29:13.423 [info] > git status -z -uall [30ms]
// 2024-02-21 03:29:13.458 [info] > git merge-base refs/heads/main refs/remotes/origin/main [29ms]
// 2024-02-21 03:29:13.489 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [28ms]
// 2024-02-21 03:29:14.605 [info] > git ls-files --stage -- D:\GitHub\miscellaneous\index.html [26ms]
// 2024-02-21 03:29:14.633 [info] > git cat-file -s e4112f44a003729ccfc66902b89d0ba5d08b5ba7 [25ms]
// 2024-02-21 03:29:14.662 [info] > git show --textconv :index.html [24ms]
// 2024-02-21 03:29:14.701 [info] > git push origin main:main [1274ms]
// 2024-02-21 03:29:14.701 [info] To https://github.com/kennethlarotyamat/miscellaneous.git
//    217ea4d..ed4276f  main -> main
// 2024-02-21 03:29:14.731 [info] > git config --get commit.template [27ms]
// 2024-02-21 03:29:14.733 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 03:29:14.768 [info] > git status -z -uall [32ms]
// 2024-02-21 03:29:14.807 [info] > git merge-base refs/heads/main refs/remotes/origin/main [33ms]
// 2024-02-21 03:29:14.811 [info] > git config --get commit.template [32ms]
// 2024-02-21 03:29:14.817 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [35ms]
// 2024-02-21 03:29:14.838 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [29ms]
// 2024-02-21 03:29:14.853 [info] > git status -z -uall [32ms]
// 2024-02-21 03:29:15.896 [info] > git ls-files --stage -- D:\GitHub\miscellaneous\index.html [23ms]
// 2024-02-21 03:29:15.920 [info] > git cat-file -s e4112f44a003729ccfc66902b89d0ba5d08b5ba7 [23ms]
// 2024-02-21 03:29:15.947 [info] > git show --textconv :index.html [23ms]
// 2024-02-21 03:29:33.481 [info] > git show --textconv :index.html [27ms]
// 2024-02-21 03:29:33.482 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\index.html [25ms]
// 2024-02-21 03:29:33.510 [info] > git cat-file -s f8e5fa4325c8503a4690f87a4d31238581376636 [25ms]
// 2024-02-21 03:29:53.298 [info] > git ls-files --stage -- D:\GitHub\MIS76810032024Sprg\index.html [27ms]
// 2024-02-21 03:29:53.302 [info] > git show --textconv :index.html [32ms]
// 2024-02-21 03:29:53.326 [info] > git cat-file -s 5887efce1b64f0f3d67f4ed9efdd23cac962420e [25ms]
// 2024-02-21 03:29:57.699 [info] > git config --get commit.template [28ms]
// 2024-02-21 03:29:57.701 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 03:29:57.728 [info] > git status -z -uall [26ms]
// 2024-02-21 03:30:02.598 [info] > git add -A -- . [46ms]
// 2024-02-21 03:30:02.871 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [272ms]
// 2024-02-21 03:30:02.895 [info] > git config --get commit.template [22ms]
// 2024-02-21 03:30:02.926 [info] > git config --get commit.template [28ms]
// 2024-02-21 03:30:02.928 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 03:30:02.955 [info] > git status -z -uall [26ms]
// 2024-02-21 03:30:02.991 [info] > git merge-base refs/heads/main refs/remotes/origin/main [28ms]
// 2024-02-21 03:30:03.019 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [25ms]
// 2024-02-21 03:30:04.133 [info] > git ls-files --stage -- D:\GitHub\MIS76810032024Sprg\index.html [23ms]
// 2024-02-21 03:30:04.160 [info] > git cat-file -s c236b3140d6329c54ab59bedfdf4eaa7c5c1876c [24ms]
// 2024-02-21 03:30:04.185 [info] > git show --textconv :index.html [23ms]
// 2024-02-21 03:30:04.363 [info] > git push origin main:main [1403ms]
// 2024-02-21 03:30:04.363 [info] To https://github.com/kennethlarotyamat/MIS76810032024Sprg.git
//    e5cee0f..723ef3d  main -> main
// 2024-02-21 03:30:04.392 [info] > git config --get commit.template [27ms]
// 2024-02-21 03:30:04.393 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 03:30:04.423 [info] > git status -z -uall [27ms]
// 2024-02-21 03:30:04.463 [info] > git merge-base refs/heads/main refs/remotes/origin/main [36ms]
// 2024-02-21 03:30:04.473 [info] > git config --get commit.template [39ms]
// 2024-02-21 03:30:04.474 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [35ms]
// 2024-02-21 03:30:04.494 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [29ms]
// 2024-02-21 03:30:04.505 [info] > git status -z -uall [29ms]
// 2024-02-21 03:30:05.476 [info] > git ls-files --stage -- D:\GitHub\MIS76810032024Sprg\index.html [28ms]
// 2024-02-21 03:30:05.504 [info] > git cat-file -s c236b3140d6329c54ab59bedfdf4eaa7c5c1876c [26ms]
// 2024-02-21 03:30:05.532 [info] > git show --textconv :index.html [25ms]
// 2024-02-21 03:33:35.814 [info] > git config --get commit.template [35ms]
// 2024-02-21 03:33:35.817 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [34ms]
// 2024-02-21 03:33:35.852 [info] > git status -z -uall [32ms]
// 2024-02-21 03:33:40.665 [info] > git add -A -- . [185ms]
// 2024-02-21 03:33:40.842 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [175ms]
// 2024-02-21 03:33:40.868 [info] > git config --get commit.template [24ms]
// 2024-02-21 03:33:40.897 [info] > git config --get commit.template [26ms]
// 2024-02-21 03:33:40.900 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 03:33:40.930 [info] > git status -z -uall [27ms]
// 2024-02-21 03:33:40.974 [info] > git merge-base refs/heads/main refs/remotes/origin/main [30ms]
// 2024-02-21 03:33:41.005 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [27ms]
// 2024-02-21 03:33:42.102 [info] > git ls-files --stage -- D:\GitHub\MIS76810032024Sprg\index.html [25ms]
// 2024-02-21 03:33:42.127 [info] > git cat-file -s c236b3140d6329c54ab59bedfdf4eaa7c5c1876c [24ms]
// 2024-02-21 03:33:42.154 [info] > git show --textconv :index.html [24ms]
// 2024-02-21 03:33:42.177 [info] > git push origin main:main [1241ms]
// 2024-02-21 03:33:42.177 [info] To https://github.com/kennethlarotyamat/MIS76810032024Sprg.git
//    723ef3d..9b65e1b  main -> main
// 2024-02-21 03:33:42.206 [info] > git config --get commit.template [26ms]
// 2024-02-21 03:33:42.207 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 03:33:42.236 [info] > git status -z -uall [26ms]
// 2024-02-21 03:33:42.274 [info] > git merge-base refs/heads/main refs/remotes/origin/main [34ms]
// 2024-02-21 03:33:42.283 [info] > git config --get commit.template [34ms]
// 2024-02-21 03:33:42.286 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [34ms]
// 2024-02-21 03:33:42.306 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [29ms]
// 2024-02-21 03:33:42.318 [info] > git status -z -uall [29ms]
// 2024-02-21 03:33:43.374 [info] > git ls-files --stage -- D:\GitHub\MIS76810032024Sprg\index.html [23ms]
// 2024-02-21 03:33:43.399 [info] > git cat-file -s c236b3140d6329c54ab59bedfdf4eaa7c5c1876c [23ms]
// 2024-02-21 03:33:43.425 [info] > git show --textconv :index.html [23ms]
// 2024-02-21 03:33:52.082 [info] > git push origin main:main [1334915ms]
// 2024-02-21 03:33:52.082 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
// send-pack: unexpected disconnect while reading sideband packet
// fatal: the remote end hung up unexpectedly
// Everything up-to-date
// 2024-02-21 03:33:52.113 [info] > git config --get commit.template [29ms]
// 2024-02-21 03:33:52.115 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
// 2024-02-21 03:33:52.142 [info] > git status -z -uall [24ms]
// 2024-02-21 03:33:52.251 [info] > git config --get commit.template [39ms]
// 2024-02-21 03:33:52.256 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [40ms]
// 2024-02-21 03:33:52.288 [info] > git status -z -uall [28ms]
// 2024-02-21 03:33:52.805 [info] > git check-ignore -v -z --stdin [25ms]
// 2024-02-21 03:35:33.825 [info] > git ls-files --stage -- D:\GitHub\project15\index.html [25ms]
// 2024-02-21 03:35:33.827 [info] > git show --textconv :index.html [30ms]
// 2024-02-21 03:35:33.855 [info] > git cat-file -s b1b43291bc46519a619f5b5b0ed789bda07dfeb6 [28ms]
// 2024-02-21 03:35:36.784 [info] > git check-ignore -v -z --stdin [23ms]
// 2024-02-21 03:35:40.974 [info] > git ls-files --stage -- D:\GitHub\project15\my-react-app\package.json [27ms]
// 2024-02-21 03:35:41.011 [info] > git cat-file -s 08b21028b4f078db0bbe6f83d799ab9c2013eb4d [34ms]
// 2024-02-21 03:35:41.011 [info] > git show --textconv :my-react-app/package.json [66ms]
// 2024-02-21 03:35:47.712 [info] > git config --get commit.template [26ms]
// 2024-02-21 03:35:47.713 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
// 2024-02-21 03:35:47.740 [info] > git status -z -uall [23ms]
// 2024-02-21 03:36:00.524 [info] > git config --get commit.template [26ms]
// 2024-02-21 03:36:00.526 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 03:36:00.553 [info] > git status -z -uall [25ms]
// 2024-02-21 03:36:01.421 [info] > git check-ignore -v -z --stdin [24ms]
// 2024-02-21 03:36:03.195 [info] > git show --textconv :my-react-app/vite/.eslintrc.cjs [162ms]
// 2024-02-21 03:36:03.196 [info] > git ls-files --stage -- D:\GitHub\project15\my-react-app\vite\.eslintrc.cjs [160ms]
// 2024-02-21 03:36:03.244 [info] > git cat-file -s 4dcb43901a687f5fa7e3867d9964a76861973151 [44ms]
// 2024-02-21 03:36:06.839 [info] > git config --get commit.template [29ms]
// 2024-02-21 03:36:06.840 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
// 2024-02-21 03:36:06.874 [info] > git status -z -uall [31ms]
// 2024-02-21 03:36:12.559 [info] > git config --get commit.template [26ms]
// 2024-02-21 03:36:12.562 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 03:36:12.589 [info] > git status -z -uall [25ms]
// 2024-02-21 03:36:17.628 [info] > git config --get commit.template [28ms]
// 2024-02-21 03:36:17.629 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 03:36:17.655 [info] > git status -z -uall [24ms]
// 2024-02-21 03:36:26.622 [info] > git show --textconv :index.html [26ms]
// 2024-02-21 03:36:26.624 [info] > git ls-files --stage -- D:\GitHub\project15\index.html [26ms]
// 2024-02-21 03:36:26.649 [info] > git cat-file -s b1b43291bc46519a619f5b5b0ed789bda07dfeb6 [23ms]
// 2024-02-21 03:36:38.088 [info] > git check-ignore -v -z --stdin [26ms]
// 2024-02-21 03:36:39.929 [info] > git check-ignore -v -z --stdin [23ms]
// 2024-02-21 03:36:41.359 [info] > git show --textconv :misc/reactbuttons.js [34ms]
// 2024-02-21 03:36:41.360 [info] > git ls-files --stage -- D:\GitHub\project15\misc\reactbuttons.js [32ms]
// 2024-02-21 03:36:41.392 [info] > git cat-file -s d94050956cd29a385efb56dc0fe7e96d6a36e008 [30ms]
// 2024-02-21 03:36:59.027 [info] > git add -A -- . [1717ms]
// 2024-02-21 03:36:59.126 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [95ms]
// 2024-02-21 03:36:59.151 [info] > git config --get commit.template [24ms]
// 2024-02-21 03:36:59.181 [info] > git config --get commit.template [27ms]
// 2024-02-21 03:36:59.183 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 03:36:59.209 [info] > git status -z -uall [24ms]
// 2024-02-21 03:36:59.253 [info] > git merge-base refs/heads/main refs/remotes/origin/main [30ms]
// 2024-02-21 03:36:59.282 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [28ms]
// 2024-02-21 03:38:54.333 [info] > git check-ignore -v -z --stdin [25ms]
// 2024-02-21 03:39:00.729 [info] > git check-ignore -v -z --stdin [23ms]
// 2024-02-21 03:39:03.044 [info] > git check-ignore -v -z --stdin [23ms]
// 2024-02-21 03:39:07.480 [info] > git ls-files --stage -- D:\GitHub\MIS76810032024Sprg\src\1EmpoyeeandEmployeeDemo.java [42ms]
// 2024-02-21 03:39:07.485 [info] > git show --textconv :src/1EmpoyeeandEmployeeDemo.java [51ms]
// 2024-02-21 03:39:07.550 [info] > git cat-file -s e69de29bb2d1d6434b8b29ae775ad8c2e48c5391 [66ms]
// 2024-02-21 03:39:09.634 [info] > git show --textconv :src/2EmpoyeeandEmployeeDemo.java [27ms]
// 2024-02-21 03:39:09.635 [info] > git ls-files --stage -- D:\GitHub\MIS76810032024Sprg\src\2EmpoyeeandEmployeeDemo.java [24ms]
// 2024-02-21 03:39:09.660 [info] > git cat-file -s e69de29bb2d1d6434b8b29ae775ad8c2e48c5391 [23ms]
// 2024-02-21 03:39:29.187 [info] > git config --get commit.template [35ms]
// 2024-02-21 03:39:29.190 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [35ms]
// 2024-02-21 03:39:29.227 [info] > git status -z -uall [33ms]
// 2024-02-21 03:39:49.965 [info] > git config --get commit.template [26ms]
// 2024-02-21 03:39:49.966 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
// 2024-02-21 03:39:49.993 [info] > git status -z -uall [25ms]
// 2024-02-21 03:40:05.811 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [33ms]
// 2024-02-21 03:40:05.812 [info] > git config --get commit.template [37ms]
// 2024-02-21 03:40:05.849 [info] > git status -z -uall [35ms]
// 2024-02-21 03:40:13.333 [info] > git config --get commit.template [30ms]
// 2024-02-21 03:40:13.334 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 03:40:13.362 [info] > git status -z -uall [26ms]
// 2024-02-21 03:40:24.811 [info] > git config --get commit.template [27ms]
// 2024-02-21 03:40:24.811 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
// 2024-02-21 03:40:24.839 [info] > git status -z -uall [25ms]
// 2024-02-21 03:40:29.882 [info] > git config --get commit.template [25ms]
// 2024-02-21 03:40:29.884 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [24ms]
// 2024-02-21 03:40:29.912 [info] > git status -z -uall [26ms]
// 2024-02-21 03:40:59.290 [info] > git config --get commit.template [26ms]
// 2024-02-21 03:40:59.292 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 03:40:59.321 [info] > git status -z -uall [27ms]
// 2024-02-21 03:41:02.156 [info] > git add -A -- . [247ms]
// 2024-02-21 03:41:02.261 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [103ms]
// 2024-02-21 03:41:02.286 [info] > git config --get commit.template [23ms]
// 2024-02-21 03:41:02.315 [info] > git config --get commit.template [26ms]
// 2024-02-21 03:41:02.318 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 03:41:02.346 [info] > git status -z -uall [27ms]
// 2024-02-21 03:41:02.413 [info] > git merge-base refs/heads/main refs/remotes/origin/main [39ms]
// 2024-02-21 03:41:02.444 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [28ms]
// 2024-02-21 03:41:03.531 [info] > git ls-files --stage -- D:\GitHub\MIS76810032024Sprg\src\2EmpoyeeandEmployeeDemo.java [24ms]
// 2024-02-21 03:41:03.558 [info] > git cat-file -s b225a8bfb2d7d020cd32f23038be6449b9584057 [25ms]
// 2024-02-21 03:41:03.586 [info] > git show --textconv :src/2EmpoyeeandEmployeeDemo.java [25ms]
// 2024-02-21 03:41:05.381 [info] > git push origin main:main [3030ms]
// 2024-02-21 03:41:05.381 [info] To https://github.com/kennethlarotyamat/MIS76810032024Sprg.git
//    9b65e1b..855d499  main -> main
// 2024-02-21 03:41:05.412 [info] > git config --get commit.template [27ms]
// 2024-02-21 03:41:05.414 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 03:41:05.445 [info] > git status -z -uall [28ms]
// 2024-02-21 03:41:05.485 [info] > git merge-base refs/heads/main refs/remotes/origin/main [36ms]
// 2024-02-21 03:41:05.504 [info] > git config --get commit.template [37ms]
// 2024-02-21 03:41:05.507 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [37ms]
// 2024-02-21 03:41:05.522 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [33ms]
// 2024-02-21 03:41:05.540 [info] > git status -z -uall [31ms]
// 2024-02-21 03:41:06.489 [info] > git ls-files --stage -- D:\GitHub\MIS76810032024Sprg\src\2EmpoyeeandEmployeeDemo.java [28ms]
// 2024-02-21 03:41:06.517 [info] > git cat-file -s b225a8bfb2d7d020cd32f23038be6449b9584057 [26ms]
// 2024-02-21 03:41:06.553 [info] > git show --textconv :src/2EmpoyeeandEmployeeDemo.java [32ms]
// 2024-02-21 03:41:55.821 [info] > git push origin main:main [944187ms]
// 2024-02-21 03:41:55.821 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
// send-pack: unexpected disconnect while reading sideband packet
// fatal: the remote end hung up unexpectedly
// Everything up-to-date
// 2024-02-21 03:41:55.853 [info] > git config --get commit.template [29ms]
// 2024-02-21 03:41:55.854 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
// 2024-02-21 03:41:55.883 [info] > git status -z -uall [27ms]
// 2024-02-21 03:41:55.977 [info] > git config --get commit.template [44ms]
// 2024-02-21 03:41:55.980 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [42ms]
// 2024-02-21 03:41:56.016 [info] > git status -z -uall [32ms]
// 2024-02-21 04:11:30.469 [info] > git push origin main:main [2071254ms]
// 2024-02-21 04:11:30.469 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
// send-pack: unexpected disconnect while reading sideband packet
// fatal: the remote end hung up unexpectedly
// Everything up-to-date
// 2024-02-21 04:11:30.502 [info] > git config --get commit.template [31ms]
// 2024-02-21 04:11:30.503 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
// 2024-02-21 04:11:30.531 [info] > git status -z -uall [27ms]
// 2024-02-21 04:11:30.598 [info] > git config --get commit.template [29ms]
// 2024-02-21 04:11:30.601 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
// 2024-02-21 04:11:30.630 [info] > git status -z -uall [27ms]
// 2024-02-21 04:15:33.403 [info] > git add -A -- . [2535ms]
// 2024-02-21 04:15:33.574 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [169ms]
// 2024-02-21 04:15:33.599 [info] > git config --get commit.template [23ms]
// 2024-02-21 04:15:33.628 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:15:33.631 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:15:33.660 [info] > git status -z -uall [27ms]
// 2024-02-21 04:15:33.703 [info] > git merge-base refs/heads/main refs/remotes/origin/main [30ms]
// 2024-02-21 04:15:33.734 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [29ms]
// 2024-02-21 04:15:45.423 [info] > git check-ignore -v -z --stdin [23ms]
// 2024-02-21 04:15:45.909 [info] > git ls-files --stage -- D:\GitHub\project16\javascript\project16.js [26ms]
// 2024-02-21 04:15:46.011 [info] > git cat-file -s e69de29bb2d1d6434b8b29ae775ad8c2e48c5391 [100ms]
// 2024-02-21 04:15:46.011 [info] > git show --textconv :javascript/project16.js [131ms]
// 2024-02-21 04:15:51.147 [info] > git config --get commit.template [24ms]
// 2024-02-21 04:15:51.151 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 04:15:51.176 [info] > git status -z -uall [23ms]
// 2024-02-21 04:15:56.218 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:15:56.220 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 04:15:56.247 [info] > git status -z -uall [24ms]
// 2024-02-21 04:16:01.308 [info] > git config --get commit.template [52ms]
// 2024-02-21 04:16:01.312 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [54ms]
// 2024-02-21 04:16:01.342 [info] > git status -z -uall [27ms]
// 2024-02-21 04:16:06.383 [info] > git config --get commit.template [25ms]
// 2024-02-21 04:16:06.386 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 04:16:06.412 [info] > git status -z -uall [24ms]
// 2024-02-21 04:16:14.322 [info] > git add -A -- . [44ms]
// 2024-02-21 04:16:14.579 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [255ms]
// 2024-02-21 04:16:14.605 [info] > git config --get commit.template [23ms]
// 2024-02-21 04:16:14.634 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:16:14.639 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:16:14.666 [info] > git status -z -uall [25ms]
// 2024-02-21 04:16:14.703 [info] > git merge-base refs/heads/main refs/remotes/origin/main [29ms]
// 2024-02-21 04:16:14.734 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [29ms]
// 2024-02-21 04:16:32.063 [info] > git push origin main:main [17392ms]
// 2024-02-21 04:16:32.063 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
// send-pack: unexpected disconnect while reading sideband packet
// fatal: the remote end hung up unexpectedly
// Everything up-to-date
// 2024-02-21 04:16:32.093 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:16:32.095 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 04:16:32.122 [info] > git status -z -uall [24ms]
// 2024-02-21 04:16:32.166 [info] > git config --get commit.template [37ms]
// 2024-02-21 04:16:32.170 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [37ms]
// 2024-02-21 04:16:32.197 [info] > git status -z -uall [25ms]
// 2024-02-21 04:17:36.334 [info] > git merge-base refs/heads/main refs/remotes/origin/main [30ms]
// 2024-02-21 04:17:36.362 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [25ms]
// 2024-02-21 04:17:41.589 [info] > git merge-base refs/heads/main refs/remotes/origin/main [359ms]
// 2024-02-21 04:17:41.616 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [25ms]
// 2024-02-21 04:17:59.768 [info] > git ls-files --stage -- D:\GitHub\project16\javascript\project16.js [26ms]
// 2024-02-21 04:17:59.771 [info] > git show --textconv :javascript/project16.js [31ms]
// 2024-02-21 04:17:59.795 [info] > git cat-file -s bb6218ac752e1d1d6c7389558b52f829bcc1c0f4 [24ms]
// 2024-02-21 04:18:04.804 [info] > git config --get commit.template [25ms]
// 2024-02-21 04:18:04.807 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
// 2024-02-21 04:18:04.833 [info] > git status -z -uall [24ms]
// 2024-02-21 04:18:09.881 [info] > git config --get commit.template [33ms]
// 2024-02-21 04:18:09.887 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [36ms]
// 2024-02-21 04:18:09.922 [info] > git status -z -uall [32ms]
// 2024-02-21 04:18:14.960 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:18:14.960 [info] > git config --get commit.template [29ms]
// 2024-02-21 04:18:14.991 [info] > git status -z -uall [29ms]
// 2024-02-21 04:18:21.026 [info] > git add -A -- . [44ms]
// 2024-02-21 04:18:21.249 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [220ms]
// 2024-02-21 04:18:21.274 [info] > git config --get commit.template [24ms]
// 2024-02-21 04:18:21.304 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:18:21.306 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:18:21.334 [info] > git status -z -uall [24ms]
// 2024-02-21 04:18:21.373 [info] > git merge-base refs/heads/main refs/remotes/origin/main [29ms]
// 2024-02-21 04:18:21.405 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [28ms]
// 2024-02-21 04:18:28.286 [info] > git add -A -- . [63ms]
// 2024-02-21 04:18:28.286 [info] warning: in the working copy of 'my-react-app/package.json', LF will be replaced by CRLF the next time Git touches it
// warning: in the working copy of 'my-react-app/vite/.eslintrc.cjs', LF will be replaced by CRLF the next time Git touches it
// 2024-02-21 04:18:28.410 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [121ms]
// 2024-02-21 04:18:28.435 [info] > git config --get commit.template [23ms]
// 2024-02-21 04:18:28.464 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:18:28.468 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 04:18:28.495 [info] > git status -z -uall [25ms]
// 2024-02-21 04:18:28.539 [info] > git merge-base refs/heads/main refs/remotes/origin/main [32ms]
// 2024-02-21 04:18:28.569 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [27ms]
// 2024-02-21 04:18:32.071 [info] > git push origin main:main [3569ms]
// 2024-02-21 04:18:32.071 [info] remote: 
// remote: GitHub found 4 vulnerabilities on kennethlarotyamat/project15's default branch (1 high, 3 moderate). To find out more, visit:        
// remote:      https://github.com/kennethlarotyamat/project15/security/dependabot        
// remote: 
// To https://github.com/kennethlarotyamat/project15.git
//    124694a..4485fa3  main -> main
// 2024-02-21 04:18:32.102 [info] > git config --get commit.template [29ms]
// 2024-02-21 04:18:32.103 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 04:18:32.133 [info] > git status -z -uall [27ms]
// 2024-02-21 04:18:32.175 [info] > git merge-base refs/heads/main refs/remotes/origin/main [38ms]
// 2024-02-21 04:18:32.183 [info] > git config --get commit.template [40ms]
// 2024-02-21 04:18:32.185 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [38ms]
// 2024-02-21 04:18:32.208 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [31ms]
// 2024-02-21 04:18:32.216 [info] > git status -z -uall [28ms]
// 2024-02-21 04:18:48.525 [info] > git push origin main:main [194859ms]
// 2024-02-21 04:18:48.525 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
// send-pack: unexpected disconnect while reading sideband packet
// fatal: the remote end hung up unexpectedly
// Everything up-to-date
// 2024-02-21 04:18:48.556 [info] > git config --get commit.template [29ms]
// 2024-02-21 04:18:48.558 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
// 2024-02-21 04:18:48.589 [info] > git status -z -uall [28ms]
// 2024-02-21 04:18:48.664 [info] > git config --get commit.template [38ms]
// 2024-02-21 04:18:48.668 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [39ms]
// 2024-02-21 04:18:48.699 [info] > git status -z -uall [29ms]
// 2024-02-21 04:18:59.481 [info] > git push origin main:main [38142ms]
// 2024-02-21 04:18:59.481 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
// send-pack: unexpected disconnect while reading sideband packet
// fatal: the remote end hung up unexpectedly
// Everything up-to-date
// 2024-02-21 04:18:59.513 [info] > git config --get commit.template [30ms]
// 2024-02-21 04:18:59.514 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
// 2024-02-21 04:18:59.543 [info] > git status -z -uall [27ms]
// 2024-02-21 04:18:59.600 [info] > git config --get commit.template [42ms]
// 2024-02-21 04:18:59.602 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [41ms]
// 2024-02-21 04:18:59.633 [info] > git status -z -uall [28ms]
// 2024-02-21 04:19:04.788 [info] > git ls-files --stage -- D:\GitHub\project16\javascript\project16.js [29ms]
// 2024-02-21 04:19:04.791 [info] > git show --textconv :javascript/project16.js [34ms]
// 2024-02-21 04:19:04.817 [info] > git cat-file -s 3272495dc406a3b28c7a809bab81332e5bb53f16 [26ms]
// 2024-02-21 04:19:11.471 [info] > git config --get commit.template [24ms]
// 2024-02-21 04:19:11.473 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [24ms]
// 2024-02-21 04:19:11.499 [info] > git status -z -uall [24ms]
// 2024-02-21 04:19:19.626 [info] > git add -A -- . [54ms]
// 2024-02-21 04:19:19.848 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [220ms]
// 2024-02-21 04:19:19.873 [info] > git config --get commit.template [23ms]
// 2024-02-21 04:19:19.903 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:19:19.907 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
// 2024-02-21 04:19:19.935 [info] > git status -z -uall [25ms]
// 2024-02-21 04:19:19.974 [info] > git merge-base refs/heads/main refs/remotes/origin/main [30ms]
// 2024-02-21 04:19:20.004 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [28ms]
// 2024-02-21 04:19:26.051 [info] > git check-ignore -v -z --stdin [24ms]
// 2024-02-21 04:19:26.869 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\ unlv\mis768\kly\CreateTranscript.java [47ms]
// 2024-02-21 04:19:26.978 [info] > git cat-file -s 14e48f52ea409dc2cfb108357dcd59adcd1e1d24 [104ms]
// 2024-02-21 04:19:26.979 [info] > git show --textconv :src/edu/unlv/mis768/kly/CreateTranscript.java [162ms]
// 2024-02-21 04:19:27.010 [info] > git check-ignore -v -z --stdin [32ms]
// 2024-02-21 04:19:42.775 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:19:42.777 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:19:42.808 [info] > git status -z -uall [29ms]
// 2024-02-21 04:19:47.853 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:19:47.855 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:19:47.885 [info] > git status -z -uall [27ms]
// 2024-02-21 04:19:52.917 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:19:52.918 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
// 2024-02-21 04:19:52.947 [info] > git status -z -uall [26ms]
// 2024-02-21 04:19:57.983 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:19:57.985 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 04:19:58.013 [info] > git status -z -uall [27ms]
// 2024-02-21 04:20:03.066 [info] > git config --get commit.template [41ms]
// 2024-02-21 04:20:03.069 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [41ms]
// 2024-02-21 04:20:03.103 [info] > git status -z -uall [30ms]
// 2024-02-21 04:20:08.136 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:20:08.139 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:20:08.167 [info] > git status -z -uall [27ms]
// 2024-02-21 04:20:13.670 [info] > git config --get commit.template [29ms]
// 2024-02-21 04:20:13.673 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
// 2024-02-21 04:20:13.702 [info] > git status -z -uall [27ms]
// 2024-02-21 04:20:15.151 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\ unlv\mis768\kly\CreateTranscriptDemo.java [31ms]
// 2024-02-21 04:20:15.274 [info] > git cat-file -s 31583d8399f209213d2b38b65e13d1078148dc5a [121ms]
// 2024-02-21 04:20:15.275 [info] > git show --textconv :src/edu/unlv/mis768/kly/CreateTranscriptDemo.java [159ms]
// 2024-02-21 04:20:20.726 [info] > git config --get commit.template [25ms]
// 2024-02-21 04:20:20.729 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 04:20:20.758 [info] > git status -z -uall [26ms]
// 2024-02-21 04:20:27.085 [info] > git config --get commit.template [29ms]
// 2024-02-21 04:20:27.088 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
// 2024-02-21 04:20:27.120 [info] > git status -z -uall [29ms]
// 2024-02-21 04:20:28.474 [info] > git show --textconv :src/edu/unlv/mis768/kly/CreateTranscript.java [28ms]
// 2024-02-21 04:20:28.475 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\ unlv\mis768\kly\CreateTranscript.java [27ms]
// 2024-02-21 04:20:28.499 [info] > git cat-file -s 14e48f52ea409dc2cfb108357dcd59adcd1e1d24 [22ms]
// 2024-02-21 04:20:35.558 [info] > git add -A -- . [178ms]
// 2024-02-21 04:20:35.708 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [148ms]
// 2024-02-21 04:20:35.736 [info] > git config --get commit.template [25ms]
// 2024-02-21 04:20:35.765 [info] > git config --get commit.template [28ms]
// 2024-02-21 04:20:35.770 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
// 2024-02-21 04:20:35.801 [info] > git status -z -uall [29ms]
// 2024-02-21 04:20:35.866 [info] > git merge-base refs/heads/main refs/remotes/origin/main [59ms]
// 2024-02-21 04:20:35.900 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [31ms]
// 2024-02-21 04:20:37.005 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\ unlv\mis768\kly\CreateTranscript.java [29ms]
// 2024-02-21 04:20:37.035 [info] > git cat-file -s 2a5566a9b816e69ca702bcbc62b4402e96fc0404 [28ms]
// 2024-02-21 04:20:37.067 [info] > git show --textconv :src/edu/unlv/mis768/kly/CreateTranscript.java [28ms]
// 2024-02-21 04:22:01.077 [info] > git push origin main:main [85272ms]
// 2024-02-21 04:22:01.077 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
// send-pack: unexpected disconnect while reading sideband packet
// fatal: the remote end hung up unexpectedly
// Everything up-to-date
// 2024-02-21 04:22:01.111 [info] > git config --get commit.template [32ms]
// 2024-02-21 04:22:01.113 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [32ms]
// 2024-02-21 04:22:01.147 [info] > git status -z -uall [32ms]
// 2024-02-21 04:22:01.229 [info] > git config --get commit.template [39ms]
// 2024-02-21 04:22:01.231 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [38ms]
// 2024-02-21 04:22:01.265 [info] > git status -z -uall [32ms]
// 2024-02-21 04:22:17.691 [info] > git check-ignore -v -z --stdin [24ms]
// 2024-02-21 04:22:20.248 [info] > git check-ignore -v -z --stdin [24ms]
// 2024-02-21 04:22:22.962 [info] > git check-ignore -v -z --stdin [23ms]
// 2024-02-21 04:22:25.412 [info] > git check-ignore -v -z --stdin [25ms]
// 2024-02-21 04:22:28.266 [info] > git check-ignore -v -z --stdin [24ms]
// 2024-02-21 04:22:31.524 [info] > git check-ignore -v -z --stdin [23ms]
// 2024-02-21 04:22:36.250 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\misc\project14\intermediate-javascript-and-the-dom--lesson-3-4---sat---sept-30\style.scss [42ms]
// 2024-02-21 04:22:36.324 [info] > git cat-file -s 9afe0a43c321aa35521e160d0553330bd3b9b16b [69ms]
// 2024-02-21 04:22:36.325 [info] > git show --textconv :misc/project14/intermediate-javascript-and-the-dom--lesson-3-4---sat---sept-30/style.scss [120ms]
// 2024-02-21 04:22:41.600 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:22:41.602 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 04:22:41.630 [info] > git status -z -uall [26ms]
// 2024-02-21 04:22:46.674 [info] > git config --get commit.template [25ms]
// 2024-02-21 04:22:46.675 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
// 2024-02-21 04:22:46.705 [info] > git status -z -uall [26ms]
// 2024-02-21 04:22:51.743 [info] > git config --get commit.template [28ms]
// 2024-02-21 04:22:51.745 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 04:22:51.775 [info] > git status -z -uall [28ms]
// 2024-02-21 04:22:56.807 [info] > git config --get commit.template [24ms]
// 2024-02-21 04:22:56.810 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
// 2024-02-21 04:22:56.839 [info] > git status -z -uall [27ms]
// 2024-02-21 04:23:01.883 [info] > git config --get commit.template [31ms]
// 2024-02-21 04:23:01.884 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
// 2024-02-21 04:23:01.913 [info] > git status -z -uall [27ms]
// 2024-02-21 04:23:05.607 [info] > git check-ignore -v -z --stdin [25ms]
// 2024-02-21 04:23:07.498 [info] > git check-ignore -v -z --stdin [24ms]
// 2024-02-21 04:23:08.545 [info] > git check-ignore -v -z --stdin [23ms]
// 2024-02-21 04:23:09.575 [info] > git check-ignore -v -z --stdin [24ms]
// 2024-02-21 04:23:10.592 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\javascript\1011052023333calculatorscript.js [43ms]
// 2024-02-21 04:23:10.713 [info] > git cat-file -s a5d772a454b09fd4765771a09c51495b4088d78a [117ms]
// 2024-02-21 04:23:10.714 [info] > git show --textconv :javascript/1011052023333calculatorscript.js [168ms]
// 2024-02-21 04:23:21.902 [info] > git config --get commit.template [29ms]
// 2024-02-21 04:23:21.904 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 04:23:21.935 [info] > git status -z -uall [29ms]
// 2024-02-21 04:23:23.748 [info] > git check-ignore -v -z --stdin [23ms]
// 2024-02-21 04:23:26.351 [info] > git check-ignore -v -z --stdin [25ms]
// 2024-02-21 04:23:27.088 [info] > git check-ignore -v -z --stdin [24ms]
// 2024-02-21 04:23:28.836 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\CSS\_qQcW3.MsLR7ecB.css [26ms]
// 2024-02-21 04:23:28.943 [info] > git cat-file -s ca3a7e78bcc6f7172e5630f7b627905d5748b3ae [103ms]
// 2024-02-21 04:23:28.943 [info] > git show --textconv :CSS/_qQcW3.MsLR7ecB.css [136ms]
// 2024-02-21 04:23:33.440 [info] > git config --get commit.template [28ms]
// 2024-02-21 04:23:33.442 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:23:33.471 [info] > git status -z -uall [27ms]
// 2024-02-21 04:23:35.371 [info] > git check-ignore -v -z --stdin [38ms]
// 2024-02-21 04:23:39.000 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\ unlv\mis768\kly\TestScoreDemo.java [29ms]
// 2024-02-21 04:23:39.016 [info] > git show --textconv :src/edu/unlv/mis768/kly/TestScoreDemo.java [48ms]
// 2024-02-21 04:23:39.031 [info] > git cat-file -s 415496ed5bf8dc9e47dee422cf9d352accdf2d0f [27ms]
// 2024-02-21 04:23:44.303 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:23:44.305 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
// 2024-02-21 04:23:44.334 [info] > git status -z -uall [27ms]
// 2024-02-21 04:23:46.837 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\ unlv\mis768\kly\TestScore.java [26ms]
// 2024-02-21 04:23:46.948 [info] > git cat-file -s ed5817dc9e274bf43f6b3e7aecb336d375e8b110 [108ms]
// 2024-02-21 04:23:46.949 [info] > git show --textconv :src/edu/unlv/mis768/kly/TestScore.java [140ms]
// 2024-02-21 04:23:49.365 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:23:49.368 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:23:49.404 [info] > git status -z -uall [33ms]
// 2024-02-21 04:23:54.440 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:23:54.442 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 04:23:54.473 [info] > git status -z -uall [28ms]
// 2024-02-21 04:24:04.412 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:24:04.415 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 04:24:04.445 [info] > git status -z -uall [28ms]
// 2024-02-21 04:24:20.511 [info] > git config --get commit.template [36ms]
// 2024-02-21 04:24:20.512 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [33ms]
// 2024-02-21 04:24:20.543 [info] > git status -z -uall [29ms]
// 2024-02-21 04:24:27.865 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:24:27.869 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 04:24:27.899 [info] > git status -z -uall [27ms]
// 2024-02-21 04:24:36.203 [info] > git add -A -- . [173ms]
// 2024-02-21 04:24:36.565 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [360ms]
// 2024-02-21 04:24:36.591 [info] > git config --get commit.template [24ms]
// 2024-02-21 04:24:36.623 [info] > git config --get commit.template [28ms]
// 2024-02-21 04:24:36.626 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
// 2024-02-21 04:24:36.656 [info] > git status -z -uall [28ms]
// 2024-02-21 04:24:36.696 [info] > git merge-base refs/heads/main refs/remotes/origin/main [30ms]
// 2024-02-21 04:24:36.728 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [29ms]
// 2024-02-21 04:24:37.841 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\ unlv\mis768\kly\TestScore.java [34ms]
// 2024-02-21 04:24:37.877 [info] > git cat-file -s d1988a75520d65f8a0eb9b6009f9034f7997173a [33ms]
// 2024-02-21 04:24:37.915 [info] > git show --textconv :src/edu/unlv/mis768/kly/TestScore.java [34ms]
// 2024-02-21 04:27:04.049 [info] > git log --format=%H%n%aN%n%aE%n%at%n%ct%n%P%n%D%n%B -z --shortstat --diff-merges=first-parent --author-date-order 0f74f39d9422082c4ddb1f2137ed007921979c60..81c7b296bb55c5d88cfa9a15c26b53d569e5a2a1 [157ms]
// 2024-02-21 04:27:04.222 [info] > git diff --shortstat 0f74f39d9422082c4ddb1f2137ed007921979c60...81c7b296bb55c5d88cfa9a15c26b53d569e5a2a1 [151ms]
// 2024-02-21 04:27:32.866 [info] > git push origin main:main [176205ms]
// 2024-02-21 04:27:32.866 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
// send-pack: unexpected disconnect while reading sideband packet
// fatal: the remote end hung up unexpectedly
// Everything up-to-date
// 2024-02-21 04:27:32.903 [info] > git config --get commit.template [34ms]
// 2024-02-21 04:27:32.904 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [33ms]
// 2024-02-21 04:27:32.939 [info] > git status -z -uall [31ms]
// 2024-02-21 04:27:33.033 [info] > git config --get commit.template [40ms]
// 2024-02-21 04:27:33.035 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [40ms]
// 2024-02-21 04:27:33.073 [info] > git status -z -uall [34ms]
// 2024-02-21 04:27:56.174 [info] > git check-ignore -v -z --stdin [23ms]
// 2024-02-21 04:27:58.890 [info] > git ls-files --stage -- D:\GitHub\project15\misc\tictactoe.js [34ms]
// 2024-02-21 04:27:58.922 [info] > git show --textconv :misc/tictactoe.js [71ms]
// 2024-02-21 04:27:58.927 [info] > git cat-file -s cca32428bfe0a0d9e0619a9a6e51a0efcb9ba6da [34ms]
// 2024-02-21 04:28:09.061 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:28:09.062 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 04:28:09.088 [info] > git status -z -uall [23ms]
// 2024-02-21 04:28:14.128 [info] > git config --get commit.template [30ms]
// 2024-02-21 04:28:14.130 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
// 2024-02-21 04:28:14.188 [info] > git status -z -uall [29ms]
// 2024-02-21 04:28:19.229 [info] > git config --get commit.template [28ms]
// 2024-02-21 04:28:19.230 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:28:19.257 [info] > git status -z -uall [25ms]
// 2024-02-21 04:28:34.348 [info] > git config --get commit.template [31ms]
// 2024-02-21 04:28:34.352 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [32ms]
// 2024-02-21 04:28:34.420 [info] > git status -z -uall [66ms]
// 2024-02-21 04:28:40.168 [info] > git config --get commit.template [28ms]
// 2024-02-21 04:28:40.170 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 04:28:40.198 [info] > git status -z -uall [26ms]
// 2024-02-21 04:28:44.407 [info] > git ls-files --stage -- D:\GitHub\project15\misc\reactbuttons.js [26ms]
// 2024-02-21 04:28:44.410 [info] > git show --textconv :misc/reactbuttons.js [32ms]
// 2024-02-21 04:28:44.437 [info] > git cat-file -s d94050956cd29a385efb56dc0fe7e96d6a36e008 [28ms]
// 2024-02-21 04:28:48.596 [info] > git config --get commit.template [25ms]
// 2024-02-21 04:28:48.597 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
// 2024-02-21 04:28:48.624 [info] > git status -z -uall [25ms]
// 2024-02-21 04:28:49.387 [info] > git ls-files --stage -- D:\GitHub\project15\misc\refactoredproject12.js [26ms]
// 2024-02-21 04:28:49.498 [info] > git cat-file -s 4f7587a9acc2c4dfe4832d54300ea55ee195ed7e [108ms]
// 2024-02-21 04:28:49.499 [info] > git show --textconv :misc/refactoredproject12.js [141ms]
// 2024-02-21 04:28:53.665 [info] > git config --get commit.template [25ms]
// 2024-02-21 04:28:53.667 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
// 2024-02-21 04:28:53.695 [info] > git status -z -uall [24ms]
// 2024-02-21 04:29:04.016 [info] > git check-ignore -v -z --stdin [24ms]
// 2024-02-21 04:29:10.564 [info] > git show --textconv :misc/project-91/project-91/dbPrestigeLevels.dat [31ms]
// 2024-02-21 04:29:10.565 [info] > git ls-files --stage -- D:\GitHub\project16\misc\project-91\project-91\dbPrestigeLevels.dat [29ms]
// 2024-02-21 04:29:10.593 [info] > git cat-file -s fa62f03d9dc78f33f5fdf3f6074370baee9f1381 [25ms]
// 2024-02-21 04:29:20.718 [info] > git check-ignore -v -z --stdin [23ms]
// 2024-02-21 04:29:21.818 [info] > git show --textconv :misc/project-91/project-91/src/script.js [27ms]
// 2024-02-21 04:29:21.819 [info] > git ls-files --stage -- D:\GitHub\project16\misc\project-91\project-91\src\script.js [25ms]
// 2024-02-21 04:29:21.846 [info] > git cat-file -s de46746d33bea9f0b36faba135cee5695a4b8701 [25ms]
// 2024-02-21 04:29:34.760 [info] > git add -A -- . [164ms]
// 2024-02-21 04:29:34.889 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [127ms]
// 2024-02-21 04:29:34.915 [info] > git config --get commit.template [23ms]
// 2024-02-21 04:29:34.944 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:29:34.947 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:29:34.974 [info] > git status -z -uall [25ms]
// 2024-02-21 04:29:35.017 [info] > git merge-base refs/heads/main refs/remotes/origin/main [31ms]
// 2024-02-21 04:29:35.047 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [27ms]
// 2024-02-21 04:29:36.644 [info] > git push origin main:main [1664ms]
// 2024-02-21 04:29:36.644 [info] remote: 
// remote: GitHub found 4 vulnerabilities on kennethlarotyamat/project15's default branch (1 high, 3 moderate). To find out more, visit:        
// remote:      https://github.com/kennethlarotyamat/project15/security/dependabot        
// remote: 
// To https://github.com/kennethlarotyamat/project15.git
//    4485fa3..0ba0a81  main -> main
// 2024-02-21 04:29:36.674 [info] > git config --get commit.template [28ms]
// 2024-02-21 04:29:36.676 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:29:36.703 [info] > git status -z -uall [25ms]
// 2024-02-21 04:29:36.770 [info] > git merge-base refs/heads/main refs/remotes/origin/main [62ms]
// 2024-02-21 04:29:36.787 [info] > git config --get commit.template [43ms]
// 2024-02-21 04:29:36.787 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [40ms]
// 2024-02-21 04:29:36.804 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [33ms]
// 2024-02-21 04:29:36.817 [info] > git status -z -uall [27ms]
// 2024-02-21 04:29:48.446 [info] > git check-ignore -v -z --stdin [24ms]
// 2024-02-21 04:29:50.011 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\misc\project14\intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30\main.js [27ms]
// 2024-02-21 04:29:50.134 [info] > git cat-file -s d0861f1bb10e2095ee3ab7f1e2f0b757b3e6d441 [118ms]
// 2024-02-21 04:29:50.134 [info] > git show --textconv :misc/project14/intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30/main.js [153ms]
// 2024-02-21 04:29:57.143 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:29:57.144 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:29:57.174 [info] > git status -z -uall [28ms]
// 2024-02-21 04:30:01.333 [info] > git add -A -- . [177ms]
// 2024-02-21 04:30:01.333 [info] warning: in the working copy of 'misc/project14/intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30/main.js', LF will be replaced by CRLF the next time Git touches it
// 2024-02-21 04:30:01.549 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [213ms]
// 2024-02-21 04:30:01.576 [info] > git config --get commit.template [24ms]
// 2024-02-21 04:30:01.608 [info] > git config --get commit.template [29ms]
// 2024-02-21 04:30:01.610 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
// 2024-02-21 04:30:01.642 [info] > git status -z -uall [29ms]
// 2024-02-21 04:30:01.684 [info] > git merge-base refs/heads/main refs/remotes/origin/main [34ms]
// 2024-02-21 04:30:01.717 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [29ms]
// 2024-02-21 04:31:02.998 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\misc\project14\intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30\main.js [29ms]
// 2024-02-21 04:31:03.026 [info] > git cat-file -s 4eeef4bac7bc5191b03320efb5bec6c725fc0f1a [25ms]
// 2024-02-21 04:31:03.056 [info] > git show --textconv :misc/project14/intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30/main.js [26ms]
// 2024-02-21 04:31:05.766 [info] > git push origin main:main [64121ms]
// 2024-02-21 04:31:05.766 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
// send-pack: unexpected disconnect while reading sideband packet
// fatal: the remote end hung up unexpectedly
// Everything up-to-date
// 2024-02-21 04:31:05.797 [info] > git config --get commit.template [28ms]
// 2024-02-21 04:31:05.798 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 04:31:07.943 [info] > git status -z -uall [2143ms]
// 2024-02-21 04:31:08.020 [info] > git config --get commit.template [66ms]
// 2024-02-21 04:31:08.030 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [73ms]
// 2024-02-21 04:31:08.061 [info] > git status -z -uall [28ms]
// 2024-02-21 04:31:25.208 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\misc\project14\intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30\modal.js [25ms]
// 2024-02-21 04:31:25.535 [info] > git cat-file -s 65aebb75f89e209794918fcff09b92bb21b4bf19 [325ms]
// 2024-02-21 04:31:25.536 [info] > git show --textconv :misc/project14/intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30/modal.js [357ms]
// 2024-02-21 04:31:32.852 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:31:32.854 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 04:31:32.884 [info] > git status -z -uall [27ms]
// 2024-02-21 04:31:37.933 [info] > git config --get commit.template [30ms]
// 2024-02-21 04:31:37.935 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
// 2024-02-21 04:31:37.965 [info] > git status -z -uall [27ms]
// 2024-02-21 04:31:43.001 [info] > git config --get commit.template [29ms]
// 2024-02-21 04:31:43.003 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 04:31:43.033 [info] > git status -z -uall [28ms]
// 2024-02-21 04:31:45.824 [info] > git add -A -- . [174ms]
// 2024-02-21 04:31:45.824 [info] warning: in the working copy of 'misc/project14/intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30/modal.js', LF will be replaced by CRLF the next time Git touches it
// 2024-02-21 04:31:45.992 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [166ms]
// 2024-02-21 04:31:46.018 [info] > git config --get commit.template [24ms]
// 2024-02-21 04:31:46.050 [info] > git config --get commit.template [28ms]
// 2024-02-21 04:31:46.052 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 04:31:46.084 [info] > git status -z -uall [29ms]
// 2024-02-21 04:31:46.130 [info] > git merge-base refs/heads/main refs/remotes/origin/main [31ms]
// 2024-02-21 04:31:46.163 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [30ms]
// 2024-02-21 04:31:47.274 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\misc\project14\intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30\modal.js [32ms]
// 2024-02-21 04:31:47.311 [info] > git cat-file -s feda1c26b2f2966029879a5fc0c29001c7578c56 [34ms]
// 2024-02-21 04:31:47.346 [info] > git show --textconv :misc/project14/intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30/modal.js [30ms]
// 2024-02-21 04:32:54.910 [info] > git push origin main:main [814969ms]
// 2024-02-21 04:32:54.910 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
// send-pack: unexpected disconnect while reading sideband packet
// fatal: the remote end hung up unexpectedly
// Everything up-to-date
// 2024-02-21 04:32:54.944 [info] > git config --get commit.template [31ms]
// 2024-02-21 04:32:54.947 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [33ms]
// 2024-02-21 04:32:54.977 [info] > git status -z -uall [27ms]
// 2024-02-21 04:32:55.077 [info] > git config --get commit.template [49ms]
// 2024-02-21 04:32:55.080 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [48ms]
// 2024-02-21 04:32:55.115 [info] > git status -z -uall [33ms]
// 2024-02-21 04:33:14.151 [info] > git check-ignore -v -z --stdin [23ms]
// 2024-02-21 04:33:23.477 [info] > git show --textconv :misc/project14/intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30/main.js [26ms]
// 2024-02-21 04:33:23.477 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\misc\project14\intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30\main.js [25ms]
// 2024-02-21 04:33:23.507 [info] > git cat-file -s 4eeef4bac7bc5191b03320efb5bec6c725fc0f1a [27ms]
// 2024-02-21 04:33:40.296 [info] > git add -A -- . [147ms]
// 2024-02-21 04:33:40.296 [info] warning: in the working copy of 'misc/project-91/project-91/src/script.js', LF will be replaced by CRLF the next time Git touches it
// 2024-02-21 04:33:40.403 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [104ms]
// 2024-02-21 04:33:40.429 [info] > git config --get commit.template [23ms]
// 2024-02-21 04:33:40.459 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:33:40.462 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:33:40.489 [info] > git status -z -uall [25ms]
// 2024-02-21 04:33:40.529 [info] > git merge-base refs/heads/main refs/remotes/origin/main [32ms]
// 2024-02-21 04:33:40.561 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [28ms]
// 2024-02-21 04:33:55.167 [info] > git push origin main:main [14672ms]
// 2024-02-21 04:33:55.167 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
// send-pack: unexpected disconnect while reading sideband packet
// fatal: the remote end hung up unexpectedly
// Everything up-to-date
// 2024-02-21 04:33:55.197 [info] > git config --get commit.template [28ms]
// 2024-02-21 04:33:55.201 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
// 2024-02-21 04:33:55.228 [info] > git status -z -uall [25ms]
// 2024-02-21 04:33:55.320 [info] > git config --get commit.template [48ms]
// 2024-02-21 04:33:55.324 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [49ms]
// 2024-02-21 04:33:55.358 [info] > git status -z -uall [31ms]
// 2024-02-21 04:34:17.088 [info] > git show --textconv :misc/project-91/project-91/src/script.js [32ms]
// 2024-02-21 04:34:17.089 [info] > git ls-files --stage -- D:\GitHub\project16\misc\project-91\project-91\src\script.js [31ms]
// 2024-02-21 04:34:17.120 [info] > git cat-file -s e6b0349998ad203cbd44dd9130c6d90fe0612739 [28ms]
// 2024-02-21 04:34:22.142 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\misc\project14\intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30\main.js [28ms]
// 2024-02-21 04:34:22.144 [info] > git show --textconv :misc/project14/intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30/main.js [32ms]
// 2024-02-21 04:34:22.169 [info] > git cat-file -s 4eeef4bac7bc5191b03320efb5bec6c725fc0f1a [25ms]
// 2024-02-21 04:34:22.547 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:34:22.551 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
// 2024-02-21 04:34:22.580 [info] > git status -z -uall [27ms]
// 2024-02-21 04:34:27.745 [info] > git add -A -- . [46ms]
// 2024-02-21 04:34:27.745 [info] warning: in the working copy of 'misc/project-91/project-91/src/script.js', LF will be replaced by CRLF the next time Git touches it
// 2024-02-21 04:34:27.922 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [175ms]
// 2024-02-21 04:34:27.948 [info] > git config --get commit.template [24ms]
// 2024-02-21 04:34:27.978 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:34:27.981 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 04:34:28.010 [info] > git status -z -uall [27ms]
// 2024-02-21 04:34:28.049 [info] > git merge-base refs/heads/main refs/remotes/origin/main [32ms]
// 2024-02-21 04:34:28.080 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [29ms]
// 2024-02-21 04:35:35.095 [info] > git push origin main:main [67080ms]
// 2024-02-21 04:35:35.095 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
// send-pack: unexpected disconnect while reading sideband packet
// fatal: the remote end hung up unexpectedly
// Everything up-to-date
// 2024-02-21 04:35:35.140 [info] > git config --get commit.template [43ms]
// 2024-02-21 04:35:35.143 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [42ms]
// 2024-02-21 04:35:35.201 [info] > git status -z -uall [55ms]
// 2024-02-21 04:35:35.313 [info] > git config --get commit.template [51ms]
// 2024-02-21 04:35:35.317 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [48ms]
// 2024-02-21 04:35:35.360 [info] > git status -z -uall [40ms]
// 2024-02-21 04:35:36.753 [info] > git push origin main:main [230662ms]
// 2024-02-21 04:35:36.753 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
// send-pack: unexpected disconnect while reading sideband packet
// fatal: the remote end hung up unexpectedly
// Everything up-to-date
// 2024-02-21 04:35:36.792 [info] > git config --get commit.template [35ms]
// 2024-02-21 04:35:36.795 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [35ms]
// 2024-02-21 04:35:37.154 [info] > git status -z -uall [356ms]
// 2024-02-21 04:35:37.216 [info] > git config --get commit.template [29ms]
// 2024-02-21 04:35:37.219 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [31ms]
// 2024-02-21 04:35:37.251 [info] > git status -z -uall [29ms]
// 2024-02-21 04:35:53.166 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\javascript\12project10script.js [27ms]
// 2024-02-21 04:35:53.285 [info] > git cat-file -s d17c5b1bcd6cde28bdca8e4de83a7e3fad4221b7 [116ms]
// 2024-02-21 04:35:53.285 [info] > git show --textconv :javascript/12project10script.js [149ms]
// 2024-02-21 04:35:58.831 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:35:58.834 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 04:35:58.867 [info] > git status -z -uall [30ms]
// 2024-02-21 04:36:03.904 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:36:03.906 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 04:36:03.939 [info] > git status -z -uall [29ms]
// 2024-02-21 04:36:08.981 [info] > git config --get commit.template [29ms]
// 2024-02-21 04:36:08.982 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
// 2024-02-21 04:36:09.014 [info] > git status -z -uall [29ms]
// 2024-02-21 04:36:14.057 [info] > git config --get commit.template [33ms]
// 2024-02-21 04:36:14.062 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [36ms]
// 2024-02-21 04:36:14.098 [info] > git status -z -uall [32ms]
// 2024-02-21 04:36:20.131 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:36:20.133 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:36:20.164 [info] > git status -z -uall [29ms]
// 2024-02-21 04:36:34.340 [info] > git add -A -- . [183ms]
// 2024-02-21 04:36:34.340 [info] warning: in the working copy of 'misc/project14/intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30/main.js', LF will be replaced by CRLF the next time Git touches it
// warning: in the working copy of 'misc/project14/intermediate-javascript-and-the-dom--lesson-2-3---sat---sept-30/modal.js', LF will be replaced by CRLF the next time Git touches it
// 2024-02-21 04:36:34.504 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [163ms]
// 2024-02-21 04:36:34.529 [info] > git config --get commit.template [23ms]
// 2024-02-21 04:36:34.560 [info] > git config --get commit.template [28ms]
// 2024-02-21 04:36:34.562 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 04:36:34.594 [info] > git status -z -uall [30ms]
// 2024-02-21 04:36:34.638 [info] > git merge-base refs/heads/main refs/remotes/origin/main [35ms]
// 2024-02-21 04:36:34.670 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [29ms]
// 2024-02-21 04:36:40.752 [info] > git check-ignore -v -z --stdin [23ms]
// 2024-02-21 04:36:41.989 [info] > git check-ignore -v -z --stdin [23ms]
// 2024-02-21 04:36:45.921 [info] > git check-ignore -v -z --stdin [25ms]
// 2024-02-21 04:36:47.063 [info] > git check-ignore -v -z --stdin [24ms]
// 2024-02-21 04:36:47.886 [info] > git check-ignore -v -z --stdin [25ms]
// 2024-02-21 04:36:50.083 [info] > git show --textconv :CSS/project16.css [34ms]
// 2024-02-21 04:36:50.084 [info] > git ls-files --stage -- D:\GitHub\project16\CSS\project16.css [32ms]
// 2024-02-21 04:36:50.113 [info] > git cat-file -s ec14e5b299d1127e6a64dec0fad00db120955596 [26ms]
// 2024-02-21 04:36:54.661 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:36:54.663 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
// 2024-02-21 04:36:54.689 [info] > git status -z -uall [24ms]
// 2024-02-21 04:36:59.728 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:36:59.729 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:36:59.756 [info] > git status -z -uall [24ms]
// 2024-02-21 04:37:04.789 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:37:04.791 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 04:37:04.817 [info] > git status -z -uall [24ms]
// 2024-02-21 04:37:08.339 [info] > git push origin main:main [33740ms]
// 2024-02-21 04:37:08.339 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
// send-pack: unexpected disconnect while reading sideband packet
// fatal: the remote end hung up unexpectedly
// Everything up-to-date
// 2024-02-21 04:37:08.370 [info] > git config --get commit.template [28ms]
// 2024-02-21 04:37:08.371 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:37:08.401 [info] > git status -z -uall [27ms]
// 2024-02-21 04:37:08.471 [info] > git config --get commit.template [41ms]
// 2024-02-21 04:37:08.474 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [42ms]
// 2024-02-21 04:37:08.503 [info] > git status -z -uall [27ms]
// 2024-02-21 04:37:12.414 [info] > git config --get commit.template [33ms]
// 2024-02-21 04:37:12.423 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [39ms]
// 2024-02-21 04:37:12.464 [info] > git status -z -uall [39ms]
// 2024-02-21 04:37:24.728 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:37:24.731 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 04:37:24.761 [info] > git status -z -uall [28ms]
// 2024-02-21 04:37:34.074 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:37:34.078 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:37:34.141 [info] > git status -z -uall [59ms]
// 2024-02-21 04:38:08.824 [info] > git config --get commit.template [29ms]
// 2024-02-21 04:38:08.827 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
// 2024-02-21 04:38:08.857 [info] > git status -z -uall [26ms]
// 2024-02-21 04:38:27.489 [info] > git config --get commit.template [31ms]
// 2024-02-21 04:38:27.491 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
// 2024-02-21 04:38:27.520 [info] > git status -z -uall [27ms]
// 2024-02-21 04:38:42.483 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:38:42.485 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:38:42.514 [info] > git status -z -uall [27ms]
// 2024-02-21 04:38:52.510 [info] > git config --get commit.template [28ms]
// 2024-02-21 04:38:52.511 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 04:38:52.539 [info] > git status -z -uall [26ms]
// 2024-02-21 04:38:57.570 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:38:57.572 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 04:38:57.600 [info] > git status -z -uall [25ms]
// 2024-02-21 04:39:16.210 [info] > git config --get commit.template [31ms]
// 2024-02-21 04:39:16.212 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [32ms]
// 2024-02-21 04:39:16.245 [info] > git status -z -uall [31ms]
// 2024-02-21 04:39:20.593 [info] > git add -A -- . [66ms]
// 2024-02-21 04:39:20.738 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [144ms]
// 2024-02-21 04:39:20.764 [info] > git config --get commit.template [24ms]
// 2024-02-21 04:39:20.794 [info] > git config --get commit.template [28ms]
// 2024-02-21 04:39:20.798 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
// 2024-02-21 04:39:20.825 [info] > git status -z -uall [25ms]
// 2024-02-21 04:39:20.873 [info] > git merge-base refs/heads/main refs/remotes/origin/main [35ms]
// 2024-02-21 04:39:20.941 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [65ms]
// 2024-02-21 04:39:22.019 [info] > git ls-files --stage -- D:\GitHub\project16\CSS\project16.css [26ms]
// 2024-02-21 04:39:22.049 [info] > git cat-file -s 74a72da8ccbdc9854d6789b878d5646d862f6f88 [28ms]
// 2024-02-21 04:39:22.085 [info] > git show --textconv :CSS/project16.css [32ms]
// 2024-02-21 04:40:40.501 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\ unlv\mis768\kly\CreateTranscript.java [25ms]
// 2024-02-21 04:40:40.503 [info] > git show --textconv :src/edu/unlv/mis768/kly/CreateTranscript.java [30ms]
// 2024-02-21 04:40:40.528 [info] > git cat-file -s 2a5566a9b816e69ca702bcbc62b4402e96fc0404 [25ms]
// 2024-02-21 04:40:56.913 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:40:56.915 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 04:40:56.946 [info] > git status -z -uall [28ms]
// 2024-02-21 04:41:01.987 [info] > git config --get commit.template [29ms]
// 2024-02-21 04:41:01.990 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
// 2024-02-21 04:41:02.021 [info] > git status -z -uall [29ms]
// 2024-02-21 04:41:07.065 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:41:07.067 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 04:41:07.097 [info] > git status -z -uall [27ms]
// 2024-02-21 04:41:39.982 [info] > git config --get commit.template [29ms]
// 2024-02-21 04:41:39.984 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 04:41:40.012 [info] > git status -z -uall [26ms]
// 2024-02-21 04:41:45.059 [info] > git config --get commit.template [31ms]
// 2024-02-21 04:41:45.061 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [31ms]
// 2024-02-21 04:41:45.091 [info] > git status -z -uall [27ms]
// 2024-02-21 04:41:55.570 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:41:55.572 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
// 2024-02-21 04:41:55.600 [info] > git status -z -uall [26ms]
// 2024-02-21 04:42:00.633 [info] > git config --get commit.template [29ms]
// 2024-02-21 04:42:00.635 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 04:42:00.665 [info] > git status -z -uall [27ms]
// 2024-02-21 04:42:04.244 [info] > git add -A -- . [177ms]
// 2024-02-21 04:42:04.419 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [173ms]
// 2024-02-21 04:42:04.444 [info] > git config --get commit.template [22ms]
// 2024-02-21 04:42:04.473 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:42:04.476 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:42:04.506 [info] > git status -z -uall [27ms]
// 2024-02-21 04:42:04.577 [info] > git merge-base refs/heads/main refs/remotes/origin/main [59ms]
// 2024-02-21 04:42:04.609 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [28ms]
// 2024-02-21 04:42:34.445 [info] > git show --textconv :src/edu/unlv/mis768/kly/CreateTranscript.java [28ms]
// 2024-02-21 04:42:34.445 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\ unlv\mis768\kly\CreateTranscript.java [26ms]
// 2024-02-21 04:42:34.474 [info] > git cat-file -s 47521a4ee5e5b78dd0abb618f4d177ea266316f0 [25ms]
// 2024-02-21 04:44:30.752 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\ unlv\mis768\kly\CreateTranscript.java [25ms]
// 2024-02-21 04:44:30.755 [info] > git show --textconv :src/edu/unlv/mis768/kly/CreateTranscript.java [30ms]
// 2024-02-21 04:44:30.782 [info] > git cat-file -s 47521a4ee5e5b78dd0abb618f4d177ea266316f0 [28ms]
// 2024-02-21 04:46:39.292 [info] > git push origin main:main [438460ms]
// 2024-02-21 04:46:39.292 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
// send-pack: unexpected disconnect while reading sideband packet
// fatal: the remote end hung up unexpectedly
// Everything up-to-date
// 2024-02-21 04:46:39.321 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:46:39.326 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [30ms]
// 2024-02-21 04:46:39.355 [info] > git status -z -uall [26ms]
// 2024-02-21 04:46:39.421 [info] > git config --get commit.template [42ms]
// 2024-02-21 04:46:39.424 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [44ms]
// 2024-02-21 04:46:39.451 [info] > git status -z -uall [25ms]
// 2024-02-21 04:46:45.097 [info] > git show --textconv :src/edu/unlv/mis768/kly/CreateTranscript.java [29ms]
// 2024-02-21 04:46:45.097 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\ unlv\mis768\kly\CreateTranscript.java [27ms]
// 2024-02-21 04:46:45.130 [info] > git cat-file -s 47521a4ee5e5b78dd0abb618f4d177ea266316f0 [31ms]
// 2024-02-21 04:46:56.350 [info] > git ls-files --stage -- D:\GitHub\kennethlarotyamat.github.io\src\edu\ unlv\mis768\kly\CreateTranscript.java [25ms]
// 2024-02-21 04:46:56.353 [info] > git show --textconv :src/edu/unlv/mis768/kly/CreateTranscript.java [30ms]
// 2024-02-21 04:46:56.377 [info] > git cat-file -s 47521a4ee5e5b78dd0abb618f4d177ea266316f0 [24ms]
// 2024-02-21 04:47:38.183 [info] > git show --textconv :misc/project-91/project-91/src/script.js [31ms]
// 2024-02-21 04:47:38.185 [info] > git ls-files --stage -- D:\GitHub\project16\misc\project-91\project-91\src\script.js [29ms]
// 2024-02-21 04:47:38.214 [info] > git cat-file -s cfb8b3deac8f8a672c22f87ec29ce9c384a3c13d [26ms]
// 2024-02-21 04:47:45.036 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:47:45.040 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 04:47:45.066 [info] > git status -z -uall [25ms]
// 2024-02-21 04:47:55.972 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:47:55.975 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [25ms]
// 2024-02-21 04:47:56.000 [info] > git status -z -uall [23ms]
// 2024-02-21 04:48:01.037 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:48:01.040 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:48:01.065 [info] > git status -z -uall [24ms]
// 2024-02-21 04:48:06.105 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:48:06.107 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 04:48:06.133 [info] > git status -z -uall [23ms]
// 2024-02-21 04:48:15.054 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:48:15.056 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:48:15.082 [info] > git status -z -uall [24ms]
// 2024-02-21 04:48:20.201 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:48:20.204 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 04:48:20.231 [info] > git status -z -uall [24ms]
// 2024-02-21 04:48:34.863 [info] > git config --get commit.template [27ms]
// 2024-02-21 04:48:34.864 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [27ms]
// 2024-02-21 04:48:34.889 [info] > git status -z -uall [24ms]
// 2024-02-21 04:48:53.329 [info] > git push origin main:main [408819ms]
// 2024-02-21 04:48:53.329 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
// send-pack: unexpected disconnect while reading sideband packet
// fatal: the remote end hung up unexpectedly
// Everything up-to-date
// 2024-02-21 04:48:53.358 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:48:53.362 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 04:48:53.396 [info] > git status -z -uall [31ms]
// 2024-02-21 04:48:53.469 [info] > git config --get commit.template [42ms]
// 2024-02-21 04:48:53.472 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [42ms]
// 2024-02-21 04:48:53.525 [info] > git status -z -uall [50ms]
// 2024-02-21 04:48:56.066 [info] > git config --get commit.template [40ms]
// 2024-02-21 04:48:56.069 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [37ms]
// 2024-02-21 04:48:56.118 [info] > git status -z -uall [44ms]
// 2024-02-21 04:49:11.683 [info] > git config --get commit.template [25ms]
// 2024-02-21 04:49:11.685 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [26ms]
// 2024-02-21 04:49:11.712 [info] > git status -z -uall [25ms]
// 2024-02-21 04:49:16.755 [info] > git config --get commit.template [26ms]
// 2024-02-21 04:49:16.760 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 04:49:16.787 [info] > git status -z -uall [25ms]
// 2024-02-21 04:49:31.509 [info] > git config --get commit.template [31ms]
// 2024-02-21 04:49:31.515 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [34ms]
// 2024-02-21 04:49:31.543 [info] > git status -z -uall [26ms]
// 2024-02-21 04:49:45.125 [info] > git add -A -- . [56ms]
// 2024-02-21 04:49:45.125 [info] warning: in the working copy of 'misc/project-91/project-91/src/script.js', LF will be replaced by CRLF the next time Git touches it
// 2024-02-21 04:49:45.349 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [222ms]
// 2024-02-21 04:49:45.373 [info] > git config --get commit.template [23ms]
// 2024-02-21 04:49:45.405 [info] > git config --get commit.template [29ms]
// 2024-02-21 04:49:45.408 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [29ms]
// 2024-02-21 04:49:45.436 [info] > git status -z -uall [26ms]
// 2024-02-21 04:49:45.491 [info] > git merge-base refs/heads/main refs/remotes/origin/main [48ms]
// 2024-02-21 04:49:45.534 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [41ms]
// 2024-02-21 04:52:28.321 [info] > git ls-tree -l HEAD -- D:\GitHub\kennethlarotyamat.github.io\src\edu\ unlv\mis768\kly\CreateTranscript.java [46ms]
// 2024-02-21 04:52:28.322 [info] > git show --textconv HEAD:src/edu/unlv/mis768/kly/CreateTranscript.java [50ms]
// 2024-02-21 04:52:34.454 [info] > git show --textconv :misc/project-91/project-91/src/script.js [29ms]
// 2024-02-21 04:52:34.455 [info] > git ls-files --stage -- D:\GitHub\project16\misc\project-91\project-91\src\script.js [26ms]
// 2024-02-21 04:52:34.483 [info] > git cat-file -s 78c80c29e9a67b130bbb96a5007020681cca79d5 [25ms]
// 2024-02-21 04:53:28.299 [info] > git log --format=%H%n%aN%n%aE%n%at%n%ct%n%P%n%D%n%B -z --shortstat --diff-merges=first-parent --author-date-order 0f74f39d9422082c4ddb1f2137ed007921979c60..6209828ef4296ae2596541fd5443dbc4e7deb5c9 [158ms]
// 2024-02-21 04:53:28.476 [info] > git diff --shortstat 0f74f39d9422082c4ddb1f2137ed007921979c60...6209828ef4296ae2596541fd5443dbc4e7deb5c9 [157ms]
// 2024-02-21 04:53:33.516 [info] > git diff --name-status -z --diff-filter=ADMR 0f9fbdb424d97038fd60295ab19f3c22ffd3b38e...6209828ef4296ae2596541fd5443dbc4e7deb5c9 [33ms]
// 2024-02-21 04:53:34.054 [info] > git check-ignore -v -z --stdin [24ms]
// 2024-02-21 04:53:34.747 [info] > git diff --name-status -z --diff-filter=ADMR 211af98af473017c070c9035092f08addab11c18...0f9fbdb424d97038fd60295ab19f3c22ffd3b38e [25ms]
// 2024-02-21 04:53:35.291 [info] > git check-ignore -v -z --stdin [24ms]
// 2024-02-21 04:53:36.421 [info] > git diff --name-status -z --diff-filter=ADMR c00e9ef1898daa76325260e190ee2095c9a61351...211af98af473017c070c9035092f08addab11c18 [27ms]
// 2024-02-21 04:53:36.964 [info] > git check-ignore -v -z --stdin [25ms]
// 2024-02-21 04:53:37.269 [info] > git diff --name-status -z --diff-filter=ADMR 81c7b296bb55c5d88cfa9a15c26b53d569e5a2a1...c00e9ef1898daa76325260e190ee2095c9a61351 [26ms]
// 2024-02-21 04:53:37.815 [info] > git check-ignore -v -z --stdin [23ms]
// 2024-02-21 04:53:37.989 [info] > git diff --name-status -z --diff-filter=ADMR a42be9395dbfdd335ed9c26ec1a6f797dbb9b180...81c7b296bb55c5d88cfa9a15c26b53d569e5a2a1 [27ms]
// 2024-02-21 04:53:38.535 [info] > git check-ignore -v -z --stdin [30ms]
// 2024-02-21 04:53:39.933 [info] > git diff --name-status -z --diff-filter=ADMR d86d04d32334f6cc21289ce37ebf57cce01b0ca5...a42be9395dbfdd335ed9c26ec1a6f797dbb9b180 [27ms]
// 2024-02-21 04:53:40.466 [info] > git check-ignore -v -z --stdin [23ms]
// 2024-02-21 04:53:41.459 [info] > git diff --name-status -z --diff-filter=ADMR 7e371f03b247c92726b32e43bd6367e7cec363ce...d86d04d32334f6cc21289ce37ebf57cce01b0ca5 [25ms]
// 2024-02-21 04:53:41.998 [info] > git check-ignore -v -z --stdin [27ms]
// 2024-02-21 04:53:42.548 [info] > git diff --name-status -z --diff-filter=ADMR 633ab65cbbc58fc92e09b97fd863e5d9a001acf3...7e371f03b247c92726b32e43bd6367e7cec363ce [26ms]
// 2024-02-21 04:53:43.094 [info] > git check-ignore -v -z --stdin [24ms]
// 2024-02-21 04:53:44.940 [info] > git diff --name-status -z --diff-filter=ADMR 0f74f39d9422082c4ddb1f2137ed007921979c60...633ab65cbbc58fc92e09b97fd863e5d9a001acf3 [42ms]
// 2024-02-21 04:53:45.495 [info] > git check-ignore -v -z --stdin [26ms]
// 2024-02-21 04:53:59.473 [info] > git log --oneline --cherry main...main@{upstream} -- [29ms]
// 2024-02-21 04:54:00.469 [info] > git pull --tags origin main [991ms]
// 2024-02-21 04:54:00.469 [info] From https://github.com/kennethlarotyamat/kennethlarotyamat.github.io
//  * branch            main       -> FETCH_HEAD
// 2024-02-21 04:54:07.147 [info] > git add -A -- . [176ms]
// 2024-02-21 04:54:07.317 [info] > git -c user.useConfigOnly=true commit --quiet --allow-empty-message --file - [168ms]
// 2024-02-21 04:54:07.342 [info] > git config --get commit.template [23ms]
// 2024-02-21 04:54:07.373 [info] > git config --get commit.template [28ms]
// 2024-02-21 04:54:07.375 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [28ms]
// 2024-02-21 04:54:07.405 [info] > git status -z -uall [28ms]
// 2024-02-21 04:54:07.444 [info] > git merge-base refs/heads/main refs/remotes/origin/main [30ms]
// 2024-02-21 04:54:07.474 [info] > git -c core.longpaths=true rev-list --count --left-right refs/heads/main...refs/remotes/origin/main [27ms]
// 2024-02-21 04:54:29.102 [info] > git ls-files --stage -- D:\GitHub\project16\misc\project-91\project-91\src\script.js [25ms]
// 2024-02-21 04:54:29.105 [info] > git show --textconv :misc/project-91/project-91/src/script.js [30ms]
// 2024-02-21 04:54:29.159 [info] > git cat-file -s 78c80c29e9a67b130bbb96a5007020681cca79d5 [55ms]
// 2024-02-21 04:54:33.260 [info] > git check-ignore -v -z --stdin [25ms]
// 2024-02-21 04:54:34.701 [info] > git show --textconv :misc/project-91/project-91/dist/script.js [28ms]
// 2024-02-21 04:54:34.702 [info] > git ls-files --stage -- D:\GitHub\project16\misc\project-91\project-91\dist\script.js [26ms]
// 2024-02-21 04:54:34.731 [info] > git cat-file -s de46746d33bea9f0b36faba135cee5695a4b8701 [27ms]
// 2024-02-21 04:54:36.582 [info] > git push origin main:main [29173ms]
// 2024-02-21 04:54:36.582 [info] error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
// send-pack: unexpected disconnect while reading sideband packet
// fatal: the remote end hung up unexpectedly
// Everything up-to-date
// 2024-02-21 04:54:36.618 [info] > git config --get commit.template [33ms]
// 2024-02-21 04:54:36.621 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [32ms]
// 2024-02-21 04:54:36.651 [info] > git status -z -uall [28ms]
// 2024-02-21 04:54:36.708 [info] > git config --get commit.template [42ms]
// 2024-02-21 04:54:36.718 [info] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) --ignore-case refs/heads/main refs/remotes/main [49ms]
// 2024-02-21 04:54:36.758 [info] > git status -z -uall [37ms]

// > git push origin main:main
// error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
// send-pack: unexpected disconnect while reading sideband packet
// fatal: the remote end hung up unexpectedly
// Everything up-to-date

// I don't know I guess it's a bad connection or something

// */