package edu.unlv.mis.kly.w3; 

// import java.io.FileNotFoundException;
// import java.io.IOException;
// import java.io.PrintWriter;
import java.io.PrintWriter;
import java.io.*; // this is an alternative, which includes IOException and PrintWriter
import java.util.Scanner;

public class AppendFileDemo {

	public static void main(String[] args) throws IOException {
		// declare variables
		String fileName; // name of the file to store the data
		String friendName; // name of a friend to be written to the file
		int numOfFriends;  // number of friends to be entered by the user
		
		// Scanner object for keyboard input
		Scanner kb = new Scanner(System.in);
		
		// get user input for number of friend
		System.out.print("How many friends do you have?");
		numOfFriends = kb.nextInt();
		
		// Consume the remaining newline character
		kb.nextLine();
		
		// get the filename
		System.out.print("Please enter the file name where you would like to store the data: ");
		fileName = kb.nextLine(); // C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\writefiledemo.txt
		
		// open the file
		FileWriter fw = new FileWriter(fileName, true); // this line has been added to append data, rather than overwrite date
		PrintWriter outputFile = new PrintWriter(fw); // PrintWriter outputFile = new PrintWriter(fileName); // C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\writefiledemo.txt
		
		//for loop
		
		for (int i=0; i<numOfFriends; i++) { // integer variable i is initialized at zero, and as long as variable i is less than the number of friends or num of friends variable, the program will continue to prompt user to enter new friend names
			System.out.print("Please enter the name of friend #"+(i+1)+":");
			friendName = kb.nextLine();
			
			outputFile.println(friendName);
		}
		outputFile.close();
		System.out.print("The Data is saved to the file " +fileName); // edC:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\writefilemo.txt
        kb.close();
		
	}

}



/*




// package edu.unlv.mis768.labwork4; // 
so the answer is yes, it will automatically create a file if that file doesn't already exist
and after creating the file, it proceedes to append the file it just created.

How many friends do you have? 30
Please enter the file name where you would like to store the data: C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfiledemoautomaticallycreatedfile.txt
Please enter the name of friend #1:Hlorna
Please enter the name of friend #2:Glorna
Please enter the name of friend #3:Florna
Please enter the name of friend #4:Flortaki
Please enter the name of friend #5:shorla
Please enter the name of friend #6:hando
Please enter the name of friend #7:comme
Please enter the name of friend #8:larti
Please enter the name of friend #9:shera
Please enter the name of friend #10:gogo
Please enter the name of friend #11:Gugina
Please enter the name of friend #12:gugino
Please enter the name of friend #13:plarkee
Please enter the name of friend #14:Dog
Please enter the name of friend #15:Fish
Please enter the name of friend #16:Orange
Please enter the name of friend #17:These
Please enter the name of friend #18:you are
Please enter the name of friend #19:whatever a moon
Please enter the name of friend #20:has always
Please enter the name of friend #21:meant
Please enter the name of friend #22:oranges
Please enter the name of friend #23:are
Please enter the name of friend #24:I'm going to buy
Please enter the name of friend #25:a bunch of oranges
Please enter the name of friend #26:and then I'm going to squeeze them
Please enter the name of friend #27:I'm going to buy a bag of oranges, and then I'm going to squeeze them.
Please enter the name of friend #28:that's my business Idea
Please enter the name of friend #29:what do you
Please enter the name of friend #30:think?
The Data is saved to the file C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfiledemoautomaticallycreatedfile.txt




This file does not exist yet, I want to see if this program will automatically create it C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfiledemoautomaticallycreatedfile.txt

Please enter the file name where you would like to store the data: C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfiledemo.txt

Please enter the file name where you would like to store the data: C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfiledemo.txt

How many friends do you have?5
Please enter the file name where you would like to store the data: C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfildemo.txt
Please enter the name of friend #1:Fragola
Please enter the name of friend #2:fragolieee
Please enter the name of friend #3:fragonardee
Please enter the name of friend #4:fraswhaa
Please enter the name of friend #5:fransolina
The Data is saved to the file C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfildemo.txt





C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfildemo.txt

This is the file path for the file that I'm going to use here. It was interesting because as i was appending the appendfiledemo.txt 
the eclipse dictionary file was also appended with new words

C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfildemo.txt

these file names have been used:

Please enter the file name where you would like to store the data: 

C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\appendfildemo.txt

C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\src\nightmare1\sharlilponi 			// this one was accidentally created when i entered friend name when prompted to enter a file name

C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\writefilemo.txt
C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\writefilemo2.txt
C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\media\text\writefilemo3.txt



*/
// elixir

