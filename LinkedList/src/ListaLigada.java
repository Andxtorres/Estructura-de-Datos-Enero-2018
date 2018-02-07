
public class ListaLigada<T> {
	
	private Nodo<T> inicio;
	
	public ListaLigada() {
		inicio= null;
	}
	
	public boolean estaVacia() {
		if(inicio==null) {
			return true;
		}
		return false;
	}
	
	public int contarElementos() {
		int contador=0;
		if(estaVacia()) {
			return contador;
		}
		Nodo<T> temp= inicio;
		while(temp!=null) {
			contador++;
			temp=temp.getSiguiente();
		}
		return contador;
	}
	
	public void insertaAlFinal(T elemento) {
		Nodo<T> nodoAInsertar= new Nodo<>(elemento);
		if(estaVacia()) {
			inicio=nodoAInsertar;
		}else {
			Nodo<T> temp=inicio;
			while(temp.getSiguiente()!=null) {
				temp=temp.getSiguiente();
			}
			temp.setSiguiente(nodoAInsertar);
		}
	}
	
	public void insertarAlInicio(T elemento) {
		if(estaVacia()) {
			inicio= new Nodo<>(elemento);	
		}else {
			Nodo<T> temp= inicio;
			inicio= new Nodo<>(elemento);
			inicio.setSiguiente(temp);
		}
		
	}
	
	public void insertarEnPosicion(T elemento, int index) throws IndiceFueraDeRangoException{
		if(index<=contarElementos()) {
			Nodo<T> nodoAInsertar= new Nodo<>(elemento);
			if(estaVacia()) {
				insertaAlFinal(elemento);
			}else {
				if(index==0) {
					insertarAlInicio(elemento);
				}else {
					Nodo<T> temp= inicio;
					for(int i=0;i<index-1;i++) {
						temp=temp.getSiguiente();
					}
					nodoAInsertar.setSiguiente(temp.getSiguiente());
					temp.setSiguiente(nodoAInsertar);
				}
			}
			
		}else {
			throw new IndiceFueraDeRangoException("Fuera de rango");
		}
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
	public void quitarAlInicio() {
		if(estaVacia()) {
			System.out.println("No puedo eliminar nada");
		}else {
			inicio= inicio.getSiguiente();
		}
	}
	public void quitarAlFinal() {
		if(estaVacia()) {
			System.out.println("No puedo eliminar nada");
		}else {
			Nodo<T> temp= inicio;
			if(contarElementos()==1) {
				inicio=null;
			}else {
				Nodo<T> tempAnterior=null;
				while(temp.getSiguiente()!=null) {
					tempAnterior=temp;
					temp= temp.getSiguiente();
				}
				tempAnterior.setSiguiente(null);
			}
		}
	}
	

}
