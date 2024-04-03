package edu.unlv.mis768.labwork12;

import javax.swing.JOptionPane;

/**
   This program demonstrates that an interface type may
   be used to create a polymorphic reference.
*/

public class PolymorphicInterfaceDemo {
   public static void main(String[] args)  {
	   // Declare a variable of a RetailItem  (interface) type
	   // It can later be used to reference objects that implements RetailItem interface
	   
	  
	   String type = JOptionPane.showInputDialog("Please enter the product type, Movie or CD:");
	   
	   if (type.equalsIgnoreCase("CD")){
			 // Get the title the title
			 String title = JOptionPane.showInputDialog("Please enter the title:");
					 
			 // Get the artist
			 String artist = JOptionPane.showInputDialog("Please enter the artist:");
			 
			 // Get the retail price
			 double price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the retail price"));
			 
		     // Create a CompactDisc object with the information entered by the user
			 
		 
	   } else if (type.equalsIgnoreCase("Movie")){
			 // Get the title the title
			 String title = JOptionPane.showInputDialog("Please enter the title:");
					 
			 // Get the running time
			 int time = Integer.parseInt(JOptionPane.showInputDialog("Please enter the running time:"));
			 
			 // Get the retail price
			 double price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the retail price"));  
			 
			// Create a StreamingMovie object with the information entered by the user
		    
	   }
	   
	   // Display the product's price .
	   
   }	   
}
