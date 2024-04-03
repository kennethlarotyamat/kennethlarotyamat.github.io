package edu.unlv.mis768.labwork10pointone; // package edu.unlv.mis768.labwork10; package edu.unlv.mis768.kly; // package edu.unlv.mis768.labwork10;

import java.util.Date;
import java.util.Scanner;

// import edu.unlv.mis768.labwork10.Product;

public class OrderDemo {

	public static void main(String[] args) {
		// input device
		Scanner kb = new Scanner(System.in);

		// get order number
		System.out.print("Please enter the order number: ");
		String orderNum = kb.nextLine();;
		// get a Date object
		Date date = new Date();
		
		// create the Order object
		Order tran = new Order(orderNum, date);

		// get items
		System.out.println("Please enter the items below.");
		String moreItem ="y"; //flag for when the loop should stop
		
		int itemCount=1;
		while (moreItem.equalsIgnoreCase("y")){
			
			System.out.print("Proudct name for item "+itemCount+": ");
			String prodName = kb.nextLine();
			System.out.print("Proudct type for item "+itemCount+": ");
			String prodType = kb.nextLine(); // this is where I'm guessing I can figure out how tax is applied or not
			System.out.print("Unit price for item "+itemCount+": ");
			double price = kb.nextDouble();
		
			//create the Product object
			Product item = new Product (prodName, prodType,price);
		
			System.out.print("Qunatity for item "+itemCount+": ");
			int quan = kb.nextInt();
		
			//create the OrderDetail object
			OrderDetail line = new OrderDetail (item,quan);
		
			//add the OrderDetail object to the order
			tran.addOrderDetail(line);
			
			
			// consume the enter key
			kb.nextLine();
			// More items?
			System.out.print("More items? (Y/N) ");
			moreItem = kb.nextLine().substring(0,1);
			
			itemCount++;
		}
		
		// coupon/discount
		System.out.print("Please enter the coupon/discount amont: ");
		double discount = kb.nextDouble();
		
		//receipt header
		System.out.println("Order number: "+ tran.getOrderNum());
		System.out.println("Date: "+ tran.getOrderDate());
		System.out.println("Product\tPrice\tQuantity\tSubtotal\tTax");
		System.out.println("==================================================================");
		
		// use a for loop to go through the ArrayList // Time really goes by faster than I expect.
		// I was really hoping to getting more done today.
		double preTaxTotal =0;
		double taxTotal = 0;
		for(int i=0; i<tran.getDetailedList().size(); i++){
			// product name
			System.out.print(tran.getDetailedList().get(i).getItem().getName());
			System.out.print("\t");
			// product price
			System.out.print(tran.getDetailedList().get(i).getItem().getUnitPrice());
			System.out.print("\t");
			// quantity
			System.out.print(tran.getDetailedList().get(i).getQuantity());
			System.out.print("\t\t");
			//subtotal
			System.out.print(tran.getDetailedList().get(i).getSubtotal());
			System.out.print("\t\t");
			//tax
			if(tran.getDetailedList().get(i).calcTax()!=0)
				System.out.print(tran.getDetailedList().get(i).calcTax()); // I think this is where the tax ix calculated. // D:\GitHub\MIS76810032024Sprg\src\MIS768\edu\ unlv\mis768\labwork10\OrderDetail.java
			// new line
			System.out.print("\n");
			
			// add to the tax total
			preTaxTotal += tran.getDetailedList().get(i).getSubtotal();
			taxTotal += tran.getDetailedList().get(i).calcTax();
		}
		
		System.out.println("\t-------------------------------");
		System.out.println("\t\tSubtotal: \t"+preTaxTotal);
		System.out.println("\t\tTax: \t\t"+taxTotal);
		System.out.println("\t\tCoupon: \t"+discount);
		System.out.println("\t\tTotal: \t\t"+tran.getTotal());
		System.out.println("\t-------------------------------");
	}

}




//package edu.unlv.mis768.kly; // package edu.unlv.mis768.labwork10;
//
//import java.util.Date;
//import java.util.Scanner;
//
//public class OrderDemo {
//
//	public static void main(String[] args) {
//		// input device
//		Scanner kb = new Scanner(System.in);
//
//		// get order number
//		System.out.print("Please enter the order number: ");
//		String orderNum = kb.nextLine();;
//		// get a Date object
//		Date date = new Date();
//		
//		// create the Order object
//		Order tran = 
//
//		// get items
//		System.out.println("Please enter the items below.");
//		String moreItem ="y"; //flag for when the loop should stop
//		
//		int itemCount=1;
//		while (moreItem.equalsIgnoreCase("y")){
//			
//			System.out.print("Proudct name for item "+itemCount+": ");
//			String prodName = kb.nextLine();
//			System.out.print("Proudct type for item "+itemCount+": ");
//			String prodType = kb.nextLine();
//			System.out.print("Unit price for item "+itemCount+": ");
//			double price = kb.nextDouble();
//		
//			//create the Product object
//			Product item = 
//		
//			System.out.print("Qunatity for item "+itemCount+": ");
//			int quan = kb.nextInt();
//		
//			//create the OrderDetail object
//			OrderDetail line = 
//		
//			//add the OrderDetail object to the order
//			
//			
//			// consume the enter key
//			kb.nextLine();
//			// More items?
//			System.out.print("More items? (Y/N) ");
//			moreItem = kb.nextLine().substring(0,1);
//			
//			itemCount++;
//		}
//		
//		// coupon/discount
//		System.out.print("Please enter the coupon/discount amont: ");
//		double discount = kb.nextDouble();
//		
//		//receipt header
//		System.out.println("Order number: "+ tran.getOrderNum());
//		System.out.println("Date: "+ tran.getOrderDate());
//		System.out.println("Product\tPrice\tQuantity\tSubtotal\tTax");
//		System.out.println("==================================================================");
//		
//		// use a for loop to go through the ArrayList
//		double preTaxTotal =0;
//		double taxTotal = 0;
//		for(int i=0; i<tran.getDetailedList().size(); i++){
//			// product name
//			System.out.print(tran.getDetailedList().get(i).getItem().getName());
//			System.out.print("\t");
//			// product price
//			System.out.print();
//			System.out.print("\t");
//			// quantity
//			System.out.print(tran.getDetailedList().get(i).getQuantity());
//			System.out.print("\t\t");
//			//sub-total
//			System.out.print();
//			System.out.print("\t\t");
//			//tax
//			if(tran.getDetailedList().get(i).calcTax()!=0)
//				System.out.print();
//			// new line
//			System.out.print("\n");
//			
//			// add to the tax total
//			preTaxTotal += tran.getDetailedList().get(i).getSubtotal();
//			taxTotal += tran.getDetailedList().get(i).calcTax();
//		}
//		
//		System.out.println("\t-------------------------------");
//		System.out.println("\t\tSubtotal: \t"+preTaxTotal);
//		System.out.println("\t\tTax: \t\t"+taxTotal);
//		System.out.println("\t\tCoupon: \t"+discount);
//		System.out.println("\t\tTotal: \t\t"+tran.getTotal());
//		System.out.println("\t-------------------------------");
//	}
//
//}
//
//// 	Comma-separated values (CSV) a csv file is a comma separated value file
////	Extensible Mark up Language (XML) - I don't know what that really means, or why it's important
//// 	Tab delimited or tab separated values (TSV)
