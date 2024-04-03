package edu.unlv.mis768.labwork10;

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






















