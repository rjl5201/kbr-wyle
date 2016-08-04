package shapes;

public class Triangle implements Shape {

	private double base;
	private double height;
	private double side;

	public Triangle(double base, double height, double side) {
		this.base = base;
		this.height = height;
		this.side = side;
	}

	@Override
	public double getArea() {
		double area = base * height / 2;
		return area;
	}

	@Override
	public double getPerimeter() {

		double perim = base + height + side;
		return perim;
	}

}
