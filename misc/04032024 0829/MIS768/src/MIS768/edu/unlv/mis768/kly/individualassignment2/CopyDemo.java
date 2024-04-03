package edu.unlv.mis768.kly.individualassignment2; // package edu.unlv.mis768.labwork9;

public class CopyDemo {

	public static void main(String[] args) {
		Stock compXYZ = new Stock("TSM",140.96);
		
		Stock compABC = compXYZ.copy();
		
		System.out.println("first object "+ compXYZ);
		System.out.println("second object "+ compABC);
		
		if(compXYZ.equals(compABC))
			System.out.print("same");
		else
			System.out.print("not the same");

	}

}

// just points to the object
