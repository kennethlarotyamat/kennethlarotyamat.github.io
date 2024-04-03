package edu.unlv.mis768.kly;

import java.util.Scanner;

public class AverageTestScoreConversion {
/**
 * 
 * @param args this is the main method
 * it allows the user to enter the score of 3 different assignments
 * each assignment is a integer number type
 */
	
	public static void main(String[] args) {
		int firstScore = 0;
		int secondScore = 0;
		int thirdScore = 0;
		int enteredScores;
		boolean invalidInformation = false;
		//boolean invalidInformation = false;
																														//int hours; 																									// user input - entered by user - user defined
// i really don't want to do any more input validation that I've already done. it throws out negative numbers, scores that are negative numbers, and scores over 100
		//int minutes;																								// user input - entered by user - user defined
																											
																													
		Scanner kb = new Scanner(System.in); 
		
		//try {
		
		
		
		try {
		System.out.print("Enter score on Assignment 1: ");
		firstScore = kb.nextInt();
		
		System.out.print("Enter score on Assignment 2: ");
		secondScore = kb.nextInt();
		
		System.out.print("Enter score on Assignment 3: ");
		thirdScore = kb.nextInt();
		}
        catch (java.util.InputMismatchException e) {
            	// This causes any input other than a number to be classified as invalid information
            	invalidInformation = true;                    
        }
		
		/**
		 *  this closes the keyboard to address the resource leak warning
		 *  actually, the if statement spits out a message to the user to inform the user
		 *  that invalid information has been entered, it's the catch statement above that throws out non numeric characters
		 *  then the if statement throws out non-numeric characters
		 */
        finally{kb.close();}
        if (invalidInformation) {
            // this is active if a user enters non-numeric characters and informs the user that the information entered is not valid.
            System.out.println("There seems to be an error, please review inputs.");
        }
		
		
		// i can't believe it's finally done.
        // this was actually as time consuming as the tax due assignment
		
		//}
		// catch (java.util.InputMismatchException e) {
            // This causes any input other than a number to be classified as invalid information
       //     invalidInformation = true;                    
       // }
        //else {
		enteredScores = processedScores(firstScore, secondScore, thirdScore);											
		System.out.println(enteredScores == -1 || invalidInformation == true ?"There seems to be an error, please review inputs.":"Your average score is: "+enteredScores); 					// "There seems to be an error, please review inputs."
		System.out.println(enteredScores == -1 || invalidInformation == true ?"There seems to be an error, please review inputs.":"Your letter grade is: "+letterGrade(enteredScores));
		
        
       // }

	}
	public static int processedScores (int scoreOne, int scoreTwo, int scoreThree) {
																																					
		double resultRoundedUp = 
		Math.ceil((double)(scoreOne+scoreTwo+scoreThree)/3);									
		int result = (int) resultRoundedUp;
		return (result < 0 || result > 100 ) ? -1 : result;    											//  "There seems to be an error, please review inputs."  Integer.toString(result);  // (String) result; // what a headache Integer.toString  System.out.print("Negative taxable income cannot be processed.");
		
	}
	
	public static String letterGrade (int enteredScores) {
		
		String resultLetterGrade = 
		  (0 <= enteredScores && enteredScores <= 69)    ?  "F"

		: (70 <= enteredScores && enteredScores <= 79)   ?  "C"

		: (80 <= enteredScores && enteredScores <= 89)   ?  "B"
		: (90 <= enteredScores && enteredScores <= 100)  ?  "A" 
		: "There seems to be an error, please review inputs.";
		return resultLetterGrade;
		
	}
} 