// orange juice is not the elixir of oranges
// and neither is lemonade the elixir of lemons
// apple juice will never be the elixir of apples 
// nor will wine be the elixir of the vine
// but here is the truth: oranges are to be squeezed!

// so i guess that it is possible for a .java file to append its self

/*
 * 
 
AI surprises with chemistry predictions
A general-purpose AI system can be turned into a chemistry specialist with only a little tweaking. Researchers added information already gathered about chemical compounds or materials to the training data of GPT-3, an early iteration of the large language model that powers ChatGPT. This allowed the system to predict properties of similar materials and reaction yields as well as, or better than, more specialized algorithms. “This greatly reduces the barrier for other chemists to benefit from machine learning in their domains,” says chemical engineer Andrew White.

Nature | 5 min read
Reference: Nature Machine Intelligence paper

https://www.nature.com/articles/s42256-023-00788-1.epdf?sharing_token=x7vPGA-lcyrgszNvhT1zzdRgN0jAjWel9jnR3ZoTv0N6KWif4PSNFpam0qGhluS-SMk858f0fd5QArJpz1LwMEnu8VLzxqpIf7QIPcgstigzfI8xZEZvN4eWP8QaWDpw2W5u8Q6cHrpJ1r4tf73irt5LDBUogZa1kZd3syX3mKk%3D

How many friends do you have?5
Please enter the file name where you would like to store the data: C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\src\nightmare1\src\edu\ unlv \mis\kly\w3\AppendFileDemo.java
Please enter the name of friend #1:// orange juice is not the elixir of oranges
Please enter the name of friend #2:// and neither is lemonade the elixir of lemons
Please enter the name of friend #3:// apple juice will never be the elixir of apples 
Please enter the name of friend #4:// nor will wine be the elixir of the vine
Please enter the name of friend #5:// but here is the truth: oranges are to be squeezed!
The Data is saved to the file C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\src\nightmare1\src\edu\ unlv \mis\kly\w3\AppendFileDemo.java 

Borges, A. F. S., Laurindo, F. J. B., Spínola, M. M., Gonçalves, R. F., & Mattos, C. A. (2021). The strategic use of artificial intelligence in the digital era: Systematic literature review and future research directions. International Journal of Information Management, 57, 102225. https://doi.org/10.1016/j.ijinfomgt.2020.102225

Anderson, C., & Robey, D. (2017). Affordance potency: Explaining the actualization of technology affordances. Information and Organization, 27(2), 100-115. https://doi.org/10.1016/j.infoandorg.2017.03.002

Jablonka, K. M., Schwaller, P., Ortega-Guerrero, A., & Smit, B. (2024). Leveraging large language models for predictive chemistry. Nature Machine Intelligence. https://doi.org/10.1038/s42256-023-00788-1

Jablonka, K. M., Schwaller, P., Ortega-Guerrero, A., & Smit, B. (2024). Leveraging large language models for predictive chemistry. Nature Machine Intelligence. https://doi.org/10.1038/s42256-023-00788-1


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
protection isn’t or cannot be granted to ai generated text or ai generated artwork, will 
patents also not be granted to ai generated chemicals? Or ai generated medicines or 
Pharmaceuticals? Or ai generated chemical compounds.




 * 
 */
