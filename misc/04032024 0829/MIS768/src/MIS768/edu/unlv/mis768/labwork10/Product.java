package edu.unlv.mis768.labwork10;

public class Product {
	// field
	private String name;
	private String type;
	private double unitPrice;
	
	// Constructors	
	public Product(){}
	
	public Product(String n, String t, double p) {
		name = n;
		type = t;
		unitPrice = p;
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
}
