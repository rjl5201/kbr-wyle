package testShapes;

import static org.junit.Assert.*;
import org.junit.Test;

import shapes.Circle;

public class TestCircle {

	Circle tester = new Circle(3);

	@Test
	public void testGetArea() {
		double area = tester.getArea();
		assertEquals(area, 28.27, .01);
	}

	@Test
	public void testGetPerimeter() {
		double perim = tester.getPerimeter();
		assertEquals(perim, 18.84, .01);
	}
}