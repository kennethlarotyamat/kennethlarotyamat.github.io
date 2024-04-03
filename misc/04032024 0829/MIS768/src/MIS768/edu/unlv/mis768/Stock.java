package edu.unlv.mis768; // package edu.unlv.mis768; // package edu.unlv.mis768.labwork9; // Stock.java // * @author Han-fen Hu

public class Stock {
	//field
	private String symbol;
	private double sharePrice;
	
	//Constructor
	public Stock(String sym, double price){
		symbol = sym;
		sharePrice = price;
	}

	//getters and setters
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
	
	// copy method
	public	Stock copy() {
		Stock newObject = new Stock(this.symbol, this.sharePrice);
		return newObject;
	}
	
	// toString method
	public String toString() {
		String str="";
		str="Symbol: "
+this.symbol+" Price: "+ this.sharePrice;
	return str;	
	}

	
	// overwrite the equals method
	public boolean equals(Stock o2) {
		if (this.sharePrice == o2.sharePrice && this.symbol.equals(o2.symbol))
			return true;
		else
			return false;
		
	}
	

}
