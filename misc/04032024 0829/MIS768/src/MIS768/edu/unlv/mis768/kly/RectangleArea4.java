package edu.unlv.mis768.kly;
import java.util.Scanner;
public class RectangleArea4 {
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
		// TODO Auto-generated method stub
	    Scanner keyboard = new Scanner(System.in);
	    RectangleArea4 rectangle = new RectangleArea4();

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

/*package edu.unlv.mis768.kly;

import java.util.Scanner;

public class RectangleArea4 {
    private double width;
    private double length;

    public RectangleArea4() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the length of the rectangle: ");
        this.length = keyboard.nextDouble();

        System.out.print("Please enter the width of the rectangle: ");
        this.width = keyboard.nextDouble();
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

    public void displayArea() {
        System.out.println("The area of the rectangle is: " + getArea());
    }

    public static void main(String[] args) {
        RectangleArea rectangle = new RectangleArea();
        rectangle.displayArea();
    }
}*/
