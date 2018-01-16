
public class Main {
	public static void main(String args[]) {
		//Solución con Object
		/*
		MyBoxWithObject mbwo= new MyBoxWithObject();
		mbwo.setObject(new Dog("Gol",2));
		Car d= (Car)mbwo.getObject();
		System.out.println("El objeto es: "+d.imprimelo());
		*/
		//Solución con Generics
		MyGenericBox<Car> mgb= new MyGenericBox<>();
		mgb.setT(new Car("A1","Audi"));
		System.out.println("El objeto es: "+mgb.printBoxContent());
	}
}
