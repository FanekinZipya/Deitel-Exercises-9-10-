package com.shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapesTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void calculateAreaAndVolume() {
		TwoDimensionalShapes triangle = new Triangle(5, 8);
		ThreeDimensionShapes pyramid = new Pyramid(10, 8, 11);
		
		System.out.println(" "+ triangle.getArea());
		System.out.println(" "+ pyramid.getArea());
		System.out.println(" "+ pyramid.getVolume());
	}

}
