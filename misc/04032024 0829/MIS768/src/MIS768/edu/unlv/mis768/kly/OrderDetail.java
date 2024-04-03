package edu.unlv.mis768.kly; // package edu.unlv.mis768.labwork10;

import edu.unlv.mis768.labwork10.Product;

public class OrderDetail {
	// field
	private Product item;
	private int quantity;
	public Product getItem() {
		return item;
	}
	public void setItem(Product item) {
		this.item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public OrderDetail(Product item, int quantity) {
		super(); //  I still don't understand what this line is for
		this.item = item;
		this.quantity = quantity;
	}
	public OrderDetail() {} // "no-arg constructor" or "no-argument constructor." // no r constructor.

	public double getSubtotal() {
		return quantity * item.getUnitPrice();
	}
	public double calcTax() {
		if (item.getType().replaceAll("\\s", "").equalsIgnoreCase("food")) // while (moreItem.equalsIgnoreCase("y"))
			return 0;
		else
			return getSubtotal() * .06;
	}
}

//package edu.unlv.mis768.kly;    // package edu.unlv.mis768.labwork7;
//
//public class OrderDetail {
//	// field
//	private int quantity;
//	private Product item;
//	
//	// no-arg constructor
//	public OrderDetail() {}
//	
//	// parameterized constructor
//	public OrderDetail(int qty, Product item) {
//		quantity = qty;
//		this.item = item;
//	}
//
//	public int getQuantity() {
//		return quantity;
//	}
//
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//
//	public Product getItem() {
//		return item;
//	}
//
//	public void setItem(Product item) {
//		this.item = item;
//	}
//	
//	public double getSubtotal() {
//		return quantity * item.getUnitPrice();
//	}
//	
//	public double calcTax() {
//		double taxAmount=0;
//		
//		if(!item.getType().equalsIgnoreCase("food"))
//			taxAmount = getSubtotal()*0.06;
//		
//		return taxAmount;
//					
//	}
//}


/*
Integer number;
number = 7;
 
 Integer myInt = 5; // Autoboxes the value 5
 
 wrapper class - wrapper classes build around primitive data types
 
 boxes into an object
 
 behind the scenes is that it unboxed, a primitive data type translate
 primitive data into an object
 
 ArrayList can hold a wrapper class, but not a primitive data type
 
 JOption
 
 input 
 message dialog
 input dialog
 includes an input box, can
 the user will get a prompt, and send an information
 
 import javax.swing.JOptionPane:
 can create a message
 
 JOptionPane.showMessageDialog(null, "Hello World");
 
 String name;
 
 name = JOptionPane.showInputDialog("Enter your name.");
 
 the user will enter a name, and the user entry will be saved
 to the variable
 
 
 System.exit(0);
 use to properly end the program.
 
 
 
 
 * */
