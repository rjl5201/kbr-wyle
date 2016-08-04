package testShapes;

import static org.junit.Assert.*;
import org.junit.Test;

import shapes.Triangle;

public class TestTriangle {

	Triangle tester = new Triangle(3, 4, 7);

	@Test
	public void testGetArea() {
		double area = tester.getArea();
		assertEquals(area, 6, .01);
	}

	@Test
	public void testGetPerimeter() {
		double perim = tester.getPerimeter();
		assertEquals(perim, 14, .01);
	}
}