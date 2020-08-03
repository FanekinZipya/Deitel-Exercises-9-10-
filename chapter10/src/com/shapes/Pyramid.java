package com.shapes;

public class Pyramid implements ThreeDimensionShapes {

	private double baseLength;
	private double baseWidth;
	private double height;
	
	
	public Pyramid(double baseLength, double baseWidth, double height) {
		this.baseLength = baseLength;
		this.baseWidth = baseWidth;
		this.height = height;
	}

	
	public double getBaseLength() {
		return baseLength;
	}


	public void setBaseLength(double baseLength) {
		this.baseLength = baseLength;
	}


	public double getBaseWidth() {
		return baseWidth;
	}


	public void setBaseWidth(double baseWidth) {
		this.baseWidth = baseWidth;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	@Override
	public double getArea() {
		return 0.5 * baseWidth * height;
	}

	@Override
	public double getVolume() {
		return (baseLength * baseWidth * height) / 3;
	}

}
