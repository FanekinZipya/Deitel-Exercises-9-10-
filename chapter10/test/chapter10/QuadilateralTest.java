package chapter10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QuadilateralTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void calculateArea() {
		Quadilateral aRectangle = new Rectangle(4, 7);
		Quadilateral aSquare = new Square(6);
		Quadilateral aTrapezium = new Trapezium(5, 10, 12);
		Quadilateral aParallelogram = new Parallelogram(10, 14);
		
		List<Quadilateral> quads = new ArrayList<>();
		quads.add(aRectangle);
		quads.add(aSquare);
		quads.add(aTrapezium);
		quads.add(aParallelogram);
		
		for(Quadilateral quad : quads) {
//			System.out.println(" "+ aRectangle.calculateArea());
//			System.out.println(" "+ aSquare.calculateArea());
//			System.out.println(" "+ aTrapezium.calculateArea());
//			System.out.println(" "+ aParallelogram.calculateArea());
			System.out.println(" "+ quad.calculateArea());
		}
	}

}
