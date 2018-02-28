import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Alumno a= new Alumno("A01211914","Andrés Torres");
		Alumno a1= new Alumno("A01211915","Andrés Torres");
		Alumno a2= new Alumno("A01211916","Andrés Torres");
		Alumno a3= new Alumno("A01211917","Andrés Torres");
		LinkedList<Alumno> listaAlumnos= new LinkedList<>();
		listaAlumnos.insertarAlInicio(a);
		listaAlumnos.insertarAlInicio(a1);
		listaAlumnos.insertarAlInicio(a2);
		listaAlumnos.insertarAlInicio(a3);
		Scanner sc= new Scanner(System.in);
		int respuesta=1;
		do {
			System.out.println("Introduce la matrícula a buscar: ");
			String mat= sc.nextLine();
			Alumno aBuscar= new Alumno(mat);
			System.out.println("El alumno está en la pos: "+listaAlumnos.linearSearch(aBuscar));
			System.out.println("Quieres buscar de nuevo? 1)Si 2)No");
			respuesta= sc.nextInt();
			sc.nextLine();
		}while(respuesta==1);
		listaAlumnos.linearSearch(new Alumno("A0121198"));
		sc.close();
	}
}
