
public class LinkedList <T extends Comparable<T>>{
	private Nodo<T> inicio;
	public LinkedList() {
		inicio=null;
	}
	
	public int contar() {
		int resultado=0;
		if(estaVacia()) {
			return resultado;
		}else {
			Nodo<T> temp= inicio;
			while(temp!=null) {
				temp=temp.getSiguente();
				resultado++;
			}
			return resultado;
		}
	}
	
	
	
	
	
	public int binarySearch(T lookingFor){
		int start=0;
		int end=contar()-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(encontrarElementoEn(mid).compareTo(lookingFor)==0) {
				return mid;
			}else if(encontrarElementoEn(mid).compareTo(lookingFor)<0) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}
	
	public int linearSearch(T e) {
		int contador=0;
		Nodo<T> temp=inicio;
		while(temp!=null&&temp.getElemento().compareTo(e)!=0){
			temp=temp.getSiguente();
			contador++;
		}
		if(temp==null) {
			return -1;
		}else {
			return contador;
		}
	}
	
	public T encontrarElementoEn(int index) {
		Nodo<T> temp= inicio;
		for(int i=0;i<index;i++) {
			temp=temp.getSiguente();
		}
		return temp.getElemento();
	}
	
	public boolean estaVacia() {
		return inicio==null;
	}
	
	public void insertarAlInicio(T elemento) {
		Nodo<T> nuevo= new Nodo<>(elemento);
		if(estaVacia()) {
			inicio= nuevo;
		}else {
			Nodo<T> temp= inicio;
			while(temp.getSiguente()!=null) {
				temp=temp.getSiguente();
			}
			temp.setSiguente(nuevo);
		}
	}

}
