package edu.unlv.mis768.w4;// package edu.unlv.mis768.kly.individualassignment2;

import java.text.DecimalFormat;

public class TestScore {

	private int numQuestions;
	private int numMissed;
	private double theScore;
	private double questionValue;

	public int getNumQuestions() {
		return numQuestions;
	}

	public void setNumMissed(int numMissed) {

	}

	public int getNumMissed() {
		return numMissed;
	}

	public double getPointsEach() {
		if (numQuestions <= 0 || numMissed < 0) {
			questionValue = 0;
		} else {
			questionValue = (100 / (double) numQuestions);
		}
		return questionValue;
	}

	public double getScore() {
		if (numQuestions <= 0 || numMissed < 0) {
			theScore = 0;
		} else {
			theScore = ((double) (numQuestions - numMissed) / numQuestions) * 100;
		}

		return theScore;
	}

	public boolean equals(TestScore o2) {
		if (this.theScore == o2.theScore)
			return true;
		else
			return false;

	}

	DecimalFormat ft = new DecimalFormat("0.00");

	public String toString() {
		String theString = null;
		theString = "The test includes " + numQuestions + " question(s).\n" + "Each question is valued at "
				+ ft.format(questionValue) + " points. \n"
				+ "The test-taker missed " + numMissed + " question(s).\n"
				+ "The score is " + ft.format(theScore) + ".";

		return theString;
	}

	public TestScore(int numQ, int numM) {

		if (numQ < 0 || numM < 0) {

			numQ = 0;
			numM = 0;
			theScore = 0;
			questionValue = 0;

		}

		numQuestions = numQ;
		numMissed = numM;

	}

	public TestScore(String numQtyString, String numWrongString) {

		int numM = Integer.parseInt(numWrongString);

		int numQ = Integer.parseInt(numQtyString);

		if (numQ < 0 || numM < 0) {

			numQ = 0;
			numM = 0;
			theScore = 0;
			questionValue = 0;

		}

		numQuestions = numQ;
		numMissed = numM;

	}

}

// i think that it's done but this basically took forever.
//}
// else {theScore=0;}
// if ((double)numQuestions < 0 || (double) numMissed < 0) {
//}
//questionValue = queVal;
//questionValue = 0;
//theScore = 0;
//questionValue = 0;
//theScore = 0;
//if	(numM < 0)
//
//	numM = 0;
//	numQ = 0;
//I can't even believe how long this is taking me.
//	String calculateQuestionValue;
//,calculateQuestionValue,calculateExamScore
//// enterQuestionQty //100;

//public double getPointsEach() {
//
//questionValue = (double) numQuestions / 100;
//return questionValue;
//}
//double calculateQuestionValue;
//double calculateExamScore;
//String calculateFirstExamScore;
//I might have to do this again using system in keyboard -- but I don't want to do that considering how long I've already taken just getting this far.
//SavingsAccount myAccount = new SavingsAccount(monthlyInterestRate,startingBalance);
//TODO Auto-generated method stub
//SavingsAccount myAccount = new SavingsAccount(monthlyInterestRate,startingBalance); // The constructor SavingsAccount(String, String) is undefined

//TestScore firstExam = new TestScore (enterQuestionQty);
//SavingsAccount myAccount = new SavingsAccount(monthlyInterestRate,startingBalance);
//		private static 
//	Create a program to demonstrate this Test class.
//	In this program, ask the user to enter the number of questions 
//	for the first test, and also enter the number of questions missed 
//	in the first test. After showing the content of the object representing 
//	the first test, the program asks the user to enter the same information 
//	for the second test. The program then shows the content of the second Test 
//	object. Finally, the program should indicate whether the scores of the two 
//	tests are the same.

//
//if(compXYZ.equals(compABC))
//System.out.print("same");
//else
//System.out.print("not the same");
//
//}

//I still don't understand this whole - two different files kind of thing
//all I know is that I have to put some things in one file, and a bunch of
//other things in some other file.
//so I have a TestScore.java - and a TestScoreDemo.java

//-numQuestions: int
//-numMissed: int
//+Test(numQ: int)
//+getNumQuestions(): int
//+setNumMissed (numMissed: int): void
//+getNumMissed(): int
//+getPoints Each(): double
//+getScore(): double
//+equals(test2: Test): boolean
//+toString(): String
//System.out.println("");
//I can't figure out how to do this as a for loop // for (int i = 0; i < 2; i++) {	}
//I'm tired already and this is taking forever, but I've managed to get the first test to display
//all i have to do left is have the second test display, and then make them equal.
//Double calculateQuestionValue = firstExam.getPointsEach();
//Double calculateExamScore = firstExam.getScore();
//I can't even believe how long this is taking me.
//		String calculateQuestionValue;
//,calculateQuestionValue,calculateExamScore
//// enterQuestionQty //100;

