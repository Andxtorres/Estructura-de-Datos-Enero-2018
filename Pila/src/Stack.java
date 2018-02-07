
public class Stack<T> {
	private Nodo<T> inicio;
	private int tamanio;
	
	public Stack() {
		inicio=null;
	}
	
	public int getTamanio() {
		return tamanio;
	}
	public boolean estaVacia() {
		if(inicio==null) {
			return true;
		}else {
			return false;
		}
	}
	public void push(T elemento) {
		Nodo<T> nuevo= new Nodo<T>(elemento);
		if(estaVacia()) {
			inicio=nuevo;
		}else {
			Nodo<T> temp= inicio;
			while(temp.getSiguiente()!=null) {
				temp=temp.getSiguiente();
			}
			temp.setSiguiente(nuevo);	
		}
		tamanio++;
	}
	
	public T pop() {
		if(estaVacia()) {
			System.out.println("Nada para sacar");
			return null;
		}else {
			Nodo<T> temp= inicio;
			if(tamanio!=1) {
				Nodo<T> tempAnterior=null;
				
				while(temp.getSiguiente()!=null) {
					tempAnterior= temp;
					temp=temp.getSiguiente();
				}
				tempAnterior.setSiguiente(null);
				tamanio--;
				return temp.getElemento();
			}else {
				inicio=null;
				tamanio--;
				return temp.getElemento();
			}
		}
	}
	
	public T peek() {
		if(estaVacia()) {
			System.out.println("Nada para mostrar");
			return null;
		}else {
			Nodo<T> temp= inicio;
			if(tamanio!=1) {
				
				while(temp.getSiguiente()!=null) {
					temp=temp.getSiguiente();
				}
				return temp.getElemento();
			}else {
				return temp.getElemento();
			}
		}		
	}
	
	public void imprimir() {
		if(estaVacia()) {
			System.out.print("La pila está vacía.");
		}else {
			int contador=0;
			Nodo<T> temp= inicio;
			while(temp!=null) {
				
				System.out.print("Stack ["+contador+".- "+temp.getElemento().toString()+"]-->");
				contador++;
				temp= temp.getSiguiente();
			}
		}
		System.out.println();
	}	
}
