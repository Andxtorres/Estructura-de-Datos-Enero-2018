
public class LinkedList<T extends Comparable<T>> {
	
	private Nodo<T> inicio;
	
	public boolean estaVacia() {
		return inicio==null;
	}
	
	public void insertarAlFinal(T elemento) {
		Nodo<T> nuevo= new Nodo<>(elemento);
		if(estaVacia()) {
			inicio=nuevo;
		}else {
			Nodo<T> temp=inicio;
			while(temp.getSiguiente()!=null) {
				temp=temp.getSiguiente();
			}
			temp.setSiguiente(nuevo);
		}
	}
	public int contarElementos() {
		int contador=0;
		Nodo<T> temp=inicio;
		while(temp!=null) {
			contador++;
			temp=temp.getSiguiente();
		}
		return contador;
	}
	
	public void intercambiar(int index1,int index2) {
		Nodo<T> nodo1= encontrarNodoEn(index1);
		Nodo<T> temp= new Nodo<>(nodo1.getElemento());
		Nodo<T> nodo2= encontrarNodoEn(index2);
		nodo1.setElemento(nodo2.getElemento());
		nodo2.setElemento(temp.getElemento());
	} 
	
	public Nodo<T> encontrarNodoEn(int index){
		Nodo<T> temp=inicio;
		for(int i=0;i<index;i++) {
			temp=temp.getSiguiente();
		}
		return temp;
	}
	public T encontrarElementoEn(int index){
		Nodo<T> temp=inicio;
		for(int i=0;i<index;i++) {
			temp=temp.getSiguiente();
		}
		return temp.getElemento();
	}	
	
	public void imprimir() {
		if(estaVacia()) {
			System.out.print("La lista está vacía.");
		}else {
			int contador=0;
			Nodo<T> temp= inicio;
			while(temp!=null) {
				
				System.out.print("["+contador+".- "+temp.getElemento().toString()+"]-->");
				contador++;
				temp= temp.getSiguiente();
			}
		}
		System.out.println();
	}
}