//public double getPointsEach() {
//
//	questionValue = (double) numQuestions / 100;
//	return questionValue;
//}
//double calculateQuestionValue;
//double calculateExamScore;
//String calculateFirstExamScore;
//I might have to do this again using system in keyboard -- but I don't want to do that considering how long I've already taken just getting this far.
//SavingsAccount myAccount = new SavingsAccount(monthlyInterestRate,startingBalance);
//TODO Auto-generated method stub
//SavingsAccount myAccount = new SavingsAccount(monthlyInterestRate,startingBalance); // The constructor SavingsAccount(String, String) is undefined

//TestScore firstExam = new TestScore (enterQuestionQty);
//SavingsAccount myAccount = new SavingsAccount(monthlyInterestRate,startingBalance);
//			private static 
//			Create a program to demonstrate this Test class.
//			In this program, ask the user to enter the number of questions 
//			for the first test, and also enter the number of questions missed 
//			in the first test. After showing the content of the object representing 
//			the first test, the program asks the user to enter the same information 
//			for the second test. The program then shows the content of the second Test 
//			object. Finally, the program should indicate whether the scores of the two 
//			tests are the same.

//
//if(compXYZ.equals(compABC))
//	System.out.print("same");
//else
//	System.out.print("not the same");
//
//}

//I still don't understand this whole - two different files kind of thing
//all I know is that I have to put some things in one file, and a bunch of
//other things in some other file.
//so I have a TestScore.java - and a TestScoreDemo.java

//	-numQuestions: int
//	-numMissed: int
//	+Test(numQ: int)
//	+getNumQuestions(): int
//	+setNumMissed (numMissed: int): void
//	+getNumMissed(): int
//	+getPoints Each(): double
//	+getScore(): double
//	+equals(test2: Test): boolean
//	+toString(): String

//Double quesVal = Double.parseDouble(quesValString);
//Double score = Double.parseDouble(scoreString);
//theScore = score; // questionValue = quesVal; // , String quesValString, String scoreString
//theScore = score; // questionValue = quesVal; // , double quesVal, double score
//The parameterized constructor accepts an argument representing the number of questions. That is, 
//when a Test object is instantiated, the number of questions needs to be specified.
//However, if the value passed to this constructor is not a positive number, make numQuestion as 0.
//The get method of numQuestions is provided, but not the set method.

// int numQ = numQuestions;
// Integer.parseInt(numQtyString)  //		v // double iRate = Double.parseDouble(iRateString);
// all right - it's all set up - well, i think so.

//The test includes 18 question(s); each question is 5.56 points.
//The test-taker missed 2 question(s).
//The score is 88.89
// I had to create a field again, rather than just a local variable, because it - questionValue - is used later on in toString()

// questionValue = (double) numQuestions/100; // I had to create a field again, 
//rather than just a local variable, because it - questionValue - is used later on in toString()

//+toString(): String


//The toString() method can be used to show the content of an object. 
//It should return a String indicating the number of questions, points 
//for each question, number of questions missed, and the score. For example, 
//with 18 questions in the Test and missed 2 questions, the toString() method 
//should return the following:

// i was originally going to declare and initialize theScore inside the method, 
// but since i use theScore in the equals method, i actually had to create a theScore 
// field // double theScore = ((double) numMissed-(double) numQuestions)/(double) numQuestions;



//  && this.symbol.equals(o2.symbol)
// overwrite the equals method

//The equals() method can be used to compare two Test objects, by the score. 
//It should return true if the scores of the two Test objects are the same, 
//		and return false if the scores of the two Test objects are not the same.	

//+equals(test2: Test): boolean
//			public boolean equals(Stock o2) {
//				if (this.sharePrice == o2.sharePrice && this.symbol.equals(o2.symbol))
//					return true;
//				else
//					return false;
//				
//			}





//The getScore() method should calculate the final score for this test. 
//This method thus should return a double number. For example, if there 
//		are 40 questions in the test and the test-taker missed 3 questions, the score should be 92.5.

//+getScore(): double // +getScore(): double
// i just took a survey from visual studio code, and it asked me how i liked developing java in visual studio code,
// and i wrote that i just really don't even use vs code for java because I really don't know how.

// I guess this wasn't too bad, I was worried at first

//	double questionValue = 0;
//+getPoints Each(): double
//The getPointsEach() method will determine how many points for each question. 
//Assume the test is 100 points and each question accounts for the same points. 
//Thus, this method will calculate the points for each question, and return a double number.

////+getPoints Each(): double
//public double getPointsEach() {
//return numMissed;
//}

//+getNumMissed(): int

//public int getNumMissed() {
//	return NumMissed;
//}



//+setNumMissed (numMissed: int): void


//public void setInterestRate(double iRate) { // public void setInterestRate(double interestRate) {
//	// this.interestRate = interestRate;
//	if(iRate<0)
//		iRate=0;
//	else if(iRate>.01)
//		iRate /=100;
//	interestRate=iRate;
//}



