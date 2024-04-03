package mis768unlv;

import java.util.Scanner;

public class LogicalAnd {
	   public static void main(String[] args){
			String name; // name of the employee
			int hours; // number of hours worked
			int points; // points earned
			Employee anEmployee = new Employee();
			
		    Scanner keyboard = new Scanner(System.in);
			try {


		    
		    // get the name
		    System.out.print("Enter the name: ");
		    name = keyboard.nextLine();
		    anEmployee.setName(name);
		    
		    // get the hours
		    System.out.print("Enter the number of hours: ");
		    hours = keyboard.nextInt();
		    
		    // get the points
		    System.out.print("Enter the number of points: ");
		    points = keyboard.nextInt();
			anEmployee.earnExperiencePoint(points);
			// allow the employee to earn the point as designated
		
	      // Determine whether the employee is qualified
	      if (anEmployee.getBonusQualification(hours)) {
	    	  System.out.print("The employee is qualified.");
	      }
	      else {
	    	  System.out.print("The Employee is not qualified.");

	      }
		} finally {
            keyboard.close();
        }
	   }

}




/*


		  try {

		  } finally {
            keyboard.close();
        }


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

Hopp, C., Antons, D., Kaminski, J., & Salge, T. O. (2018). Disruptive Innovation: Conceptual Foundations, Empirical Evidence, and Research Opportunities in the Digital Age. Journal of Product Innovation Management, 35(3), 446–457. https://doi.org/10.1111/jpim.12448

Chan, C. M. L., Teoh, S. Y., Yeow, A., & Pan, G. (2018). Agility in responding to disruptive digital innovation: Case study of an SME. Information Systems Journal, 29(2), 436–455. https://doi.org/10.1111/isj.12215

Carlo, J. L., Gaskin, J., Lyytinen, K., & Rose, G. M. (2014). Early vs. late adoption of radical information technology innovations across software development organizations: an extension of the disruptive information technology innovation model. Information Systems Journal, 24(6), 537–569. https://doi.org/10.1111/isj.12039

Lyytinen, K., & Rose, G. M. (2003). The disruptive nature of information technology innovations: The case of internet computing in systems development organizations. MIS Quarterly, 27(4), 557-595. https://doi.org/10.2307/30036549
Benbya, H., Pachidi, S., & Jarvenpaa, S. (2021). Special Issue Editorial: Artificial Intelligence in Organizations: Implications for Information Systems Research. Journal of the Association for Information Systems, 22(2), 281-303. https://doi.org/10.17705/1jais.00662
Paschen, U., Pitt, C., & Kietzmann, J. (2020). Artificial intelligence: Building blocks and an innovation typology. Business Horizons, 63, 147-155. https://doi.org/10.1016/j.bushor.2019.10.004
Dwivedi, Y. K., Hughes, L., Ismagilova, E., Aarts, G., Coombs, C., Crick, T., ... Williams, M. D. (2021). Artificial Intelligence (AI): Multidisciplinary perspectives on emerging challenges, opportunities, and agenda for research, practice and policy. International Journal of Information Management, 57, 101994. https://doi.org/10.1016/j.ijinfomgt.2019.08.002
Borges, A. F. S., Laurindo, F. J. B., Spínola, M. M., Gonçalves, R. F., & Mattos, C. A. (2021). The strategic use of artificial intelligence in the digital era: Systematic literature review and future research directions. International Journal of Information Management, 57, 102225. https://doi.org/10.1016/j.ijinfomgt.2020.102225


















Annotations


I’m going to double check the references page before transferring the information over to the module 3 paper






Module 1 Vicky
Module 2 Kelly
Module 3 Kenneth
Module 4 Group
Subsection 4.3 Group
4.3.1 Digital Innovation Review Vicky
4.3.2 Unpacking The Difference Kelly
4.3.3 Digital Opportunities For Incumbents Kenneth
4.3.4 Digitalization Ethical Challenge Kenneth




		  try {

		  } finally {
            keyboard.close();
        }


  
 */