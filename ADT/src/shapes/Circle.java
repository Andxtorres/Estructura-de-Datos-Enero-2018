package shapes;

public class Circle extends Shape{
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double calculateArea() {
		return Math.PI*(Math.pow(radius, 2));
	}

	public double calculatePerimeter() {
		return Math.PI*2*radius;
	}

}
