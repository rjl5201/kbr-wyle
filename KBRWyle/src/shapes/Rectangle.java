package shapes;

public class Rectangle implements Shape {

	private double length;
	private double width;

	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;	
	}
	
	
	@Override
	public double getArea() {
		double area = length * width;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perim = 2*(width+length);	
		return perim;
	}

}
