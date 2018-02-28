
public class Main {
	public static void main(String args[]) {
		LinkedList<Integer> linkedList= new LinkedList<>();
		linkedList.insertarAlFinal(1);
		linkedList.insertarAlFinal(7);
		linkedList.insertarAlFinal(2);
		linkedList.insertarAlFinal(5);
		linkedList.insertarAlFinal(3);
		linkedList.imprimir();
		linkedList.intercambiar(0, 4);
		linkedList.imprimir();
		Ordenamiento<Integer> o= new Ordenamiento<>();
		LinkedList<Integer> resultado=o.selectionSort(linkedList);
		resultado.imprimir();
	}
}
