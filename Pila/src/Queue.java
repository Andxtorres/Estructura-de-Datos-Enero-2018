

public class Queue<T> {
	private Nodo<T> inicio;
	private Nodo<T> fin;
	private int tamanio;
	public Queue() {
		inicio=null;
	}
	
	public boolean estaVacia() {
		return inicio==null;
	}
	
	public void enqueue(T elemento) {
		Nodo<T> nuevo= new Nodo<>(elemento);

		if(estaVacia()) {
			inicio=nuevo;
			fin=nuevo;
		}else {
			Nodo<T> temp= fin;
			fin=nuevo;
			temp.setSiguiente(fin);
		}
		tamanio++;
		//Sin nodo final
		/*
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
		tamanio++;
		*/
	}
	
	public T dequeue() {
		if(estaVacia()) {
			System.out.println("Nada que sacar");
			return null;
		}else {
			Nodo<T> temp= inicio;
			inicio=inicio.getSiguiente();
			tamanio--;
			return temp.getElemento();
		}
	}
	public void imprimir() {
		if(estaVacia()) {
			System.out.print("La pila está vacía.");
		}else {
			int contador=0;
			Nodo<T> temp= inicio;
			while(temp!=null) {
				
				System.out.print("Queue ["+contador+".- "+temp.getElemento().toString()+"]-->");
				contador++;
				temp= temp.getSiguiente();
			}
		}
		System.out.println();
	}	
}
