/*
 * Author's Name: 		    Kenneth Larot Yamat
 * Purpose of Program:      To calculate the amount of tax due 
 *                          based on a user-entered amount of taxable income
 * 						    given a tiered marginal income tax structure
 * Date Due:                February 4th, 2024
 */

package edu.unlv.mis.kly.w3;

import java.util.Scanner;

// this was originally IndividualAssignmentOne, however, in order to follow correct naming conventions, it has been change to TaxableIncomeCalculator, since
// the name of a class must describe what the class does.
// this name has been change a second time because I realize that it does not calculate taxable income, it calculates
// the amount of tax due based on the users taxable income.
public class TaxDueCalculator {

    public static void main(String[] args) {

        // these are the various tax rates used in calculating the
        // amount of tax due
        final double TEN_PERCENT = 0.10;
        final double TWELVE_PERCENT = 0.12;
        final double TWENTY_TWO_PERCENT = 0.22;
        final double TWENTY_FOUR_PERCENT = 0.24;
        final double THIRTY_TWO_PERCENT = 0.32;
        final double THIRTY_FIVE_PERCENT = 0.35;
        final double THIRTY_SEVEN_PERCENT = 0.37;
        final double ONE_HUNDRED_PERCENT = 1.00; // This is more or less not used, other than to end the ternary operator

        // this are the upper limits of each marginal tax bracket
        // the lower limit of any given tax bracket is basically the upper limit of the previous tax bracket
        // this is resolved in the code by using the comparison operator < 

        final double BRACKET_LIMIT_TEN = 11000;
        final double BRACKET_LIMIT_TWELVE = 44725;
        final double BRACKET_LIMIT_TWENTY_TWO = 95375;
        final double BRACKET_LIMIT_TWENTY_FOUR = 182100;
        final double BRACKET_LIMIT_THIRTY_TWO = 231250;
        final double BRACKET_LIMIT_THIRTY_FIVE = 578125;
        final double BRACKET_LIMIT_THIRTY_SEVEN = 578126;

        double taxableIncome = 0.00; // this initializes taxableIncome - this will be updated later on by the user when they enter their taxable income

        boolean invalidInformation = false; // invalid information is being declared and initialized as false - this becomes true if the user enters invalid information
        double taxDue = 0.00; // taxDue is declared and initialized

        Scanner kb = new Scanner(System.in); // this is where the keyboard is initialized
        try {
            System.out.print("Please enter your taxable income: ");

            // the next 3 statements are used for input validation -
            // this was originally a straight forward statement like:     taxableIncome = kb.nextDouble();
            // however, something like:  $ 578,126 would throw an input error because it contains a dollar bill sign, and a comma
            // and a space
            String userInput = kb.nextLine();

            // this removes extra spaces, commas, and dollar bill signs
            userInput = userInput.replaceAll("[, $]", "");

            // This parses the cleaned input to double - the user input information is then converted to taxableIncome
            // the user input is then rounded up to the nearest whole number before being used in calculations
            taxableIncome = Math.ceil(Double.parseDouble(userInput));
        }

        catch (java.util.InputMismatchException e) {
            // This causes any input other than a number to be classified as invalid information
            invalidInformation = true;                    
        }
        catch (java.lang.NumberFormatException e) {
            // this catch has been added because another issue has come up when i entered "Blordanicalimor" as my income // This causes any input other than a number to be classified as invalid information
            invalidInformation = true;
            /*
                This second catch statement was used to address the following exception:
                Please enter your taxable income: asadasddsa
				Exception in thread "main" java.lang.NumberFormatException: For input string: "asadasddsa"
				at java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
				at java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
				at java.base/java.lang.Double.parseDouble(Double.java:792)
				at nightmare1/edu.unlv.mis.kly.w3.TaxableIncomeCalculator.main(TaxableIncomeCalculator.java:62)
             
             
             */
        }

        if (taxableIncome < 0) {
            // this throws out a negative number and informs the user that negative taxable income cannot be processed by this program.
            System.out.print("Negative taxable income cannot be processed.");
        }

        else if (invalidInformation) {
            // this is active if a user enters non-numeric characters and informs the user that the information entered is not valid.
            System.out.print("The information entered is invalid.");
        }

        else { // this is where the taxes due calculations take place, after throwing out different types of invalid inputs, 
               // like negative numbers, letters, or special characters
            taxDue =
                        // start brackets
                                        // 10% on taxable income from $0 to $11,000
                                        (0 <= taxableIncome && taxableIncome <= BRACKET_LIMIT_TEN)
                                        ? 
                                        taxableIncome * TEN_PERCENT
                        // end 10
                                        // 12% on taxable income over $11,001 to $44,725
                                        : (BRACKET_LIMIT_TEN < taxableIncome && taxableIncome <= BRACKET_LIMIT_TWELVE)
                                        ? 
                                        (BRACKET_LIMIT_TEN * TEN_PERCENT) +                    // income taxable at 10%
                                        ((taxableIncome - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) // marginal income taxable at 12%
                        // end 12
                                        // 22% on taxable income over $44,726 to $95,375
                                        : (BRACKET_LIMIT_TWELVE < taxableIncome && taxableIncome <= BRACKET_LIMIT_TWENTY_TWO)
                                        ?
                                        (BRACKET_LIMIT_TEN * TEN_PERCENT) +                                 // income taxable at 10%
                                        ((BRACKET_LIMIT_TWELVE - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) +     // income taxable at 12%
                                        ((taxableIncome - BRACKET_LIMIT_TWELVE) * TWENTY_TWO_PERCENT)       // marginal income taxable at 22%

                        // end 22
                                        // 24% on taxable income over $95,376 to $182,100,
                                        : (BRACKET_LIMIT_TWENTY_TWO < taxableIncome && taxableIncome <= BRACKET_LIMIT_TWENTY_FOUR)
                                        ?
                                        (BRACKET_LIMIT_TEN * TEN_PERCENT) +                                         // income taxable at 10%
                                        ((BRACKET_LIMIT_TWELVE - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) +             // income taxable at 12%
                                        ((BRACKET_LIMIT_TWENTY_TWO - BRACKET_LIMIT_TWELVE) * TWENTY_TWO_PERCENT) +  // income taxable at 22%
                                        ((taxableIncome - BRACKET_LIMIT_TWENTY_TWO) * TWENTY_FOUR_PERCENT)          // marginal income taxable at 24%
                                        
                        // end 24
                                        // 32% on taxable income over $182,101to $231,250
                                        : (BRACKET_LIMIT_TWENTY_FOUR < taxableIncome && taxableIncome <= BRACKET_LIMIT_THIRTY_TWO)
                                        ?
                                        (BRACKET_LIMIT_TEN * TEN_PERCENT) +                                                     // income taxable at 10%
                                        ((BRACKET_LIMIT_TWELVE - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) +                         // income taxable at 12%
                                        ((BRACKET_LIMIT_TWENTY_TWO - BRACKET_LIMIT_TWELVE) * TWENTY_TWO_PERCENT) +              // income taxable at 22%    
                                        ((BRACKET_LIMIT_TWENTY_FOUR - BRACKET_LIMIT_TWENTY_TWO) * TWENTY_FOUR_PERCENT) +        // income taxable at 24%
                                        ((taxableIncome - BRACKET_LIMIT_TWENTY_FOUR) * THIRTY_TWO_PERCENT)                      // marginal income taxable at 32%

                        // end 32
                                        // 35% on taxable income over $231,251 to $578,125
                                        : (BRACKET_LIMIT_THIRTY_TWO < taxableIncome && taxableIncome <= BRACKET_LIMIT_THIRTY_FIVE)
                                        ?
                                        (BRACKET_LIMIT_TEN * TEN_PERCENT) +                                                 // income taxable at 10%
                                        ((BRACKET_LIMIT_TWELVE - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) +                     // income taxable at 12%
                                        ((BRACKET_LIMIT_TWENTY_TWO - BRACKET_LIMIT_TWELVE) * TWENTY_TWO_PERCENT) +          // income taxable at 22%
                                        ((BRACKET_LIMIT_TWENTY_FOUR - BRACKET_LIMIT_TWENTY_TWO) * TWENTY_FOUR_PERCENT) +    // income taxable at 24%
                                        ((BRACKET_LIMIT_THIRTY_TWO - BRACKET_LIMIT_TWENTY_FOUR) * THIRTY_TWO_PERCENT) +     // income taxable at 32%
                                        ((taxableIncome - BRACKET_LIMIT_THIRTY_TWO) * THIRTY_FIVE_PERCENT)                  // marginal income taxable at 35%
                        // end 35
                                        // 37% on taxable income over $578,126 or more
                                        : (BRACKET_LIMIT_THIRTY_FIVE < taxableIncome && taxableIncome >= BRACKET_LIMIT_THIRTY_SEVEN)
                                        ?
                                        (BRACKET_LIMIT_TEN * TEN_PERCENT) +                                                 // income taxable at 10%
                                        ((BRACKET_LIMIT_TWELVE - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) +                     // income taxable at 12%
                                        ((BRACKET_LIMIT_TWENTY_TWO - BRACKET_LIMIT_TWELVE) * TWENTY_TWO_PERCENT) +          // income taxable at 22%
                                        ((BRACKET_LIMIT_TWENTY_FOUR - BRACKET_LIMIT_TWENTY_TWO) * TWENTY_FOUR_PERCENT) +    // income taxable at 24%
                                        ((BRACKET_LIMIT_THIRTY_TWO - BRACKET_LIMIT_TWENTY_FOUR) * THIRTY_TWO_PERCENT) +     // income taxable at 32%
                                        ((BRACKET_LIMIT_THIRTY_FIVE - BRACKET_LIMIT_THIRTY_TWO) * THIRTY_FIVE_PERCENT) +    // income taxable at 35%        
                                        ((taxableIncome - BRACKET_LIMIT_THIRTY_FIVE) * THIRTY_SEVEN_PERCENT)                // marginal income taxable at 37%
                        // end 37                                        
                                        : ONE_HUNDRED_PERCENT;  // this one_hundred_percent isn't used other than to end the expression


                        System.out.print("The total tax due is: $" + Math.ceil(taxDue)); // Amount of tax due is rounded up to the nearest whole number

                    }
        			// this closes out the keyboard after the program runs
                    kb.close();

                }
                

            }

// i need to knock out these next two assignments so that i have the weekend. well. Friday through Sunday to do work work. 

// I really enjoyed this assignment, but I'm really nervous because of how long it took me, and because of how long it turned out to be.
//and also because how how much more involved the grading system is with this, but, i turned it in. and now I'm done with it.
            //taxableIncome = kb.nextDouble();
            //taxableIncome = kb.nextLine();
// I think that this is more or less ready to go. I just need to double check everything and see that it fits the grading rubric.
        // String taxableIncome = 0.00;
        /*
        finally {

}
         * 
         * Please enter your taxable income: asdasdasd
         * Exception in thread "main" java.util.InputMismatchException
         * at java.base/java.util.Scanner.throwFor(Scanner.java:947)
         * at java.base/java.util.Scanner.next(Scanner.java:1602)
         * at java.base/java.util.Scanner.nextDouble(Scanner.java:2573)
         * at nightmare1/edu.unlv.mis.kly.w3.TaxableIncomeCalculator.main(
         * TaxableIncomeCalculator.java:39)
         *  what a nightmare. i think that this works. when i enter: uasofua0ifjoiasdjfo 
         * or whatever, it prints the message "information not valid." 
         */
/*

        boolean  invalidInformation = !kb.nextDouble();

//        }

//        finally {
//            kb.close();
//        }
//        try {

...

System.out.print("The ticket class entered is not a valid ticket class");

}

keyboard.close();

...

I’m going to double check the references page before transferring the information over to the module 3 paper

MIS 764 1001 - 2024 Sprg <notifications@instructure.com> Mon, Jan 29, 12:20 PM (15 hours ago) to yamatk1 

Hi Folks Some of you have asked me about the module papers after class last Thursday. I am posting for the benefit of all. The module papers can be of 2 parts. The first part is the summary of the readings (1-2 paragraphs per reading). The second part can be a critique/analysis/list of recommendations based on your readings. So for example, the second part could be about a few points you things the readings missed. Or it could be about a point or two that really struck you in the readings and recommendations on how organizations can pursue those. Or it could be about a couple of ideas in the readings that you think need to be modified, and how they can be modified. In other words, how you decide to write the second part is up to you, as long as it is connected to the readings. 

Thanks Sutirtha

Module 3: It-Enabled Innovation 

3.1: The Relation Between It And Organizational Innovation 
1: The Role Of It In Organizational Innovation
 
correlations: 	number of servers to firm performance
computing capacity to firm performance
storage capacity to firm performance
number of patents to it investments
it expertise and firm performance
patents filed to commercialized products
moderate competition stimulates innovation
intense competition depresses innovation

variables:		productivity 
sales performance 
profitability 
value added 
stock returns 
return on investment
Economies of scale
Architectural flexibility
Diminishing returns
Limited impact

influences:		firm alignment and orientation
			posture
			governance
			internal conflict
			internal and external context
group conflict hinders adoption
actively fostering innovation
informal mechanisms
industry dynamics
gender diversity
Knowledge integration
Key actors

frameworks:	resource based view
			capabilities based perspective
industry convergence
Organizational innovation system

cases:			polaroid - misalignment
			xerox - failure to capitalize
			yahoo - failure to capitalize
			hospitality incumbents - dismissive of disruptors
			pharmaceutical companies - r&d failures lead to patent
acquisition resulting in depressed firm performance

limitations:		knowledge gaps
			outcome measurement
			Conceptual abstraction hinders implementation
			Difficulties in establishing causation between variables
			
2: The Nonlinear Influence Of Harmonious Information Technology 


Frameworks: 	HITA - Harmonious IT affordance
			Non-linear vs quadratic
Affordances not inherent in people or artifacts, but
 organizational relationships
Distinctions between Affordances  & impediments 
Resonance - HITA alignment preserves organizational 
memory 
Organizational inertia - delays in implementation
Adaptation
Paradox - tensions between interdependent elements


limitations:		Few studies use non-linear frameworks
			Most studies assume linear relationships


Variables:		IT Affordance
			IT appropriation


Guidance:		Promote positive hita or impede negative HITA
			Managing tensions to promote innovations
			Finding and leveraging existing paradoxes to stimulate
innovation - converting tensions into synergies

Examples:		New Collaborations tools that don’t integrate well with 
Existing Organizational memory tools, reducing HITA
Paradoxes - when innovation increases despite increasing
organizational misalignment

Perspectives:	IT Affordance misalignment may prevent standardization 
or an effort toward homogeneity and uniformity - or it may be perceived in this manner - but it is exactly this misalignment that results in novel solutions as disparate structures attempt to integrate with one another.


3: Strategic Relevance Of Organizational Virtues Enabled By IT
4: Information Technology And Organizational Innovation: 

3.2: Disruptive Innovations With It
1: Disruptive Innovation: Conceptual Foundations And Research Opportunities 
2: Agility In Responding To Disruptive Digital Innovation
3: The Disruptive Information Technology Innovation Model
4: The Disruptive Nature Of Information Technology Innovations

3.3: Innovating With Artificial Intelligence 
1: Artificial Intelligence In Organizations 
2: Ai Innovation Typology
3: Artificial Intelligence (Ai): Multidisciplinary Perspectives 
4: Strategic Use Of Ai


		// String input = "";
		// String result = "";


        // final String INVALID_INFORMATION = "The Information Entered is not Valid";

            // invalidInformation = !kb.hasNextDouble();

                                                                                            // REPLACE THIS WHEN READY
                                                                                            // REMEMBER TO CHECK BRACKET CONDITIONAL BRACKET RANGES

//else if (!kb.hasNextDouble()) {
                //System.out.print("The Information Entered is not Valid");
            //}



else{			//result = OTHER;
                System.out.print(INVALID_INFORMATION);
            }


Development commentary:

this started out as an iteration upon the shipment pricing calculator
and other class assignments were used as well, including the ticket pricing calculator.


...
		System.out.print("Please enter the weight of the package:");
		weight = kb.nextDouble();
		
		charge = weight * (weight<=WEIGHT_LIMIT? BASE_FEE: OVERWEIGHT_FEE);
		
		System.out.print("The total charge is:$" +charge);



        ...


		System.out.print("Please enter the ticket class: ");
		input = kb.nextLine();
		
		if (input.equals("1"))
			result = CLASS_1;
		else if (input.equals("2"))
			result = CLASS_2;
		else if (input.equals("3"))
			result = CLASS_3;
		else if (input.equals("4"))
			result = CLASS_4;
		else
			result = OTHER;
		System.out.print("The Price is: "+result);
		
		kb.close();
	}



BRACKET_LIMIT_THIRTY_FIVE < taxableIncome && 
I FIGURED SOMETHING OUT -- FOR THE FINAL TAX BRACKET CODE -- IT'S DIFFERENT THAN THE OTHER ONES --

                                        : (BRACKET_LIMIT_THIRTY_FIVE < taxableIncome && taxableIncome <= BRACKET_LIMIT_THIRTY_SEVEN)

: INVALID_INFORMATION
		final double INVALID_INFORMATION ;
I think that I'm done almost well with the tax brackets portion anyway.

                                        : (BRACKET_LIMIT_THIRTY_FIVE < taxableIncome && taxableIncome <= BRACKET_LIMIT_THIRTY_SEVEN)
                                        ?
                                        (BRACKET_LIMIT_TEN * TEN_PERCENT) + 
                                        ((BRACKET_LIMIT_TWELVE - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) +
                                        ((BRACKET_LIMIT_TWENTY_TWO - BRACKET_LIMIT_TWELVE) * TWENTY_TWO_PERCENT) +
                                        ((BRACKET_LIMIT_TWENTY_FOUR - BRACKET_LIMIT_TWENTY_TWO) * TWENTY_FOUR_PERCENT) +
                                        ((BRACKET_LIMIT_THIRTY_TWO - BRACKET_LIMIT_TWENTY_FOUR) * THIRTY_TWO_PERCENT) +
                                        ((BRACKET_LIMIT_THIRTY_FIVE - BRACKET_LIMIT_THIRTY_TWO) * THIRTY_FIVE_PERCENT) +
                                        ((taxableIncome - BRACKET_LIMIT_THIRTY_FIVE) * THIRTY_SEVEN_PERCENT)


                                        final double THIRTY_SEVEN_PERCENT = 0.37;


                                        : (BRACKET_LIMIT_THIRTY_TWO < taxableIncome && taxableIncome <= BRACKET_LIMIT_THIRTY_FIVE)
                                        ?
                                        (BRACKET_LIMIT_TEN * TEN_PERCENT) + 
                                        ((BRACKET_LIMIT_TWELVE - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) +
                                        ((BRACKET_LIMIT_TWENTY_TWO - BRACKET_LIMIT_TWELVE) * TWENTY_TWO_PERCENT) +
                                        ((BRACKET_LIMIT_TWENTY_FOUR - BRACKET_LIMIT_TWENTY_TWO) * TWENTY_FOUR_PERCENT) +
                                        ((BRACKET_LIMIT_THIRTY_TWO - BRACKET_LIMIT_TWENTY_FOUR) * THIRTY_TWO_PERCENT) +
                                        ((taxableIncome - BRACKET_LIMIT_THIRTY_TWO) * THIRTY_FIVE_PERCENT)



                                        : (BRACKET_LIMIT_TWENTY_TWO < taxableIncome && taxableIncome <= BRACKET_LIMIT_TWENTY_FOUR)
                                        ?
                                        (BRACKET_LIMIT_TEN * TEN_PERCENT) + 
                                        ((BRACKET_LIMIT_TWELVE - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) +
                                        ((BRACKET_LIMIT_TWENTY_TWO - BRACKET_LIMIT_TWELVE) * TWENTY_TWO_PERCENT) +
                                        ((BRACKET_LIMIT_TWENTY_FOUR - BRACKET_LIMIT_TWENTY_TWO) * TWENTY_FOUR_PERCENT) +
                                        ((taxableIncome - BRACKET_LIMIT_TWENTY_FOUR) * THIRTY_TWO_PERCENT)




                                        BRACKET_LIMIT_TWENTY_FOUR

I renamed this - well i had to create a copy of the original file, and rename the copy to follow the naming conventions requirement of the assignment
I'm going to be working on this from the file, the renamed - the copied and renamed file. = TaxableIncomeCalculator rather than IndividualAssignmentOne

                                        : (BRACKET_LIMIT_TWENTY_TWO < taxableIncome && taxableIncome <= BRACKET_LIMIT_TWENTY_FOUR)
                                        ?
                                        (BRACKET_LIMIT_TEN * TEN_PERCENT) + 
                                        ((BRACKET_LIMIT_TWELVE - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) +
                                        ((BRACKET_LIMIT_TWENTY_TWO - BRACKET_LIMIT_TWELVE) * TWENTY_TWO_PERCENT) +
                                        ((taxableIncome - BRACKET_LIMIT_TWENTY_TWO) * TWENTY_FOUR_PERCENT) 

//


Math.ceil(number) to get the round-up number.

: (BRACKET_LIMIT_TWENTY_TWO < taxableIncome && taxableIncome <= BRACKET_LIMIT_TWENTY_FOUR)
?
(BRACKET_LIMIT_TEN * TEN_PERCENT) + 
((BRACKET_LIMIT_TWELVE - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) +
((BRACKET_LIMIT_TWENTY_TWO - BRACKET_LIMIT_TWELVE) * TWENTY_TWO_PERCENT) +
((taxableIncome - BRACKET_LIMIT_TWENTY_TWO) * TWENTY_FOUR_PERCENT) 










//      double negativeTaxableIncome; // I wont be using this
I had to use a spreadsheet to figure out what was wrong with my math

the issue was that the first 11000 was being double taxed at the 12 percent bracket



		92750		10% on taxable income from $0 to $11,000, plus		
				12% on taxable income over $11,001 to $44,725, plus		
				22% on taxable income over $44,726 to $95,375, plus		
						
						
						
						
						
		11000	0.1	1100		
		44725	0.12	5367		
		48025	0.22	10565.5		
						
				17032.5		
						
						
						
						


(BRACKET_LIMIT_TWELVE < taxableIncome && taxableIncome <= BRACKET_LIMIT_TWENTY_TWO)
?
(BRACKET_LIMIT_TEN * TEN_PERCENT) + 
((taxableIncome - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) +
((taxableIncome - BRACKET_LIMIT_TWELVE) * TWENTY_TWO_PERCENT)

(taxableIncome <= BRACKET_LIMIT_TEN && taxableIncome > 0)                           
                        (taxableIncome <= BRACKET_LIMIT_TEN && taxableIncome > 0) 





(taxableIncome <= BRACKET_LIMIT_TWELVE && BRACKET_LIMIT_TEN < taxableIncome)
(BRACKET_LIMIT_TEN < taxableIncome  &&     taxableIncome <= BRACKET_LIMIT_TWELVE )











 */





// i need a ternary conditional operator for before the first tax bracket for
// negative numbers
// something like if taxable income is less than zero
// I'm making progress here. thank god!
// I have to convert this ternary conditional operators to if or else if or if
// else statements because
// I'm already confused about how to do the next ternary conditional operators
// in the chain.

/*
 * BRACKET_LIMIT_TEN <
 * taxDue = (taxableIncome <= BRACKET_LIMIT_TEN) ?
 * taxableIncome * TEN_PERCENT :
 * 
 * (taxableIncome <= BRACKET_LIMIT_TWELVE) ?
 * (BRACKET_LIMIT_TEN * TEN_PERCENT) + ((taxableIncome - BRACKET_LIMIT_TEN) *
 * TWELVE_PERCENT) :
 * 
 * // Add additional condition or expression here if needed
 * (BRACKET_LIMIT_TWELVE * TWELVE_PERCENT) + ((taxableIncome -
 * BRACKET_LIMIT_TWELVE) * ANOTHER_PERCENT);
 * 
 * 
 */
/*
 * 
 * taxDue = (taxableIncome <= BRACKET_LIMIT_TEN) ?
 * taxableIncome * TEN_PERCENT :
 * (BRACKET_LIMIT_TEN * TEN_PERCENT) + ((taxableIncome - BRACKET_LIMIT_TEN) *
 * TWELVE_PERCENT);
 * 
 * taxDue = taxableIncome * (taxableIncome <= BRACKET_LIMIT_TEN ? TEN_PERCENT :
 * (TWELVE_PERCENT - (11000 * TEN_PERCENT)));
 * 
 * 
 * 
 * final double BRACKET_LIMIT_TEN = 20;
 * //37% on taxable income over $578,126 or more
 * // 10% on taxable income from $0 to $11,000, plus
 * //12% on taxable income over $11,001 to $44,725, plus
 * //22% on taxable income over $44,726 to $95,375, plus
 * //24% on taxable income over $95,376 to $182,100, plus
 * //32% on taxable income over $182,101 to $231,250, plus
 * //35% on taxable income over $231,251 to $578,125, plus
 * 10% on taxable income from $0 to $11,000, plus
 * final double BRACKET_LIMIT_TEN = 20;
 * 12% on taxable income over $11,001 to $44,725, plus
 * final double BRACKET_LIMIT_TWELVE = 20;
 * 22% on taxable income over $44,726 to $95,375, plus
 * final double BRACKET_LIMIT_TWENTY_TWO = 20;
 * 24% on taxable income over $95,376 to $182,100, plus
 * final double BRACKET_LIMIT_TWENTY-FOUR = 20;
 * 32% on taxable income over $182,101 to $231,250, plus
 * final double BRACKET_LIMIT_THIRTY_TWO = 20;
 * 35% on taxable income over $231,251 to $578,125, plus
 * final double BRACKET_LIMIT_THIRTY_FIVE = 20;
 * 37% on taxable income over $578,126 or more 578126
 * final double BRACKET_LIMIT_THIRTY_SEVEN = 20;
 * 
 * taxDue
 * // 
 * 
 * TO1DO Auto- 
 * generated 
 * method  
 * stub
 * 
 * 
 * taxableIncome
 * 
 * 10% on taxable income from $0 to $11,000, plus 11000
 * final double BRACKET_LIMIT_TEN = 20;
 * 12% on taxable income over $11,001 to $44,725, plus 44725
 * final double BRACKET_LIMIT_TWELVE = 20;
 * 22% on taxable income over $44,726 to $95,375, plus 95375
 * final double BRACKET_LIMIT_TWENTY_TWO = 20;
 * 24% on taxable income over $95,376 to $182,100, plus 182100
 * final double BRACKET_LIMIT_TWENTY-FOUR = 20;
 * 32% on taxable income over $182,101 to $231,250, plus 231250
 * final double BRACKET_LIMIT_THIRTY_TWO = 20;
 * 35% on taxable income over $231,251 to $578,125, plus 578125
 * final double BRACKET_LIMIT_THIRTY_FIVE = 20;
 * 37% on taxable income over $578,126 or more
 * final double BRACKET_LIMIT_THIRTY_SEVEN = 20;
 * 
 * 
 * 
 * final String CLASS_1 = "$15";
 * final String CLASS_2 = "$15";
 * final String CLASS_3 = "$25";
 * final String CLASS_4 = "$35";
 * final String OTHER = "Invalid";
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * public static void main(String[] args) {
 * // TO1DO Auto-generated method stub
 * final double BASE_FEE = 4.5;
 * final double OVERWEIGHT_FEE = 7;
 * final double WEIGHT_LIMIT = 20;
 * 
 * double weight;
 * double charge;
 * 
 * Scanner kb = new Scanner(System.in);
 * try {
 * 
 * 
 * 
 * System.out.print("Please enter the weight of the package:");
 * weight = kb.nextDouble();
 * 
 * charge = weight * (weight<=WEIGHT_LIMIT? BASE_FEE: OVERWEIGHT_FEE);
 * 
 * System.out.print("The total charge is:$" +charge);
 * }
 * 
 * finally {
 * kb.close();
 * }
 * 
 * }
 * 
 * 
 * package com.chestnutandhazel.edu.unlv.mis768.labwork;
 * 
 * public class WageCalculatorP {
 * 
 * public static void main(String[] args) {
 * // constants
 * 
 * final double BASE_PAY = 25;
 * final double REGULAR_HOURS = 40;
 * 
 * // declare variables
 * double salary; // salary to be calculated
 * double hours = 57;
 * 
 * salary = (hours - REGULAR_HOURS) * BASE_PAY * 0.5 + hours * BASE_PAY;
 * 
 * 
 * System.out.print("The Salary is $" + salary);
 * 
 * }
 * 
 * }
 * 
 * Resources:
 * 
 * https://www.geeksforgeeks.org/java-math-class/
 * 
 * ...
 * 
 * there was another assignment, a package weight assignment, and this also
 * might be another approach that i can use. it's
 * something like a package weight calculator. or package weight pricing
 * calculator.
 * 
 * ...
 * 
 * I'm thinking that I should start off with something similar to the ticket
 * class assignment
 * 
 * Resources:
 * 
 * https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
 * 
 * https://www.w3schools.com/java/java_math.asp
 * 
 * https://www.javatpoint.com/java-math
 * 
 * https://docs.oracle.com/javase/tutorial/java/concepts/
 * 
 * https://www.geeksforgeeks.org/java-math-class/
 * 
 * 
 * Availability and Response Time
 * I will be logging in to this course to answer questions and provide feedback
 * twice a day Monday-Friday. I will not be answering questions over the
 * weekends or on holidays.
 * 
 * You can attend the Office Hours on Tuesdays and Thursdays from 12-2 pm:
 * https://calendar.app.google/4o3svZoNqmAyi61cALinks to an external site..
 * If the regular office hours do not work for you, please feel free to email me
 * to set up appointments.
 * Resources
 * How do I send a message to a user (including the instructor) in a course in
 * the InboxLinks to an external site.?
 * 
 * ...
 * 
 * Correction: Assignment 1 tax bracket
 * Han-Fen Hu (She/Her)
 * All Sections
 * No unread replies.No replies.
 * Hi All,
 * 
 * I would like to make a correct on Individual Assignment 1: the tax bracket
 * for 35% should start with $231,251 (instead of $231,250).
 * 
 * I have updated the assignment sheet and the assignment page. Sorry about the
 * error!
 * 
 * Once again, Individual Assignment 1 is due on February 4. Please feel free to
 * reach out if you have any questions or need help with the assignment.
 * 
 * Han-fen
 * 
 * This announcement is closed for comments
 * 
 * ...
 * 
 * Purpose
 * Declare variables and constants and use them in a program.
 * Design a decision structure to evaluate different conditions and execute
 * different instructions accordingly.
 * Handle user input and show output/results properly.
 * Requirement
 * Please provide proper comments to document your code, including the
 * following:
 * Author’s name
 * Purpose of the program
 * In-line comments for the statements, including the variable/constant
 * declaration and initialization.
 * Please submit the .java file(s) that contains the program for solving the
 * following question.
 * Write a program that computes the income tax for an individual.
 * The program should ask the user to enter the amount of taxable income. If the
 * user enters a negative number, the program should show an error message and
 * end the program.
 * 
 * The program then uses the tax bracket (as shown below) to calculate the tax
 * amount:
 * 10% on taxable income from $0 to $11,000, plus
 * 12% on taxable income over $11,001 to $44,725, plus
 * 22% on taxable income over $44,726 to $95,375, plus
 * 24% on taxable income over $95,376 to $182,100, plus
 * 32% on taxable income over $182,101 to $231,250, plus
 * 35% on taxable income over $231,251 to $578,125, plus
 * 37% on taxable income over $578,126 or more
 * 
 * The program should display the total income and the total tax due.
 * 
 * Note: The income and tax amount should be rounded up to the next whole
 * number. You can use Math.ceil(number) to get the round-up number.
 * 
 * ...
 * 
 * 
 * 
 * 
 




 Module 3: It-Enabled Innovation 

3.1: The Relation Between It And Organizational Innovation 
1: The Role Of It In Organizational Innovation
 
correlations: 	number of servers to firm performance
computing capacity to firm performance
storage capacity to firm performance
number of patents to it investments
it expertise and firm performance
patents filed to commercialized products
moderate competition stimulates innovation
intense competition depresses innovation

variables:		productivity 
sales performance 
profitability 
value added 
stock returns 
return on investment
Economies of scale
Architectural flexibility
Diminishing returns
Limited impact

influences:		firm alignment and orientation
			posture
			governance
			internal conflict
			internal and external context
group conflict hinders adoption
actively fostering innovation
informal mechanisms
industry dynamics
gender diversity
Knowledge integration
Key actors

frameworks:	resource based view
			capabilities based perspective
industry convergence
Organizational innovation system

cases:			polaroid - misalignment
			xerox - failure to capitalize
			yahoo - failure to capitalize
			hospitality incumbents - dismissive of disruptors
			pharmaceutical companies - r&d failures lead to patent
acquisition resulting in depressed firm performance

limitations:		knowledge gaps
			outcome measurement
			Conceptual abstraction hinders implementation
			Difficulties in establishing causation between variables
			
2: The Nonlinear Influence Of Harmonious Information Technology 


Frameworks: 	HITA - Harmonious IT affordance
			Non-linear vs quadratic
Affordances not inherent in people or artifacts, but
 organizational relationships
Distinctions between Affordances  & impediments 
Resonance - HITA alignment preserves organizational 
memory 
Organizational inertia - delays in implementation
Adaptation
Paradox - tensions between interdependent elements


limitations:		Few studies use non-linear frameworks
			Most studies assume linear relationships


Variables:		IT Affordance
			IT appropriation


Guidance:		Promote positive hita or impede negative HITA
			Managing tensions to promote innovations
			Finding and leveraging existing paradoxes to stimulate
innovation - converting tensions into synergies

Examples:		New Collaborations tools that don’t integrate well with 
Existing Organizational memory tools, reducing HITA
Paradoxes - when innovation increases despite increasing
organizational misalignment

Perspectives:	IT Affordance misalignment may prevent standardization 
or an effort toward homogeneity and uniformity - or it may be perceived in this manner - but it is exactly this misalignment that results in novel solutions as disparate structures attempt to integrate with one another.


3: Strategic Relevance Of Organizational Virtues Enabled By IT
4: Information Technology And Organizational Innovation: 

3.2: Disruptive Innovations With It
1: Disruptive Innovation: Conceptual Foundations And Research Opportunities 
2: Agility In Responding To Disruptive Digital Innovation
3: The Disruptive Information Technology Innovation Model
4: The Disruptive Nature Of Information Technology Innovations

3.3: Innovating With Artificial Intelligence 
1: Artificial Intelligence In Organizations 
2: Ai Innovation Typology
3: Artificial Intelligence (Ai): Multidisciplinary Perspectives 
4: Strategic Use Of Ai

References

Mamonov, S., & Peterson, R. (2021). The role of IT in organizational innovation – A systematic literature review. Journal of Strategic Information Systems, 30, 101696. https://doi.org/10.1016/j.jsis.2021.101696

Chatterjee, S., Moody, G. D., Lowry, P. B., Chakraborty, S., & Hardin, A. (2021). The nonlinear influence of harmonious information technology affordance on organisational innovation. Information Systems Journal, 31(3), 294–322. https://doi.org/10.1111/isj.12311

Chatterjee, S., Moody, G., Lowry, P. B., Chakraborty, S., & Hardin, A. (2015). Strategic relevance of organizational virtues enabled by information technology in organizational innovation. Journal of Management Information Systems, 32(3), 158–196. https://doi.org/10.1080/07421222.2015.1099180

Chatterjee, S., Moody, G., Lowry, P. B., Chakraborty, S., & Hardin, A. (2020). Information technology and organizational innovation: Harmonious information technology affordance and courage-based actualization. Journal of Strategic Information Systems, 29, 101596. https://doi.org/10.1016/j.jsis.2020.101596

Hopp, C., Antons, D., Kaminski, J., & Salge, T. O. (2018). Disruptive Innovation: Conceptual Foundations, Empirical Evidence, and Research Opportunities in the Digital Age. Journal of Product Innovation Management, 35(3), 446–457. https://doi.org/10.1111/jpim.12448

Chan, C. M. L., Teoh, S. Y., Yeow, A., & Pan, G. (2018). Agility in responding to disruptive digital innovation: Case study of an SME. Information Systems Journal, 29(2), 436–455. https://doi.org/10.1111/isj.12215

Carlo, J. L., Gaskin, J., Lyytinen, K., & Rose, G. M. (2014). Early vs. late adoption of radical information technology innovations across software development organizations: an extension of the disruptive information technology innovation model. Information Systems Journal, 24(6), 537–569. https://doi.org/10.1111/isj.12039

Lyytinen, K., & Rose, G. M. (2003). The disruptive nature of information technology innovations: The case of internet computing in systems development organizations. MIS Quarterly, 27(4), 557-595. https://doi.org/10.2307/30036549


Benbya, H., Pachidi, S., & Jarvenpaa, S. (2021). Special Issue Editorial: Artificial Intelligence in Organizations: Implications for Information Systems Research. Journal of the Association for Information Systems, 22(2), 281-303. https://doi.org/10.17705/1jais.00662


Paschen, U., Pitt, C., & Kietzmann, J. (2020). Artificial intelligence: Building blocks and an innovation typology. Business Horizons, 63, 147-155. https://doi.org/10.1016/j.bushor.2019.10.004


Dwivedi, Y. K., Hughes, L., Ismagilova, E., Aarts, G., Coombs, C., Crick, T., ... Williams, M. D. (2021). Artificial Intelligence (AI): Multidisciplinary perspectives on emerging challenges, opportunities, and agenda for research, practice and policy. International Journal of Information Management, 57, 101994. https://doi.org/10.1016/j.ijinfomgt.2019.08.002


Borges, A. F. S., Laurindo, F. J. B., Spínola, M. M., Gonçalves, R. F., & Mattos, C. A. (2021). The strategic use of artificial intelligence in the digital era: Systematic literature review and future research directions. International Journal of Information Management, 57, 102225. https://doi.org/10.1016/j.ijinfomgt.2020.102225





Module 3: It-Enabled Innovation 

3.1: The Relation Between It And Organizational Innovation 
1: The Role Of It In Organizational Innovation
 
correlations: 	number of servers to firm performance
computing capacity to firm performance
storage capacity to firm performance
number of patents to it investments
it expertise and firm performance
patents filed to commercialized products
moderate competition stimulates innovation
intense competition depresses innovation

variables:		productivity 
sales performance 
profitability 
value added 
stock returns 
return on investment
Economies of scale
Architectural flexibility
Diminishing returns
Limited impact

influences:		firm alignment and orientation
			posture
			governance
			internal conflict
			internal and external context
group conflict hinders adoption
actively fostering innovation
informal mechanisms
industry dynamics
gender diversity
Knowledge integration
Key actors

frameworks:	resource based view
			capabilities based perspective
industry convergence
Organizational innovation system

cases:			polaroid - misalignment
			xerox - failure to capitalize
			yahoo - failure to capitalize
			hospitality incumbents - dismissive of disruptors
			pharmaceutical companies - r&d failures lead to patent
acquisition resulting in depressed firm performance

limitations:		knowledge gaps
			outcome measurement
			Conceptual abstraction hinders implementation
			Difficulties in establishing causation between variables
			
2: The Nonlinear Influence Of Harmonious Information Technology 


Frameworks: 	HITA - Harmonious IT affordance
			linear vs Non-linear & quadratic correlations
Affordances not inherent in people or artifacts, but
 organizational relationships
Distinctions between Affordances  & impediments 
Resonance - HITA alignment preserves organizational 
memory 
Organizational inertia - delays in implementation
Adaptation
Paradox - tensions between interdependent elements
Exploratory innovation
Exploitative Innovation


limitations:		Few studies use non-linear frameworks
			Most studies assume linear relationships


Variables:		IT Affordance
			IT appropriation


Guidance:		Promote positive hita or impede negative HITA
			Managing tensions to promote innovations
			Finding and leveraging existing paradoxes to stimulate
innovation - converting tensions into synergies

Examples:		New Collaborations tools that don’t integrate well with 
Existing Organizational memory tools, reducing HITA
Paradoxes - when innovation increases despite increasing
organizational misalignment

Perspectives:	IT Affordance misalignment may prevent standardization 
or an effort toward homogeneity and uniformity - or it may be perceived in this manner - but it is exactly this misalignment that results in novel solutions as disparate structures attempt to integrate with one another.
			It’s the challenges created by dissonance, and the need to resolve 
that dissonance - the conflicts created by that dissonance - that results in innovation, and innovate solutions


3: Strategic Relevance Of Organizational Virtues Enabled By IT
4: Information Technology And Organizational Innovation: 

3.2: Disruptive Innovations With It
1: Disruptive Innovation: Conceptual Foundations And Research Opportunities 
2: Agility In Responding To Disruptive Digital Innovation
3: The Disruptive Information Technology Innovation Model
4: The Disruptive Nature Of Information Technology Innovations

3.3: Innovating With Artificial Intelligence 
1: Artificial Intelligence In Organizations 
2: Ai Innovation Typology
3: Artificial Intelligence (Ai): Multidisciplinary Perspectives 
4: Strategic Use Of Ai

References

Mamonov, S., & Peterson, R. (2021). The role of IT in organizational innovation – A systematic literature review. Journal of Strategic Information Systems, 30, 101696. https://doi.org/10.1016/j.jsis.2021.101696

Chatterjee, S., Moody, G. D., Lowry, P. B., Chakraborty, S., & Hardin, A. (2021). The nonlinear influence of harmonious information technology affordance on organisational innovation. Information Systems Journal, 31(3), 294–322. https://doi.org/10.1111/isj.12311

Chatterjee, S., Moody, G., Lowry, P. B., Chakraborty, S., & Hardin, A. (2015). Strategic relevance of organizational virtues enabled by information technology in organizational innovation. Journal of Management Information Systems, 32(3), 158–196. https://doi.org/10.1080/07421222.2015.1099180

Chatterjee, S., Moody, G., Lowry, P. B., Chakraborty, S., & Hardin, A. (2020). Information technology and organizational innovation: Harmonious information technology affordance and courage-based actualization. Journal of Strategic Information Systems, 29, 101596. https://doi.org/10.1016/j.jsis.2020.101596

Hopp, C., Antons, D., Kaminski, J., & Salge, T. O. (2018). Disruptive Innovation: Conceptual Foundations, Empirical Evidence, and Research Opportunities in the Digital Age. Journal of Product Innovation Management, 35(3), 446–457. https://doi.org/10.1111/jpim.12448

Chan, C. M. L., Teoh, S. Y., Yeow, A., & Pan, G. (2018). Agility in responding to disruptive digital innovation: Case study of an SME. Information Systems Journal, 29(2), 436–455. https://doi.org/10.1111/isj.12215

Carlo, J. L., Gaskin, J., Lyytinen, K., & Rose, G. M. (2014). Early vs. late adoption of radical information technology innovations across software development organizations: an extension of the disruptive information technology innovation model. Information Systems Journal, 24(6), 537–569. https://doi.org/10.1111/isj.12039

Lyytinen, K., & Rose, G. M. (2003). The disruptive nature of information technology innovations: The case of internet computing in systems development organizations. MIS Quarterly, 27(4), 557-595. https://doi.org/10.2307/30036549


Benbya, H., Pachidi, S., & Jarvenpaa, S. (2021). Special Issue Editorial: Artificial Intelligence in Organizations: Implications for Information Systems Research. Journal of the Association for Information Systems, 22(2), 281-303. https://doi.org/10.17705/1jais.00662


Paschen, U., Pitt, C., & Kietzmann, J. (2020). Artificial intelligence: Building blocks and an innovation typology. Business Horizons, 63, 147-155. https://doi.org/10.1016/j.bushor.2019.10.004


Dwivedi, Y. K., Hughes, L., Ismagilova, E., Aarts, G., Coombs, C., Crick, T., ... Williams, M. D. (2021). Artificial Intelligence (AI): Multidisciplinary perspectives on emerging challenges, opportunities, and agenda for research, practice and policy. International Journal of Information Management, 57, 101994. https://doi.org/10.1016/j.ijinfomgt.2019.08.002


Borges, A. F. S., Laurindo, F. J. B., Spínola, M. M., Gonçalves, R. F., & Mattos, C. A. (2021). The strategic use of artificial intelligence in the digital era: Systematic literature review and future research directions. International Journal of Information Management, 57, 102225. https://doi.org/10.1016/j.ijinfomgt.2020.102225


Module 3: It-Enabled Innovation 

3.1: The Relation Between It And Organizational Innovation 
1: The Role Of It In Organizational Innovation
 
correlations: 	number of servers to firm performance
computing capacity to firm performance
storage capacity to firm performance
number of patents to it investments
it expertise and firm performance
patents filed to commercialized products
moderate competition stimulates innovation
intense competition depresses innovation

variables:		productivity 
sales performance 
profitability 
value added 
stock returns 
return on investment
Economies of scale
Architectural flexibility
Diminishing returns
Limited impact

influences:		firm alignment and orientation
			posture
			governance
			internal conflict
			internal and external context
group conflict hinders adoption
actively fostering innovation
informal mechanisms
industry dynamics
gender diversity
Knowledge integration
Key actors

frameworks:	resource based view
			capabilities based perspective
industry convergence
Organizational innovation system

cases:			polaroid - misalignment
			xerox - failure to capitalize
			yahoo - failure to capitalize
			hospitality incumbents - dismissive of disruptors
			pharmaceutical companies - r&d failures lead to patent
acquisition resulting in depressed firm performance

limitations:		knowledge gaps
			outcome measurement
			Conceptual abstraction hinders implementation
			Difficulties in establishing causation between variables
			
2: The Nonlinear Influence Of Harmonious Information Technology 


Frameworks: 	HITA - Harmonious IT affordance
			linear vs Non-linear & quadratic correlations
Affordances not inherent in people or artifacts, but
 organizational relationships
Distinctions between Affordances  & impediments 
Resonance - HITA alignment preserves organizational 
memory 
Organizational inertia - delays in implementation
Adaptation
Paradox - tensions between interdependent elements
Exploratory innovation
Exploitative Innovation


limitations:		Few studies use non-linear frameworks
			Most studies assume linear relationships


Variables:		IT Affordance
			IT appropriation


Guidance:		Promote positive hita or impede negative HITA
			Managing tensions to promote innovations
			Finding and leveraging existing paradoxes to stimulate
innovation - converting tensions into synergies

Examples:		New Collaborations tools that don’t integrate well with 
Existing Organizational memory tools, reducing HITA
Counter-intuitive - when innovation increases despite increasing
organizational misalignment

Perspectives:	IT Affordance misalignment may prevent standardization 
or an effort toward homogeneity and uniformity - or it may be perceived in this manner - but it is exactly this misalignment that results in novel solutions as disparate structures attempt to integrate with one another.
			It’s the challenges created by dissonance, and the need to resolve 
that dissonance - the conflicts created by that dissonance - that results in innovation, and innovate solutions
Definitions:	Positive HITA is when an organization is operating synergistically
			Negative HITA is when an organization is operating with creative
 Dissonance, or, displays paradoxical characteristics
The quadratic relationship between innovation and HITA is that 
innovation is increases as synergies increase, but also as dissonance increases
			Paradox refers to conflict within an organization, or
misalignment withing an organization, or dissonance within an organization - even though it may be paradoxical
That innovation can increase as dissonance increases, paradox is not used to describe this phenomenon, the term counter-intuitive is used in this circumstance


3: Strategic Relevance Of Organizational Virtues Enabled By IT
4: Information Technology And Organizational Innovation: 

3.2: Disruptive Innovations With It
1: Disruptive Innovation: Conceptual Foundations And Research Opportunities 
2: Agility In Responding To Disruptive Digital Innovation
3: The Disruptive Information Technology Innovation Model
4: The Disruptive Nature Of Information Technology Innovations

3.3: Innovating With Artificial Intelligence 
1: Artificial Intelligence In Organizations 
2: Ai Innovation Typology
3: Artificial Intelligence (Ai): Multidisciplinary Perspectives 
4: Strategic Use Of Ai

References

Mamonov, S., & Peterson, R. (2021). The role of IT in organizational innovation – A systematic literature review. Journal of Strategic Information Systems, 30, 101696. https://doi.org/10.1016/j.jsis.2021.101696

Chatterjee, S., Moody, G. D., Lowry, P. B., Chakraborty, S., & Hardin, A. (2021). The nonlinear influence of harmonious information technology affordance on organisational innovation. Information Systems Journal, 31(3), 294–322. https://doi.org/10.1111/isj.12311

Chatterjee, S., Moody, G., Lowry, P. B., Chakraborty, S., & Hardin, A. (2015). Strategic relevance of organizational virtues enabled by information technology in organizational innovation. Journal of Management Information Systems, 32(3), 158–196. https://doi.org/10.1080/07421222.2015.1099180

Chatterjee, S., Moody, G., Lowry, P. B., Chakraborty, S., & Hardin, A. (2020). Information technology and organizational innovation: Harmonious information technology affordance and courage-based actualization. Journal of Strategic Information Systems, 29, 101596. https://doi.org/10.1016/j.jsis.2020.101596

Hopp, C., Antons, D., Kaminski, J., & Salge, T. O. (2018). Disruptive Innovation: Conceptual Foundations, Empirical Evidence, and Research Opportunities in the Digital Age. Journal of Product Innovation Management, 35(3), 446–457. https://doi.org/10.1111/jpim.12448

Chan, C. M. L., Teoh, S. Y., Yeow, A., & Pan, G. (2018). Agility in responding to disruptive digital innovation: Case study of an SME. Information Systems Journal, 29(2), 436–455. https://doi.org/10.1111/isj.12215

Carlo, J. L., Gaskin, J., Lyytinen, K., & Rose, G. M. (2014). Early vs. late adoption of radical information technology innovations across software development organizations: an extension of the disruptive information technology innovation model. Information Systems Journal, 24(6), 537–569. https://doi.org/10.1111/isj.12039

Lyytinen, K., & Rose, G. M. (2003). The disruptive nature of information technology innovations: The case of internet computing in systems development organizations. MIS Quarterly, 27(4), 557-595. https://doi.org/10.2307/30036549


Benbya, H., Pachidi, S., & Jarvenpaa, S. (2021). Special Issue Editorial: Artificial Intelligence in Organizations: Implications for Information Systems Research. Journal of the Association for Information Systems, 22(2), 281-303. https://doi.org/10.17705/1jais.00662


Paschen, U., Pitt, C., & Kietzmann, J. (2020). Artificial intelligence: Building blocks and an innovation typology. Business Horizons, 63, 147-155. https://doi.org/10.1016/j.bushor.2019.10.004


Dwivedi, Y. K., Hughes, L., Ismagilova, E., Aarts, G., Coombs, C., Crick, T., ... Williams, M. D. (2021). Artificial Intelligence (AI): Multidisciplinary perspectives on emerging challenges, opportunities, and agenda for research, practice and policy. International Journal of Information Management, 57, 101994. https://doi.org/10.1016/j.ijinfomgt.2019.08.002


Borges, A. F. S., Laurindo, F. J. B., Spínola, M. M., Gonçalves, R. F., & Mattos, C. A. (2021). The strategic use of artificial intelligence in the digital era: Systematic literature review and future research directions. International Journal of Information Management, 57, 102225. https://doi.org/10.1016/j.ijinfomgt.2020.102225


















Annotations









Module 1 Vicky
Module 2 Kelly
Module 3 Kenneth
Module 4 Group
Subsection 4.3 Group
4.3.1 Digital Innovation Review Vicky
4.3.2 Unpacking The Difference Kelly
4.3.3 Digital Opportunities For Incumbents Kenneth
4.3.4 Digitalization Ethical Challenge Kenneth


Module 3: It-Enabled Innovation 

3.1: The Relation Between It And Organizational Innovation 
1: The Role Of It In Organizational Innovation
 
correlations: 	number of servers to firm performance
computing capacity to firm performance
storage capacity to firm performance
number of patents to it investments
it expertise and firm performance
patents filed to commercialized products
moderate competition stimulates innovation
intense competition depresses innovation

variables:		productivity 
sales performance 
profitability 
value added 
stock returns 
return on investment
Economies of scale
Architectural flexibility
Diminishing returns
Limited impact

influences:		firm alignment and orientation
			posture
			governance
			internal conflict
			internal and external context
group conflict hinders adoption
actively fostering innovation
informal mechanisms
industry dynamics
gender diversity
Knowledge integration
Key actors

frameworks:	resource based view
			capabilities based perspective
industry convergence
Organizational innovation system

cases:			polaroid - misalignment
			xerox - failure to capitalize
			yahoo - failure to capitalize
			hospitality incumbents - dismissive of disruptors
			pharmaceutical companies - r&d failures lead to patent
acquisition resulting in depressed firm performance

limitations:		knowledge gaps
			outcome measurement
			Conceptual abstraction hinders implementation
			Difficulties in establishing causation between variables
			
2: The Nonlinear Influence Of Harmonious Information Technology 


Frameworks: 	HITA - Harmonious IT affordance
			linear vs Non-linear & quadratic correlations
Affordances not inherent in people or artifacts, but
 organizational relationships
Distinctions between Affordances  & impediments 
Resonance - HITA alignment preserves organizational 
memory 
Organizational inertia - delays in implementation
Adaptation
Paradox - tensions between interdependent elements
Exploratory innovation
Exploitative Innovation


limitations:		Few studies use non-linear frameworks
			Most studies assume linear relationships


Variables:		IT Affordance
			IT appropriation


Guidance:		Promote = positive hita or impede = negative HITA
				Either situation can be leveraged to produce innovation
And innovative solutions
			Managing tensions to promote innovations
			Finding and leveraging existing paradoxes to stimulate
innovation - converting tensions into synergies

Examples:		New Collaborations tools that don’t integrate well with 
Existing Organizational memory tools, reducing HITA
Counter-intuitive - when innovation increases despite increasing
organizational misalignment

Perspectives:	IT Affordance misalignment may prevent standardization 
or an effort toward homogeneity and uniformity - or it may be perceived in this manner - but it is exactly this misalignment that results in novel solutions as disparate structures attempt to integrate with one another.
			It’s the challenges created by dissonance, and the need to resolve 
that dissonance - the conflicts created by that dissonance - that results in innovation, and innovate solutions
Definitions:	Positive HITA is when an organization is operating synergistically
			Negative HITA is when an organization is operating with creative
 Dissonance, or, displays paradoxical characteristics
The quadratic relationship between innovation and HITA is that 
innovation is increases as synergies increase, but also as dissonance increases
			Paradox refers to conflict within an organization, or
misalignment within an organization, or dissonance within an organization - even though it may be paradoxical
That innovation can increase as dissonance increases, paradox is not used to describe this phenomenon, the term counter-intuitive is used in this circumstance
			Coalignment - in contrast to dissonance - a kind of synergy
			Affordance Theory - what information technology allows human
users to do - affordance can increase as an operator becomes more adept at using a particular artifact of information technology - affordance is also - it affordance also depends on the goals of the user. - a crm doesn’t do much for a person interested in programming - an IDE doesn’t do much for a person looking to close a deal.
			Types of IT Affordance - Collaborative Affordance - 
organizational Memory Affordance - process management affordance
			Affordance - what is allowed - what is enabled
			Organizational inertia - describes the difficulties an 
organization may have in changing course or changing direction - in HITA terms - HITA = Zero
			Orthogonal - do not influence one another, either in a positive 
way or a negative way
			


3: Strategic Relevance Of Organizational Virtues Enabled By IT
4: Information Technology And Organizational Innovation: 

3.2: Disruptive Innovations With It
1: Disruptive Innovation: Conceptual Foundations And Research Opportunities 
2: Agility In Responding To Disruptive Digital Innovation
3: The Disruptive Information Technology Innovation Model
4: The Disruptive Nature Of Information Technology Innovations

3.3: Innovating With Artificial Intelligence 
1: Artificial Intelligence In Organizations 
2: Ai Innovation Typology
3: Artificial Intelligence (Ai): Multidisciplinary Perspectives 
4: Strategic Use Of Ai

References

Mamonov, S., & Peterson, R. (2021). The role of IT in organizational innovation – A systematic literature review. Journal of Strategic Information Systems, 30, 101696. https://doi.org/10.1016/j.jsis.2021.101696

Chatterjee, S., Moody, G. D., Lowry, P. B., Chakraborty, S., & Hardin, A. (2021). The nonlinear influence of harmonious information technology affordance on organisational innovation. Information Systems Journal, 31(3), 294–322. https://doi.org/10.1111/isj.12311

Chatterjee, S., Moody, G., Lowry, P. B., Chakraborty, S., & Hardin, A. (2015). Strategic relevance of organizational virtues enabled by information technology in organizational innovation. Journal of Management Information Systems, 32(3), 158–196. https://doi.org/10.1080/07421222.2015.1099180

Chatterjee, S., Moody, G., Lowry, P. B., Chakraborty, S., & Hardin, A. (2020). Information technology and organizational innovation: Harmonious information technology affordance and courage-based actualization. Journal of Strategic Information Systems, 29, 101596. https://doi.org/10.1016/j.jsis.2020.101596

Hopp, C., Antons, D., Kaminski, J., & Salge, T. O. (2018). Disruptive Innovation: Conceptual Foundations, Empirical Evidence, and Research Opportunities in the Digital Age. Journal of Product Innovation Management, 35(3), 446–457. https://doi.org/10.1111/jpim.12448

Chan, C. M. L., Teoh, S. Y., Yeow, A., & Pan, G. (2018). Agility in responding to disruptive digital innovation: Case study of an SME. Information Systems Journal, 29(2), 436–455. https://doi.org/10.1111/isj.12215

Carlo, J. L., Gaskin, J., Lyytinen, K., & Rose, G. M. (2014). Early vs. late adoption of radical information technology innovations across software development organizations: an extension of the disruptive information technology innovation model. Information Systems Journal, 24(6), 537–569. https://doi.org/10.1111/isj.12039

Lyytinen, K., & Rose, G. M. (2003). The disruptive nature of information technology innovations: The case of internet computing in systems development organizations. MIS Quarterly, 27(4), 557-595. https://doi.org/10.2307/30036549


Benbya, H., Pachidi, S., & Jarvenpaa, S. (2021). Special Issue Editorial: Artificial Intelligence in Organizations: Implications for Information Systems Research. Journal of the Association for Information Systems, 22(2), 281-303. https://doi.org/10.17705/1jais.00662


Paschen, U., Pitt, C., & Kietzmann, J. (2020). Artificial intelligence: Building blocks and an innovation typology. Business Horizons, 63, 147-155. https://doi.org/10.1016/j.bushor.2019.10.004


Dwivedi, Y. K., Hughes, L., Ismagilova, E., Aarts, G., Coombs, C., Crick, T., ... Williams, M. D. (2021). Artificial Intelligence (AI): Multidisciplinary perspectives on emerging challenges, opportunities, and agenda for research, practice and policy. International Journal of Information Management, 57, 101994. https://doi.org/10.1016/j.ijinfomgt.2019.08.002


Borges, A. F. S., Laurindo, F. J. B., Spínola, M. M., Gonçalves, R. F., & Mattos, C. A. (2021). The strategic use of artificial intelligence in the digital era: Systematic literature review and future research directions. International Journal of Information Management, 57, 102225. https://doi.org/10.1016/j.ijinfomgt.2020.102225

Anderson, C., & Robey, D. (2017). Affordance potency: Explaining the actualization of technology affordances. Information and Organization, 27(2), 100-115. https://doi.org/10.1016/j.infoandorg.2017.03.002

Module 3: It-Enabled Innovation 

3.1: The Relation Between It And Organizational Innovation 
1: The Role Of It In Organizational Innovation
 
correlations: 	number of servers to firm performance
computing capacity to firm performance
storage capacity to firm performance
number of patents to it investments
it expertise and firm performance
patents filed to commercialized products
moderate competition stimulates innovation
intense competition depresses innovation

variables:		productivity 
sales performance 
profitability 
value added 
stock returns 
return on investment
Economies of scale
Architectural flexibility
Diminishing returns
Limited impact

influences:		firm alignment and orientation
			posture
			governance
			internal conflict
			internal and external context
group conflict hinders adoption
actively fostering innovation
informal mechanisms
industry dynamics
gender diversity
Knowledge integration
Key actors

frameworks:	resource based view
			capabilities based perspective
industry convergence
Organizational innovation system

cases:			polaroid - misalignment
			xerox - failure to capitalize
			yahoo - failure to capitalize
			hospitality incumbents - dismissive of disruptors
			pharmaceutical companies - r&d failures lead to patent
acquisition resulting in depressed firm performance

limitations:		knowledge gaps
			outcome measurement
			Conceptual abstraction hinders implementation
			Difficulties in establishing causation between variables
			
2: The Nonlinear Influence Of Harmonious Information Technology 


Frameworks: 	HITA - Harmonious IT affordance
			linear vs Non-linear & quadratic correlations
Affordances not inherent in people or artifacts, but
 organizational relationships
Distinctions between Affordances  & impediments 
Resonance - HITA alignment preserves organizational 
memory 
Organizational inertia - delays in implementation
Adaptation
Paradox - tensions between interdependent elements
Exploratory innovation
Exploitative Innovation


limitations:		Few studies use non-linear frameworks
			Most studies assume linear relationships


Variables:		IT Affordance
			IT appropriation


Guidance:		Promote = positive hita or impede = negative HITA
				Either situation can be leveraged to produce innovation
And innovative solutions
			Managing tensions to promote innovations
			Finding and leveraging existing paradoxes to stimulate
innovation - converting tensions into synergies

Examples:		New Collaborations tools that don’t integrate well with 
Existing Organizational memory tools, reducing HITA
Counter-intuitive - when innovation increases despite increasing
organizational misalignment

Perspectives:	IT Affordance misalignment may prevent standardization 
or an effort toward homogeneity and uniformity - or it may be perceived in this manner - but it is exactly this misalignment that results in novel solutions as disparate structures attempt to integrate with one another.
			It’s the challenges created by dissonance, and the need to resolve 
that dissonance - the conflicts created by that dissonance - that results in innovation, and innovate solutions
Definitions:	Positive HITA is when an organization is operating synergistically
			Negative HITA is when an organization is operating with creative
 Dissonance, or, displays paradoxical characteristics
The quadratic relationship between innovation and HITA is that 
innovation is increases as synergies increase, but also as dissonance increases
			Paradox refers to conflict within an organization, or
misalignment within an organization, or dissonance within an organization - even though it may be paradoxical
That innovation can increase as dissonance increases, paradox is not used to describe this phenomenon, the term counter-intuitive is used in this circumstance
			Coalignment - in contrast to dissonance - a kind of synergy
			Affordance Theory - what information technology allows human
users to do - affordance can increase as an operator becomes more adept at using a particular artifact of information technology - affordance is also - it affordance also depends on the goals of the user. - a crm doesn’t do much for a person interested in programming - an IDE doesn’t do much for a person looking to close a deal.
			Types of IT Affordance - Collaborative Affordance - 
organizational Memory Affordance - process management affordance
			Affordance - what is allowed - what is enabled
			Organizational inertia - describes the difficulties an 
organization may have in changing course or changing direction - in HITA terms - HITA = Zero
			Orthogonal - do not influence one another, either in a positive 
way or a negative way
			


3: Strategic Relevance Of Organizational Virtues Enabled By IT

Terminology:	COPs - communities of practice - a conceptual framework for
Organizations.
Concepts:		Improvisation as innovation - improvisation involves developing
				novel solutions to address novel situations - and should be 
				considered a form of innovation - and should be fostered
				or promoted by an organization to address urgent and
				unpredictable, and unanticipated challenges
			Organizational Wisdom - required to improvise successfully - has
				a positive effect on the ability to improvise

Virtues:		Courage
			Justice - distributive and corrective
			Wisdom
			Temperance - particularly relevant during periods of radical 
				organizational change - needed to reduce anxiety, panic, 
				And Despair that coincides with radical organizational 
				change - Organizational Temperance serves to prevent or 
				reduce chaos

Frameworks:	The framework for organizational virtues is an extension of the 
				business ethics
			Organizational IT affordances - collaborative, process 
				management, and memory - Which in turn enable
				Organizational Virtues - These organizational virtues 
				determine the success of organizational improvisation - 
				improvisation is either a form of innovation - or a kind of 
				process that occurs before innovation - or is a kind of 
				preliminary step to innovation.

4: Information Technology And Organizational Innovation: 

3.2: Disruptive Innovations With It
1: Disruptive Innovation: Conceptual Foundations And Research Opportunities 
2: Agility In Responding To Disruptive Digital Innovation
3: The Disruptive Information Technology Innovation Model
4: The Disruptive Nature Of Information Technology Innovations

3.3: Innovating With Artificial Intelligence 
1: Artificial Intelligence In Organizations 
2: Ai Innovation Typology
3: Artificial Intelligence (Ai): Multidisciplinary Perspectives 
4: Strategic Use Of Ai

References

Mamonov, S., & Peterson, R. (2021). The role of IT in organizational innovation – A systematic literature review. Journal of Strategic Information Systems, 30, 101696. https://doi.org/10.1016/j.jsis.2021.101696

Chatterjee, S., Moody, G. D., Lowry, P. B., Chakraborty, S., & Hardin, A. (2021). The nonlinear influence of harmonious information technology affordance on organisational innovation. Information Systems Journal, 31(3), 294–322. https://doi.org/10.1111/isj.12311

Chatterjee, S., Moody, G., Lowry, P. B., Chakraborty, S., & Hardin, A. (2015). Strategic relevance of organizational virtues enabled by information technology in organizational innovation. Journal of Management Information Systems, 32(3), 158–196. https://doi.org/10.1080/07421222.2015.1099180

Chatterjee, S., Moody, G., Lowry, P. B., Chakraborty, S., & Hardin, A. (2020). Information technology and organizational innovation: Harmonious information technology affordance and courage-based actualization. Journal of Strategic Information Systems, 29, 101596. https://doi.org/10.1016/j.jsis.2020.101596

Hopp, C., Antons, D., Kaminski, J., & Salge, T. O. (2018). Disruptive Innovation: Conceptual Foundations, Empirical Evidence, and Research Opportunities in the Digital Age. Journal of Product Innovation Management, 35(3), 446–457. https://doi.org/10.1111/jpim.12448

Chan, C. M. L., Teoh, S. Y., Yeow, A., & Pan, G. (2018). Agility in responding to disruptive digital innovation: Case study of an SME. Information Systems Journal, 29(2), 436–455. https://doi.org/10.1111/isj.12215

Carlo, J. L., Gaskin, J., Lyytinen, K., & Rose, G. M. (2014). Early vs. late adoption of radical information technology innovations across software development organizations: an extension of the disruptive information technology innovation model. Information Systems Journal, 24(6), 537–569. https://doi.org/10.1111/isj.12039

Lyytinen, K., & Rose, G. M. (2003). The disruptive nature of information technology innovations: The case of internet computing in systems development organizations. MIS Quarterly, 27(4), 557-595. https://doi.org/10.2307/30036549


Benbya, H., Pachidi, S., & Jarvenpaa, S. (2021). Special Issue Editorial: Artificial Intelligence in Organizations: Implications for Information Systems Research. Journal of the Association for Information Systems, 22(2), 281-303. https://doi.org/10.17705/1jais.00662


Paschen, U., Pitt, C., & Kietzmann, J. (2020). Artificial intelligence: Building blocks and an innovation typology. Business Horizons, 63, 147-155. https://doi.org/10.1016/j.bushor.2019.10.004


Dwivedi, Y. K., Hughes, L., Ismagilova, E., Aarts, G., Coombs, C., Crick, T., ... Williams, M. D. (2021). Artificial Intelligence (AI): Multidisciplinary perspectives on emerging challenges, opportunities, and agenda for research, practice and policy. International Journal of Information Management, 57, 101994. https://doi.org/10.1016/j.ijinfomgt.2019.08.002


Borges, A. F. S., Laurindo, F. J. B., Spínola, M. M., Gonçalves, R. F., & Mattos, C. A. (2021). The strategic use of artificial intelligence in the digital era: Systematic literature review and future research directions. International Journal of Information Management, 57, 102225. https://doi.org/10.1016/j.ijinfomgt.2020.102225

Anderson, C., & Robey, D. (2017). Affordance potency: Explaining the actualization of technology affordances. Information and Organization, 27(2), 100-115. https://doi.org/10.1016/j.infoandorg.2017.03.002
 


Module 3: It-Enabled Innovation 

3.1: The Relation Between It And Organizational Innovation 
1: The Role Of It In Organizational Innovation
 
correlations: 	number of servers to firm performance
computing capacity to firm performance
storage capacity to firm performance
number of patents to it investments
it expertise and firm performance
patents filed to commercialized products
moderate competition stimulates innovation
intense competition depresses innovation

variables:		productivity 
sales performance 
profitability 
value added 
stock returns 
return on investment
Economies of scale
Architectural flexibility
Diminishing returns
Limited impact

influences:		firm alignment and orientation
			posture
			governance
			internal conflict
			internal and external context
group conflict hinders adoption
actively fostering innovation
informal mechanisms
industry dynamics
gender diversity
Knowledge integration
Key actors

frameworks:	resource based view
			capabilities based perspective
industry convergence
Organizational innovation system

cases:			polaroid - misalignment
			xerox - failure to capitalize
			yahoo - failure to capitalize
			hospitality incumbents - dismissive of disruptors
			pharmaceutical companies - r&d failures lead to patent
acquisition resulting in depressed firm performance

limitations:		knowledge gaps
			outcome measurement
			Conceptual abstraction hinders implementation
			Difficulties in establishing causation between variables
			
2: The Nonlinear Influence Of Harmonious Information Technology 


Frameworks: 	HITA - Harmonious IT affordance
			linear vs Non-linear & quadratic correlations
Affordances not inherent in people or artifacts, but
 organizational relationships
Distinctions between Affordances  & impediments 
Resonance - HITA alignment preserves organizational 
memory 
Organizational inertia - delays in implementation
Adaptation
Paradox - tensions between interdependent elements
Exploratory innovation
Exploitative Innovation


limitations:		Few studies use non-linear frameworks
			Most studies assume linear relationships


Variables:		IT Affordance
			IT appropriation


Guidance:		Promote = positive hita or impede = negative HITA
				Either situation can be leveraged to produce innovation
And innovative solutions
			Managing tensions to promote innovations
			Finding and leveraging existing paradoxes to stimulate
innovation - converting tensions into synergies

Examples:		New Collaborations tools that don’t integrate well with 
Existing Organizational memory tools, reducing HITA
Counter-intuitive - when innovation increases despite increasing
organizational misalignment

Perspectives:	IT Affordance misalignment may prevent standardization 
or an effort toward homogeneity and uniformity - or it may be perceived in this manner - but it is exactly this misalignment that results in novel solutions as disparate structures attempt to integrate with one another.
			It’s the challenges created by dissonance, and the need to resolve 
that dissonance - the conflicts created by that dissonance - that results in innovation, and innovate solutions
Definitions:	Positive HITA is when an organization is operating synergistically
			Negative HITA is when an organization is operating with creative
 Dissonance, or, displays paradoxical characteristics
The quadratic relationship between innovation and HITA is that 
innovation is increases as synergies increase, but also as dissonance increases
			Paradox refers to conflict within an organization, or
misalignment within an organization, or dissonance within an organization - even though it may be paradoxical
That innovation can increase as dissonance increases, paradox is not used to describe this phenomenon, the term counter-intuitive is used in this circumstance
			Coalignment - in contrast to dissonance - a kind of synergy
			Affordance Theory - what information technology allows human
users to do - affordance can increase as an operator becomes more adept at using a particular artifact of information technology - affordance is also - it affordance also depends on the goals of the user. - a crm doesn’t do much for a person interested in programming - an IDE doesn’t do much for a person looking to close a deal.
			Types of IT Affordance - Collaborative Affordance - 
organizational Memory Affordance - process management affordance
			Affordance - what is allowed - what is enabled
			Organizational inertia - describes the difficulties an 
organization may have in changing course or changing direction - in HITA terms - HITA = Zero
			Orthogonal - do not influence one another, either in a positive 
way or a negative way

3: Strategic Relevance Of Organizational Virtues Enabled By IT

Terminology:	COPs - communities of practice - a conceptual framework for
Organizations.
Concepts:		Improvisation as innovation - improvisation involves developing
				novel solutions to address novel situations - and should be 
				considered a form of innovation - and should be fostered
				or promoted by an organization to address urgent and
				unpredictable, and unanticipated challenges
			Organizational Wisdom - required to improvise successfully - has
				a positive effect on the ability to improvise
			Mediating Variables - Mediating Factors - IT affordance doesn’t 
				have a direct connection to innovation - it’s mediated 
				through virtues and capabilities that can foster or hinder 
				Innovation.
			IT Capabilities are distinct from IT affordances - capabilities refer 
				to what can be done - affordances, specifically the aspect of 
				how technology is appropriated for a purpose - how 
				technologies might be used - a GPU could be used for 
				enhancing a computer game - or processing a large 
				language model - or processing a blockchain or 
				cryptocurrency - a GPU is capable of performing 
				calculations, but what functions a GPU affords to the user 
				depends on how the user appropriates or uses the GPU or
				what application the user uses it for.

Virtues:		Courage
			Justice - distributive and corrective
			Wisdom
			Temperance - particularly relevant during periods of radical 
				organizational change - needed to reduce anxiety, panic, 
				And Despair that coincides with radical organizational 
				change - Organizational Temperance serves to prevent or 
				reduce chaos

Frameworks:	The framework for organizational virtues is an extension of the 
				business ethics
			Organizational IT affordances - collaborative, process 
				management, and memory - Which in turn enable
				Organizational Virtues - These organizational virtues 
				determine the success of organizational improvisation - 
				improvisation is either a form of innovation - or a kind of 
				process that occurs before innovation - or is a kind of 
				preliminary step to innovation.


4: Information Technology And Organizational Innovation: 

3.2: Disruptive Innovations With It
1: Disruptive Innovation: Conceptual Foundations And Research Opportunities 
2: Agility In Responding To Disruptive Digital Innovation
3: The Disruptive Information Technology Innovation Model
4: The Disruptive Nature Of Information Technology Innovations

3.3: Innovating With Artificial Intelligence 
1: Artificial Intelligence In Organizations 
2: Ai Innovation Typology
3: Artificial Intelligence (Ai): Multidisciplinary Perspectives 
4: Strategic Use Of Ai

References

Mamonov, S., & Peterson, R. (2021). The role of IT in organizational innovation – A systematic literature review. Journal of Strategic Information Systems, 30, 101696. https://doi.org/10.1016/j.jsis.2021.101696

Chatterjee, S., Moody, G. D., Lowry, P. B., Chakraborty, S., & Hardin, A. (2021). The nonlinear influence of harmonious information technology affordance on organisational innovation. Information Systems Journal, 31(3), 294–322. https://doi.org/10.1111/isj.12311

Chatterjee, S., Moody, G., Lowry, P. B., Chakraborty, S., & Hardin, A. (2015). Strategic relevance of organizational virtues enabled by information technology in organizational innovation. Journal of Management Information Systems, 32(3), 158–196. https://doi.org/10.1080/07421222.2015.1099180

Chatterjee, S., Moody, G., Lowry, P. B., Chakraborty, S., & Hardin, A. (2020). Information technology and organizational innovation: Harmonious information technology affordance and courage-based actualization. Journal of Strategic Information Systems, 29, 101596. https://doi.org/10.1016/j.jsis.2020.101596

Hopp, C., Antons, D., Kaminski, J., & Salge, T. O. (2018). Disruptive Innovation: Conceptual Foundations, Empirical Evidence, and Research Opportunities in the Digital Age. Journal of Product Innovation Management, 35(3), 446–457. https://doi.org/10.1111/jpim.12448

Chan, C. M. L., Teoh, S. Y., Yeow, A., & Pan, G. (2018). Agility in responding to disruptive digital innovation: Case study of an SME. Information Systems Journal, 29(2), 436–455. https://doi.org/10.1111/isj.12215

Carlo, J. L., Gaskin, J., Lyytinen, K., & Rose, G. M. (2014). Early vs. late adoption of radical information technology innovations across software development organizations: an extension of the disruptive information technology innovation model. Information Systems Journal, 24(6), 537–569. https://doi.org/10.1111/isj.12039

Lyytinen, K., & Rose, G. M. (2003). The disruptive nature of information technology innovations: The case of internet computing in systems development organizations. MIS Quarterly, 27(4), 557-595. https://doi.org/10.2307/30036549


Benbya, H., Pachidi, S., & Jarvenpaa, S. (2021). Special Issue Editorial: Artificial Intelligence in Organizations: Implications for Information Systems Research. Journal of the Association for Information Systems, 22(2), 281-303. https://doi.org/10.17705/1jais.00662


Paschen, U., Pitt, C., & Kietzmann, J. (2020). Artificial intelligence: Building blocks and an innovation typology. Business Horizons, 63, 147-155. https://doi.org/10.1016/j.bushor.2019.10.004


Dwivedi, Y. K., Hughes, L., Ismagilova, E., Aarts, G., Coombs, C., Crick, T., ... Williams, M. D. (2021). Artificial Intelligence (AI): Multidisciplinary perspectives on emerging challenges, opportunities, and agenda for research, practice and policy. International Journal of Information Management, 57, 101994. https://doi.org/10.1016/j.ijinfomgt.2019.08.002


Borges, A. F. S., Laurindo, F. J. B., Spínola, M. M., Gonçalves, R. F., & Mattos, C. A. (2021). The strategic use of artificial intelligence in the digital era: Systematic literature review and future research directions. International Journal of Information Management, 57, 102225. https://doi.org/10.1016/j.ijinfomgt.2020.102225

Anderson, C., & Robey, D. (2017). Affordance potency: Explaining the actualization of technology affordances. Information and Organization, 27(2), 100-115. https://doi.org/10.1016/j.infoandorg.2017.03.002






















Annotations









Module 1 Vicky
Module 2 Kelly
Module 3 Kenneth
Module 4 Group
Subsection 4.3 Group
4.3.1 Digital Innovation Review Vicky
4.3.2 Unpacking The Difference Kelly
4.3.3 Digital Opportunities For Incumbents Kenneth
4.3.4 Digitalization Ethical Challenge Kenneth



Module 3: It-Enabled Innovation 

3.1: The Relation Between It And Organizational Innovation 
1: The Role Of It In Organizational Innovation
 
correlations: 	number of servers to firm performance
computing capacity to firm performance
storage capacity to firm performance
number of patents to it investments
it expertise and firm performance
patents filed to commercialized products
moderate competition stimulates innovation
intense competition depresses innovation

variables:		productivity 
sales performance 
profitability 
value added 
stock returns 
return on investment
Economies of scale
Architectural flexibility
Diminishing returns
Limited impact

influences:		firm alignment and orientation
			posture
			governance
			internal conflict
			internal and external context
group conflict hinders adoption
actively fostering innovation
informal mechanisms
industry dynamics
gender diversity
Knowledge integration
Key actors

frameworks:	resource based view
			capabilities based perspective
industry convergence
Organizational innovation system

cases:			polaroid - misalignment
			xerox - failure to capitalize
			yahoo - failure to capitalize
			hospitality incumbents - dismissive of disruptors
			pharmaceutical companies - r&d failures lead to patent
acquisition resulting in depressed firm performance

limitations:		knowledge gaps
			outcome measurement
			Conceptual abstraction hinders implementation
			Difficulties in establishing causation between variables
			
2: The Nonlinear Influence Of Harmonious Information Technology 


Frameworks: 	HITA - Harmonious IT affordance
			linear vs Non-linear & quadratic correlations
Affordances not inherent in people or artifacts, but
 organizational relationships
Distinctions between Affordances  & impediments 
Resonance - HITA alignment preserves organizational 
memory 
Organizational inertia - delays in implementation
Adaptation
Paradox - tensions between interdependent elements
Exploratory innovation
Exploitative Innovation


limitations:		Few studies use non-linear frameworks
			Most studies assume linear relationships


Variables:		IT Affordance
			IT appropriation


Guidance:		Promote = positive hita or impede = negative HITA
				Either situation can be leveraged to produce innovation
And innovative solutions
			Managing tensions to promote innovations
			Finding and leveraging existing paradoxes to stimulate
innovation - converting tensions into synergies

Examples:		New Collaborations tools that don’t integrate well with 
Existing Organizational memory tools, reducing HITA
Counter-intuitive - when innovation increases despite increasing
organizational misalignment

Perspectives:	IT Affordance misalignment may prevent standardization 
or an effort toward homogeneity and uniformity - or it may be perceived in this manner - but it is exactly this misalignment that results in novel solutions as disparate structures attempt to integrate with one another.
			It’s the challenges created by dissonance, and the need to resolve 
that dissonance - the conflicts created by that dissonance - that results in innovation, and innovate solutions
Definitions:	Positive HITA is when an organization is operating synergistically
			Negative HITA is when an organization is operating with creative
 Dissonance, or, displays paradoxical characteristics
The quadratic relationship between innovation and HITA is that 
innovation is increases as synergies increase, but also as dissonance increases
			Paradox refers to conflict within an organization, or
misalignment within an organization, or dissonance within an organization - even though it may be paradoxical
That innovation can increase as dissonance increases, paradox is not used to describe this phenomenon, the term counter-intuitive is used in this circumstance
			Coalignment - in contrast to dissonance - a kind of synergy
			Affordance Theory - what information technology allows human
users to do - affordance can increase as an operator becomes more adept at using a particular artifact of information technology - affordance is also - it affordance also depends on the goals of the user. - a crm doesn’t do much for a person interested in programming - an IDE doesn’t do much for a person looking to close a deal.
			Types of IT Affordance - Collaborative Affordance - 
organizational Memory Affordance - process management affordance
			Affordance - what is allowed - what is enabled
			Organizational inertia - describes the difficulties an 
organization may have in changing course or changing direction - in HITA terms - HITA = Zero
			Orthogonal - do not influence one another, either in a positive 
way or a negative way

3: Strategic Relevance Of Organizational Virtues Enabled By IT

Terminology:	COPs - communities of practice - a conceptual framework for
Organizations.
Concepts:		Improvisation as innovation - improvisation involves developing
				novel solutions to address novel situations - and should be 
				considered a form of innovation - and should be fostered
				or promoted by an organization to address urgent and
				unpredictable, and unanticipated challenges
			Organizational Wisdom - required to improvise successfully - has
				a positive effect on the ability to improvise
			Mediating Variables - Mediating Factors - IT affordance doesn’t 
				have a direct connection to innovation - it’s mediated 
				through virtues and capabilities that can foster or hinder 
				Innovation.
			IT Capabilities are distinct from IT affordances - capabilities refer 
				to what can be done - affordances, specifically the aspect of 
				how technology is appropriated for a purpose - how 
				technologies might be used - a GPU could be used for 
				enhancing a computer game - or processing a large 
				language model - or processing a blockchain or 
				cryptocurrency - a GPU is capable of performing 
				calculations, but what functions a GPU affords to the user 
				depends on how the user appropriates or uses the GPU or
				what application the user uses it for.

Virtues:		Courage
			Justice - distributive and corrective
			Wisdom
			Temperance - particularly relevant during periods of radical 
				organizational change - needed to reduce anxiety, panic, 
				And Despair that coincides with radical organizational 
				change - Organizational Temperance serves to prevent or 
				reduce chaos

Frameworks:	The framework for organizational virtues is an extension of the 
				business ethics
			Organizational IT affordances - collaborative, process 
				management, and memory - Which in turn enable
				Organizational Virtues - These organizational virtues 
				determine the success of organizational improvisation - 
				improvisation is either a form of innovation - or a kind of 
				process that occurs before innovation - or is a kind of 
				preliminary step to innovation.

Catalysts:		improvisation - turbulent circumstances - spontaneous situations - unprecedented 
				Circumstances - truncated time horizons
Innovation - enhanced by formalizing the process of improvisation - or establishing or 
	practicing improvisation - having a process in place specifically for developing 
	novel solutions to unprecedented situations


4: Information Technology And Organizational Innovation: 

3.2: Disruptive Innovations With It
1: Disruptive Innovation: Conceptual Foundations And Research Opportunities 
2: Agility In Responding To Disruptive Digital Innovation
3: The Disruptive Information Technology Innovation Model
4: The Disruptive Nature Of Information Technology Innovations

3.3: Innovating With Artificial Intelligence 
1: Artificial Intelligence In Organizations 
2: Ai Innovation Typology
3: Artificial Intelligence (Ai): Multidisciplinary Perspectives 
4: Strategic Use Of Ai

References

Mamonov, S., & Peterson, R. (2021). The role of IT in organizational innovation – A systematic literature review. Journal of Strategic Information Systems, 30, 101696. https://doi.org/10.1016/j.jsis.2021.101696

Chatterjee, S., Moody, G. D., Lowry, P. B., Chakraborty, S., & Hardin, A. (2021). The nonlinear influence of harmonious information technology affordance on organisational innovation. Information Systems Journal, 31(3), 294–322. https://doi.org/10.1111/isj.12311

Chatterjee, S., Moody, G., Lowry, P. B., Chakraborty, S., & Hardin, A. (2015). Strategic relevance of organizational virtues enabled by information technology in organizational innovation. Journal of Management Information Systems, 32(3), 158–196. https://doi.org/10.1080/07421222.2015.1099180

Chatterjee, S., Moody, G., Lowry, P. B., Chakraborty, S., & Hardin, A. (2020). Information technology and organizational innovation: Harmonious information technology affordance and courage-based actualization. Journal of Strategic Information Systems, 29, 101596. https://doi.org/10.1016/j.jsis.2020.101596

Hopp, C., Antons, D., Kaminski, J., & Salge, T. O. (2018). Disruptive Innovation: Conceptual Foundations, Empirical Evidence, and Research Opportunities in the Digital Age. Journal of Product Innovation Management, 35(3), 446–457. https://doi.org/10.1111/jpim.12448

Chan, C. M. L., Teoh, S. Y., Yeow, A., & Pan, G. (2018). Agility in responding to disruptive digital innovation: Case study of an SME. Information Systems Journal, 29(2), 436–455. https://doi.org/10.1111/isj.12215

Carlo, J. L., Gaskin, J., Lyytinen, K., & Rose, G. M. (2014). Early vs. late adoption of radical information technology innovations across software development organizations: an extension of the disruptive information technology innovation model. Information Systems Journal, 24(6), 537–569. https://doi.org/10.1111/isj.12039

Lyytinen, K., & Rose, G. M. (2003). The disruptive nature of information technology innovations: The case of internet computing in systems development organizations. MIS Quarterly, 27(4), 557-595. https://doi.org/10.2307/30036549


Benbya, H., Pachidi, S., & Jarvenpaa, S. (2021). Special Issue Editorial: Artificial Intelligence in Organizations: Implications for Information Systems Research. Journal of the Association for Information Systems, 22(2), 281-303. https://doi.org/10.17705/1jais.00662


Paschen, U., Pitt, C., & Kietzmann, J. (2020). Artificial intelligence: Building blocks and an innovation typology. Business Horizons, 63, 147-155. https://doi.org/10.1016/j.bushor.2019.10.004


Dwivedi, Y. K., Hughes, L., Ismagilova, E., Aarts, G., Coombs, C., Crick, T., ... Williams, M. D. (2021). Artificial Intelligence (AI): Multidisciplinary perspectives on emerging challenges, opportunities, and agenda for research, practice and policy. International Journal of Information Management, 57, 101994. https://doi.org/10.1016/j.ijinfomgt.2019.08.002


Borges, A. F. S., Laurindo, F. J. B., Spínola, M. M., Gonçalves, R. F., & Mattos, C. A. (2021). The strategic use of artificial intelligence in the digital era: Systematic literature review and future research directions. International Journal of Information Management, 57, 102225. https://doi.org/10.1016/j.ijinfomgt.2020.102225

Anderson, C., & Robey, D. (2017). Affordance potency: Explaining the actualization of technology affordances. Information and Organization, 27(2), 100-115. https://doi.org/10.1016/j.infoandorg.2017.03.002






















Annotations









Module 1 										Vicky
Module 2										Kelly
Module 3 										Kenneth
Module 4 										Group Paper
4.1. The Landscape of Emerging Technologies				
4.1.1 Blockchain Research in Information Systems
4.1.2 Editorial Emergent Tech and Organizing
4.1.3 the Fintech Revolution:
4.1.4 Quantum Computing and Information Systems


4.2. The Changing Nature of Work
4.2.1 Editorial Future of Work Organizations Society
4.2.2 Human Factors in AI and Future of Work
4.2.3 Mental Health and Information Technology
4.2.4 Waging war from remote cubicles

4.3 Digitalization: Advances and Challenges 				Group Presentation
4.3.1 Digital Innovation Review 					Vicky
4.3.2 Unpacking The Difference 					Kelly
4.3.3 Digital Opportunities For Incumbents 			Kenneth
4.3.4 Digitalization Ethical Challenge 				Kenneth

Module 3: It-Enabled Innovation 

3.1: The Relation Between It And Organizational Innovation 
1: The Role Of It In Organizational Innovation
 
correlations: 	number of servers to firm performance
computing capacity to firm performance
storage capacity to firm performance
number of patents to it investments
it expertise and firm performance
patents filed to commercialized products
moderate competition stimulates innovation
intense competition depresses innovation

variables:		productivity 
sales performance 
profitability 
value added 
stock returns 
return on investment
Economies of scale
Architectural flexibility
Diminishing returns
Limited impact

influences:		firm alignment and orientation
			posture
			governance
			internal conflict
			internal and external context
group conflict hinders adoption
actively fostering innovation
informal mechanisms
industry dynamics
gender diversity
Knowledge integration
Key actors

frameworks:	resource based view
			capabilities based perspective
industry convergence
Organizational innovation system

cases:			polaroid - misalignment
			xerox - failure to capitalize
			yahoo - failure to capitalize
			hospitality incumbents - dismissive of disruptors
			pharmaceutical companies - r&d failures lead to patent
acquisition resulting in depressed firm performance

limitations:		knowledge gaps
			outcome measurement
			Conceptual abstraction hinders implementation
			Difficulties in establishing causation between variables
			
2: The Nonlinear Influence Of Harmonious Information Technology 


Frameworks: 	HITA - Harmonious IT affordance
			linear vs Non-linear & quadratic correlations
Affordances not inherent in people or artifacts, but
 organizational relationships
Distinctions between Affordances  & impediments 
Resonance - HITA alignment preserves organizational 
memory 
Organizational inertia - delays in implementation
Adaptation
Paradox - tensions between interdependent elements
Exploratory innovation
Exploitative Innovation


limitations:		Few studies use non-linear frameworks
			Most studies assume linear relationships


Variables:		IT Affordance
			IT appropriation


Guidance:		Promote = positive hita or impede = negative HITA
				Either situation can be leveraged to produce innovation
And innovative solutions
			Managing tensions to promote innovations
			Finding and leveraging existing paradoxes to stimulate
innovation - converting tensions into synergies

Examples:		New Collaborations tools that don’t integrate well with 
Existing Organizational memory tools, reducing HITA
Counter-intuitive - when innovation increases despite increasing
organizational misalignment

Perspectives:	IT Affordance misalignment may prevent standardization 
or an effort toward homogeneity and uniformity - or it may be perceived in this manner - but it is exactly this misalignment that results in novel solutions as disparate structures attempt to integrate with one another.
			It’s the challenges created by dissonance, and the need to resolve 
that dissonance - the conflicts created by that dissonance - that results in innovation, and innovate solutions
Definitions:	Positive HITA is when an organization is operating synergistically
			Negative HITA is when an organization is operating with creative
 Dissonance, or, displays paradoxical characteristics
The quadratic relationship between innovation and HITA is that 
innovation is increases as synergies increase, but also as dissonance increases
			Paradox refers to conflict within an organization, or
misalignment within an organization, or dissonance within an organization - even though it may be paradoxical
That innovation can increase as dissonance increases, paradox is not used to describe this phenomenon, the term counter-intuitive is used in this circumstance
			Coalignment - in contrast to dissonance - a kind of synergy
			Affordance Theory - what information technology allows human
users to do - affordance can increase as an operator becomes more adept at using a particular artifact of information technology - affordance is also - it affordance also depends on the goals of the user. - a crm doesn’t do much for a person interested in programming - an IDE doesn’t do much for a person looking to close a deal.
			Types of IT Affordance - Collaborative Affordance - 
organizational Memory Affordance - process management affordance
			Affordance - what is allowed - what is enabled
			Organizational inertia - describes the difficulties an 
organization may have in changing course or changing direction - in HITA terms - HITA = Zero
			Orthogonal - do not influence one another, either in a positive 
way or a negative way

3: Strategic Relevance Of Organizational Virtues Enabled By IT

Terminology:	COPs - communities of practice - a conceptual framework for
Organizations.
Concepts:		Improvisation as innovation - improvisation involves developing
				novel solutions to address novel situations - and should be 
				considered a form of innovation - and should be fostered
				or promoted by an organization to address urgent and
				unpredictable, and unanticipated challenges
			Organizational Wisdom - required to improvise successfully - has
				a positive effect on the ability to improvise
			Mediating Variables - Mediating Factors - IT affordance doesn’t 
				have a direct connection to innovation - it’s mediated 
				through virtues and capabilities that can foster or hinder 
				Innovation.
			IT Capabilities are distinct from IT affordances - capabilities refer 
				to what can be done - affordances, specifically the aspect of 
				how technology is appropriated for a purpose - how 
				technologies might be used - a GPU could be used for 
				enhancing a computer game - or processing a large 
				language model - or processing a blockchain or 
				cryptocurrency - a GPU is capable of performing 
				calculations, but what functions a GPU affords to the user 
				depends on how the user appropriates or uses the GPU or
				what application the user uses it for.

Virtues:		Courage
			Justice - distributive and corrective
			Wisdom
			Temperance - particularly relevant during periods of radical 
				organizational change - needed to reduce anxiety, panic, 
				And Despair that coincides with radical organizational 
				change - Organizational Temperance serves to prevent or 
				reduce chaos

Frameworks:	The framework for organizational virtues is an extension of the 
				business ethics
			Organizational IT affordances - collaborative, process 
				management, and memory - Which in turn enable
				Organizational Virtues - These organizational virtues 
				determine the success of organizational improvisation - 
				improvisation is either a form of innovation - or a kind of 
				process that occurs before innovation - or is a kind of 
				preliminary step to innovation.

Catalysts:		improvisation - turbulent circumstances - spontaneous situations - unprecedented 
				Circumstances - truncated time horizons
Innovation - enhanced by formalizing the process of improvisation - or establishing or 
	practicing improvisation - having a process in place specifically for developing 
	novel solutions to unprecedented situations


Limitations:		ninety percent of innovations fail
Research showing reduced significance of information technology on organizational 
Outcomes
Organizational Wisdom - highest correlative variable to improvisational success - may 
potentially be highest among more established incumbent organizations - and less 
so among more recently established organizations.
In Business Ethics research, the virtue based ethical framework occupies a niche area, even 
within the information systems discipline - business ethics, the majority of business 
ethics scholarship - focuses on morality (“deontology”) or optimization as an 
ethical framework (“utilitarianism”)
Research based on subjects or observees or participants based in the united states


4: Information Technology And Organizational Innovation: 

3.2: Disruptive Innovations With It
1: Disruptive Innovation: Conceptual Foundations And Research Opportunities 
2: Agility In Responding To Disruptive Digital Innovation
3: The Disruptive Information Technology Innovation Model
4: The Disruptive Nature Of Information Technology Innovations

3.3: Innovating With Artificial Intelligence 
1: Artificial Intelligence In Organizations 
2: Ai Innovation Typology
3: Artificial Intelligence (Ai): Multidisciplinary Perspectives 
4: Strategic Use Of Ai

References

Mamonov, S., & Peterson, R. (2021). The role of IT in organizational innovation – A systematic literature review. Journal of Strategic Information Systems, 30, 101696. https://doi.org/10.1016/j.jsis.2021.101696

Chatterjee, S., Moody, G. D., Lowry, P. B., Chakraborty, S., & Hardin, A. (2021). The nonlinear influence of harmonious information technology affordance on organisational innovation. Information Systems Journal, 31(3), 294–322. https://doi.org/10.1111/isj.12311

Chatterjee, S., Moody, G., Lowry, P. B., Chakraborty, S., & Hardin, A. (2015). Strategic relevance of organizational virtues enabled by information technology in organizational innovation. Journal of Management Information Systems, 32(3), 158–196. https://doi.org/10.1080/07421222.2015.1099180

Chatterjee, S., Moody, G., Lowry, P. B., Chakraborty, S., & Hardin, A. (2020). Information technology and organizational innovation: Harmonious information technology affordance and courage-based actualization. Journal of Strategic Information Systems, 29, 101596. https://doi.org/10.1016/j.jsis.2020.101596

Hopp, C., Antons, D., Kaminski, J., & Salge, T. O. (2018). Disruptive Innovation: Conceptual Foundations, Empirical Evidence, and Research Opportunities in the Digital Age. Journal of Product Innovation Management, 35(3), 446–457. https://doi.org/10.1111/jpim.12448

Chan, C. M. L., Teoh, S. Y., Yeow, A., & Pan, G. (2018). Agility in responding to disruptive digital innovation: Case study of an SME. Information Systems Journal, 29(2), 436–455. https://doi.org/10.1111/isj.12215

Carlo, J. L., Gaskin, J., Lyytinen, K., & Rose, G. M. (2014). Early vs. late adoption of radical information technology innovations across software development organizations: an extension of the disruptive information technology innovation model. Information Systems Journal, 24(6), 537–569. https://doi.org/10.1111/isj.12039

Lyytinen, K., & Rose, G. M. (2003). The disruptive nature of information technology innovations: The case of internet computing in systems development organizations. MIS Quarterly, 27(4), 557-595. https://doi.org/10.2307/30036549


Benbya, H., Pachidi, S., & Jarvenpaa, S. (2021). Special Issue Editorial: Artificial Intelligence in Organizations: Implications for Information Systems Research. Journal of the Association for Information Systems, 22(2), 281-303. https://doi.org/10.17705/1jais.00662


Paschen, U., Pitt, C., & Kietzmann, J. (2020). Artificial intelligence: Building blocks and an innovation typology. Business Horizons, 63, 147-155. https://doi.org/10.1016/j.bushor.2019.10.004


Dwivedi, Y. K., Hughes, L., Ismagilova, E., Aarts, G., Coombs, C., Crick, T., ... Williams, M. D. (2021). Artificial Intelligence (AI): Multidisciplinary perspectives on emerging challenges, opportunities, and agenda for research, practice and policy. International Journal of Information Management, 57, 101994. https://doi.org/10.1016/j.ijinfomgt.2019.08.002


Borges, A. F. S., Laurindo, F. J. B., Spínola, M. M., Gonçalves, R. F., & Mattos, C. A. (2021). The strategic use of artificial intelligence in the digital era: Systematic literature review and future research directions. International Journal of Information Management, 57, 102225. https://doi.org/10.1016/j.ijinfomgt.2020.102225

Anderson, C., & Robey, D. (2017). Affordance potency: Explaining the actualization of technology affordances. Information and Organization, 27(2), 100-115. https://doi.org/10.1016/j.infoandorg.2017.03.002






















Annotations









Module 1 										Vicky
Module 2										Kelly
Module 3 										Kenneth
Module 4 										Group Paper
4.1. The Landscape of Emerging Technologies				
4.1.1 Blockchain Research in Information Systems
4.1.2 Editorial Emergent Tech and Organizing
4.1.3 the Fintech Revolution:
4.1.4 Quantum Computing and Information Systems


4.2. The Changing Nature of Work
4.2.1 Editorial Future of Work Organizations Society
4.2.2 Human Factors in AI and Future of Work
4.2.3 Mental Health and Information Technology
4.2.4 Waging war from remote cubicles

4.3 Digitalization: Advances and Challenges 				Group Presentation
4.3.1 Digital Innovation Review 					Vicky
4.3.2 Unpacking The Difference 					Kelly
4.3.3 Digital Opportunities For Incumbents 			Kenneth
4.3.4 Digitalization Ethical Challenge 				Kenneth


*/