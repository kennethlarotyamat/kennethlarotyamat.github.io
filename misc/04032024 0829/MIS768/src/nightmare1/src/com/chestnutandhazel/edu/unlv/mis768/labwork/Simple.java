package com.chestnutandhazel.edu.unlv.mis768.labwork;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salary = 0;
		System.out.println ("Programming is great fun");
		
		Employee someone = new Employee();
		
		someone.setFullName("Gordisimo Elephante");
		//		pronounced gor dee see mo el ay fawn tay
		salary = someone.calDailyPay(8);
		System.out.print(someone.getFullName() + "'s daily salary is $" + salary);
		

	}

	

}