/*
  
  
	public static String letterGrade () {
																																					
		double resultRoundedUp = Math.ceil((double)(scoreOne+scoreTwo+scoreThree)/3);									
		int result = (int) resultRoundedUp;
		return result;
		
	}

(0 <= enteredScores && enteredScores <= 69)
?F:
?C:(70 <= enteredScores && enteredScores <= 79)
?B:(80 <= enteredScores && enteredScores <= 89)
?A:(90 <= enteredScores && enteredScores <= 100):"There seems to be an error, please review inputs.";







(0 <= enteredScores && enteredScores <= 70)
(0 <= enteredScores && enteredScores <= 70)


(0 <= taxableIncome && taxableIncome <= BRACKET_LIMIT_TEN)
                                        ? 
                                        taxableIncome * TEN_PERCENT
                                                                                : (BRACKET_LIMIT_TEN < taxableIncome && taxableIncome <= BRACKET_LIMIT_TWELVE)
                                        ? 
                                        (BRACKET_LIMIT_TEN * TEN_PERCENT) +                    // income taxable at 10%
                                        ((taxableIncome - BRACKET_LIMIT_TEN) * TWELVE_PERCENT)



Module 3: IT-Enabled Innovation 

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

2.1 Why Microtribes Are Wrecking Company Growth Plans

Dynamics:		Market fragmentation - has been increasing in an increasingly granular way - allowed by changes in how people 
				connect with one another
			Examples of how incumbents have adapted - have to combine some functions - keep other functions separate - these 
				can be used to describe when organizations 
					VF Corporation
					Match Group
					Omnicom
					Publicis
			Technologies change the way people interact - which changes the sizes of market segments - which changes how 
				companies manage product lineups - which changes how organizations are segmented
			I can demonstrate the non-linear/quadratic/parabolic/u-shaped relationship by using illustrations from 
				Fragmented organizations - VF Corp. - Match - Meta - Berkshire Hathaway
				Integrated Organizations - Apple - Google
				Mixed Integrated Organizations - Amazon
				


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
Challenges:	Inconsistencies in literature
			Limitations on areas of study - Organizational courage - risk tolerance - risk aversion - and fit
			Limitations of agency in a corporate context
Concepts:		Fit -HITA, and how HITA influences organizational courage
			Gestalt - coherence of internal structures
			Stratification of Fit: proposes 3 levels of fit Level 1 - Level 2 - Level 3
			Actualization - application and implementation
			Innovation - 2 types - exploratory - exploitative - exploitative meaning commercializable - actually - it seems both 
				exploratory and exploitative are for commercial applications - exploratory refers to innovating new 
				products - exploitative refers to innovating existing products - exploratory innovation is radical - 
				Exploitative is Incremental. Exploratory innovation is more disruptive.
			Actualizing affordances - Requires experimentation, changes, tinkering - these processes can pose a perceived risk 
				that a less courageous organization may be averse to, and therefore will never benefit from affordances 
				that are never implemented or actualized.
			Moderation - one variable has an effect on another variable, but that intensity of that impact is affected by a
				third variable
			Mediation -  one variable has an effect on another variable, but this effect can only occur through an 
				intermediate variable, or intermediary, that transmits the effect from the first variable, to the second 
				Variable
			Profile deviation - expectations vs reality
			Matching - two variables
			Covariance
			Gestalt
			
			
Frameworks:	Agility -  the ability to adapt to changing circumstances
Terminology:	Organizational Courage - refers to the ability to take risks - 
			Fit - Alignment and harmony - FIT & HITA refer to the convergence of IT infrastructure and organizational
				objectives in a way that serves as a catalyst for innovation - fosters innovation
			Circumspect - risk averse - risk avoidance - wary or risk
			Transitive Effect - 
			Salience = prevalence -
			Parsimonious - used in this context to mean focused
			Spurious - dubious or contrived

Conflicts:		Exploratory innovation by a firm may create products that conflict with existing product lines the following are 
			a list of companies that innovated products that conflicted with existing products:
				Vanguard - passively managed index funds
				State Street - Exchange traded funds
				Xerox - GUI, Personal Computers
				Polaroid - Digital Cameras, digital photography, digital imaging
				Alphabet - Large Language Models
				Booking holdings - Vacation Rentals
				IBM - Personal Computers , Servers
				Altria - vape products
				Microsoft - Mobile Operating Systems, Mobile Devices
				Corteva - Bioengineered crops
				Blockbuster - video streaming services
				Palm, blackberry, motorola - touchscreen smartphones
				DR Horton, Lennar Greystone - Modular construction techniques
				Atari - console gaming - computer gaming - multiplayer gaming
Reflections:	Affordances must be actualized, having the best tools, having the best technology means nothing if it isn’t put
				into use, it’s useless if it isn’t used - and it’s useless if it isn’t used to produce anything, like to innovate new 
				products, or iterate and improve upon existing products. These new innovations have the potential to create 
				uncertainty and perceived risks to an organization, and an organization must have courage to overcome				 the fears of risk and uncertainty to actualize technology to innovate.
			What the data shows is that the rewards are there for organizations  willing to take risks, for organizations that
				have The organizational courage to take prudent and well calculated risks and address the uncertainties 
				that come with those, rewards, those innovations, however, in order for these rewards to materialize for an
				Organization, information Technology affordances must be actualized in combination with a strong 
				culture of organizational courage.
			There is a point in the article that shows that there is a strong relationship between exploratory and exploitative
				 innovation, that when one measurement measures high, that the other will also measure high. One thing we 
				discussed in class was that, a long series of incremental, exploitative innovations, can result in - or can add 
				up to something similarly to an exploratory, disruptive innovation
			


3.2: Disruptive Innovations With It

1: Disruptive Innovation: Conceptual Foundations And Research Opportunities 
Disruption:		The term disruption - Currently Overused - core concepts misunderstood - disruption usually occurs at the
				lower-end of the market. Incumbents produce over-developed products. New entrants develop inexpensive
				products.
					Fintech -	
					Rideshare -
					Vacation Rentals -
					Browser software - 
			The technology isn’t usually innovative, but the business model is what is disruptive
			Low-end encroachment - movement from the low-end of the market, upstream, to the higher end of the market is 
				Usually something incumbents tend not to pay attention to - and this results in an increased chance of 
				being disrupted
			Industry-Wide or Strategic Disruptions
				Green Revolution
				Automation, AI, robotics, drones
				Sensor Technologies, wireless sensor networks
				Additive Manufacturing techniques, 3d printing, digital production
Methods:		Used language analysis to screen 1078 research papers published between 1978 - 2016
			Diffusion patterns
			Ex-ante
			Ex-post
			Post-hoc conclusions
Dynamics:		incumbents, established organizations lose ground when innovations occur due to a focus on existing, 
				sophisticated customers
			It has been suggested that organizations develop units that guard against disruptions rather than focus on 
				customer needs
			Leadership structures that cause organizations to be disrupted, increase the risk of being disrupted, and have 
				difficulties adapting and reacting to disruptions
			Legislative barriers prevented or interfered with the adoption of e-readers in japan - copyrights and intellectual 
				property protections specifically



2: Agility In Responding To Disruptive Digital Innovation
Focus:		small and medium sized enterprises - firms

Terminology:	SME - small to medium sized enterprises
			DDI - disruptive digital innovation
			Rigidity & Agility - refers to or connects to the concept of organizational inertia and agility
			

Cases:			Kodak - failure to respond to digital photography
			Nokia - failure to respond to smartphones
			AirBNB - how will it adapt as the market for vacation rentals becomes increasingly competitive
			Uber Technologies - 
			Elixir Technologies - coding changes - programming disruptions - software delivery distribution disruptions - 
				moved from business reporting - to business intelligence software - then to providing this service through 
				the cloud or through a cloud based application. - Developed a system for dispatching taxis to taxi stands, 
				but this was disrupted by ride-hailing services, so the technology was modified to serve mass transit stations
				Elixir was in a somewhat unique position - since they were in a business reporting, business intelligence, 
				business analytics software business, they often had extensive external network relationships since they 
				had to work with a variety of businesses - through these networks, the leadership teams were often more 
				creative, and more open to new business ideas. Converted the transit system software to a smart-transit 
				software system. from off the shelf packages - to cloud based software as a service - from business reporting 
				software to business analytics software. Had to adapt to mobile devices - pdas - and later to smart phones - 
				to allow delivery of the software to mobile devices

Concepts:		Agility is the key factor in surviving disruptions caused by digital innovations - requires the ability to detect and 
				respond to the changes caused by the innovations
			Some innovations may require the combination of several different technologies, or may require the maturity of 
				some technologies to occur, prerequisite developments to take place.
			SME - do not require large amounts of slack resources - refers to emergency fund style resources - larger 
				organizations require more slack resources in a way that someone with higher monthly expenses may require 
				a larger emergency fund. SMEs tend to have owner/managers who tend to have a mindset or approach that is 
				different from someone who is an employee/manager
			External network relationships - people outside a firm who can assist an SME in various ways, support an SME in 
				various ways, provide external competencies, external insights, alternative viewpoints, identify 
				Opportunities
			SME - does experience greater resource constraints compared to larger organizations
			Organizational Ambidexterity - managing exploratory, and exploitative innovation at the same time.
			Exploratory vs Exploitative innovation - in elixer’s case - mentioned that 3 out of 10 exploitative pilot projects 
				work out, compared to 1 out of 10 for exploratory pilot projects
			Responding to changes - develop capabilities - preventing rigidities - sensing requires leadership to have strong 
				external networks boundary openness
			Sensing Capabilities - being able to detect changes in innovation that can disrupt a business.
			SME - has benefits as well as challenges, they don’t require extensive resource slack, or fall back resources, but 
				they also don’t have - this also is an issue because they may not have enough resources to reconfigure the 
				Business or to adapt in the necessary ways after a disruption.



3: The Disruptive Information Technology Innovation Model
4: The Disruptive Nature Of Information Technology Innovations

3.3: Innovating With Artificial Intelligence
 
1: Artificial Intelligence In Organizations 
2: AI Innovation Typology
3: Artificial Intelligence (AI): Multidisciplinary Perspectives 




3.1 Leveraging large language models for predictive chemistry


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
Polymers- This is chemistry related
Monomers - This is chemistry related
		Gaussian process regression - GPR
		Generative pretrained transformer - gpt

Applications:	Large Language Models and machine learning to chemistry, and physical sciences
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
AI is already used to create novel chemical structures, however, the prevailing AI tools 
used for the purpose of generating novel chemical structures are Machine learning 
models, rather than large language models, this research paper approaches 
generating novel chemical structures using LLMs rather than MLMs


Intersections:	This paper illustrates the concept of IT Affordances - LLMs have certain capabilities, and 
how LLMs are appropriated, in this case, an LLM is appropriated for the purpose of creating novel chemical compounds - this article illustrates a novel appropriation of an existing tool.



	
	
4: Strategic Use Of AI











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
Jablonka, K. M., Schwaller, P., Ortega-Guerrero, A., & Smit, B. (2024). Leveraging large language models for predictive chemistry. Nature Machine Intelligence. https://doi.org/10.1038/s42256-023-00788-1

Patnaik, D. (2024, February 11). Why Microtribes Are Wrecking Company Growth Plans. Forbes. https://www.forbes.com/sites/devpatnaik/2024/02/11/why-microtribes-are-wrecking-company-growth-plans/?sh=3307ddba509c
























Annotations

Testing the presentation - tested inserting videos - creating charts - creating diagrams - 

Created slides 21 - 24 - subsequently deleted.


Updated Module paper 3, just the references page

I came across an interesting scholarly article that I want to read, and cite in this paper
So i am skipping to 3.3 of the module 3 paper



Article Read Aloud Set up Area

– this was basically useless, you can’t print a pdf that has read aloud enabled, a document has to be downloaded, not printed – as a pdf in order for it to be read aloud enabled












Module 1 											Vicky
Module 2											Kelly
Module 3 											Kenneth
Module 4 											Group Paper
4.1. The Landscape of Emerging Technologies				Vicky
4.1.1 Blockchain Research in Information Systems		Vicky
4.1.2 Editorial Emergent Tech and Organizing			Vicky
4.1.3 the Fintech Revolution:						Vicky
4.1.4 Quantum Computing and Information Systems		Vicky


4.2. The Changing Nature of Work						Kelly
4.2.1 Editorial Future of Work Organizations Society		Kelly
4.2.2 Human Factors in AI and Future of Work			Kelly
4.2.3 Mental Health and Information Technology		Kelly
4.2.4 Waging war from remote cubicles				Kelly

4.3 Digitalization: Advances and Challenges 				Kenneth			Group Presentation
4.3.1 Digital Innovation Review 					Kenneth			Vicky
4.3.2 Unpacking The Difference 					Kenneth			Kelly
4.3.3 Digital Opportunities For Incumbents 			Kenneth			Kenneth
4.3.4 Digitalization Ethical Challenge 				Kenneth			Kenneth

*/


//		(0 <= taxableIncome && taxableIncome <= BRACKET_LIMIT_TEN)
//		? 
//		taxableIncome * TEN_PERCENT



//int convertedMinutes;
//result to be calculated

//I have to remember to import the scanner // the was one other thing we learned to import, but I forgot what that was // 


//convertedScores = convertToScores(hours, minutes);												//	convertedMinutes = convertToMinutes(hours, minutes);
//+ Math.ceil(taxDue));

//variable declaration // TODO Auto-generated method stub

//result variable and calculation
//60*hr+min;
// it works. as simple as this is, I'm actually really excited about it.
// i need to work today, and this is the last day to turn in the assignment to calculating average grades
// i didn't realize that the course grade has weights for different assignment classes.
