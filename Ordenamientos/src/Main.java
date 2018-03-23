
public class Main {
	public static void main(String args[]) {
		LinkedList<Integer> linkedList= new LinkedList<>();
		linkedList.insertarAlFinal(3);
		linkedList.insertarAlFinal(7);
		linkedList.insertarAlFinal(2);
		linkedList.insertarAlFinal(5);
		linkedList.insertarAlFinal(1);
		System.out.println("Inicial: "+linkedList.getInicio().getElemento());
		Ordenamiento<Integer> o= new Ordenamiento<>();
		o.mergeSort(linkedList);
		linkedList.imprimir();
	}
}
