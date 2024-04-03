package edu.unlv.mis768.kly; //package edu.unlv.mis768.labwork8;

import javax.swing.JOptionPane;

public class RoulettePocketDemo2 {
	   public static void main(String [] args)   {

		   // get a number from the user using dialog box
		   String num = JOptionPane.showInputDialog("Please enter a number between 0-36: ");
				   
		   // instantiate a Roulette Pocket object
		   RoulettePocket pocket = new RoulettePocket();
		   // set the string num to set the number
		   pocket.setNumber(num);
		   
		   
		   // show the number and color for testing
		   JOptionPane.showMessageDialog(null, "The number is "
		                            +pocket.getNumber()+" and the color is "+pocket.getColor());
		   
		   
	   }
}
