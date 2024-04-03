package edu.unlv.mis768.assignments; // package edu.unlv.mis768.assignments;



/**
 * This class represent an order by a customer. A visit by a customer will by an order.
 * Certain type of jobs will be performed. The price for each job is defined in AutoJob Enum.
 * @author Han-fen Hu

 */
public class CustomerOrder {
	// fields
	boolean oilChange;	// Whether this task is performed
	boolean lubeJob;
	boolean radiatorFlush;
	boolean transmissionFlush;
	boolean inspection;
	boolean mufflerReplacement;
	boolean tireRotation;
	
	double partPrice;	// cost for the parts
	double laborPrice;	// cost for the labor
		
	double discount;	// discount rate
	
	/**
	 * No-arg constructor
	 */
	
	public CustomerOrder(){
		
	}
	
	/**
	 * This constructor sets the tasks performed, and costs for parts and labor, as well as the discount rate.
	 * @param o Boolean. Whether oil change is performed.
	 * @param l Boolean. Whether lube job is performed.
	 * @param r Boolean. Whether radiator flush is performed.
	 * @param t Boolean. Whether transmission flush is performed.
	 * @param i Boolean. Whether inspection is performed.
	 * @param m Boolean. Whether muffler replacement is performed.
	 * @param tr Boolean. Whether tire rotation is performed.
	 * @param pPrice double. The cost for parts
	 * @param lPrice double. The cost for labor
	 * @param dis double. Discount rate
	 */
	public CustomerOrder(boolean o, boolean l, boolean r, boolean t, boolean i,
			boolean m, boolean tr, double pPrice, double lPrice, double dis){
		this.oilChange = o;
		this.lubeJob = l;
		this.radiatorFlush = r;
		this.transmissionFlush = t;
		this.inspection = i;
		this.mufflerReplacement = m;
		this.tireRotation = tr;
		this.partPrice = pPrice;
		this.laborPrice = lPrice;
		this.discount = dis;
		
	}
	
	/**
	 * This method calculates the total of this order, based on the jobs done, and costs for parts and labor. 
	 * Discount is also applied.
	 * @return Total of the order
	 */
	public double getTotal(){
		double subTotal=0;
		
		// if the job is performed, add the price to the subtotal
		if(this.oilChange)
			subTotal += AutoJob.OIL_CHANGE.getPrice();
		if(this.lubeJob)
			subTotal += AutoJob.LUBE_JOB.getPrice();
		if(this.radiatorFlush)
			subTotal += AutoJob.RADIATOR_FLUSH.getPrice();
		if(this.transmissionFlush)
			subTotal += AutoJob.TRANSMISSION_FLUSH.getPrice();
		if(this.inspection)
			subTotal += AutoJob.INSPECTION.getPrice();
		if(this.mufflerReplacement)
			subTotal += AutoJob.MUFFLER_REPLACEMENT.getPrice();
		if(this.tireRotation)
			subTotal +=AutoJob.TIRE_ROTATION.getPrice();
		
		// add the costs for parts and labor. Multiply by the discout rate
		subTotal = (subTotal + this.partPrice+this.laborPrice)*this.discount;
		
		return subTotal;
	}

	
	/**
	 * All the getters and setters
	 */
	
	public boolean isOilChange() {
		return oilChange;
	}

	public void setOilChange(boolean oilChange) {
		this.oilChange = oilChange;
	}

	public boolean isLubeJob() {
		return lubeJob;
	}

	public void setLubeJob(boolean lubeJob) {
		this.lubeJob = lubeJob;
	}

	public boolean isRadiatorFlush() {
		return radiatorFlush;
	}

	public void setRadiatorFlush(boolean radiatorFlush) {
		this.radiatorFlush = radiatorFlush;
	}

	public boolean isTransmissionFlush() {
		return transmissionFlush;
	}

	public void setTransmissionFlush(boolean transmissionFlush) {
		this.transmissionFlush = transmissionFlush;
	}

	public boolean isInspection() {
		return inspection;
	}

	public void setInspection(boolean inspection) {
		this.inspection = inspection;
	}

	public boolean isMufflerReplacement() {
		return mufflerReplacement;
	}

	public void setMufflerReplacement(boolean mufflerReplacement) {
		this.mufflerReplacement = mufflerReplacement;
	}

	public boolean isTireRotation() {
		return tireRotation;
	}

	public void setTireRotation(boolean tireRotation) {
		this.tireRotation = tireRotation;
	}

	public double getPartPrice() {
		return partPrice;
	}

	public void setPartPrice(double partPrice) {
		this.partPrice = partPrice;
	}

	public double getLaborPrice() {
		return laborPrice;
	}

	public void setLaborPrice(double laborPrice) {
		this.laborPrice = laborPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
