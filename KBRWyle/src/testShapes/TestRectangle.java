package testShapes;

import static org.junit.Assert.*;
import org.junit.Test;

import shapes.Rectangle;

public class TestRectangle {

	Rectangle tester = new Rectangle(2, 4);

	@Test
	public void testGetArea() {
		double area = tester.getArea();
		assertEquals(area, 8, .01);
	}

	@Test
	public void testGetPerimeter() {
		double perim = tester.getPerimeter();
		assertEquals(perim, 12, .01);
	}
}