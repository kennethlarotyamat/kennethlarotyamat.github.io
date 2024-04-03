package edu.unlv.mis768.labwork10;



/**
The StockPurchase class represents a stock purchase.
*/
public class StockPurchase {
private Stock stock;  // The stock that was purchased
private int shares;   // Number of shares owned

/**
   Constructor
   @param stockObject The stock to purchase.
   @param numShares The number of shares.
*/
public StockPurchase(Stock stockObject, int numShares) {
   // Create a copy of the object referenced by
   // stockObject.
   this.stock = stockObject.copy();
   shares = numShares;
}

/**
   getStock method
   @return A copy of the Stock object for the stock
           being purchased.
*/
public Stock getStock() {
   // Return a copy of the object referenced by stock.
	  Stock stock = this.stock.copy();
	  return stock;
}

/**
   getShares method
   @return The number of shares being purchased.
*/
public int getShares()  {
   return shares;
}

/**
   getCost method
   @return The cost of the stock purchase.
*/
public double getCost()   {
	// assume that 1% of transaction fee will be charged.
   return shares * stock.getSharePrice()*1.01;
}
}