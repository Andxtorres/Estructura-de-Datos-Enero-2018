import shapes.Square;
import shapes.Circle;
import shapes.Shape;
public class Main {
	
	public static void main(String arg[]) {
		Square s= new Square();
		s.setSide(4);	
		s.setName("Square");
		Circle c= new Circle();
		c.setRadius(5);
		c.setName("Circle");
		Shape[] shapes= new Shape[2];
		shapes[0]=s;
		shapes[1]=c;
		for(int i=0;i<shapes.length;i++) {
			System.out.println("El área del "+
					shapes[i].getName()+ " es"
					+ " "+shapes[i].calculateArea());
		}
	}

}
