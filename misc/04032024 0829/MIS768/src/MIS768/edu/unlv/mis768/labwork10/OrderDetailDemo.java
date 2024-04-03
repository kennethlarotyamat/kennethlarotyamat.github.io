package edu.unlv.mis768.labwork10;

import javax.swing.JOptionPane;

public class OrderDetailDemo {

	public static void main(String[] args) {
		String productName = JOptionPane.showInputDialog("Please enter the product name: "); // Ex. Chickens
		String productType = JOptionPane.showInputDialog("Please enter the product type: "); // wait a minute - I think this should be taxable or non-taxable, meaning, the product type is 
		// meaning this program is only worried if a product type is taxable or non-taxable, not if the product type is poultry or vegetables or soda // Ex. Poultry
		double price = Double.parseDouble((JOptionPane.showInputDialog("Please enter the product price: ")));
		
		Product item = new Product(productName, productType, price);
		
		int quan = Integer.parseInt(JOptionPane.showInputDialog("Pleae enter the quantity: "));
		
		OrderDetail line = new OrderDetail(item, quan);
		
		JOptionPane.showConfirmDialog(null,   "Tax amount: "+ line.calcTax() );
		JOptionPane.showConfirmDialog(null,  "Subtotal: "+line.getSubtotal());
		
	}

}
