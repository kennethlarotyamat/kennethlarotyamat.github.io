package edu.unlv.mis.kly.w3;

import java.util.Scanner;

public class CityPopulation {

	public static void main(String[] args) {
												// int number = 0;							// reintroduced to reduce squiggly lines in eclipse- to be deleted later
		double  currentCityPopulation = 0;  		// originally the variable number - renamed to currentCityPopulation - Loop control variable
		double  cityGrowthRate = 0;					// may need to change from int to double or float
		int numberOfYears = 0;
		
												// Scanner object for keyboard input
		Scanner kb = new Scanner(System.in);
		
																							 // the number input has been changed - user input sets cityPopulation -  Get user input for the size of the square table
		System.out.print("Please enter the current city population in millions: ");
		currentCityPopulation = kb.nextDouble();                                       		 // kb.nextDouble();      kb.nextInt();   
		
		System.out.print("Please enter the projected city population growth rate: ");
		cityGrowthRate = kb.nextDouble();													// kb.nextDouble();     kb.nextInt();			
		
		System.out.print("Please enter the number of years into the future: ");		//    \n   -- this is not a good place to put a line break -- looks funny
		numberOfYears = kb.nextInt();
		
																					// print the table header
		System.out.println("\n");													// i find that it's better just to print a line break all on it's own -- i guess - it look funny when I inserted it into the other one
		System.out.println("Years          City Population"); 						// use      \n        to create a line break in java
		System.out.println("==============================");						//    		System.out.println("-----------------------");
																					//	System.out.println("-----------------------");
		
																					// use a loop to print from 1 to the number entered
		for (int i=0; i<=numberOfYears; i++) {										// i think that i should remove i<number												// number needs to be converted into city population -- i needs to be converted into number of years -- i need to use growth rate
																					// can also do
			// currentCityPopulation = currentCityPopulation * Math.pow(1 + cityGrowthRate / 100, i); 		//    numberOfYears-1     currentCityPopulation = currentCityPopulation * Math.pow(1 + cityGrowthRate / 100, i);
			System.out.printf("%d                %.2f\n", i, currentCityPopulation * Math.pow(1 + cityGrowthRate / 100, i)); 			// System.out.printf       (1+cityGrowthRate/100)      I think that i need to use Math.pow()   like compound interest			(1+(cityGrowthRate/100)));				// can also use \t to indicate space or use in place of actual spaces
		//  System.out.printf("%d                %.2f\n", i, currentCityPopulation * Math.pow(1 + cityGrowthRate / 100, i));
		//  System.out.printf("%d                %.2f\n",i + "                " + currentCityPopulation * Math.pow(1 + cityGrowthRate / 100, i));	
	        kb.close();
	         
	    }

	}

}






/*
 * 
 * 
 * 
 * 
	
PrintWriter class allows you
to write data to a file using
print and println
new line character

PrintWriter outputFile = new PrintWriter ("StudentData.txt");

		Please submit the .java file (i.e., the source files).
You can use printf() for formatted result
%3d for three digits of integer
%10.2f for a float number with 2 digits after the decimal point and a total length of 10 digits
		
(1+(cityGrowthRate/100)));		
		Please submit the .java file (i.e., the source files).
		You can use printf() for formatted result
		%3d for three digits of integer
		%10.2f for a float number with 2 digits after the decimal point and a total length of 10 digits



		This is originally the squares assignment being repurposed for the city population assignment  -- Repurposed 
																										  repurposed	
		
		System.out.print("Please enter an integer for printing the squares table: ");
		
		3: Artificial Intelligence (AI): Multidisciplinary Perspectives 
3.3.3.1 Leveraging large language models for predictive chemistry


Terminology:	Machine Learning
			Large Language Model
			LLM Training
			In context learning - this refers to how the LLM learns about a subject during the course 
                                       		of a chat session, rather than fine-tuning or training the model directly.		
			Inverse design - this refers to creating molecular structures - or chemicals - polymers or 
alloys - that react in a certain way, or have a specific set of properties - I think that it 
is called inverse design because, rather than creating a chemical, and describing its 
properties, - the desired properties are described, and then the molecule is designed
			Generative Models
			MLM - Machine Learning Model
			LLM - Large Language Model
			First-principles theory
                          Isomers - This is chemistry related
		Gaussian process regression - GPR
		Generative pretrained transformer - gpt

Application:	Large Language Models and machine learning to chemistry, and physical sciences
			Computing, programming, AI, ML, LLM on Physical sciences, chemistry, and predictive
				Simulations
			Generating a specific type of dispersant - which I think is a kind of soap - generating a 
dispersant with a specific set of characteristics

Limitations:		The LLM was able to generate molecules using inverse design, or, it was able to 
Hypothesize the existence of chemicals with a desired set of characteristics,
But there were instances where the LLM generated invalid chemical structures
Even if an LLM is able to generate a new chemical, that chemical still has to be synthesized
	And there are instances where it’s not really possible or practical to synthesize the
	Chemical generated by the LLM
It can be difficult to train an LLM accurately, or train it well for accuracy because very 
large dataset are required, and there are limitations on how many chemicals can be 
tested and added to a given data set to train an LLM on

Variations:		Using a general LLM AI tool (GPT 3) trained on chemistry documents Rather than a 
chemistry specific AI tool, or existing chemistry simulation tools conventional machine learning models designed for chemistry
Existing machine learning models represent chemicals or molecular structures 
	mathematically, or symbolically, or as a kind of code or program that reacts  	
a certain way, rather than verbally. Existing machine learning models simulate 
molecular structures in an abstract way, rather than verbally, the approach used in 
this paper, by these researchers, describes chemicals verbally
The GPT 3 LLM was compared with a gaussian process regression mlm

Reflections:	this was a really interesting article - one of the things that I’m wondering is: if copyright 
protection isn’t or cannot be granted to ai generated text or ai generated artwork, will patents also not be granted to ai generated chemicals? Or AI generated medicines or Pharmaceuticals? Or ai generated chemical compounds.
AI is already used to create novel chemical structures, however, the prevailing AI tools used for the purpose of generating novel chemical structures are Machine learning models, rather than large language models, this research paper approaches generating novel chemical structures using LLMs rather than MLMs






// (int i=0; i<number; i++)
 * 
 * (int i=1; i<=number; i++)   
 */
// System.out.println(i+1+"      "+(i+1)*(i+1));
