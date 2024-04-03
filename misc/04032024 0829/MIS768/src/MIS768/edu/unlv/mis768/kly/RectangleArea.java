package edu.unlv.mis768.kly;
import java.util.Scanner;
public class RectangleArea {
    private double width;
    private double length;
    

    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }
	public static void main(String[] args) {

	    Scanner keyboard = new Scanner(System.in);
	    RectangleArea rectangle = new RectangleArea();

        System.out.print("Please enter the length of the rectangle: ");
        double length = keyboard.nextDouble();
        rectangle.setLength(length);

        System.out.print("Please enter the width of the rectangle: ");
        double width = keyboard.nextDouble();
        rectangle.setWidth(width);
        
        double area = rectangle.getArea();
        System.out.println("Area of the rectangle is: " + area);
        
        keyboard.close();

	}

}

// in·stan·ti·ate - represent with an instance - create an instance of - represented with an actual example - creating an object
// there is a model class and there is a demo class.
// I really need to get the week 5 stuff done today, and then go back around to my 764 homework.
// TODO Auto-generated method stub
// I'm going to avoid in-line comments unless I really have to use them - they are so distracting.
// this wasn't really an assignment or anything, but she was demonstrating something in class that I wanted to try out.
// i needed assistance with this, but, i got it!

// but i really want to try this again.

/*package edu.unlv.mis768.kly;

import java.util.Scanner;

public class RectangleArea {
	public static void main(String[] args) {
	private double width;
	private double length;

	public RectangleArea() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the length of the rectangle: ");
		this.length = keyboard.nextDouble();
		System.out.print("Please enter the width of the rectangle: ");
		this.width = keyboard.nextDouble();

		System.out.println("The area of the rectangle is: " + getArea());
		keyboard.close();
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;

	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return width * length;
	}
	}

	public void displayArea() {
		// TODO Auto-generated method stub
		
	}
}*/

//double length = keyboard.nextInt();
//System.out.print("Please enter the length of the rectangle: ");
//this.length = keyboard.nextDouble(); 											
//System.out.print("Please enter the width of the rectangle: ");
//this.width = keyboard.nextDouble();