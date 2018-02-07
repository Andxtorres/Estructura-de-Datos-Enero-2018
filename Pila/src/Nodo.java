
public class Nodo<T> {
	private Nodo<T> siguiente;
	private T elemento;
	public Nodo (T elemento) {
		this.elemento=elemento;
	}
	public Nodo<T> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}
	public T getElemento() {
		return elemento;
	}
	public void setElemento(T elemento) {
		this.elemento = elemento;
	}
	

}
