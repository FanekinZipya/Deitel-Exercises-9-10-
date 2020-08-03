package chapter10;

public class Square implements Quadilateral {

	private double sides;

	public double getSides() {
		return sides;
	}

	public void setSides(double sides) {
		this.sides = sides;
	}

	public Square(double sideLength) {
		sides = sideLength;
	}
	
	@Override
	public double calculateArea() {
		double squareArea = sides * sides;
		return squareArea;
	}
	
	

}
