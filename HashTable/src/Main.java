
public class Main {

	public static void main(String[] args) {
		Alumno a= new Alumno("Andrés Torres","A01211914",100);
		Alumno a2= new Alumno("Juan José Galvan","A01311914",90);
		Alumno a3= new Alumno("In Joong Kim","A01411914",45);
		HashTable<Integer,Alumno> ht= new HashTable<>(100);
		ht.insertarEntrada(a.hashCode(), a);
		ht.insertarEntrada(a2.hashCode(), a2);
		ht.insertarEntrada(a3.hashCode(), a3);
		ht.imprimeTabla();
	}

}
