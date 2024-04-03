package edu.unlv.mis768.labwork11;

import java.util.Scanner;

public class CubeDemo {

	public static void main(String[] args) {
	      double length;  // The cube's length
	      double width;   // The cube's width
	      double height;  // The cube's height

	      // Create a Scanner object for keyboard input.
	      Scanner keyboard = new Scanner(System.in);
	      
	      // Get cube's length.
	      System.out.println("Enter the dimensions of a cube:");
	      System.out.print("Length: ");
	      length = keyboard.nextDouble();
	      
	      // Get the cube's width.
	      System.out.print("Width: ");
	      width = keyboard.nextDouble();
	      
	      // Get the cube's height.
	      System.out.print("Height: ");
	      height = keyboard.nextDouble();
		
	      // Create a Cube object and pass the dimensions to the constructor
	      Cube c = new Cube(length,width,height);
	      
	      // Display the cube's properties
	      System.out.println("Length: "+c.getLength());
	      System.out.println("Width: "+c.getWidth());
	      System.out.println("Height:"+c.getHeight());
	      System.out.println("Volume: "+c.getVolume());
	      keyboard.close();
	} 	// A while ago I did my own rectangle area calculator, and it took me forever. there was just a snippet of code for a rectangle class
		// in one of the videos, but there was no in-class exercise, so I did it on my own, and it took a long time.
		// I was looking at my code for my RectangleArea class, and I didn't see an args method for the main method, but it's at the bottom. I don't remember how this 
		// happened, what I think I did was generate it from the Source tab in eclipse -- usually args is at the top, except when I use the source to generate a method.
	

}


/* 







package edu.unlv.mis768.labwork11;
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
 
 
 
 
 */

//in·stan·ti·ate - represent with an instance - create an instance of - represented with an actual example - creating an object
//there is a model class and there is a demo class.
//I really need to get the week 5 stuff done today, and then go back around to my 764 homework.
//TO DO Auto-generated method stub
//I'm going to avoid in-line comments unless I really have to use them - they are so distracting.
//this wasn't really an assignment or anything, but she was demonstrating something in class that I wanted to try out.
//i needed assistance with this, but, i got it!

//but i really want to try this again.

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
