package shapes;

public class Circle implements Shape {

	private final static double pi = 3.1416;
	private double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		double area = pi * (r * r);
		return area;
	}

	@Override
	public double getPerimeter() {
		double perim = 2 * pi * r;
		return perim;
	}

}