//+getNumQuestions(): int
//public double getBalance() {
//	return balance;
//}





//+TestScore(numQ: int)
//+TestScore(numQ: int)

//+Test(numQ: int)

//-numQuestions: int
//-numMissed: int

//public SavingsAccount(String iRateString, String balString) { //method overload to string// public SavingsAccount(double iRate, double bal) {
//	
//	//		+SavingsAccount()
//	//		+SavingsAccount(iRate: double, bal: double) 
//	//		+SavingsAccount(iRateStr: String, balString: String)
//	// The constructor SavingsAccount(String, String) is undefined
//    double iRate = Double.parseDouble(iRateString);
//    double bal = Double.parseDouble(balString);	
//if(bal<0)
//	bal=0;
//
//balance = bal;
//
//if(iRate<0)
//	iRate=0;
//else if(iRate>.01)
//	iRate /=100;
//interestRate=iRate; // Type mismatch: cannot convert from String to double
//}

//-numQuestions: int
//-numMissed: int

//+Test(numQ: int)
//+getNumQuestions(): int
//+setNumMissed (numMissed: int): void
//+getNumMissed(): int
//+getPoints Each(): double
//+getScore(): double
//+equals(test2: Test): boolean
//+toString(): String


	// private with negative sign
//-numQuestions: int
//-numMissed: int
	// public with positive sign

//+Test(numQ: int)
//+getNumQuestions(): int
//+setNumMissed (numMissed: int): void
//+getNumMissed(): int
//+getPoints Each(): double
//+getScore(): double
//+equals(test2: Test): boolean
//+toString(): String

//I still don't understand this whole - two different files kind of thing
//all I know is that I have to put some things in one file, and a bunch of
//other things in some other file.
//so I have a TestScore.java - and a TestScoreDemo.java

//	-numQuestions: int
//	-numMissed: int

//	+Test(numQ: int)
//	+getNumQuestions(): int
//	+setNumMissed (numMissed: int): void
//	+getNumMissed(): int
//	+getPoints Each(): double
//	+getScore(): double
//	+equals(test2: Test): boolean
//	+toString(): String


/*



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


3.1 Norfolk Southern Corporation. (224). Form 10-K Annual Report.

Conclusions:	The East Palestine, Ohio derailment, cost 1.1 billion is an Example of a lack of a certain organizational virtue, they
				had all the technology in place to determine safety issues and set up maintenance to avert the issues, but for 
				one reason or another, they didn’t take the actions necessary to prevent the disaster

3.2 The Boeing Company. (2024). Form 10-K Annual Report.

Conclusions:	Similar to the issues at Norfolk Southern Corporation







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
Frameworks:	disruptive information technology innovation model (DITIM)
				adoption timing
				disruptive innovation cycle
			Variables that Differ between early and late adopters
				(1) adoption rate of radical IT innovations, 
				(2) strong order effects on downstream innovations related to the amount of innovation, 
				(3) perceived radicalness of innovations and 
				(4) strong effects on downstream innovations related to the radicalness of innovation.
			DITIM explains innovation patterns over time and articulates their sequence across three types of IT innovations: 
				(1) bases 
				(2) processes 
				(3) services
			Radical Innovations
				learning barriers - high during early period of innovation cycle, 
							    lower later on due to larger knowledge base

Timelines:		1995–1999, an early period of rapid, broad and deep industry-wide innovation
			2000 -  onward, a period in which industry-wide innovation slowed, 
			became dramatically standardized and posed lower learning requirements 
			for new entrants relative to the earlier stage.

Conclusions:	Goals of 
			(1) demonstrating the importance of considering temporal factors in the study of disruptive innovation 
			(2) illustrating that innovation types matter when theorizing about IT-innovation creation and adoption
			service innovation: primary engine of process innovation during the entire disruptive IT-innovation cycle
				Service innovation drives process innovation
			base technologies: ‘mature’ and become more standardized and powerful, they have more significant effects.
			process innovations: take more time to mature and evolve
			Process innovations: Process innovations may also have early substitutive effects when the causal links between 
				the base technologies and their effects are poorly understood and are later replaced with complementary
				Effects.
Reflections:	There is an early and late innovation cycle
			And there are early and late adopters of innovations
			
			


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



Norfolk Southern Corporation. (2024). Form 10-K Annual Report. U.S. Securities and Exchange Commission. https://www.sec.gov/ixviewer/ix.html?doc=/Archives/edgar/ data/702165/000070216524000005/nsc-20231231.htm



The Boeing Company. (2024). Form 10-K Annual Report. U.S. Securities and Exchange Commission. https://www.sec.gov/ixviewer/ix.html?doc=/Archives/edgar/data/12927/000001292724000010/ba-20231231.htm
























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