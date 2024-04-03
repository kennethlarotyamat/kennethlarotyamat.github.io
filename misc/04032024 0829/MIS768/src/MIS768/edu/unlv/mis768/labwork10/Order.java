package edu.unlv.mis768.labwork10;

import java.util.ArrayList;
import java.util.Date;

public class Order {
	//fields
	private String orderNum;
	private Date orderDate;
	private double discountAmount;
	private ArrayList <OrderDetail> detailedList;

	
	// constructor
	public Order(String orderNum, Date orderDate) {
		this.orderNum = orderNum;
		this.orderDate = orderDate;
		this.discountAmount =0;
		this.detailedList = new ArrayList<OrderDetail>();
	}

	// getters and setters
	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public double getDiscountAmount() {
		return discountAmount;
	}


	public ArrayList<OrderDetail> getDetailedList() {
		return detailedList;
	}

	public void setDetailedList(ArrayList<OrderDetail> detailedList) {
		this.detailedList = detailedList;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}
	public void addOrderDetail(OrderDetail line) {
		
		detailedList.add(line);
	}
		public double getTotal() {
			double total =0;
			for(int i=0; i<detailedList.size(); i++) {
				total+=detailedList.get(i).getSubtotal();
					total+=detailedList.get(i).calcTax();
					}
			
			total-= discountAmount;
			return total;
		}

	

	
}
