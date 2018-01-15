package shapes;

public class Square extends Shape{
	private double side;

	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double calculateArea() {
		return side*side;
	}
	
	public double calculatePerimeter() {
		return side*4;
	}
}
