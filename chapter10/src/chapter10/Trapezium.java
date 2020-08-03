package chapter10;

public class Trapezium implements Quadilateral {

	private double height;
	private double a;
	private double base;
	
	
	public Trapezium(double height, double a, double base) {
		this.height = height;
		this.a = a;
		this.base = base;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getA() {
		return a;
	}


	public void setA(double a) {
		this.a = a;
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	@Override
	public double calculateArea() {
//		double trapeziumArea = (0.5(a + base)) * height;
		return (0.5 * (a + base)) * height;
	}


}
