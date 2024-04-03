package edu.unlv.mis768.kly;
import java.util.Scanner;
public class RectangleArea5 {
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
	    RectangleArea5 rectangle = new RectangleArea5();

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
