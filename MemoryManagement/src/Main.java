
public class Main {

	public static void main(String[] args) {
		  Point pnt1 = new Point(0,0);
		  Point pnt2 = new Point(0,0);
		  System.out.println("X: " + pnt1.x + " Y: " +pnt1.y); 
		  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);
		  System.out.println(" ");
		  tricky(pnt1,pnt2);
		  System.out.println("X: " + pnt1.x + " Y:" + pnt1.y); 
		  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);  
		
	}
	public static void tricky(Point point1, Point point2)
	{
	 point1.x = 100;
	  point2.y = 100;
	  Point temp = point1;
	  point1 = point2;
	  point2 = temp;
	  temp.x=200;
	}

}
