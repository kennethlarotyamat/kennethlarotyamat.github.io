package edu.unlv.mis768.labwork11;

public class Cube extends Rectangle {
	
	private double height;
	
	public Cube (double l, double w, double h) {
		super(l, w);
		height=h;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
		return getArea() * height;
	}
} 
//  so I'v been meaning to buy a new computer for a while, but it isn't something that I really need, just something that I would really want, but I don't need a new computer, it's just something
// that I would want for gaming and all that. but I don't need it, and gaming really puts me back in terms of getting my work done. so it's not s - so I'm not sure if it's something that I should do. even if it's something that I want to do.
