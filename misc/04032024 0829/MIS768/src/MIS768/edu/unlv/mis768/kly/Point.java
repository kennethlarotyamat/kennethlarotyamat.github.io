package edu.unlv.mis768.kly; // package edu.unlv.mis768.labwork6;

public class Point {
	// field
	private int x;
	private int y;
	
	// constructor
	public Point(){ }	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void translate(int deltaX, int deltaY){
		this.x += deltaX;
		this.y+= deltaY;
	}
	
	public void setLocation(int x, int y){
		this.x = x;
		this.y = y;		
	}

	public double getDistance(Point p){
		return Math.sqrt((this.x-p.x)*(this.x-p.x) + (this.y-p.y)*(this.y-p.y));
	}
	
	public String toString(){
		return x+","+y;
	}
}
