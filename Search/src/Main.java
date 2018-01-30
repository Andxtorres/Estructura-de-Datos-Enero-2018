
public class Main {
	public static void main(String args[]) {
		/*
		Profesor p1= new Profesor("L0334","Andrés Torres");
		Profesor p2= new Profesor("L0335","Andrés Torres");
		Profesor p3= new Profesor("L0336","Andrés Torres");
		Profesor p4= new Profesor("L0337","Andrés Torres");
		Profesor p5= new Profesor("L0338","Andrés Torres");
		Profesor[] profesores= new Profesor[5];
		profesores[0]=p1;
		profesores[1]=p2;
		profesores[2]=p3;
		profesores[3]=p4;
		profesores[4]=p5;
		Search<Profesor> s= new Search<>();
		System.out.println(s.binarySearch(profesores, new Profesor("L0338","")));
		*/
		
		Integer[] enteros= new Integer[5];
		enteros[0]=1;
		enteros[1]=2;
		enteros[2]=3;
		enteros[3]=4;
		enteros[4]=5;
		Search<Integer> sI= new Search<>();
		System.out.println(sI.binarySearch(enteros,5));
		
	}
}
