package edu.unlv.mis768.assignments;


/**
 * This enum lists all the possible auto jobs to be performed.
 * The price is set for each job.
 * @author Han-fen Hu
 */

public enum AutoJob {
	OIL_CHANGE (26.00),
	LUBE_JOB (18.00),
	RADIATOR_FLUSH(30.00),
	TRANSMISSION_FLUSH(80.00),
	INSPECTION(15.00),
	MUFFLER_REPLACEMENT(100.00),
	TIRE_ROTATION(20.00);
	
	private double price;
	
	AutoJob (double aPrice){
		this.price = aPrice;
	}	
	void setPrice (double aPrice){
		this.price = aPrice;
	}
	double getPrice(){
		return this.price;
	}

}
