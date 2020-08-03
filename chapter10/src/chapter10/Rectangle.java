package chapter10;

public class Rectangle implements Quadilateral {

	private double lenght;
	private double breadth;
	
	@Override
	public double calculateArea() {
		return lenght * breadth;
	}

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public Rectangle(double lenght, double breadth) {
		this.lenght = lenght;
		this.breadth = breadth;
	}

	
}
