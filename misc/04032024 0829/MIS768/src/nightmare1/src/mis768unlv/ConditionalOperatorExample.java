package mis768unlv;

import java.util.Scanner;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double BASE_FEE = 4.5;
		final double OVERWEIGHT_FEE = 7;
		final double WEIGHT_LIMIT = 20;
		
		double weight;
		double charge;
		
		Scanner kb = new Scanner(System.in);
		try {
			

		
		System.out.print("Please enter the weight of the package:");
		weight = kb.nextDouble();
		
		charge = weight * (weight<=WEIGHT_LIMIT? BASE_FEE: OVERWEIGHT_FEE);
		
		System.out.print("The total charge is:$" +charge);
	} 

	finally {
		kb.close();
	}

	}

}


/* 


wait. it is in effect. never mind.
I thought that the weight limit would prevent the package from being shipped, but the weight limit determines if or not
the package is subject to an overweight fee.

...


THere is a weight limit here that isn't actually in effect.

...

		  try {
			System.out.print("Enter Ticket Class 1, 2, 3 or 4: ");

			ticketClass = keyboard.next().charAt(0); 

            if (ticketClass == '1') {
                System.out.print("Ticket Class 1 has been added to your cart, the amount due is $15");
            } else if (ticketClass == '2') {
                System.out.print("Ticket Class 2 has been added to your cart, the amount due is $15");
            } else if (ticketClass == '3') {
                System.out.print("Ticket Class 3 has been added to your cart, the amount due is $25");
            } else if (ticketClass == '4') {
                System.out.print("Ticket Class 4 has been added to your cart, the amount due is $35");
            } else {
                System.out.print("The ticket class entered is not a valid ticket class");
            }





		  try {
			
        } finally {
            keyboard.close();
        }


I'm not sure why closing the keyboard is important.

everything seems to work just fine without the keyboard being closed.
i think.

anyway.



 
 
I'm experiencing quite a bit of anxiety right now. 
 
 
 Module 3: It-Enabled Innovation 

3.1: The Relation Between It And Organizational Innovation 
1: The Role Of It In Organizational Innovation 
2: The Nonlinear Influence Of Harmonious Information Technology 
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

 
 
*/

