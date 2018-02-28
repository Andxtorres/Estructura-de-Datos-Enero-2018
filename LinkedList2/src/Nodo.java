
public class Nodo<T> {
	
	private T elemento;
	private Nodo<T> siguente;
	
	
	public Nodo(T elemento) {
		this.elemento = elemento;
	}
	public T getElemento() {
		return elemento;
	}
	public void setElemento(T elemento) {
		this.elemento = elemento;
	}
	public Nodo<T> getSiguente() {
		return siguente;
	}
	public void setSiguente(Nodo<T> siguente) {
		this.siguente = siguente;
	}
	
	

}
